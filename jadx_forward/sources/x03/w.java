package x03;

/* loaded from: classes15.dex */
public final class w implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532687d;

    public w(x03.i0 i0Var) {
        this.f532687d = i0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public final void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        x03.i0 i0Var = this.f532687d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f532577a, interfaceC26164x73fc6bc6 + " on seek");
        x03.s1 s1Var = i0Var.f532580d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 9, interfaceC26164x73fc6bc6);
        }
    }
}
