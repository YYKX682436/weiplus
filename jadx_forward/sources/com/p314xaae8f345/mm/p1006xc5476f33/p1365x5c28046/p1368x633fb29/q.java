package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes15.dex */
public final class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.p f179124c = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.p(null);

    /* renamed from: d, reason: collision with root package name */
    public static java.util.HashMap f179125d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f179126e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f179127f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f179128a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f179129b;

    public q(r45.oo3 oo3Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f179128a = arrayList;
        this.f179129b = new java.util.HashMap();
        if (oo3Var == null) {
            return;
        }
        arrayList.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.p pVar = f179124c;
        pVar.c();
        java.util.LinkedList<r45.yj0> EmotionStoreRecList = oo3Var.f463927e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EmotionStoreRecList, "EmotionStoreRecList");
        long j17 = oo3Var.f463928f;
        java.lang.String valueOf = j17 > 0 ? java.lang.String.valueOf(j17) : "";
        for (r45.yj0 yj0Var : EmotionStoreRecList) {
            int i17 = yj0Var.f472677e;
            if (i17 == 1) {
                int i18 = yj0Var.f472676d;
                if (i18 != 1) {
                    a(this, yj0Var.f472678f, this.f179128a, i18, 0, 8, null);
                }
                i22.a aVar = new i22.a();
                aVar.f369455a = new java.util.ArrayList();
                aVar.f369456b = yj0Var.f472681i;
                aVar.f369457c = yj0Var.f472676d;
                ((java.util.ArrayList) this.f179128a).add(aVar);
            } else if (i17 == 2) {
                a(this, yj0Var.f472678f, this.f179128a, yj0Var.f472676d, 0, 8, null);
                java.util.LinkedList EmotionList = yj0Var.f472683n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EmotionList, "EmotionList");
                int i19 = 0;
                for (java.lang.Object obj : EmotionList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.zj0 zj0Var = (r45.zj0) obj;
                    i22.m0 m0Var = new i22.m0();
                    m0Var.f369538b = i19 == 0;
                    j12.i iVar = new j12.i(zj0Var);
                    iVar.f378709k = valueOf;
                    if (n22.l.c(zj0Var)) {
                        if (n22.l.a()) {
                            iVar.c(7);
                        } else {
                            iVar.c(3);
                        }
                    }
                    boolean b17 = pVar.b();
                    java.lang.String str = zj0Var.f473661d;
                    iVar.b(b17, str != null ? (com.p314xaae8f345.mm.p2621x8fb0427b.f5) this.f179129b.get(str) : null, pVar.a(zj0Var.f473661d));
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().f179131b != null && (!((java.util.HashMap) r12).isEmpty())) {
                        int b18 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().b(zj0Var.f473661d);
                        if (b18 >= 0) {
                            iVar.c(6);
                            iVar.f378703e = b18;
                        }
                        if (b18 < 0 && iVar.f378704f == 6) {
                            iVar.c(3);
                        }
                    }
                    m0Var.f369537a = iVar;
                    ((java.util.ArrayList) this.f179128a).add(m0Var);
                    i19 = i27;
                }
                i22.k0 k0Var = new i22.k0();
                k0Var.f369529b = x51.j1.d(yj0Var.f472679g);
                java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.byr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
                k0Var.f369528a = r17;
                java.lang.String ListName = yj0Var.f472678f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ListName, "ListName");
                k0Var.f369530c = ListName;
                k0Var.f369531d = yj0Var.f472676d;
                ((java.util.ArrayList) this.f179128a).add(k0Var);
            } else if (i17 == 3) {
                java.util.LinkedList<r45.vi0> EmojiRecommendList = yj0Var.f472685p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EmojiRecommendList, "EmojiRecommendList");
                for (r45.vi0 vi0Var : EmojiRecommendList) {
                    i22.a1 a1Var = new i22.a1();
                    a1Var.f369461d = yj0Var.f472676d;
                    java.util.LinkedList<r45.ri0> Emojis = vi0Var.f469810f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Emojis, "Emojis");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Emojis, 10));
                    for (r45.ri0 ri0Var : Emojis) {
                        i22.c1 c1Var = new i22.c1();
                        c1Var.f369485a = ri0Var;
                        c1Var.f369486b = yj0Var.f472676d;
                        arrayList2.add(c1Var);
                    }
                    a1Var.f369458a = arrayList2;
                    a1Var.f369459b = vi0Var.f469808d;
                    ((java.util.ArrayList) this.f179128a).add(a1Var);
                }
            }
        }
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q qVar, java.lang.String str, java.util.List list, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = -1;
        }
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return false;
        }
        i22.l0 l0Var = new i22.l0();
        l0Var.f369533a = str;
        l0Var.f369534b = i17;
        if (i18 == -1) {
            list.add(l0Var);
        } else {
            list.add(i18, l0Var);
        }
        return true;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f5 b(java.lang.String str) {
        java.util.HashMap hashMap = this.f179129b;
        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = str == null ? null : (com.p314xaae8f345.mm.p2621x8fb0427b.f5) hashMap.get(str);
        if (f5Var == null) {
            f5Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f5(str);
            if (str != null) {
                hashMap.put(str, f5Var);
            }
        }
        return f5Var;
    }
}
