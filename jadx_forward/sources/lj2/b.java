package lj2;

/* loaded from: classes10.dex */
public final class b implements ai2.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400351a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400352b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400353c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400354d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f400355e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f400356f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f400357g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f400358h;

    public b(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f400351a = rootView;
        this.f400352b = "FinderLiveBattleDrawResultBarWidget";
        this.f400353c = "finder_live_pk_result_draw.pag";
        this.f400354d = "finder_live_pk_result_draw_en.pag";
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.eoi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f400355e = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.eog);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f400356f = textView;
        this.f400358h = p3325xe03a0797.p3326xc267989b.z0.b();
        textView.setVisibility(8);
    }

    @Override // ai2.a
    public android.view.View h() {
        return this.f400351a;
    }

    @Override // ai2.a
    public void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400352b, "battleStart withAnim:" + z17);
        this.f400355e.setVisibility(8);
        this.f400356f.setVisibility(8);
        android.view.View view = this.f400351a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ai2.a
    public void j(boolean z17, dk2.u4 u4Var) {
        java.lang.String str = this.f400352b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "battleEnd curBattle:" + u4Var);
        if (u4Var != null) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? this.f400353c : this.f400354d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "battleEnd pagRes:" + str2);
            this.f400356f.setVisibility(8);
            if (str2 == null || str2.length() == 0) {
                return;
            }
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            boolean a17 = ae2.in.f85221a.a(ym5.f6.R);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f400355e;
            c22789xd23e9a9b.o(a17);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f400357g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f400357g = p3325xe03a0797.p3326xc267989b.l.d(this.f400358h, null, null, new lj2.a(str2, this, null), 3, null);
            c22789xd23e9a9b.setVisibility(0);
            android.view.View view = this.f400351a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleEnd", "(ZLcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleEnd", "(ZLcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ai2.a
    /* renamed from: reset */
    public void mo2073x6761d4f() {
        this.f400355e.n();
        android.view.View view = this.f400351a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f400357g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f400357g = null;
    }
}
