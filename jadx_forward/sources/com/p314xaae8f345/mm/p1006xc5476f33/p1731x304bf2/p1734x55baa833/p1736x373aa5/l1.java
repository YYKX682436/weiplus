package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes7.dex */
public class l1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1 f220749n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1 m1Var, android.content.Context context) {
        super(context);
        this.f220749n = m1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public android.graphics.PointF a(int i17) {
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) this.f220749n.f220753d.getLayoutManager()).a(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void c() {
        this.f220749n.getClass();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void d() {
        super.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1 m1Var = this.f220749n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "SmoothScrollerForFling onStop %d", java.lang.Integer.valueOf(m1Var.f220753d.mo7958x54496c8e()));
        if (m1Var.f220753d.mo7958x54496c8e() == 0) {
            m1Var.c();
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
