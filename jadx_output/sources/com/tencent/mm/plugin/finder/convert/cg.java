package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView f103055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(com.tencent.mm.plugin.finder.convert.qg qgVar, int i17, com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView) {
        super(0);
        this.f103053d = qgVar;
        this.f103054e = i17;
        this.f103055f = finderHomeTabFeedBackBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        int dimensionPixelOffset;
        int i17;
        com.tencent.mm.ui.MMActivity activity = this.f103053d.f104380e.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = (com.tencent.mm.plugin.finder.viewmodel.component.bl) a17;
        int i18 = this.f103054e;
        com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = blVar.X6(i18);
        if (X6 != null && X6.f134526c) {
            java.lang.Object obj = X6.f134524a;
            zx2.u uVar = obj instanceof zx2.u ? (zx2.u) obj : null;
            if (uVar != null) {
                view = uVar.f477086f;
            }
            view = null;
        } else {
            java.lang.Object obj2 = X6 != null ? X6.f134524a : null;
            oa.i iVar = obj2 instanceof oa.i ? (oa.i) obj2 : null;
            if (iVar != null) {
                view = iVar.f343783f;
            }
            view = null;
        }
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView = this.f103055f;
        int width = view != null ? view.getWidth() : finderHomeTabFeedBackBubbleView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
        int i19 = iArr[0];
        if (i19 > 0) {
            dimensionPixelOffset = (i19 + (width / 2)) - (finderHomeTabFeedBackBubbleView.getWidth() / 2);
        } else {
            int r76 = blVar.r7();
            float f17 = (X6 == null || r76 <= 0) ? i18 != 1 ? i18 != 3 ? 0.6666667f : 0.33333334f : 0.5f : X6.f134527d / r76;
            com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i27 = a18.f197135a;
            if (!z17 && i27 > (i17 = a18.f197136b)) {
                i27 = i17;
            }
            dimensionPixelOffset = (int) ((i27 * f17) - finderHomeTabFeedBackBubbleView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[adjustFeedBackBubbleLayout] attachTabType=");
        sb6.append(i18);
        sb6.append(", width=");
        sb6.append(finderHomeTabFeedBackBubbleView.getWidth());
        sb6.append(" x_value=");
        sb6.append(iArr[0]);
        sb6.append(" targetTabViewWidth=");
        sb6.append(width);
        sb6.append(", startPadding=");
        sb6.append(dimensionPixelOffset);
        sb6.append(" targetTabView is null?=");
        sb6.append(view == null);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullMergedHeaderConvert", sb6.toString());
        android.view.ViewGroup.LayoutParams layoutParams = finderHomeTabFeedBackBubbleView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = ((int) finderHomeTabFeedBackBubbleView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479623ay)) + ((int) finderHomeTabFeedBackBubbleView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj)) + com.tencent.mm.ui.bl.h(finderHomeTabFeedBackBubbleView.getContext());
            marginLayoutParams.leftMargin = dimensionPixelOffset;
        }
        finderHomeTabFeedBackBubbleView.requestLayout();
        return jz5.f0.f302826a;
    }
}
