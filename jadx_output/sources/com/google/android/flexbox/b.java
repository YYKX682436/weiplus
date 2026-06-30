package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public int f44234e;

    /* renamed from: f, reason: collision with root package name */
    public int f44235f;

    /* renamed from: g, reason: collision with root package name */
    public int f44236g;

    /* renamed from: h, reason: collision with root package name */
    public int f44237h;

    /* renamed from: i, reason: collision with root package name */
    public int f44238i;

    /* renamed from: j, reason: collision with root package name */
    public float f44239j;

    /* renamed from: k, reason: collision with root package name */
    public float f44240k;

    /* renamed from: l, reason: collision with root package name */
    public int f44241l;

    /* renamed from: m, reason: collision with root package name */
    public int f44242m;

    /* renamed from: o, reason: collision with root package name */
    public int f44244o;

    /* renamed from: p, reason: collision with root package name */
    public int f44245p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f44246q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f44247r;

    /* renamed from: a, reason: collision with root package name */
    public int f44230a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f44231b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f44232c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f44233d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f44243n = new java.util.ArrayList();

    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        this.f44230a = java.lang.Math.min(this.f44230a, (view.getLeft() - flexItem.getMarginLeft()) - i17);
        this.f44231b = java.lang.Math.min(this.f44231b, (view.getTop() - flexItem.getMarginTop()) - i18);
        this.f44232c = java.lang.Math.max(this.f44232c, view.getRight() + flexItem.getMarginRight() + i19);
        this.f44233d = java.lang.Math.max(this.f44233d, view.getBottom() + flexItem.getMarginBottom() + i27);
    }
}
