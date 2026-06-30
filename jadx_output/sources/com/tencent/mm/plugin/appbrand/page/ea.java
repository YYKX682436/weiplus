package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ea extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.qd f86573i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f86574j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f86575k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(com.tencent.mm.plugin.appbrand.page.ia iaVar, long j17, java.lang.Boolean bool, int i17, com.tencent.mm.plugin.appbrand.page.qd qdVar, int i18) {
        super(j17, bool);
        this.f86575k = iaVar;
        this.f86572h = i17;
        this.f86573i = qdVar;
        this.f86574j = i18;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.plugin.appbrand.page.ha p17;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.appbrand.page.ha p18;
        android.view.ViewGroup n17;
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f86575k;
        int i17 = iaVar.f86760d;
        int i18 = this.f86572h;
        boolean z17 = false;
        if (i18 != i17 && (p17 = iaVar.p(i18)) != null && (weakReference = p17.f86681a) != null && (view = (android.view.View) weakReference.get()) != null) {
            iaVar.f86765i = i18;
            int i19 = p17.f86683c;
            android.view.ViewGroup n18 = iaVar.n(i19, false, false);
            if ((n18 instanceof com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView) && ((com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView) n18).f80626d && (p18 = iaVar.p(i19)) != null && (n17 = iaVar.n(p18.f86683c, false, false)) != null) {
                android.view.View view2 = (android.view.View) weakReference.get();
                if (view2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    view2.setLayoutParams(layoutParams);
                }
                iaVar.f86765i = p18.f86682b;
                p17 = p18;
                n18 = n17;
            }
            if (n18 != null) {
                view = (android.view.View) p17.f86681a.get();
                int indexOfChild = n18.indexOfChild(view);
                android.view.View view3 = iaVar.f86762f;
                if (view3 != null && (viewGroup = (android.view.ViewGroup) view3.getParent()) != null) {
                    viewGroup.removeView(view3);
                }
                n18.addView(view3, indexOfChild);
                n18.removeView(view);
            }
            iaVar.f86761e = new float[]{view.getX(), view.getY(), view.getWidth(), view.getHeight(), p17.f86684d};
            iaVar.f86764h.e(view, this.f86574j);
            iaVar.f86760d = i18;
            iaVar.f86763g = this.f86573i;
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
