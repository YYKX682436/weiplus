package aw2;

/* loaded from: classes10.dex */
public final class y0 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f96353d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f96354e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15256x26e1a935 f96355f;

    /* renamed from: g, reason: collision with root package name */
    public int f96356g;

    public y0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f96353d = activity;
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.buf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f96355f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15256x26e1a935) findViewById;
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f96353d;
        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.bue);
        g92.b bVar = g92.b.f351302e;
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(abstractActivityC21394xb3d2c0cf), false, 2, null);
        boolean z17 = ((((j37 != null ? j37.f68698x26b1b2e8 : 0) & 8192) != 0) || ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207942h).mo141623x754a37bb()).r()).intValue() == 1) && this.f96356g == 0;
        int i17 = z17 ? 0 : 8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15256x26e1a935 c15256x26e1a935 = this.f96355f;
        c15256x26e1a935.setVisibility(i17);
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderSetNewsFeedWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderSetNewsFeedWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m92.b j38 = g92.a.j3(bVar, xy2.c.e(abstractActivityC21394xb3d2c0cf), false, 2, null);
        if ((((j38 != null ? j38.f68698x26b1b2e8 : 0) & 8192) != 0) && c15256x26e1a935.a()) {
            android.os.Bundle bundle = this.f96354e;
            if (bundle != null) {
                bundle.putInt("KEY_POST_OBJECT_TYPE", 1);
                return;
            }
            return;
        }
        android.os.Bundle bundle2 = this.f96354e;
        if (bundle2 != null) {
            bundle2.putInt("KEY_POST_OBJECT_TYPE", 0);
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        a();
    }
}
