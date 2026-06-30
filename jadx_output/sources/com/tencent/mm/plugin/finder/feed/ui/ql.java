package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI f110461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f110462e;

    public ql(com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI, android.view.View view) {
        this.f110461d = finderTeenModeLimitUI;
        this.f110462e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI = this.f110461d;
        boolean z17 = finderTeenModeLimitUI.f109557u;
        hy2.g gVar = hy2.g.f286058a;
        int i17 = 11;
        android.view.View view2 = this.f110462e;
        if (z17) {
            java.lang.String str2 = gVar.b() + ":00";
            java.lang.String str3 = "0" + gVar.a() + ":00";
            if (finderTeenModeLimitUI.f109558v != 7) {
                i17 = finderTeenModeLimitUI.f109557u ? 6 : 5;
            } else if (!finderTeenModeLimitUI.f109557u) {
                i17 = 10;
            }
            str = "finder_limit_curfew_" + c01.id.e();
            string = view2.getResources().getString(finderTeenModeLimitUI.f109558v == 7 ? com.tencent.mm.R.string.f492844i36 : com.tencent.mm.R.string.f6w, str2, str3);
        } else {
            int c17 = gVar.c() / 60;
            if (finderTeenModeLimitUI.f109558v != 7) {
                i17 = finderTeenModeLimitUI.f109557u ? 6 : 5;
            } else if (!finderTeenModeLimitUI.f109557u) {
                i17 = 10;
            }
            str = "finder_limit_time_lock_" + c01.id.e();
            string = view2.getResources().getString(com.tencent.mm.R.string.f492102f72, java.lang.Integer.valueOf(c17));
        }
        java.lang.String str4 = string;
        int i18 = i17;
        java.lang.String str5 = str;
        kotlin.jvm.internal.o.d(str4);
        com.tencent.mars.xlog.Log.i("FinderHotWordTimelineUI", "key: " + str5);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).u6(view2.getContext(), i18, str5, view2.getResources().getString(finderTeenModeLimitUI.f109558v == 7 ? com.tencent.mm.R.string.i3b : com.tencent.mm.R.string.f7d), str4, "", null, new com.tencent.mm.plugin.finder.feed.ui.pl(finderTeenModeLimitUI));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
