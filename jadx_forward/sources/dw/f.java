package dw;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final dw.f f325603a = new dw.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f325604b;

    /* renamed from: c, reason: collision with root package name */
    public static final zv.r0 f325605c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.String f325606d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f325607e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f325608f;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService_accounts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        f325604b = R;
        f325605c = zv.r0.f557628a;
        f325606d = "";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f325608f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5205xb2777c61>(a0Var) { // from class: com.tencent.mm.feature.brandecs.digest.BrandEcsFlutterDigestHelper$brandServiceCreationCenterInfoUpdateEvent$1
            {
                this.f39173x3fe91575 = -2069781423;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5205xb2777c61 c5205xb2777c61) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5205xb2777c61 event = c5205xb2777c61;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                dw.f.f325603a.a();
                return false;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (r11 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.f.a():void");
    }

    public final java.lang.String b(java.lang.String username, com.p314xaae8f345.mm.p2621x8fb0427b.f9 info) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.mo78013xfb85f7b0() == -1879048173) {
            return dw.h.f325610a.a(info);
        }
        java.lang.String msgContent = username + ':' + info.j();
        zq1.c0 c0Var = (zq1.c0) i95.n0.c(zq1.c0.class);
        int mo78013xfb85f7b0 = info.mo78013xfb85f7b0();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.b) c0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        java.lang.String l17 = qm.a0.l(0, "service_officialaccounts", msgContent, mo78013xfb85f7b0, context);
        int L = r26.n0.L(l17, ":", 0, false, 6, null);
        if (L != -1) {
            str = l17.substring(0, L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            str2 = l17.substring(L + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        } else {
            str = "";
            str2 = null;
        }
        return str + ':' + str2;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a0 a0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a0.f297580b;
        a0Var.a(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f, dw.a.f325598a);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.v(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f, dw.b.f325599a);
        a0Var.c(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f, dw.c.f325600a);
        a0Var.b(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f, dw.d.f325601a);
        a0Var.d(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f, dw.e.f325602a);
        f325608f.mo48813x58998cd();
    }
}
