package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.seek.FinderSeekBar f104545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f104546i;

    public sd(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, com.tencent.mm.plugin.finder.video.seek.FinderSeekBar finderSeekBar, android.widget.LinearLayout linearLayout) {
        this.f104541d = qeVar;
        this.f104542e = s0Var;
        this.f104543f = baseFinderFeed;
        this.f104544g = i17;
        this.f104545h = finderSeekBar;
        this.f104546i = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104541d;
        in5.s0 s0Var = this.f104542e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104543f;
        qeVar.I1(s0Var, baseFinderFeed, this.f104544g, false);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.g99);
        if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.video.seek.FinderSeekBar finderSeekBar = this.f104545h;
        if (finderSeekBar != null) {
            finderSeekBar.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f104546i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        baseFinderFeed.B1(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
