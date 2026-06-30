package u85;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final u85.i f507240a = new u85.i();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f507241b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f507242c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f507243d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f507244e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f507245f;

    /* renamed from: g, reason: collision with root package name */
    public static final fp0.o f507246g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f507247h;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + "/sticker/";
        f507241b = str;
        f507242c = str + "package/";
        f507243d = str + "temp/";
        f507244e = str + "thumb/";
        f507245f = 50;
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(Integer.MAX_VALUE, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "StickerTask"));
        f507246g = oVar;
        f507247h = new java.util.HashMap();
        u85.f fVar = new u85.f();
        com.p314xaae8f345.mm.vfs.w6.u(str);
        com.p314xaae8f345.mm.vfs.w6.t(str);
        oVar.g(fVar);
    }

    public static final void a(u85.i iVar, java.lang.String str, int i17) {
        iVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            kz5.h0.u(linkedList, s17);
            int size = linkedList.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerFileManager", "cleanFile: " + str + " count is " + size);
            if (size <= i17) {
                return;
            }
            if (linkedList.size() > 1) {
                kz5.g0.t(linkedList, new u85.g());
            }
            java.util.List<com.p314xaae8f345.mm.vfs.x1> subList = linkedList.subList(i17, size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : subList) {
                boolean z17 = x1Var.f294769f;
                java.lang.String str2 = x1Var.f294765b;
                if (z17) {
                    com.p314xaae8f345.mm.vfs.w6.f(str + str2);
                } else {
                    com.p314xaae8f345.mm.vfs.w6.h(str + str2);
                }
            }
        }
    }

    public final java.lang.String b(java.lang.String lensId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensId, "lensId");
        return f507242c + lensId + '/';
    }

    public final fp0.u c(r45.p64 lensInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensInfo, "lensInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerFileManager", "loadByFileId: " + lensInfo.f464325d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lensInfo.f464325d)) {
            return fp0.u.f346824g;
        }
        java.lang.String LensId = lensInfo.f464325d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LensId, "LensId");
        if (t85.j.f498006l.a(b(LensId))) {
            return fp0.u.f346823f;
        }
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = new com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1(0);
        java.lang.String str = lensInfo.f464325d;
        if (str == null) {
            str = "";
        }
        c21046x5cf452f1.f275223e = str;
        r45.r64 r64Var = lensInfo.f464329h;
        java.lang.String str2 = r64Var != null ? r64Var.f466103d : null;
        if (str2 == null) {
            str2 = "";
        }
        c21046x5cf452f1.f275224f = str2;
        java.lang.String str3 = r64Var != null ? r64Var.f466104e : null;
        c21046x5cf452f1.f275225g = str3 != null ? str3 : "";
        c21046x5cf452f1.f275226h = r64Var != null ? r64Var.f466105f : 0;
        d(c21046x5cf452f1);
        return fp0.u.f346826i;
    }

    public final void d(com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 info) {
        fp0.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.HashMap hashMap = f507247h;
        if (hashMap.containsKey(info.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerFileManager", "loadByInfo: " + info.a() + " waiting in queue");
            return;
        }
        if (((km0.c) gm0.j1.p().a()).a()) {
            dVar = info.f275222d == 1 ? new u85.q(info) : new u85.e(info);
        } else {
            u85.n nVar = new u85.n(info);
            hashMap.put(info.a(), nVar);
            dVar = nVar;
        }
        f507246g.a(dVar);
    }

    public final void e(fp0.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        f507246g.g(callback);
    }

    public final void f(fp0.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        fp0.o oVar = f507246g;
        oVar.getClass();
        pm0.v.X(new fp0.n(oVar, callback));
    }
}
