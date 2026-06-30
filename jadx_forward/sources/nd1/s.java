package nd1;

/* loaded from: classes7.dex */
public final class s {
    public s(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(nd1.s sVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab c12201x3480ccab) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig bgShapeConf;
        int i17;
        boolean z17;
        boolean z18;
        k91.y3 o17;
        sVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = c12201x3480ccab.f164028f.L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        boolean c17 = halfScreenConfig.c();
        android.os.Bundle bundle = c12201x3480ccab.f164027e;
        boolean z19 = bundle.getBoolean("halfEnable", c17);
        boolean z27 = bundle.getBoolean("enableFullScreenGesture", halfScreenConfig.f158897n);
        boolean z28 = bundle.getBoolean("autoFullScreenWhenTap", halfScreenConfig.A);
        boolean z29 = bundle.getBoolean("forbidSlidingUpGesture", halfScreenConfig.f158902s);
        boolean z37 = bundle.getBoolean("forbidGestureWhenFullScreen", halfScreenConfig.f158889J);
        boolean z38 = bundle.getBoolean("forceLightMode", halfScreenConfig.f158894h);
        boolean z39 = bundle.getBoolean("showBgMask", halfScreenConfig.f158904u);
        if (bundle.containsKey("shapeConfig")) {
            android.os.Bundle bundle2 = bundle.getBundle("shapeConfig");
            bgShapeConf = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), bundle2 != null ? bundle2.getBoolean("topLeft", false) : false, bundle2 != null ? bundle2.getBoolean("topRight", false) : false, bundle2 != null ? bundle2.getBoolean("topRight", false) : false, bundle2 != null ? bundle2.getBoolean("bottomRight", false) : false);
        } else {
            bgShapeConf = halfScreenConfig.f158893g;
        }
        if (bundle.containsKey("height")) {
            double d17 = bundle.getDouble("height");
            if (java.lang.Double.isNaN(d17)) {
                i17 = -1;
            } else {
                if (!(d17 == 0.0d)) {
                    i17 = vp0.b.b(java.lang.Double.valueOf(d17));
                }
                i17 = -2;
            }
        } else {
            if (halfScreenConfig.c()) {
                i17 = halfScreenConfig.f158890d;
            }
            i17 = -2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("halfRestartAppBrandImpl.url=");
        java.lang.String str = c12201x3480ccab.f164026d;
        sb6.append(str);
        sb6.append(",halfSingleValue=");
        sb6.append(z19);
        sb6.append(",height=");
        sb6.append(i17);
        sb6.append(",enableFullScreenGesture=");
        sb6.append(z27);
        sb6.append(",context=");
        sb6.append(context.getClass().getName());
        sb6.append(",isFinish=");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToWC", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c12201x3480ccab.f164028f;
        b1Var.f398547b = c11809xbc286be4.f158811d;
        b1Var.f398555f = str;
        java.lang.Integer num = c12201x3480ccab.f164029g;
        b1Var.f398565k = num != null ? num.intValue() : 0;
        java.lang.String str2 = c12201x3480ccab.f164030h;
        if (str2 == null) {
            str2 = "";
        }
        b1Var.f398567l = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = c11809xbc286be4.L1.e();
        if (z19) {
            e17.f159054a = true;
            e17.f159066m = z29;
            e17.E = z37;
            e17.f159055b = i17;
            e17.f159065l = z27;
            e17.f159075v = z28;
            k91.s2 activityAnimStyle = bundle.containsKey("usePushAnimation") ? bundle.getBoolean("usePushAnimation", false) ? k91.s2.f387294e : k91.s2.f387293d : halfScreenConfig.f158891e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityAnimStyle, "activityAnimStyle");
            e17.f159059f = activityAnimStyle;
            e17.f159063j = z38;
            e17.f159072s = z39;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgShapeConf, "bgShapeConf");
            e17.f159062i = bgShapeConf;
        } else {
            e17.f159054a = false;
            e17.f159065l = false;
            e17.f159075v = false;
        }
        b1Var.G = e17.a();
        if (z19) {
            k91.y3 y3Var = k91.y3.DEFAULT;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        } else {
            boolean containsKey = bundle.containsKey("usePushAnimation");
            k91.y3 y3Var2 = k91.y3.SLIDE;
            k91.y3 y3Var3 = k91.y3.POPUP;
            if (containsKey) {
                z17 = false;
                z18 = true;
                o17 = bundle.getBoolean("usePushAnimation", false) ? y3Var2 : y3Var3;
            } else {
                z17 = false;
                z18 = true;
                o17 = c11809xbc286be4.o();
            }
            b1Var.S = o17;
            if (!bundle.containsKey("usePushAnimation")) {
                y3Var2 = c11809xbc286be4.q();
            } else if (bundle.getBoolean("usePushAnimation", z17) != z18) {
                y3Var2 = y3Var3;
            }
            b1Var.T = y3Var2;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }
}
