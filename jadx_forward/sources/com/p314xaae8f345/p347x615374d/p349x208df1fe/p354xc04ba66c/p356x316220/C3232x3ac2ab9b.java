package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaHoneyPayService;", "Lcom/tencent/kinda/gen/KHoneyPayService;", "", "payMsgId", "msgContent", dm.i4.f66875xa013b0d5, "Ljz5/f0;", "updateBubbleMsg", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "bindSerial", "handleOfflineThings", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "Lcom/tencent/kinda/gen/VoidStringCallback;", "resultCallback", "selectSingeContactImpl", "stopSelectSingleContact", "jumpToBankcardList", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.module.impl.KindaHoneyPayService */
/* loaded from: classes9.dex */
public final class C3232x3ac2ab9b implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3468xa7e3d2bd {

    /* renamed from: REQUEST_SELECT_CONTACT */
    public static final int f12407x2df278d = 101;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3468xa7e3d2bd
    /* renamed from: handleOfflineThings */
    public void mo25873xc7c3dfc0(int i17, java.lang.String str) {
        u73.h.e(i17, str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3468xa7e3d2bd
    /* renamed from: jumpToBankcardList */
    public void mo25874x7ad5fbf3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KindaHoneyPayService", "isKindaBankCardManagerEnable");
        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("bankCard", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.module.impl.KindaHoneyPayService$jumpToBankcardList$1
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public final void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3468xa7e3d2bd
    /* renamed from: selectSingeContactImpl */
    public void mo25875x448651e6(java.lang.String str, final com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16, 1, 2, 4, 16384));
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("titile", str);
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m27313x7608d9c4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m27313x7608d9c4).m78545xde66c1f2(new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.kinda.framework.module.impl.KindaHoneyPayService$selectSingeContactImpl$1
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent2) {
                if (i17 == 101 && i18 == -1) {
                    java.lang.String stringExtra = intent2.getStringExtra("Select_Conv_User");
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a.this;
                    if (abstractC3635x710ca4a2 != null) {
                        abstractC3635x710ca4a2.mo28515x2e7a5e(stringExtra);
                    }
                }
            }
        });
        j45.l.v(m27313x7608d9c4, ".ui.contact.SelectContactUI", intent, 101);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3468xa7e3d2bd
    /* renamed from: stopSelectSingleContact */
    public void mo25876x552ab7ba() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3468xa7e3d2bd
    /* renamed from: updateBubbleMsg */
    public void mo25877x7175588c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        u73.h.k(str, str2, str3, null);
    }
}
