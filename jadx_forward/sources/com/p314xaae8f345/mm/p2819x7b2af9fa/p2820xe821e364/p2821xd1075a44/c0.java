package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public int f296008b;

    /* renamed from: c, reason: collision with root package name */
    public int f296009c;

    /* renamed from: d, reason: collision with root package name */
    public int f296010d;

    /* renamed from: e, reason: collision with root package name */
    public int f296011e;

    /* renamed from: f, reason: collision with root package name */
    public int f296012f;

    /* renamed from: g, reason: collision with root package name */
    public int f296013g;

    /* renamed from: j, reason: collision with root package name */
    public int f296016j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f296018l;

    /* renamed from: a, reason: collision with root package name */
    public boolean f296007a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f296014h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f296015i = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f296017k = null;

    public void a(android.view.View view) {
        int a17;
        int size = this.f296017k.size();
        android.view.View view2 = null;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < size; i18++) {
            android.view.View view3 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) this.f296017k.get(i18)).f296236d;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams layoutParams = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.f295958a.m() && (a17 = (layoutParams.a() - this.f296010d) * this.f296011e) >= 0 && a17 < i17) {
                view2 = view3;
                if (a17 == 0) {
                    break;
                } else {
                    i17 = a17;
                }
            }
        }
        if (view2 == null) {
            this.f296010d = -1;
        } else {
            this.f296010d = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view2.getLayoutParams()).a();
        }
    }
}
