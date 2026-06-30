package v85;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final v85.e f515636a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f515637b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f515638c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f515639d;

    /* renamed from: e, reason: collision with root package name */
    public static final r45.q64 f515640e;

    /* renamed from: f, reason: collision with root package name */
    public static final r45.q64 f515641f;

    /* renamed from: g, reason: collision with root package name */
    public static int f515642g;

    /* renamed from: h, reason: collision with root package name */
    public static yz5.a f515643h;

    static {
        java.lang.String string;
        v85.e eVar = new v85.e();
        f515636a = eVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            string = eVar.a();
        } else {
            android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, null, v85.b.class);
            string = bundle != null ? bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : null;
            if (string == null) {
                string = "";
            }
        }
        f515637b = string;
        java.lang.String str = string + "recommend.proto";
        f515638c = str;
        f515639d = string + "history.proto";
        r45.q64 q64Var = new r45.q64();
        f515640e = q64Var;
        f515641f = new r45.q64();
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        if (N != null) {
            if (!(N.length == 0)) {
                try {
                    q64Var.mo11468x92b714fd(N);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LensInfoUserCache", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoUserCache", "parseRecommend: " + str + ' ' + q64Var.f465243d.size());
            }
        }
        r45.q64 q64Var2 = f515641f;
        java.lang.String str2 = f515639d;
        byte[] N2 = com.p314xaae8f345.mm.vfs.w6.N(str2, 0, -1);
        if (N2 != null) {
            if (!(N2.length == 0)) {
                try {
                    q64Var2.mo11468x92b714fd(N2);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LensInfoUserCache", e18, "", new java.lang.Object[0]);
                }
                java.util.LinkedList lensInfoList = q64Var2.f465243d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lensInfoList, "lensInfoList");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : lensInfoList) {
                    java.lang.String str3 = ((r45.p64) obj).f464325d;
                    if (!(str3 == null || r26.n0.N(str3))) {
                        arrayList.add(obj);
                    }
                }
                java.util.LinkedList linkedList = q64Var2.f465243d;
                linkedList.clear();
                linkedList.addAll(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoUserCache", "parseHistory: " + str2 + ' ' + linkedList.size());
            }
        }
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STICKER_USER_CACHE_DIR_STRING;
        java.lang.Object m17 = c17.m(u3Var, null);
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "lens_" + java.lang.System.currentTimeMillis();
            gm0.j1.u().c().x(u3Var, str);
        }
        return lp0.b.h() + "sticker/data/" + str + '/';
    }

    public final void b() {
        yz5.a aVar = f515643h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        r45.q64 q64Var = f515641f;
        byte[] mo14344x5f01b1f6 = q64Var.mo14344x5f01b1f6();
        com.p314xaae8f345.mm.vfs.w6.u(f515637b);
        com.p314xaae8f345.mm.vfs.w6.R(f515639d, mo14344x5f01b1f6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoUserCache", "saveHistory: " + q64Var.f465243d.size());
    }

    public final void c(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        r45.q64 q64Var = f515640e;
        q64Var.f465243d.clear();
        q64Var.f465243d.addAll(list);
        byte[] mo14344x5f01b1f6 = q64Var.mo14344x5f01b1f6();
        com.p314xaae8f345.mm.vfs.w6.u(f515637b);
        com.p314xaae8f345.mm.vfs.w6.R(f515638c, mo14344x5f01b1f6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoUserCache", "saveRecommend: " + q64Var.f465243d.size());
    }
}
