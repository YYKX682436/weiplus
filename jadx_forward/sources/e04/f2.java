package e04;

/* loaded from: classes15.dex */
public final class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f327459b;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f327466i;

    /* renamed from: a, reason: collision with root package name */
    public static final e04.f2 f327458a = new e04.f2();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f327460c = jz5.h.b(e04.x1.f327686d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f327461d = jz5.h.b(e04.z1.f327702d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f327462e = jz5.h.b(e04.a2.f327397d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f327463f = jz5.h.b(e04.y1.f327694d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f327464g = jz5.h.b(e04.b2.f327404d);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f327465h = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f327467j = jz5.h.b(e04.e2.f327428d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f327468k = jz5.h.b(e04.w1.f327680d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f327469l = jz5.h.b(e04.d2.f327420d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f327470m = jz5.h.b(e04.c2.f327410d);

    public static final void a(com.p314xaae8f345.p2891x34da02.C25307xad2910d9 c25307xad2910d9) {
        if (c25307xad2910d9 != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            b(context, c25307xad2910d9.f45396x832f8c70, c25307xad2910d9.f45403xb37d6834, c25307xad2910d9.f45401xe9487ac4, c25307xad2910d9.f45400x47104a15);
            return;
        }
        if (!f327466i) {
            g();
        }
        java.lang.String str = pt5.a.f439801c;
        java.lang.String str2 = pt5.a.f439803e;
        java.lang.String str3 = pt5.a.f439806h;
        java.lang.String str4 = pt5.a.f439809k;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        b(context2, str, str2, str3, str4);
    }

    public static final void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanDebugUtil", "checkAndCopyAIModelFileIfNeed detectModelPath: " + str + ", srModelPath: " + str2 + ", segmentationModelPath: " + str3 + ", reverseClsModel: " + str4);
            e04.f2 f2Var = f327458a;
            f2Var.c(context, (ct5.a) ((jz5.n) f327460c).mo141623x754a37bb(), str, false);
            f2Var.c(context, (ct5.d) ((jz5.n) f327461d).mo141623x754a37bb(), str2, false);
            if (((java.lang.Boolean) ((jz5.n) f327469l).mo141623x754a37bb()).booleanValue()) {
                f2Var.c(context, (ct5.c) ((jz5.n) f327462e).mo141623x754a37bb(), str3, false);
            }
            if (((java.lang.Boolean) ((jz5.n) f327470m).mo141623x754a37bb()).booleanValue()) {
                f2Var.c(context, (ct5.b) ((jz5.n) f327463f).mo141623x754a37bb(), str4, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanDebugUtil", e17, "initQBarModelFile", new java.lang.Object[0]);
        }
    }

    public static final int e() {
        return ((java.lang.Boolean) ((jz5.n) f327467j).mo141623x754a37bb()).booleanValue() ? 1 : 0;
    }

    public static final void f() {
        g();
        java.util.ArrayList arrayList = f327465h;
        arrayList.add(pt5.a.f439801c);
        arrayList.add(pt5.a.f439803e);
        arrayList.add(pt5.a.f439806h);
        arrayList.add(pt5.a.f439809k);
        a(null);
        ((ku5.t0) ku5.t0.f394148d).g(e04.v1.f327670d);
    }

    public static final void g() {
        if (((java.lang.Boolean) ((jz5.n) f327467j).mo141623x754a37bb()).booleanValue()) {
            pt5.a.f439810l = 1;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setQbarBackend:1");
            pt5.a.f439812n = true;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setQBarOptDet :true");
            pt5.a.f439811m = true;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setQBarOptSr :true");
            pt5.a.f439813o = true;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setQbarOptLibdmtx :true");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ct5.a) ((jz5.n) f327460c).mo141623x754a37bb()).getClass();
            pt5.a.f439800b = "V1.8.0.26";
            pt5.a.f439801c = "";
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setDetectModelVersion %s", "V1.8.0.26");
            java.lang.String str = pt5.a.f439800b;
            if (str == null || str.isEmpty()) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ScanUtil", "setDetectModelVersion invalid version: %s", "V1.8.0.26");
            } else {
                java.lang.String b17 = pt5.a.b(context);
                if (b17 != null && !b17.isEmpty()) {
                    pt5.a.f439801c = b17 + pt5.a.f439800b.toUpperCase() + "/qbar_detect.xnet";
                }
            }
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ct5.d) ((jz5.n) f327461d).mo141623x754a37bb()).getClass();
            pt5.a.f439802d = "V1.1.0.26";
            pt5.a.f439803e = "";
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setSRModelVersion %s", "V1.1.0.26");
            java.lang.String str2 = pt5.a.f439802d;
            if (str2 == null || str2.isEmpty()) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ScanUtil", "setSRModelVersion invalid version: %s", "V1.1.0.26");
            } else {
                java.lang.String b18 = pt5.a.b(context2);
                if (b18 != null && !b18.isEmpty()) {
                    pt5.a.f439803e = b18 + pt5.a.f439802d.toUpperCase() + "/qbar_sr.xnet";
                }
            }
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) f327469l).mo141623x754a37bb()).booleanValue();
            pt5.a.f439804f = booleanValue;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setEnableSeg:" + booleanValue);
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ct5.c) ((jz5.n) f327462e).mo141623x754a37bb()).getClass();
            pt5.a.f439805g = "V1.1.0.26";
            pt5.a.f439806h = "";
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setSegmentationModelVersion %s", "V1.1.0.26");
            java.lang.String str3 = pt5.a.f439805g;
            if (str3 == null || str3.isEmpty()) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ScanUtil", "setSegmentationModelVersion invalid version: %s", pt5.a.f439805g);
            } else {
                java.lang.String b19 = pt5.a.b(context3);
                if (b19 != null && !b19.isEmpty()) {
                    pt5.a.f439806h = b19 + pt5.a.f439805g.toUpperCase() + "/qbar_seg.xnet";
                }
            }
            boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) f327464g).mo141623x754a37bb()).booleanValue();
            pt5.a.f439814p = booleanValue2;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setDetectModelUseFp16:" + booleanValue2);
            boolean booleanValue3 = ((java.lang.Boolean) ((jz5.n) f327470m).mo141623x754a37bb()).booleanValue();
            pt5.a.f439807i = booleanValue3;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setEnableReverseCls:" + booleanValue3);
            android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ct5.b) ((jz5.n) f327463f).mo141623x754a37bb()).getClass();
            pt5.a.f439808j = "V1.0";
            pt5.a.f439809k = "";
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "setReverseClsModelVersion %s", "V1.0");
            java.lang.String str4 = pt5.a.f439808j;
            if (str4 == null || str4.isEmpty()) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ScanUtil", "setReverseClsModelVersion invalid version: %s", pt5.a.f439808j);
            } else {
                java.lang.String b27 = pt5.a.b(context4);
                if (b27 != null && !b27.isEmpty()) {
                    pt5.a.f439809k = b27 + pt5.a.f439808j.toUpperCase() + "/qbar_reverse_cls.xnet";
                }
            }
            f327466i = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x002d A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:46:0x001a, B:5:0x0029, B:32:0x002d, B:34:0x0034, B:36:0x005c, B:37:0x005f, B:38:0x0071, B:40:0x007b, B:41:0x007e, B:43:0x0092, B:44:0x0095), top: B:45:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0029 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:46:0x001a, B:5:0x0029, B:32:0x002d, B:34:0x0034, B:36:0x005c, B:37:0x005f, B:38:0x0071, B:40:0x007b, B:41:0x007e, B:43:0x0092, B:44:0x0095), top: B:45:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r18, dt5.b r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.f2.c(android.content.Context, dt5.b, java.lang.String, boolean):void");
    }

    public final void d(java.lang.String str) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanDebugUtil", "ensureParentDirExists  destFilePath is empty");
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).s();
            if (s17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanDebugUtil", "ensureParentDirExists  parentFile == null, destFilePath: ".concat(str));
                return;
            }
            if (s17.m() && s17.y()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanDebugUtil", "ensureParentDirExists parentFile is exists: " + s17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanDebugUtil", "ensureParentDirExists  do make dir , parentFile: %s, exists : %b, result: %b, isDirectory: %b", s17.o(), java.lang.Boolean.valueOf(s17.m()), java.lang.Boolean.valueOf(s17.y()), java.lang.Boolean.valueOf(s17.J()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanDebugUtil", e17, "ensureParentDirExists", new java.lang.Object[0]);
        }
    }
}
