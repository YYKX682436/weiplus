package x03;

/* loaded from: classes15.dex */
public final class q0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532636d;

    public q0(x03.u0 u0Var) {
        this.f532636d = u0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public final void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        x03.u0 u0Var = this.f532636d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, interfaceC26164x73fc6bc6 + " on complete");
        x03.s1 s1Var = u0Var.f532669d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 4, interfaceC26164x73fc6bc6);
        }
    }
}
