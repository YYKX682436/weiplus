package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class s1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198905d;

    /* renamed from: e, reason: collision with root package name */
    public final int f198906e;

    /* renamed from: f, reason: collision with root package name */
    public final int f198907f;

    /* renamed from: g, reason: collision with root package name */
    public final float f198908g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f198909h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f198910i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f198911m;

    /* renamed from: n, reason: collision with root package name */
    public db2.m5 f198912n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f198913o;

    /* renamed from: p, reason: collision with root package name */
    public final bm2.c f198914p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 f198915q;

    public s1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198905d = activity;
        this.f198906e = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f198907f = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        this.f198908g = activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9);
        this.f198913o = new java.util.ArrayList();
        this.f198914p = new bm2.c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.s82 s82Var;
        gm0.j1.d().q(4140, this);
        java.util.ArrayList arrayList = this.f198913o;
        if (i17 == 0 && i18 == 0) {
            db2.m5 m5Var = m1Var instanceof db2.m5 ? (db2.m5) m1Var : null;
            if (m5Var != null && (s82Var = m5Var.f309608i) != null) {
                arrayList.clear();
                arrayList.addAll(s82Var.m75941xfb821914(1));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveRecentPlayUIC", "recentPlayList.size:" + arrayList.size());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r1(this));
    }
}
