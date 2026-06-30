package mi1;

/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.a1 f408041a = new mi1.a1();

    public static final java.util.Map a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        if (e9Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd bdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd) e9Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd.class);
        if (bdVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CapsuleBarUtils", "getBoundingRectFallback with appId[%s] NULL IMenuButtonLayoutPropertiesService", e9Var.mo48798x74292566());
            return null;
        }
        int E6 = bdVar.E6(e9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zd zdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zd) bdVar;
        android.content.Context context = (android.content.Context) zdVar.f171908f.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = zdVar.f171906d;
        if (context == null) {
            context = c11510xdd90c2f2.f156328d;
        }
        int b17 = a06.d.b(context.getResources().getDisplayMetrics().density * 96);
        android.content.Context context2 = (android.content.Context) zdVar.f171908f.mo141623x754a37bb();
        if (context2 == null) {
            context2 = c11510xdd90c2f2.f156328d;
        }
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561569m8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad a76 = bdVar.a7();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.b(e9Var)[0];
        int i18 = E6 + (a76 != null ? a76.f171044b : 0);
        int i19 = dimensionPixelSize + i18;
        int i27 = i17 - (a76 != null ? a76.f171045c : 0);
        java.util.Map c17 = f408041a.c(new android.graphics.Rect(i27 - b17, i18, i27, i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapsuleBarUtils", "getBoundingRectFallback with appId[%s] return %s", e9Var.mo48798x74292566(), c17);
        return c17;
    }

    public static final java.util.Map b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 pageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        int[] iArr = new int[2];
        al1.b r17 = pageView.r1();
        if (r17 != null && (m2209x716f693c3 = r17.m2209x716f693c()) != null) {
            m2209x716f693c3.getLocationInWindow(iArr);
        }
        al1.b r18 = pageView.r1();
        int width = (r18 == null || (m2209x716f693c2 = r18.m2209x716f693c()) == null) ? 0 : m2209x716f693c2.getWidth();
        al1.b r19 = pageView.r1();
        int height = (r19 == null || (m2209x716f693c = r19.m2209x716f693c()) == null) ? 0 : m2209x716f693c.getHeight();
        int i17 = iArr[1];
        int i18 = iArr[0];
        int i19 = i18 + width;
        int i27 = height + i17;
        if (i18 == 0 || width == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CapsuleBarUtils", "getBoundingRectLegacy with appId[%s] left==0, return null", pageView.mo48798x74292566());
            return null;
        }
        java.util.Map c17 = f408041a.c(new android.graphics.Rect(i18, i17, i19, i27));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapsuleBarUtils", "getBoundingRectLegacy with appId[%s] return %s", pageView.mo48798x74292566(), c17);
        return c17;
    }

    public static final mi1.z0 d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        mi1.v vVar = runtime.f156354z;
        if (vVar == null) {
            return mi1.z0.f408272e;
        }
        mi1.f b17 = vVar.b();
        if (!(runtime.f156354z.d().f172567e != null) || b17.d() == Integer.MIN_VALUE) {
            return b17.j() != Integer.MIN_VALUE ? e(b17.j()) : mi1.z0.f408272e;
        }
        int d17 = b17.d();
        return d17 == 1 ? mi1.z0.f408277m : d17 == 0 ? mi1.z0.f408278n : mi1.z0.f408272e;
    }

    public static final mi1.z0 e(int i17) {
        return i17 == 1 ? mi1.z0.f408274g : i17 == 2 ? mi1.z0.f408275h : i17 == 3 ? mi1.z0.f408276i : mi1.z0.f408272e;
    }

    public final java.util.Map c(android.graphics.Rect rect) {
        rect.left = ik1.w.e(rect.left);
        rect.top = ik1.w.e(rect.top);
        rect.right = ik1.w.e(rect.right);
        rect.bottom = ik1.w.e(rect.bottom);
        java.util.HashMap hashMap = new java.util.HashMap(6);
        hashMap.put("left", java.lang.Integer.valueOf(rect.left));
        hashMap.put("top", java.lang.Integer.valueOf(rect.top));
        hashMap.put("right", java.lang.Integer.valueOf(rect.right));
        hashMap.put("bottom", java.lang.Integer.valueOf(rect.bottom));
        hashMap.put("width", java.lang.Integer.valueOf(rect.width()));
        hashMap.put("height", java.lang.Integer.valueOf(rect.height()));
        return hashMap;
    }
}
