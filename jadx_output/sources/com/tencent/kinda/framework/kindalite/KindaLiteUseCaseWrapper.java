package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteUseCaseWrapper;", "Lcom/tencent/kinda/gen/IKindaLiteUseCaseWrapper;", "", "url", "Lcom/tencent/kinda/gen/ITransmitKvData;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "isEnableLiteAppUseCase", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "callback", "Ljz5/f0;", "startKindaLiteUseCaseImpl", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "Lcom/tencent/kinda/gen/UseCaseCallback;", "useCaseCallback$delegate", "Ljz5/g;", "getUseCaseCallback", "()Lcom/tencent/kinda/gen/UseCaseCallback;", com.tencent.kinda.framework.kindalite.KindaLiteDef.STORE_ACTION_USE_CASE_CALLBACK, "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class KindaLiteUseCaseWrapper implements com.tencent.kinda.gen.IKindaLiteUseCaseWrapper {
    private static final java.lang.String TAG = "KindaLiteUseCaseWrapper";
    private com.tencent.kinda.gen.VoidITransmitKvDataCallback callback;

    /* renamed from: useCaseCallback$delegate, reason: from kotlin metadata */
    private final jz5.g useCaseCallback = jz5.h.b(new com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper$useCaseCallback$2(this));

    private final com.tencent.kinda.gen.UseCaseCallback getUseCaseCallback() {
        return (com.tencent.kinda.gen.UseCaseCallback) this.useCaseCallback.getValue();
    }

    @Override // com.tencent.kinda.gen.IKindaLiteUseCaseWrapper
    public boolean isEnableLiteAppUseCase(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData data) {
        if (url == null) {
            com.tencent.mars.xlog.Log.w(TAG, "url is null");
            return false;
        }
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            return qVar.isEnableLiteAppUseCase(url, data);
        }
        return false;
    }

    @Override // com.tencent.kinda.gen.IKindaLiteUseCaseWrapper
    public void startKindaLiteUseCaseImpl(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        if (str == null || iTransmitKvData == null) {
            com.tencent.mars.xlog.Log.w(TAG, "url or data is null");
            return;
        }
        this.callback = voidITransmitKvDataCallback;
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            qVar.startUseCase(str, iTransmitKvData, getUseCaseCallback());
        }
    }
}
