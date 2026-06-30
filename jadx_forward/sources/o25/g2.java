package o25;

/* loaded from: classes8.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o25.g2 f424060a = new o25.g2();

    public static final boolean a(android.content.Context context, o25.b2 referer, java.lang.String businessType, java.lang.String str, o25.c2 c2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referer, "referer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        java.lang.String a17 = referer.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(businessType);
        sb6.append('#');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handle for sessionId:");
        sb8.append(sb7);
        sb8.append(", context:");
        sb8.append(context);
        sb8.append(", appId:");
        sb8.append(a17);
        sb8.append(", businessType:");
        sb8.append(businessType);
        sb8.append(", query:");
        sb8.append(str == null ? "" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewAsLiteAppHandler", sb8.toString());
        android.app.Activity a18 = q75.a.a(context);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = a18 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) a18 : null;
        p3325xe03a0797.p3326xc267989b.y0 b17 = activityC0065xcd7aa112 != null ? v65.m.b(activityC0065xcd7aa112) : v65.m.f515113a;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new o25.f2(sb7, context, a17, businessType, str, c2Var, null), 2, null);
        return true;
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "sendRespToApp for appId:" + str + " sessionId:" + str3 + ", app info not found");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp(bundle);
        resp.f32867xa7c470f2 = i17;
        resp.f32868xb2d5068c = str4;
        resp.f32999xb32a65a0 = str5;
        resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        resp.f32998xd7e6e31a = str2;
        resp.f32870x7fa0d2de = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n5.f273326a;
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = h17.f67386xa1e9e82c;
        args.f32701xaddf3082 = bundle;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }
}
