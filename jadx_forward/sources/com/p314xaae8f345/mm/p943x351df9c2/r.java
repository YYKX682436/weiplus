package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class r implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f152053o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_avatar_max_retry_download_count, 5);

    /* renamed from: d, reason: collision with root package name */
    public boolean f152054d;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f152058h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f152055e = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f152056f = new jt0.j(400);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Stack f152057g = new java.util.Stack();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f152059i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final kk.j f152060m = new jt0.j(200);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f152061n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p943x351df9c2.k(this), false);

    public r() {
        this.f152054d = false;
        gm0.j1.d().a(123, this);
        this.f152054d = false;
        this.f152058h = c01.z1.r();
    }

    public void a() {
        while (true) {
            java.util.Stack stack = this.f152057g;
            if (stack.size() <= 0) {
                return;
            }
            this.f152055e.remove(stack.pop());
        }
    }

    public void b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p943x351df9c2.h(this, str));
    }

    public void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_contact_get_check_avatar_expire_sw, 1) == 1 && ((lt0.f) this.f152056f).mo143585xbc5e1583().contains(str)) {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p943x351df9c2.i(this, str));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarService", "checkAvatarUpdateExpire %s", e17.getMessage());
        }
    }

    public final void d(com.p314xaae8f345.mm.p943x351df9c2.t0 t0Var, int i17, int i18) {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        java.util.HashSet hashSet3;
        java.util.Iterator it;
        r45.du5 du5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.LinkedList linkedList = t0Var.f152077f;
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.fz3 fz3Var = (r45.fz3) it6.next();
                if (fz3Var == null || (du5Var = fz3Var.f456279e) == null) {
                    hashSet3 = hashSet4;
                    it = it6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "error p is null or username is null %s", fz3Var);
                } else {
                    java.lang.String str = du5Var.f454289d;
                    r45.cu5 cu5Var = fz3Var.f456278d;
                    if (cu5Var == null || (gVar = cu5Var.f453374f) == null || gVar.f273689a == null) {
                        hashSet3 = hashSet4;
                        it = it6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarService", "DoScene is OK, but data is empty:%s", str);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.mo68477x336bdfd8(138L, 11L, 1L, true);
                        g0Var.d(14058, 100001, 11, "", 0, str, "", -1, "", "", -1);
                    } else {
                        hashSet4.add(str);
                        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                        r0Var.f152062a = str;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.mo68477x336bdfd8(138L, 43L, 1L, true);
                        it = it6;
                        hashSet3 = hashSet4;
                        g0Var2.d(14058, 100001, 43, "", 0, str, "", -1, "", "", -1);
                        h(new com.p314xaae8f345.mm.p943x351df9c2.p(this, r0Var, fz3Var.f456278d.f453374f.f273689a));
                    }
                }
                it6 = it;
                hashSet4 = hashSet3;
            }
            hashSet = hashSet4;
        } else {
            hashSet = hashSet4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarService", "scene resp is null");
        }
        java.util.LinkedList linkedList2 = t0Var.f152076e;
        if (linkedList2 != null) {
            java.util.Iterator it7 = linkedList2.iterator();
            while (it7.hasNext()) {
                r45.du5 du5Var2 = (r45.du5) it7.next();
                if (du5Var2 != null) {
                    java.lang.String str2 = du5Var2.f454289d;
                    hashSet2 = hashSet;
                    if (!hashSet2.contains(str2)) {
                        if (i17 == 0 && i18 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarService", "DoScene is OK, but resp data is empty:%s", str2);
                            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                            r0Var2.f152062a = str2;
                            h(new com.p314xaae8f345.mm.p943x351df9c2.q(this, r0Var2));
                        } else {
                            com.p314xaae8f345.mm.p943x351df9c2.s0 g17 = g();
                            if (g17 != null && (n07 = g17.n0(str2)) != null && n07.f152063b == 4) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarService", "DoScene is fail, try reset imgFlag:%s", str2);
                                n07.f152063b = 3;
                                g17.y0(n07);
                            }
                            this.f152055e.remove(str2);
                        }
                    }
                } else {
                    hashSet2 = hashSet;
                }
                hashSet = hashSet2;
            }
        }
    }

    public final com.p314xaae8f345.mm.p943x351df9c2.z e() {
        if (gm0.j1.b().m()) {
            return com.p314xaae8f345.mm.p943x351df9c2.d1.Ai();
        }
        return null;
    }

    public android.graphics.Bitmap f(java.lang.String str, boolean z17, int i17, com.p314xaae8f345.mm.p943x351df9c2.e eVar) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p943x351df9c2.z e17 = e();
        if (e17 != null) {
            if (i17 < 0 || i17 <= 5) {
                bitmap = null;
            } else {
                bitmap = e17.l(java.lang.String.format("%s$$%d", str, java.lang.Integer.valueOf(i17)));
                if (bitmap != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "find custom corner avatar, custom corner %d", java.lang.Integer.valueOf(i17));
                    c(str);
                    return bitmap;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "can not find custom corner avatar, custom corner %d", java.lang.Integer.valueOf(i17));
            }
            if (bitmap == null) {
                bitmap = e17.l(str);
            }
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            if (i17 >= 0 && i17 > 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "create custom corner avatar, custom corner %d", java.lang.Integer.valueOf(i17));
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, i17);
                e17.s(java.lang.String.format("%s$$%d", str, java.lang.Integer.valueOf(i17)), bitmap);
            }
            c(str);
            return bitmap;
        }
        if (z17) {
            c(str);
            return null;
        }
        java.util.Set set = this.f152055e;
        if (set.contains(str)) {
            c(str);
            return null;
        }
        set.add(str);
        h(new com.p314xaae8f345.mm.p943x351df9c2.n(this, str, eVar));
        return null;
    }

    public final com.p314xaae8f345.mm.p943x351df9c2.s0 g() {
        if (gm0.j1.b().m()) {
            return com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
        }
        return null;
    }

    public final int h(com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 g6Var) {
        if (g6Var == null) {
            return -1;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p943x351df9c2.j(this, g6Var));
        return 1;
    }

    public void i(java.lang.String str) {
        h(new com.p314xaae8f345.mm.p943x351df9c2.n(this, str));
    }

    public void j(java.lang.String str, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.d())) {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str, false);
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str, true);
        } else {
            r0Var.f152069h = 1;
        }
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        com.p314xaae8f345.mm.p943x351df9c2.e eVar = new com.p314xaae8f345.mm.p943x351df9c2.e();
        eVar.f151975c = r0Var.f152063b != 4;
        h(new com.p314xaae8f345.mm.p943x351df9c2.n(this, str, eVar));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 123 && (m1Var instanceof com.p314xaae8f345.mm.p943x351df9c2.t0)) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(138L, 12L, 1L, true);
                g0Var.d(14058, 100001, 12, "", 0, "", "", -1, "", "", -1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(138L, 45L, 1L, true);
            g0Var2.d(14058, 100001, 45, "", 0, "", "", -1, "", "", -1);
            try {
                d((com.p314xaae8f345.mm.p943x351df9c2.t0) m1Var, i17, i18);
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarService", "[onSceneEnd] NullPointerException:%s", e17);
            }
            this.f152054d = false;
            if (this.f152057g.isEmpty()) {
                return;
            }
            this.f152061n.c(0L, 0L);
        }
    }
}
