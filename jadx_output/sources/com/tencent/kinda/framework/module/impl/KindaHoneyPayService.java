package com.tencent.kinda.framework.module.impl;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaHoneyPayService;", "Lcom/tencent/kinda/gen/KHoneyPayService;", "", "payMsgId", "msgContent", dm.i4.COL_USERNAME, "Ljz5/f0;", "updateBubbleMsg", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "bindSerial", "handleOfflineThings", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Lcom/tencent/kinda/gen/VoidStringCallback;", "resultCallback", "selectSingeContactImpl", "stopSelectSingleContact", "jumpToBankcardList", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class KindaHoneyPayService implements com.tencent.kinda.gen.KHoneyPayService {
    public static final int REQUEST_SELECT_CONTACT = 101;

    @Override // com.tencent.kinda.gen.KHoneyPayService
    public void handleOfflineThings(int i17, java.lang.String str) {
        u73.h.e(i17, str);
    }

    @Override // com.tencent.kinda.gen.KHoneyPayService
    public void jumpToBankcardList() {
        com.tencent.mars.xlog.Log.i("MicroMsg.KindaHoneyPayService", "isKindaBankCardManagerEnable");
        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("bankCard", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.module.impl.KindaHoneyPayService$jumpToBankcardList$1
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public final void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // com.tencent.kinda.gen.KHoneyPayService
    public void selectSingeContactImpl(java.lang.String str, final com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16, 1, 2, 4, 16384));
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("titile", str);
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        kotlin.jvm.internal.o.e(topOrUIPageFragmentActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) topOrUIPageFragmentActivity).mmSetOnActivityResultCallback(new com.tencent.mm.ui.da() { // from class: com.tencent.kinda.framework.module.impl.KindaHoneyPayService$selectSingeContactImpl$1
            @Override // com.tencent.mm.ui.xc
            public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent2) {
                if (i17 == 101 && i18 == -1) {
                    java.lang.String stringExtra = intent2.getStringExtra("Select_Conv_User");
                    com.tencent.kinda.gen.VoidStringCallback voidStringCallback2 = com.tencent.kinda.gen.VoidStringCallback.this;
                    if (voidStringCallback2 != null) {
                        voidStringCallback2.call(stringExtra);
                    }
                }
            }
        });
        j45.l.v(topOrUIPageFragmentActivity, ".ui.contact.SelectContactUI", intent, 101);
    }

    @Override // com.tencent.kinda.gen.KHoneyPayService
    public void stopSelectSingleContact() {
    }

    @Override // com.tencent.kinda.gen.KHoneyPayService
    public void updateBubbleMsg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        u73.h.k(str, str2, str3, null);
    }
}
