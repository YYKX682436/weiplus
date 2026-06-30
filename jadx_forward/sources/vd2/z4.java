package vd2;

/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f517583a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f517584b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f517585c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f517586d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 f517587e;

    /* renamed from: f, reason: collision with root package name */
    public int f517588f;

    public z4(android.app.Activity activity, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f517583a = activity;
        this.f517584b = qt2Var;
        this.f517585c = "Finder.FinderLiveViewCallback.Manager@" + hashCode();
        this.f517588f = -1;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419, boolean z17, boolean z18) {
        java.lang.String str = "deactivate plugin pos:" + this.f517588f;
        java.lang.String str2 = this.f517585c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (c14353xe7c1f419 != null) {
            c14353xe7c1f419.m57734x6761d4f(false, z18);
            c14353xe7c1f419.mo46559xed5f7500();
            android.view.ViewParent parent = c14353xe7c1f419.getParent();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = parent instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) parent : null;
            if (c22646x1e9ca55 != null) {
                c22646x1e9ca55.m81437x205ac394(i65.a.b(c22646x1e9ca55.getContext(), 8));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "after deactivate plugin");
    }
}
