package p14;

/* loaded from: classes5.dex */
public final class n implements x14.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff f432770a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff c17366x88027ff) {
        this.f432770a = c17366x88027ff;
    }

    public final void a(int i17, int i18) {
        int m68944x146ed6fa;
        int m68944x146ed6fa2;
        int m68944x146ed6fa3;
        int m68943x4bd0e63e;
        int m68944x146ed6fa4;
        int m68943x4bd0e63e2;
        android.widget.ImageView m68947x8963b0f1;
        android.widget.LinearLayout m68935x7f3f33e5;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff c17366x88027ff = this.f432770a;
        c17366x88027ff.m68944x146ed6fa();
        m68944x146ed6fa = c17366x88027ff.m68944x146ed6fa();
        if (i17 > m68944x146ed6fa) {
            m68944x146ed6fa2 = c17366x88027ff.m68944x146ed6fa();
            if (i18 > m68944x146ed6fa2) {
                m68944x146ed6fa3 = c17366x88027ff.m68944x146ed6fa();
                int i19 = i17 - m68944x146ed6fa3;
                m68943x4bd0e63e = c17366x88027ff.m68943x4bd0e63e();
                int min = java.lang.Math.min(i19, m68943x4bd0e63e);
                m68944x146ed6fa4 = c17366x88027ff.m68944x146ed6fa();
                int i27 = i18 - m68944x146ed6fa4;
                m68943x4bd0e63e2 = c17366x88027ff.m68943x4bd0e63e();
                int min2 = java.lang.Math.min(i27, m68943x4bd0e63e2);
                m68947x8963b0f1 = c17366x88027ff.m68947x8963b0f1();
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff.l(c17366x88027ff, m68947x8963b0f1, min, java.lang.Integer.valueOf(min2));
                m68935x7f3f33e5 = c17366x88027ff.m68935x7f3f33e5();
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff.l(c17366x88027ff, m68935x7f3f33e5, min, java.lang.Integer.valueOf(min2));
            }
        }
    }
}
