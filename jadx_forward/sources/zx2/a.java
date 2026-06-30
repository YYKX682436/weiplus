package zx2;

/* loaded from: classes2.dex */
public final class a implements zx2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f558561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f558562b;

    public a(boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f558561a = z17;
        this.f558562b = i17;
    }

    @Override // zx2.b0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79) {
        int i17;
        int i18;
        if (c15436x4c00d79 != null) {
            int childCount = c15436x4c00d79.f214636g.getChildCount();
            boolean z17 = true;
            if (childCount < 2 || childCount % 2 != 0 || !this.f558561a) {
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                java.lang.System.nanoTime();
                if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                    z17 = false;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                int i19 = a17.f278668a;
                if (!z17 && i19 > (i17 = a17.f278669b)) {
                    i19 = i17;
                }
                int[] iArr = {0, 0};
                c15436x4c00d79.getLocationOnScreen(iArr);
                c(c15436x4c00d79, ((i19 / 2) - (iArr[0] + (c15436x4c00d79.getWidth() / 2))) + this.f558562b);
                return;
            }
            int i27 = childCount / 2;
            zx2.c b17 = b(c15436x4c00d79, i27 - 1);
            zx2.c b18 = b(c15436x4c00d79, i27);
            android.view.View m17 = b17 != null ? b17.m() : null;
            android.view.View o17 = b18 != null ? b18.o() : null;
            if (m17 == null || o17 == null) {
                return;
            }
            int[] iArr2 = {0, 0};
            m17.getLocationOnScreen(iArr2);
            int[] iArr3 = {0, 0};
            o17.getLocationOnScreen(iArr3);
            int width = ((iArr2[0] + m17.getWidth()) + iArr3[0]) / 2;
            com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i28 = a18.f278668a;
            if (!z18 && i28 > (i18 = a18.f278669b)) {
                i28 = i18;
            }
            c(c15436x4c00d79, (i28 / 2) - width);
        }
    }

    public final zx2.c b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79, int i17) {
        android.view.View view;
        android.view.View childAt = c15436x4c00d79.f214636g.getChildAt(i17);
        zx2.w wVar = childAt instanceof zx2.w ? (zx2.w) childAt : null;
        java.lang.Object tag = (wVar == null || (view = wVar.f558629g) == null) ? null : view.getTag();
        if (tag instanceof zx2.c) {
            return (zx2.c) tag;
        }
        return null;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = c15436x4c00d79.getLayoutParams();
        jz5.f0 f0Var = null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CenterAlignStrategy", "marginStart: " + marginLayoutParams.getMarginStart() + " delta:" + i17 + ' ');
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + i17);
            c15436x4c00d79.setLayoutParams(marginLayoutParams);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CenterAlignStrategy", "tabLayoutParams null!");
        }
    }
}
