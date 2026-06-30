package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4 f186872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4 c4Var) {
        super(0);
        this.f186872d = c4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        java.lang.String str = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4 c4Var = this.f186872d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y6) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) c4Var.f186971a).f187514i).mo141623x754a37bb()).f187567a.t("KEY_FINDER_RED_DOT_EXPOSE_TIME_INFO_MAP");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExposeHandler", "getExposeTimeInfoMap json= " + str);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) new com.p176xb6135e39.p280x308fcb.i().c(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z3().f371555b);
            if (concurrentHashMap == null) {
                concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(concurrentHashMap);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.RedDotExposeHandler", m143898xd4a2fc34, "getExposeTimeInfoMap failed! json= " + str, new java.lang.Object[0]);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) m143895xf1229813;
        return concurrentHashMap2 == null ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap2;
    }
}
