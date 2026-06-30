package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public final class q implements com.tencent.mm.plugin.emoji.model.f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.model.p f97591c = new com.tencent.mm.plugin.emoji.model.p(null);

    /* renamed from: d, reason: collision with root package name */
    public static java.util.HashMap f97592d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f97593e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f97594f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f97595a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f97596b;

    public q(r45.oo3 oo3Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f97595a = arrayList;
        this.f97596b = new java.util.HashMap();
        if (oo3Var == null) {
            return;
        }
        arrayList.clear();
        com.tencent.mm.plugin.emoji.model.p pVar = f97591c;
        pVar.c();
        java.util.LinkedList<r45.yj0> EmotionStoreRecList = oo3Var.f382394e;
        kotlin.jvm.internal.o.f(EmotionStoreRecList, "EmotionStoreRecList");
        long j17 = oo3Var.f382395f;
        java.lang.String valueOf = j17 > 0 ? java.lang.String.valueOf(j17) : "";
        for (r45.yj0 yj0Var : EmotionStoreRecList) {
            int i17 = yj0Var.f391144e;
            if (i17 == 1) {
                int i18 = yj0Var.f391143d;
                if (i18 != 1) {
                    a(this, yj0Var.f391145f, this.f97595a, i18, 0, 8, null);
                }
                i22.a aVar = new i22.a();
                aVar.f287922a = new java.util.ArrayList();
                aVar.f287923b = yj0Var.f391148i;
                aVar.f287924c = yj0Var.f391143d;
                ((java.util.ArrayList) this.f97595a).add(aVar);
            } else if (i17 == 2) {
                a(this, yj0Var.f391145f, this.f97595a, yj0Var.f391143d, 0, 8, null);
                java.util.LinkedList EmotionList = yj0Var.f391150n;
                kotlin.jvm.internal.o.f(EmotionList, "EmotionList");
                int i19 = 0;
                for (java.lang.Object obj : EmotionList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.zj0 zj0Var = (r45.zj0) obj;
                    i22.m0 m0Var = new i22.m0();
                    m0Var.f288005b = i19 == 0;
                    j12.i iVar = new j12.i(zj0Var);
                    iVar.f297176k = valueOf;
                    if (n22.l.c(zj0Var)) {
                        if (n22.l.a()) {
                            iVar.c(7);
                        } else {
                            iVar.c(3);
                        }
                    }
                    boolean b17 = pVar.b();
                    java.lang.String str = zj0Var.f392128d;
                    iVar.b(b17, str != null ? (com.tencent.mm.storage.f5) this.f97596b.get(str) : null, pVar.a(zj0Var.f392128d));
                    if (((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().f97598b != null && (!((java.util.HashMap) r12).isEmpty())) {
                        int b18 = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().b(zj0Var.f392128d);
                        if (b18 >= 0) {
                            iVar.c(6);
                            iVar.f297170e = b18;
                        }
                        if (b18 < 0 && iVar.f297171f == 6) {
                            iVar.c(3);
                        }
                    }
                    m0Var.f288004a = iVar;
                    ((java.util.ArrayList) this.f97595a).add(m0Var);
                    i19 = i27;
                }
                i22.k0 k0Var = new i22.k0();
                k0Var.f287996b = x51.j1.d(yj0Var.f391146g);
                java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.byr);
                kotlin.jvm.internal.o.f(r17, "getString(...)");
                k0Var.f287995a = r17;
                java.lang.String ListName = yj0Var.f391145f;
                kotlin.jvm.internal.o.f(ListName, "ListName");
                k0Var.f287997c = ListName;
                k0Var.f287998d = yj0Var.f391143d;
                ((java.util.ArrayList) this.f97595a).add(k0Var);
            } else if (i17 == 3) {
                java.util.LinkedList<r45.vi0> EmojiRecommendList = yj0Var.f391152p;
                kotlin.jvm.internal.o.f(EmojiRecommendList, "EmojiRecommendList");
                for (r45.vi0 vi0Var : EmojiRecommendList) {
                    i22.a1 a1Var = new i22.a1();
                    a1Var.f287928d = yj0Var.f391143d;
                    java.util.LinkedList<r45.ri0> Emojis = vi0Var.f388277f;
                    kotlin.jvm.internal.o.f(Emojis, "Emojis");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Emojis, 10));
                    for (r45.ri0 ri0Var : Emojis) {
                        i22.c1 c1Var = new i22.c1();
                        c1Var.f287952a = ri0Var;
                        c1Var.f287953b = yj0Var.f391143d;
                        arrayList2.add(c1Var);
                    }
                    a1Var.f287925a = arrayList2;
                    a1Var.f287926b = vi0Var.f388275d;
                    ((java.util.ArrayList) this.f97595a).add(a1Var);
                }
            }
        }
    }

    public static boolean a(com.tencent.mm.plugin.emoji.model.q qVar, java.lang.String str, java.util.List list, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = -1;
        }
        qVar.getClass();
        kotlin.jvm.internal.o.g(list, "list");
        if (str == null || kotlin.jvm.internal.o.b(str, "")) {
            return false;
        }
        i22.l0 l0Var = new i22.l0();
        l0Var.f288000a = str;
        l0Var.f288001b = i17;
        if (i18 == -1) {
            list.add(l0Var);
        } else {
            list.add(i18, l0Var);
        }
        return true;
    }

    public com.tencent.mm.storage.f5 b(java.lang.String str) {
        java.util.HashMap hashMap = this.f97596b;
        com.tencent.mm.storage.f5 f5Var = str == null ? null : (com.tencent.mm.storage.f5) hashMap.get(str);
        if (f5Var == null) {
            f5Var = new com.tencent.mm.storage.f5(str);
            if (str != null) {
                hashMap.put(str, f5Var);
            }
        }
        return f5Var;
    }
}
