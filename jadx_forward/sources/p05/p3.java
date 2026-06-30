package p05;

/* loaded from: classes5.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.p3 f432172a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f432173b;

    /* renamed from: c, reason: collision with root package name */
    public static final r45.v87 f432174c;

    /* renamed from: d, reason: collision with root package name */
    public static r45.v87 f432175d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f432176e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedHashSet f432177f;

    static {
        p05.p3 p3Var = new p05.p3();
        f432172a = p3Var;
        f432173b = new java.util.LinkedList();
        f432174c = new r45.v87();
        f432175d = new r45.v87();
        f432176e = new java.util.LinkedList();
        f432177f = new java.util.LinkedHashSet();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        p3Var.c();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19567x35db38ca.f270128a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            throw new java.lang.RuntimeException("WeVisUpdateReceiver can only register from non main process!");
        }
        if (fp.h.a(33)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19567x35db38ca(), new android.content.IntentFilter("com.tencent.mm.WeVisUpdate"));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19567x35db38ca(), new android.content.IntentFilter("com.tencent.mm.WeVisUpdate"), 4);
        }
    }

    public final void a(int i17, int i18, java.lang.String path) {
        boolean z17;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p05.a3 a3Var = p05.a3.f431972a;
        sb6.append(p05.a3.f431976e);
        sb6.append('/');
        sb6.append(i17);
        sb6.append('.');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.util.LinkedList NewConfigList = f432175d.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
        java.util.Iterator it = NewConfigList.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.w87 w87Var = (r45.w87) obj;
            if (w87Var.f470504d == i17 && w87Var.f470505e == i18) {
                break;
            }
        }
        r45.w87 w87Var2 = (r45.w87) obj;
        if (w87Var2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(i17, i18), w87Var2.f470506f)) {
            return;
        }
        java.lang.String str = w87Var2.f470507g;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.f(sb7);
        com.p314xaae8f345.mm.vfs.w6.h(sb7);
        com.p314xaae8f345.mm.vfs.w6.u(sb7);
        com.p314xaae8f345.mm.vfs.w6.c(path, sb7 + '/' + w87Var2.f470507g);
        p05.m4.f432155a.b(5, i17, i18);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WeVision_ModelInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "initOtherProcess: ");
        byte[] j17 = b().j("local_info");
        r45.v87 v87Var = f432174c;
        if (j17 != null) {
            try {
                v87Var.mo11468x92b714fd(j17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        g();
    }

    public final void d(long j17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = b().getLong("cgi_time", 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadRemoteInfoAfterLast: last:");
        sb6.append(j18);
        sb6.append(" diff:");
        long j19 = currentTimeMillis - j18;
        sb6.append(j19);
        sb6.append(", ");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", sb6.toString());
        ((ku5.t0) ku5.t0.f394148d).A("WeVisModelMgr_cgi");
        if (j19 >= j17) {
            ((ku5.t0) ku5.t0.f394148d).h(p05.n3.f432160d, "WeVisModelMgr_cgi");
        } else {
            ((ku5.t0) ku5.t0.f394148d).l(p05.o3.f432165d, (j18 + j17) - currentTimeMillis, "WeVisModelMgr_cgi");
        }
    }

    public final void e() {
        java.util.LinkedList linkedList = f432176e;
        linkedList.clear();
        java.util.LinkedList NewConfigList = f432175d.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(NewConfigList, 10));
        java.util.Iterator it = NewConfigList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((r45.w87) it.next()).f470504d));
        }
        linkedList.addAll(kz5.n0.Q(arrayList));
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "updateLocalModelInfo: ");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<r45.w87> NewConfigList = f432175d.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
        for (r45.w87 w87Var : NewConfigList) {
            p05.r3 r3Var = p05.r3.f432207a;
            if (((java.lang.String) p05.r3.f432210d.get(java.lang.Integer.valueOf(w87Var.f470504d))) != null) {
                java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(w87Var.f470504d, w87Var.f470505e);
                boolean z17 = false;
                if (!(Ni == null || Ni.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Ni, w87Var.f470506f)) {
                    if (!linkedList.isEmpty()) {
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            if (((r45.w87) it.next()).f470504d == w87Var.f470504d) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
                        linkedList.add(w87Var);
                    }
                }
            }
        }
        r45.v87 v87Var = f432174c;
        v87Var.f469526d = linkedList;
        b().H("local_info", pm0.v.D(v87Var));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = b();
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        b17.putInt("sdk_version", tq5.i.f502802a);
        g();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19567x35db38ca.f270128a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.WeVisUpdate");
            intent.putExtra("type", "wevis_model");
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
    }

    public final void g() {
        java.util.LinkedList linkedList = f432173b;
        synchronized (linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "updateLocalModelList: ");
            linkedList.clear();
            java.util.LinkedList<r45.w87> NewConfigList = f432174c.f469526d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
            for (r45.w87 w87Var : NewConfigList) {
                p05.r3 r3Var = p05.r3.f432207a;
                java.lang.String str = (java.lang.String) p05.r3.f432210d.get(java.lang.Integer.valueOf(w87Var.f470504d));
                if (str != null && w87Var.f470506f != null && w87Var.f470507g != null) {
                    p05.q3 q3Var = new p05.q3();
                    q3Var.f432189a = str;
                    java.lang.String md52 = w87Var.f470506f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(md52, "md5");
                    q3Var.f432192d = md52;
                    q3Var.f432190b = w87Var.f470504d;
                    q3Var.f432191c = w87Var.f470505e;
                    java.lang.String filename = w87Var.f470507g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filename, "filename");
                    q3Var.f432193e = filename;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "updateLocalModelList: " + str + ", " + w87Var.f470504d + '.' + w87Var.f470505e + ", " + w87Var.f470506f + ", " + w87Var.f470507g);
                    f432173b.add(q3Var);
                }
            }
        }
    }
}
