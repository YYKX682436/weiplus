package zx2;

/* loaded from: classes2.dex */
public final class b implements zx2.b0 {
    public b(int i17) {
    }

    @Override // zx2.b0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79) {
        android.view.View l17;
        int i17;
        android.view.View view;
        if (c15436x4c00d79 != null) {
            zx2.t tVar = c15436x4c00d79.f214636g;
            boolean z17 = true;
            if (tVar.getChildCount() > 1) {
                android.view.View childAt = tVar.getChildAt(1);
                jz5.f0 f0Var = null;
                zx2.w wVar = childAt instanceof zx2.w ? (zx2.w) childAt : null;
                java.lang.Object tag = (wVar == null || (view = wVar.f558629g) == null) ? null : view.getTag();
                zx2.c cVar = tag instanceof zx2.c ? (zx2.c) tag : null;
                if (cVar == null || (l17 = cVar.l()) == null) {
                    return;
                }
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                java.lang.System.nanoTime();
                if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                    z17 = false;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                int i18 = a17.f278668a;
                if (!z17 && i18 > (i17 = a17.f278669b)) {
                    i18 = i17;
                }
                int[] iArr = {0, 0};
                l17.getLocationOnScreen(iArr);
                int width = (i18 / 2) - (iArr[0] + (l17.getWidth() / 2));
                android.view.ViewGroup.LayoutParams layoutParams = c15436x4c00d79.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CenterAlignStrategy", "marginStart: " + marginLayoutParams.getMarginStart() + " delta:" + width + ' ');
                    marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + width);
                    c15436x4c00d79.setLayoutParams(marginLayoutParams);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CenterAlignStrategy", "tabLayoutParams null!");
                }
            }
        }
    }
}
