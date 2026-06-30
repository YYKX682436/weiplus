package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class j2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 f173526n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 l2Var, android.content.Context context) {
        super(context);
        this.f173526n = l2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public android.graphics.PointF a(int i17) {
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) this.f173526n.f173532d.getLayoutManager()).a(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void c() {
        this.f173526n.getClass();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void d() {
        super.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 l2Var = this.f173526n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "SmoothScrollerForFling onStop %d", java.lang.Integer.valueOf(l2Var.f173532d.mo7958x54496c8e()));
        if (l2Var.f173532d.mo7958x54496c8e() == 0) {
            l2Var.d();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 40.0f / displayMetrics.densityDpi;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int m() {
        return -1;
    }
}
