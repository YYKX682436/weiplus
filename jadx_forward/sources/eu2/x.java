package eu2;

/* loaded from: classes2.dex */
public final class x implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f338346d;

    public x(eu2.b0 b0Var) {
        this.f338346d = b0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onPause]: loss focus");
        pm0.v.X(new eu2.v(this.f338346d));
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onResume]: gain focus");
        pm0.v.X(new eu2.u(this.f338346d));
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onStop]: loss focus");
        pm0.v.X(new eu2.w(this.f338346d));
    }
}
