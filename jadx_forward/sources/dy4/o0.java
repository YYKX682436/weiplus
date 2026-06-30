package dy4;

/* loaded from: classes15.dex */
public final class o0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326226d;

    public o0(dy4.f1 f1Var) {
        this.f326226d = f1Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        dy4.f1 f1Var = this.f326226d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onPause: loss focus");
        ye1.e eVar = f1Var.f326160n;
        if (eVar != null) {
            eVar.mo1863x764d819b(true);
        }
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        dy4.f1 f1Var = this.f326226d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onResume: gain focus");
        ye1.e eVar = f1Var.f326160n;
        if (eVar != null) {
            eVar.mo1863x764d819b(false);
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        dy4.f1 f1Var = this.f326226d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onStop: loss focus");
        f1Var.z();
    }
}
