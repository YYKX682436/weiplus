package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ma implements ph1.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ka {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f166319b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f166320c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166321d;

    /* renamed from: e, reason: collision with root package name */
    public ph1.p f166322e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f166323f;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6, java.lang.String moduleName, java.lang.String transactionKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transactionKey, "transactionKey");
        this.f166319b = rt6;
        this.f166320c = moduleName;
        this.f166321d = transactionKey;
        this.f166323f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.la(this));
    }

    @Override // ph1.r
    public void a(java.util.concurrent.Executor executor) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea eaVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(executor, ph1.o.f435878a);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea.f166130d;
        java.lang.String transactionKey = this.f166321d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transactionKey, "transactionKey");
        java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea.f166130d;
        if (map2 instanceof java.util.concurrent.ConcurrentHashMap) {
            java.lang.Object computeIfAbsent = ((java.util.concurrent.ConcurrentHashMap) map2).computeIfAbsent(transactionKey, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u9(transactionKey));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(computeIfAbsent);
            eaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea) computeIfAbsent;
        } else {
            synchronized (map2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea eaVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea) ((java.util.concurrent.ConcurrentHashMap) map2).get(transactionKey);
                if (eaVar2 == null) {
                    eaVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea(transactionKey);
                    ((java.util.concurrent.ConcurrentHashMap) map2).put(transactionKey, eaVar2);
                }
                eaVar = eaVar2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = eaVar.f166133c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f166319b;
        if (c11510xdd90c2f2 == null) {
            eaVar.f166133c = c11510xdd90c2f22;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11510xdd90c2f2, c11510xdd90c2f22);
        }
        eaVar.f166132b.add(this);
    }

    @Override // ph1.r
    public void b(ph1.p pVar) {
        this.f166322e = pVar;
    }
}
