package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class in implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f103676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f103677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f103678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103679g;

    public in(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, so2.u1 u1Var, com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var) {
        this.f103676d = finderVideoLayout;
        this.f103677e = u1Var;
        this.f103678f = ynVar;
        this.f103679g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f103676d.isSelectedToPlay;
        com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", "setOnClickListener onMediaClick  " + this.f103677e + ", isViewSelected=" + z17);
        if (z17) {
            com.tencent.mm.plugin.finder.convert.yn.Q1(this.f103678f, this.f103679g, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
