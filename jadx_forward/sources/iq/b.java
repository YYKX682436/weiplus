package iq;

/* loaded from: classes10.dex */
public abstract class b {
    public static boolean A() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6167x86140054 c6167x86140054 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6167x86140054();
        c6167x86140054.e();
        am.zy zyVar = c6167x86140054.f136427g;
        boolean z17 = zyVar.f90148a && zyVar.f90149b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkTingChatRoomStateExist isExist %b ", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean B(android.content.Context context, boolean z17) {
        boolean A = A();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkTingChatRoomStateExist isExist %b ", java.lang.Boolean.valueOf(A));
        if (A && z17 && context != null) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.n68, 0).show();
        }
        return A;
    }

    public static boolean C(android.content.Context context) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (!w00Var.f89780c) {
            if (m(context, true, null) || q(context, true) || B(context, true)) {
                return true;
            }
            s(context);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
        java.lang.String G = G(context, w00Var.f89778a);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = G;
        e4Var.c();
        return w00Var.f89780c;
    }

    public static boolean D(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (w00Var.f89780c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
            db5.e1.y(context, "", G(context, w00Var.f89778a), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), onClickListener);
            return w00Var.f89780c;
        }
        if (q(context, true) || B(context, true)) {
            return true;
        }
        s(context);
        return false;
    }

    public static boolean E() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        return c6229x2bb765fe.f136476g.f89779b;
    }

    public static boolean F(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (w00Var.f89780c && z17) {
            db5.t7.m123883x26a183b(context, G(context, w00Var.f89778a), 0).show();
        }
        return w00Var.f89780c;
    }

    public static java.lang.String G(android.content.Context context, boolean z17) {
        return z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqd) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqf);
    }

    public static boolean H() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f();
        c5716x51d5635f.f136037g.f87792a = 1;
        c5716x51d5635f.e();
        return c5716x51d5635f.f136038h.f87892a;
    }

    public static boolean a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038 c5170x9489e038 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038();
        c5170x9489e038.e();
        am.z zVar = c5170x9489e038.f135519g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandCameraUsing isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f90030b), java.lang.Boolean.valueOf(zVar.f90029a));
        if (zVar.f90029a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "app brand voip camera using");
        }
        return zVar.f90029a;
    }

    public static boolean b(android.content.Context context) {
        return c(context, true);
    }

    public static boolean c(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038 c5170x9489e038 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038();
        c5170x9489e038.e();
        am.z zVar = c5170x9489e038.f135519g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandCameraUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f90030b), java.lang.Boolean.valueOf(zVar.f90029a));
        if (zVar.f90029a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "app brand voip camera using");
            if (z17) {
                dp.a.m125854x26a183b(context, G(context, zVar.f90029a), 0).show();
            }
        }
        return zVar.f90029a;
    }

    public static boolean d() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038 c5170x9489e038 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038();
        c5170x9489e038.e();
        am.z zVar = c5170x9489e038.f135519g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsing isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f90030b), java.lang.Boolean.valueOf(zVar.f90029a));
        if (zVar.f90030b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "app brand voip voice using");
        }
        return zVar.f90030b;
    }

    public static boolean e(android.content.Context context) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038 c5170x9489e038 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038();
        c5170x9489e038.e();
        am.z zVar = c5170x9489e038.f135519g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f90030b), java.lang.Boolean.valueOf(zVar.f90029a));
        if (zVar.f90030b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "app brand voip voice using");
            db5.e1.y(context, "", G(context, zVar.f90029a), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new iq.a());
        }
        return zVar.f90030b;
    }

    public static boolean f(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038 c5170x9489e038 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038();
        c5170x9489e038.e();
        am.z zVar = c5170x9489e038.f135519g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f90030b), java.lang.Boolean.valueOf(zVar.f90029a));
        if (zVar.f90030b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "app brand voip voice using");
            db5.e1.y(context, "", G(context, zVar.f90029a), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), onClickListener);
        }
        return zVar.f90030b;
    }

    public static boolean g(android.content.Context context) {
        return i(context, true, null);
    }

    public static boolean h(android.content.Context context, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (!w00Var.f89779b) {
            t(context, onClickListener);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isCameraUsing");
        if (z17) {
            db5.e1.y(context, "", G(context, w00Var.f89778a), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), onClickListener);
        }
        return w00Var.f89779b;
    }

    public static boolean i(android.content.Context context, boolean z17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (w00Var.f89779b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isCameraUsing");
            if (z17) {
                java.lang.String G = G(context, w00Var.f89778a);
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = G;
                e4Var.c();
            }
            return w00Var.f89779b;
        }
        if (m(context, z17, bundle)) {
            return true;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df c5684xd8c855df = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df();
        c5684xd8c855df.e();
        c5684xd8c855df.f136010g.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b isAudioMicing %s isVideoMicing %s", bool, bool, bool, bool);
        return false;
    }

    public static int j() {
        if (E()) {
            return 1;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        if (c6229x2bb765fe.f136476g.f89780c) {
            return 2;
        }
        if (x(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 3;
        }
        return H() ? 4 : 0;
    }

    public static boolean k(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5422x7cda145c c5422x7cda145c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5422x7cda145c();
        c5422x7cda145c.e();
        am.p9 p9Var = c5422x7cda145c.f135766g;
        if (!p9Var.f89143a) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "is Face page exist");
        db5.e1.y(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572700c72), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), onClickListener);
        return p9Var.f89143a;
    }

    public static boolean l(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25 c5497x84efdb25 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25();
        c5497x84efdb25.e();
        am.ac acVar = c5497x84efdb25.f135829g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f87679a), java.lang.Boolean.valueOf(acVar.f87680b));
        boolean z18 = acVar.f87679a || acVar.f87683e;
        if (z18 && z17) {
            db5.t7.m123883x26a183b(context, acVar.f87680b ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2g) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2j), 0).show();
        }
        return z18;
    }

    public static boolean m(android.content.Context context, boolean z17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25 c5497x84efdb25 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25();
        c5497x84efdb25.e();
        am.ac acVar = c5497x84efdb25.f135829g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f87679a), java.lang.Boolean.valueOf(acVar.f87680b));
        boolean z18 = acVar.f87679a && acVar.f87680b;
        boolean z19 = acVar.f87682d;
        boolean z27 = bundle != null ? bundle.getBoolean("CLICK_ENTER_SCAN", false) : false;
        boolean z28 = acVar.f87683e;
        boolean z29 = (z27 || z28) && !z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isAnchorLinkMic %b isEnterScan %b isFloatModeBeforePost %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28));
        boolean z37 = z18 && !z29;
        if (z37 && z17) {
            db5.t7.m123883x26a183b(context, z19 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2h) : acVar.f87680b ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2g) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2j), 0).show();
        }
        return z37;
    }

    public static boolean n(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25 c5497x84efdb25 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25();
        c5497x84efdb25.e();
        am.ac acVar = c5497x84efdb25.f135829g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f87679a), java.lang.Boolean.valueOf(acVar.f87680b));
        boolean z18 = acVar.f87679a && !acVar.f87680b && acVar.f87681c;
        if (z18 && z17) {
            db5.t7.m123883x26a183b(context, acVar.f87680b ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2g) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2j), 0).show();
        }
        return z18;
    }

    public static boolean o(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25 c5497x84efdb25 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25();
        c5497x84efdb25.e();
        am.ac acVar = c5497x84efdb25.f135829g;
        boolean z18 = acVar.f87682d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderLiveStateAsVisitorMicOrIntercom isLiving %b isAnchor %b isLinkMic %b", java.lang.Boolean.valueOf(acVar.f87679a), java.lang.Boolean.valueOf(acVar.f87680b), java.lang.Boolean.valueOf(z18));
        boolean z19 = acVar.f87679a && !acVar.f87680b && z18;
        if (z19 && z17) {
            db5.t7.m123883x26a183b(context, z18 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2h) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2j), 0).show();
        }
        return z19;
    }

    public static boolean p() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25 c5497x84efdb25 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5497x84efdb25();
        c5497x84efdb25.e();
        am.ac acVar = c5497x84efdb25.f135829g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderLiveStatePlaying isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f87679a), java.lang.Boolean.valueOf(acVar.f87680b));
        return acVar.f87679a && !acVar.f87680b;
    }

    public static boolean q(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5547x3ee7faa8 c5547x3ee7faa8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5547x3ee7faa8();
        c5547x3ee7faa8.e();
        am.rd rdVar = c5547x3ee7faa8.f135871g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderVideoState isExist %b ", java.lang.Boolean.valueOf(rdVar.f89340a));
        if (rdVar.f89340a && z17 && context != null) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.elf, 0).show();
        }
        return rdVar.f89340a;
    }

    public static boolean r() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df c5684xd8c855df = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df();
        c5684xd8c855df.e();
        am.aj ajVar = c5684xd8c855df.f136010g;
        ajVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ajVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b", bool, bool);
        ajVar.getClass();
        return false;
    }

    public static boolean s(android.content.Context context) {
        t(context, null);
        return false;
    }

    public static boolean t(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df c5684xd8c855df = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df();
        c5684xd8c855df.e();
        am.aj ajVar = c5684xd8c855df.f136010g;
        ajVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ajVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b", bool, bool);
        ajVar.getClass();
        return false;
    }

    public static boolean u(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df c5684xd8c855df = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5684xd8c855df();
        c5684xd8c855df.e();
        am.aj ajVar = c5684xd8c855df.f136010g;
        ajVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ajVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkFinderLiveStatePlaying isLiving %b isAnchor %b", bool, bool);
        ajVar.getClass();
        return false;
    }

    public static boolean v(android.content.Context context) {
        if (!H()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isMultiTalking");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqf);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = string;
        e4Var.c();
        return true;
    }

    public static boolean w(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        if (!H()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "isMultiTalking");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqf);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = string;
        e4Var.c();
        return true;
    }

    public static boolean x(android.content.Context context) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f();
        c5716x51d5635f.f136037g.f87792a = 2;
        c5716x51d5635f.e();
        return c5716x51d5635f.f136038h.f87892a;
    }

    public static boolean y() {
        boolean z17 = l(null, false) || q(null, false) || B(null, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOccupy", "checkMutePlay=" + z17);
        return z17;
    }

    public static boolean z(android.content.Context context) {
        boolean Bi = com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi();
        if (Bi) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqe);
            e4Var.c();
        }
        return Bi;
    }
}
