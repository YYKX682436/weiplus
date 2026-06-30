package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class b2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f171572n;

    /* renamed from: o, reason: collision with root package name */
    public final int f171573o;

    /* renamed from: p, reason: collision with root package name */
    public final int f171574p;

    public b2(android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        super(context);
        this.f171572n = c1162x665295de;
        this.f171573o = 3000;
        this.f171574p = java.lang.Math.round(context.getResources().getDisplayMetrics().heightPixels * 0.75f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public android.graphics.PointF a(int i17) {
        return this.f171572n.a(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int l(int i17) {
        return super.l(java.lang.Math.max(this.f171574p, java.lang.Math.min(this.f171573o, i17)));
    }
}
