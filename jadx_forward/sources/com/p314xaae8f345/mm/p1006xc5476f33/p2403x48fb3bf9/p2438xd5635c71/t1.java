package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f269461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 f269462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o25.k2 f269463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269465h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f269466i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y1Var, o25.k2 k2Var, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(0);
        this.f269461d = linkedList;
        this.f269462e = y1Var;
        this.f269463f = k2Var;
        this.f269464g = str;
        this.f269465h = str2;
        this.f269466i = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            java.util.LinkedList<r45.d24> linkedList = this.f269461d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y1Var = this.f269462e;
            o25.k2 performanceHelper = this.f269463f;
            java.lang.String str = this.f269464g;
            java.lang.String str2 = this.f269465h;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f269466i;
            for (r45.d24 d24Var : linkedList) {
                if (y1Var.f269487e.containsKey(d24Var.f453539d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 c17 = y1Var.c();
                    c17.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceHelper, "performanceHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) c17.k().get(d24Var.f453539d);
                    if (k0Var != null) {
                        c17.c(k0Var.a(), d24Var, performanceHelper.f424083a, false);
                    }
                } else {
                    java.util.HashMap hashMap = y1Var.f269487e;
                    java.lang.String name = d24Var.f453539d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    hashMap.put(name, d24Var);
                    y1Var.c().d(str, str2, d24Var, performanceHelper, c0Var.f391645d);
                    y1Var.c().f269345b.f269444a.add(java.lang.Long.valueOf(d24Var.f453543h));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebComponent", e17, "config webcompt", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
