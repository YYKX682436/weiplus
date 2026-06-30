package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerImpl;", "Lcom/tencent/kinda/gen/KindaSessionIdListener;", "", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "Ljz5/f0;", "onSessionId", "Lh45/n;", "callback", "Lh45/n;", "getCallback", "()Lh45/n;", "setCallback", "(Lh45/n;)V", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl */
/* loaded from: classes9.dex */
public final class C3241xec66f8b8 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 {
    private h45.n callback;

    public final h45.n getCallback() {
        return this.callback;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78
    /* renamed from: onSessionId */
    public void mo25905x22647b32(java.lang.String str) {
        h45.n nVar = this.callback;
        if (nVar != null) {
            if (str == null) {
                str = "";
            }
            nVar.mo28746x22647b32(str);
        }
    }

    /* renamed from: setCallback */
    public final void m25906x6c4ebec7(h45.n nVar) {
        this.callback = nVar;
    }
}
