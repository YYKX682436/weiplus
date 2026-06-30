package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class r implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f70520o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_avatar_max_retry_download_count, 5);

    /* renamed from: d, reason: collision with root package name */
    public boolean f70521d;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f70525h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f70522e = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f70523f = new jt0.j(400);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Stack f70524g = new java.util.Stack();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f70526i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final kk.j f70527m = new jt0.j(200);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f70528n = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelavatar.k(this), false);

    public r() {
        this.f70521d = false;
        gm0.j1.d().a(123, this);
        this.f70521d = false;
        this.f70525h = c01.z1.r();
    }

    public void a() {
        while (true) {
            java.util.Stack stack = this.f70524g;
            if (stack.size() <= 0) {
                return;
            }
            this.f70522e.remove(stack.pop());
        }
    }

    public void b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelavatar.h(this, str));
    }

    public void c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_contact_get_check_avatar_expire_sw, 1) == 1 && ((lt0.f) this.f70523f).keySet().contains(str)) {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelavatar.i(this, str));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarService", "checkAvatarUpdateExpire %s", e17.getMessage());
        }
    }

    public final void d(com.tencent.mm.modelavatar.t0 t0Var, int i17, int i18) {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        com.tencent.mm.modelavatar.r0 n07;
        java.util.HashSet hashSet3;
        java.util.Iterator it;
        r45.du5 du5Var;
        com.tencent.mm.protobuf.g gVar;
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.LinkedList linkedList = t0Var.f70544f;
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.fz3 fz3Var = (r45.fz3) it6.next();
                if (fz3Var == null || (du5Var = fz3Var.f374746e) == null) {
                    hashSet3 = hashSet4;
                    it = it6;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "error p is null or username is null %s", fz3Var);
                } else {
                    java.lang.String str = du5Var.f372756d;
                    r45.cu5 cu5Var = fz3Var.f374745d;
                    if (cu5Var == null || (gVar = cu5Var.f371841f) == null || gVar.f192156a == null) {
                        hashSet3 = hashSet4;
                        it = it6;
                        com.tencent.mars.xlog.Log.w("MicroMsg.AvatarService", "DoScene is OK, but data is empty:%s", str);
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(138L, 11L, 1L, true);
                        g0Var.d(14058, 100001, 11, "", 0, str, "", -1, "", "", -1);
                    } else {
                        hashSet4.add(str);
                        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                        r0Var.f70529a = str;
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.idkeyStat(138L, 43L, 1L, true);
                        it = it6;
                        hashSet3 = hashSet4;
                        g0Var2.d(14058, 100001, 43, "", 0, str, "", -1, "", "", -1);
                        h(new com.tencent.mm.modelavatar.p(this, r0Var, fz3Var.f374745d.f371841f.f192156a));
                    }
                }
                it6 = it;
                hashSet4 = hashSet3;
            }
            hashSet = hashSet4;
        } else {
            hashSet = hashSet4;
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarService", "scene resp is null");
        }
        java.util.LinkedList linkedList2 = t0Var.f70543e;
        if (linkedList2 != null) {
            java.util.Iterator it7 = linkedList2.iterator();
            while (it7.hasNext()) {
                r45.du5 du5Var2 = (r45.du5) it7.next();
                if (du5Var2 != null) {
                    java.lang.String str2 = du5Var2.f372756d;
                    hashSet2 = hashSet;
                    if (!hashSet2.contains(str2)) {
                        if (i17 == 0 && i18 == 0) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AvatarService", "DoScene is OK, but resp data is empty:%s", str2);
                            com.tencent.mm.modelavatar.r0 r0Var2 = new com.tencent.mm.modelavatar.r0();
                            r0Var2.f70529a = str2;
                            h(new com.tencent.mm.modelavatar.q(this, r0Var2));
                        } else {
                            com.tencent.mm.modelavatar.s0 g17 = g();
                            if (g17 != null && (n07 = g17.n0(str2)) != null && n07.f70530b == 4) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AvatarService", "DoScene is fail, try reset imgFlag:%s", str2);
                                n07.f70530b = 3;
                                g17.y0(n07);
                            }
                            this.f70522e.remove(str2);
                        }
                    }
                } else {
                    hashSet2 = hashSet;
                }
                hashSet = hashSet2;
            }
        }
    }

    public final com.tencent.mm.modelavatar.z e() {
        if (gm0.j1.b().m()) {
            return com.tencent.mm.modelavatar.d1.Ai();
        }
        return null;
    }

    public android.graphics.Bitmap f(java.lang.String str, boolean z17, int i17, com.tencent.mm.modelavatar.e eVar) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.modelavatar.z e17 = e();
        if (e17 != null) {
            if (i17 < 0 || i17 <= 5) {
                bitmap = null;
            } else {
                bitmap = e17.l(java.lang.String.format("%s$$%d", str, java.lang.Integer.valueOf(i17)));
                if (bitmap != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "find custom corner avatar, custom corner %d", java.lang.Integer.valueOf(i17));
                    c(str);
                    return bitmap;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "can not find custom corner avatar, custom corner %d", java.lang.Integer.valueOf(i17));
            }
            if (bitmap == null) {
                bitmap = e17.l(str);
            }
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            if (i17 >= 0 && i17 > 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "create custom corner avatar, custom corner %d", java.lang.Integer.valueOf(i17));
                bitmap = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, i17);
                e17.s(java.lang.String.format("%s$$%d", str, java.lang.Integer.valueOf(i17)), bitmap);
            }
            c(str);
            return bitmap;
        }
        if (z17) {
            c(str);
            return null;
        }
        java.util.Set set = this.f70522e;
        if (set.contains(str)) {
            c(str);
            return null;
        }
        set.add(str);
        h(new com.tencent.mm.modelavatar.n(this, str, eVar));
        return null;
    }

    public final com.tencent.mm.modelavatar.s0 g() {
        if (gm0.j1.b().m()) {
            return com.tencent.mm.modelavatar.d1.Ni();
        }
        return null;
    }

    public final int h(com.tencent.mm.sdk.platformtools.g6 g6Var) {
        if (g6Var == null) {
            return -1;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelavatar.j(this, g6Var));
        return 1;
    }

    public void i(java.lang.String str) {
        h(new com.tencent.mm.modelavatar.n(this, str));
    }

    public void j(java.lang.String str, com.tencent.mm.modelavatar.r0 r0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.d())) {
            com.tencent.mm.modelavatar.d1.Ai().p(str, false);
            com.tencent.mm.modelavatar.d1.Ai().p(str, true);
        } else {
            r0Var.f70536h = 1;
        }
        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        com.tencent.mm.modelavatar.e eVar = new com.tencent.mm.modelavatar.e();
        eVar.f70442c = r0Var.f70530b != 4;
        h(new com.tencent.mm.modelavatar.n(this, str, eVar));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 123 && (m1Var instanceof com.tencent.mm.modelavatar.t0)) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(138L, 12L, 1L, true);
                g0Var.d(14058, 100001, 12, "", 0, "", "", -1, "", "", -1);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(138L, 45L, 1L, true);
            g0Var2.d(14058, 100001, 45, "", 0, "", "", -1, "", "", -1);
            try {
                d((com.tencent.mm.modelavatar.t0) m1Var, i17, i18);
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AvatarService", "[onSceneEnd] NullPointerException:%s", e17);
            }
            this.f70521d = false;
            if (this.f70524g.isEmpty()) {
                return;
            }
            this.f70528n.c(0L, 0L);
        }
    }
}
