package be1;

/* loaded from: classes7.dex */
public class x1 implements be1.v1 {
    @Override // be1.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map a(java.lang.String type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(component);
        int i17 = 0;
        int i18 = a17[0];
        int i19 = a17[1];
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i19)));
        be1.f0.G(hashMap, component, i18, i19);
        hashMap.put("statusBarHeight", java.lang.Integer.valueOf(ik1.w.e(be1.f0.E(component))));
        int[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.b(component);
        int i27 = b17[0];
        int i28 = b17[1];
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(i27)));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(i28)));
        try {
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(component);
            android.widget.FrameLayout mo51313xaf0c0532 = a18 == null ? null : a18.mo51313xaf0c0532();
            if (mo51313xaf0c0532 != null) {
                mo51313xaf0c0532.getLocationOnScreen(iArr);
                i17 = iArr[1];
            }
            hashMap.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.GetSystemInfoNewLU", e17.getMessage());
        }
        c(component, hashMap);
        return hashMap;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component, java.util.Map outRes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
    }
}
