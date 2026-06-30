package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class k4 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f183843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f183844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f183845c;

    public k4(android.view.MenuItem menuItem, android.app.Activity activity, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f183843a = menuItem;
        this.f183844b = activity;
        this.f183845c = k0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j4(this.f183843a, this.f183844b, bitmap, this.f183845c));
        }
    }
}
