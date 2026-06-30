package be1;

/* loaded from: classes7.dex */
public class x1 implements be1.v1 {
    @Override // be1.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map a(java.lang.String type, com.tencent.mm.plugin.appbrand.y component) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(component, "component");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a(component);
        int i17 = 0;
        int i18 = a17[0];
        int i19 = a17[1];
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i19)));
        be1.f0.G(hashMap, component, i18, i19);
        hashMap.put("statusBarHeight", java.lang.Integer.valueOf(ik1.w.e(be1.f0.E(component))));
        int[] b17 = com.tencent.mm.plugin.appbrand.utils.f5.b(component);
        int i27 = b17[0];
        int i28 = b17[1];
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(i27)));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(i28)));
        try {
            int[] iArr = new int[2];
            com.tencent.mm.plugin.appbrand.page.v5 a18 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(component);
            android.widget.FrameLayout pageArea = a18 == null ? null : a18.getPageArea();
            if (pageArea != null) {
                pageArea.getLocationOnScreen(iArr);
                i17 = iArr[1];
            }
            hashMap.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.GetSystemInfoNewLU", e17.getMessage());
        }
        c(component, hashMap);
        return hashMap;
    }

    public void c(com.tencent.mm.plugin.appbrand.y component, java.util.Map outRes) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(outRes, "outRes");
    }
}
