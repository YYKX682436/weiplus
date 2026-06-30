package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f184586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15296xf9ed3206 f184588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15296xf9ed3206 c15296xf9ed3206) {
        super(0);
        this.f184586d = qgVar;
        this.f184587e = i17;
        this.f184588f = c15296xf9ed3206;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        int dimensionPixelOffset;
        int i17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f184586d.f185913e.f190288g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) a17;
        int i18 = this.f184587e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi X6 = blVar.X6(i18);
        if (X6 != null && X6.f216059c) {
            java.lang.Object obj = X6.f216057a;
            zx2.u uVar = obj instanceof zx2.u ? (zx2.u) obj : null;
            if (uVar != null) {
                view = uVar.f558619f;
            }
            view = null;
        } else {
            java.lang.Object obj2 = X6 != null ? X6.f216057a : null;
            oa.i iVar = obj2 instanceof oa.i ? (oa.i) obj2 : null;
            if (iVar != null) {
                view = iVar.f425316f;
            }
            view = null;
        }
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15296xf9ed3206 c15296xf9ed3206 = this.f184588f;
        int width = view != null ? view.getWidth() : c15296xf9ed3206.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        int i19 = iArr[0];
        if (i19 > 0) {
            dimensionPixelOffset = (i19 + (width / 2)) - (c15296xf9ed3206.getWidth() / 2);
        } else {
            int r76 = blVar.r7();
            float f17 = (X6 == null || r76 <= 0) ? i18 != 1 ? i18 != 3 ? 0.6666667f : 0.33333334f : 0.5f : X6.f216060d / r76;
            com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i27 = a18.f278668a;
            if (!z17 && i27 > (i17 = a18.f278669b)) {
                i27 = i17;
            }
            dimensionPixelOffset = (int) ((i27 * f17) - c15296xf9ed3206.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[adjustFeedBackBubbleLayout] attachTabType=");
        sb6.append(i18);
        sb6.append(", width=");
        sb6.append(c15296xf9ed3206.getWidth());
        sb6.append(" x_value=");
        sb6.append(iArr[0]);
        sb6.append(" targetTabViewWidth=");
        sb6.append(width);
        sb6.append(", startPadding=");
        sb6.append(dimensionPixelOffset);
        sb6.append(" targetTabView is null?=");
        sb6.append(view == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullMergedHeaderConvert", sb6.toString());
        android.view.ViewGroup.LayoutParams layoutParams = c15296xf9ed3206.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = ((int) c15296xf9ed3206.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay)) + ((int) c15296xf9ed3206.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj)) + com.p314xaae8f345.mm.ui.bl.h(c15296xf9ed3206.getContext());
            marginLayoutParams.leftMargin = dimensionPixelOffset;
        }
        c15296xf9ed3206.requestLayout();
        return jz5.f0.f384359a;
    }
}
