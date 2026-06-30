package n34;

/* loaded from: classes4.dex */
public final class s3 implements z35.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f416259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f416260e;

    public s3(n34.v3 v3Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d) {
        this.f416259d = v3Var;
        this.f416260e = c17983xb14a9c8d;
    }

    @Override // z35.d0
    public void D0(android.widget.SeekBar seekBar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStopTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getShowCutSameView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n34.v3 v3Var = this.f416259d;
        boolean z17 = v3Var.f416285d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getShowCutSameView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            android.view.View view = v3Var.f416284c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStopTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStopTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f416260e;
        if (c17983xb14a9c8d != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 a17 = n34.v3.a(v3Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            c17983xb14a9c8d.Z((int) (a17.c(i17) / 1000), true);
        }
        if (c17983xb14a9c8d != null) {
            c17983xb14a9c8d.m70641xcbc2dc9b(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n34.o3 o3Var = v3Var.f416292k;
        o3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispose", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = o3Var.f416229f.f416291j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n3Var.mo50300x3fa464aa(o3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispose", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStopTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
    }

    @Override // z35.d0
    public void g6(android.widget.SeekBar seekBar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        android.view.View view = this.f416259d.f416284c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStartTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStartTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f416260e;
        if (c17983xb14a9c8d != null) {
            c17983xb14a9c8d.F();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
    }

    @Override // z35.d0
    /* renamed from: onProgressChanged */
    public void mo129341x95ed2be8(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgressChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
        if (z17) {
            n34.v3 v3Var = this.f416259d;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 a17 = n34.v3.a(v3Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            int c17 = (int) (a17.c(i17) / 1000);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            n34.o3 o3Var = v3Var.f416292k;
            o3Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("schedule", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
            o3Var.f416227d = c17;
            if (android.os.SystemClock.uptimeMillis() - o3Var.f416228e > 100) {
                o3Var.run();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                n34.v3 v3Var2 = o3Var.f416229f;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = v3Var2.f416291j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                n3Var.mo50300x3fa464aa(o3Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = v3Var2.f416291j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                n3Var2.mo50297x7c4d7ca2(o3Var, 100L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("schedule", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgressChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
    }
}
