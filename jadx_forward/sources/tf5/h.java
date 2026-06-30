package tf5;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f500522d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f500523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07 f500524f;

    public h(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07 abstractC22341xb20d9d07, android.view.View view) {
        this.f500524f = abstractC22341xb20d9d07;
        this.f500523e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07 abstractC22341xb20d9d07 = this.f500524f;
        if (abstractC22341xb20d9d07.m7474xfb86a31b() == null) {
            return;
        }
        int a17 = com.p314xaae8f345.mm.ui.bl.a(abstractC22341xb20d9d07.mo7438x76847179());
        int i17 = com.p314xaae8f345.mm.ui.bl.i(abstractC22341xb20d9d07.mo7438x76847179(), -1);
        if (i17 <= 0) {
            if (this.f500522d < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC22341xb20d9d07.s0(), "[trySetParentViewPadding] try getStatusHeight again!");
                abstractC22341xb20d9d07.m7474xfb86a31b().post(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(abstractC22341xb20d9d07.s0(), "[trySetParentViewPadding] try getStatusHeight finally!");
            }
            this.f500522d++;
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07.f288133n;
            int t07 = abstractC22341xb20d9d07.t0();
            if (t07 != abstractC22341xb20d9d07.m7474xfb86a31b().getPaddingTop()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC22341xb20d9d07.s0(), "[trySetParentViewPadding] now:%s old:%s", java.lang.Integer.valueOf(t07), java.lang.Integer.valueOf(abstractC22341xb20d9d07.m7474xfb86a31b().getPaddingTop()));
                if (com.p314xaae8f345.mm.ui.a4.f278650a.h(abstractC22341xb20d9d07.mo78409x676b27cd())) {
                    abstractC22341xb20d9d07.m7474xfb86a31b().setPadding(0, t07, 0, 0);
                } else {
                    abstractC22341xb20d9d07.m7474xfb86a31b().setPadding(0, t07, 0, this.f500523e.getHeight());
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC22341xb20d9d07.s0(), "[trySetParentViewPadding] has try more once! it's right! actionBarHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC22341xb20d9d07.s0(), "[trySetParentViewPadding] tryCount:%s actionBarHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(this.f500522d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
    }
}
