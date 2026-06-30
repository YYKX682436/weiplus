package com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteUseCaseWrapper;", "Lcom/tencent/kinda/gen/IKindaLiteUseCaseWrapper;", "", "url", "Lcom/tencent/kinda/gen/ITransmitKvData;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "isEnableLiteAppUseCase", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "callback", "Ljz5/f0;", "startKindaLiteUseCaseImpl", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "Lcom/tencent/kinda/gen/UseCaseCallback;", "useCaseCallback$delegate", "Ljz5/g;", "getUseCaseCallback", "()Lcom/tencent/kinda/gen/UseCaseCallback;", com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.STORE_ACTION_USE_CASE_CALLBACK, "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper */
/* loaded from: classes9.dex */
public final class C3219xe3b1c997 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3406xc023872e {
    private static final java.lang.String TAG = "KindaLiteUseCaseWrapper";
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f callback;

    /* renamed from: useCaseCallback$delegate, reason: from kotlin metadata */
    private final jz5.g useCaseCallback = jz5.h.b(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3220xb7af1a7d(this));

    /* renamed from: getUseCaseCallback */
    private final com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c m25808x29b6a886() {
        return (com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c) this.useCaseCallback.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3406xc023872e
    /* renamed from: isEnableLiteAppUseCase */
    public boolean mo25809x6a93e3f1(java.lang.String url, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e data) {
        if (url == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "url is null");
            return false;
        }
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            return qVar.mo24773x6a93e3f1(url, data);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3406xc023872e
    /* renamed from: startKindaLiteUseCaseImpl */
    public void mo25810x13419afe(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        if (str == null || abstractC3411xcfaed72e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "url or data is null");
            return;
        }
        this.callback = abstractC3628xfac5d5f;
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            qVar.mo24837xef221a95(str, abstractC3411xcfaed72e, m25808x29b6a886());
        }
    }
}
