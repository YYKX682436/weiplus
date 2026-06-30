package com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public int f125767e;

    /* renamed from: f, reason: collision with root package name */
    public int f125768f;

    /* renamed from: g, reason: collision with root package name */
    public int f125769g;

    /* renamed from: h, reason: collision with root package name */
    public int f125770h;

    /* renamed from: i, reason: collision with root package name */
    public int f125771i;

    /* renamed from: j, reason: collision with root package name */
    public float f125772j;

    /* renamed from: k, reason: collision with root package name */
    public float f125773k;

    /* renamed from: l, reason: collision with root package name */
    public int f125774l;

    /* renamed from: m, reason: collision with root package name */
    public int f125775m;

    /* renamed from: o, reason: collision with root package name */
    public int f125777o;

    /* renamed from: p, reason: collision with root package name */
    public int f125778p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f125779q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f125780r;

    /* renamed from: a, reason: collision with root package name */
    public int f125763a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f125764b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f125765c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f125766d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f125776n = new java.util.ArrayList();

    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) view.getLayoutParams();
        this.f125763a = java.lang.Math.min(this.f125763a, (view.getLeft() - interfaceC1624x6bcaaecc.mo17207x63bacacb()) - i17);
        this.f125764b = java.lang.Math.min(this.f125764b, (view.getTop() - interfaceC1624x6bcaaecc.mo17209xc1272e11()) - i18);
        this.f125765c = java.lang.Math.max(this.f125765c, view.getRight() + interfaceC1624x6bcaaecc.mo17208x13f4efd8() + i19);
        this.f125766d = java.lang.Math.max(this.f125766d, view.getBottom() + interfaceC1624x6bcaaecc.mo17206x4fb623ef() + i27);
    }
}
