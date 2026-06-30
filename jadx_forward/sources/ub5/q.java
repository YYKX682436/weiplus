package ub5;

/* loaded from: classes3.dex */
public final class q implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f507774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f507775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f507776f;

    public q(boolean z17, android.app.Activity activity, boolean z18) {
        this.f507774d = z17;
        this.f507775e = activity;
        this.f507776f = z18;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        boolean z17 = this.f507774d;
        android.app.Activity activity = this.f507775e;
        if (z17) {
            g4Var.h(1, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njh), com.p314xaae8f345.mm.R.raw.f79032x574cb5f9, activity.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        if (this.f507776f) {
            db5.h4 h4Var = new db5.h4(activity, 2, 0);
            h4Var.f309901i = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nji);
            h4Var.d(com.p314xaae8f345.mm.R.raw.f80366xb6aaf2cf, activity.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            g4Var.v(h4Var);
        }
    }
}
