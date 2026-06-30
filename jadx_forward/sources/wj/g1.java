package wj;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class})
/* loaded from: classes7.dex */
public final class g1 extends i95.w implements wj.m {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f527943d = jz5.h.b(wj.z0.f528087d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f527944e = jz5.h.b(wj.f1.f527937d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f527945f = jz5.h.b(wj.e1.f527931d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f527946g = jz5.h.b(wj.a1.f527907d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f527947h = jz5.h.b(wj.d1.f527928d);

    public boolean Ai(java.lang.String bizName, java.lang.String slotId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotId, "slotId");
        hk.n nVar = hk.n.f363216a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27060, bizName, 2, slotId, 0);
        hk.b b17 = nVar.b();
        if (b17 == null) {
            return false;
        }
        int m145252xb06685ab = b17.m145252xb06685ab("AdvertisePushDBInfo", "message_slotid=?", new java.lang.String[]{slotId});
        if (m145252xb06685ab >= 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdvertisePushDBInfoStorage", "clearSpecificSlotMsg error,delete ret:" + m145252xb06685ab);
        return false;
    }

    public java.util.List Bi(java.lang.String bizName, java.lang.String slotId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotId, "slotId");
        java.util.List<hk.a> a17 = hk.n.f363216a.a(bizName, slotId);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (hk.a info : a17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            int y07 = info.y0();
            long t07 = info.t0();
            long v07 = info.v0();
            long u07 = info.u0();
            java.lang.String w07 = info.w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getMessage_traceid(...)");
            arrayList.add(new com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557(y07, t07, v07, u07, w07));
        }
        return arrayList;
    }

    public xj.p Di() {
        java.lang.Object obj;
        jz5.o oVar = (jz5.o) ((jz5.n) this.f527945f).mo141623x754a37bb();
        int intValue = ((java.lang.Number) oVar.f384374d).intValue();
        if (!((java.lang.Boolean) oVar.f384376f).booleanValue() || intValue < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", "[MBAd] navigate strategy: CONTROL (_0312 not hit)");
            return xj.p.f536299f;
        }
        xj.p.f536298e.getClass();
        java.util.Iterator it = ((kz5.h) xj.p.f536303m).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((xj.p) obj).f536304d == intValue) {
                break;
            }
        }
        xj.p pVar = (xj.p) obj;
        if (pVar == null) {
            pVar = xj.p.f536299f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", "[MBAd] navigate strategy: " + pVar + " (from _0312, value=" + intValue + ')');
        return pVar;
    }

    public boolean Ni() {
        boolean z17;
        try {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_keep_alive_0427;
            h62.d dVar = (h62.d) e0Var;
            boolean mj6 = dVar.mj(c0Var, c19767x257d7f, c19767x257d7f2);
            int Ni = dVar.Ni(c0Var, 0);
            if (mj6) {
                z17 = true;
                if (Ni == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", "[MBAd] keepAlive0427 value:" + Ni + ", groupId:" + c19767x257d7f2.f38864x6ac9171 + ", hit:" + mj6 + ", enabled:" + z17);
                    return z17;
                }
            }
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", "[MBAd] keepAlive0427 value:" + Ni + ", groupId:" + c19767x257d7f2.f38864x6ac9171 + ", hit:" + mj6 + ", enabled:" + z17);
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicAdvertiseFeatureService", "[MBAd] keepAlive expt read failed: " + e17);
            return false;
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7 s7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class));
        s7Var.bj("MagicAdPublicService", wj.b1.f527914a);
        s7Var.bj("MagicAdMiniProgram", wj.c1.f527916a);
    }

    public xj.k wi(java.lang.String bizName, java.lang.String adSlot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adSlot, "adSlot");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "MagicAdMiniProgram") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(adSlot, "rewardAD")) {
            return (xj.k) ((jz5.n) this.f527946g).mo141623x754a37bb();
        }
        return new xj.k(false, 0);
    }
}
