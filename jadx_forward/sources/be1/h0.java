package be1;

/* loaded from: classes7.dex */
public final class h0 {
    public h0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component, java.util.Map data) {
        int i17;
        android.view.View mo51310xc2a54588;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = t37 != null ? t37.u0() : null;
        if (u07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetSystemInfoWC", "initConfig is null, return");
            return;
        }
        if (u07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) u07;
            if (c11809xbc286be4.L1.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = c11809xbc286be4.L1;
                if (!c11816x5915d2c1.f158897n && c11816x5915d2c1.f158890d == -1) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetSystemInfoWC", "half screen mode, force [screenTop] and [statusBarHeight] to 0");
                if (c11809xbc286be4.L1.W) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetSystemInfoWC", "half screen mode, enableExpandToStatusBarTop");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(component);
                if (a17 != null && (mo51310xc2a54588 = a17.mo51310xc2a54588()) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(component);
                    android.widget.FrameLayout mo51313xaf0c0532 = a18 != null ? a18.mo51313xaf0c0532() : null;
                    if (mo51313xaf0c0532 != null) {
                        i17 = java.lang.Math.max(mo51310xc2a54588.getMeasuredHeight() - mo51313xaf0c0532.getMeasuredHeight(), 0);
                        data.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
                        data.put("statusBarHeight", 0);
                    }
                }
                i17 = 0;
                data.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
                data.put("statusBarHeight", 0);
            }
        }
    }
}
