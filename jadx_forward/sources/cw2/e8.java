package cw2;

/* loaded from: classes2.dex */
public final class e8 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f305211d;

    public e8(cw2.f8 f8Var) {
        this.f305211d = f8Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        f25.e Vd = ((f25.n0) i95.n0.c(f25.n0.class)).Vd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f305211d.F0());
        sb6.append(' ');
        sb6.append(activity);
        sb6.append(" onPause: loss focus, session:");
        f25.m0 m0Var = Vd.f340626b;
        sb6.append(m0Var != null ? ((g25.e) m0Var).f349512b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", sb6.toString());
        cw2.f8 f8Var = this.f305211d;
        f25.m0 m0Var2 = Vd.f340626b;
        f8Var.I0(m0Var2 != null ? ((g25.e) m0Var2).f349512b : null);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        cw2.f8 f8Var = this.f305211d;
        sb6.append(f8Var.F0());
        sb6.append(' ');
        sb6.append(activity);
        sb6.append(" onResume: gain focus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", sb6.toString());
        f8Var.G0();
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        f25.e Vd = ((f25.n0) i95.n0.c(f25.n0.class)).Vd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f305211d.F0());
        sb6.append(' ');
        sb6.append(activity);
        sb6.append(" onStop: loss focus, session:");
        f25.m0 m0Var = Vd.f340626b;
        sb6.append(m0Var != null ? ((g25.e) m0Var).f349512b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", sb6.toString());
        this.f305211d.I0(null);
    }
}
