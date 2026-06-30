package cw1;

/* loaded from: classes3.dex */
public final class k0 implements c01.e8 {

    /* renamed from: d, reason: collision with root package name */
    public final long f304601d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304606i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304608n;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, android.widget.TextView textView, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView2, android.widget.TextView textView3) {
        this.f304602e = activityC13107x4291ddb8;
        this.f304603f = textView;
        this.f304604g = view;
        this.f304605h = view2;
        this.f304606i = view3;
        this.f304607m = textView2;
        this.f304608n = textView3;
    }

    @Override // c01.e8
    public void b(int i17, int i18) {
        yv1.h1.f(2, this.f304602e.f177180d);
        if (i18 <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.j0(this.f304603f, this.f304602e, i17, i18));
    }

    @Override // c01.e8
    public void c(boolean z17, long j17, int i17) {
        if (z17) {
            yv1.h1.g(0, null, 2, null);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.i0(this.f304602e, this.f304604g, this.f304605h, this.f304606i, z17, this.f304607m, this.f304608n));
        jx3.f.INSTANCE.d(25464, 15, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f304601d), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
