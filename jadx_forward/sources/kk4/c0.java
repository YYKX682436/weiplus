package kk4;

/* loaded from: classes4.dex */
public final class c0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f390053d;

    public c0(kk4.f0 f0Var) {
        this.f390053d = f0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public final void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        kk4.f0 f0Var = this.f390053d;
        com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener iOnInfoListener = f0Var.f390063f;
        if (iOnInfoListener != null) {
            iOnInfoListener.mo53278xc39adf2d(interfaceC26164x73fc6bc6, i17, j17, j18, obj);
        }
        if (i17 == 106) {
            f0Var.f390062e = true;
        }
    }
}
