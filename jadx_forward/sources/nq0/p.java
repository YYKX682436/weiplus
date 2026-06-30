package nq0;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class})
/* loaded from: classes7.dex */
public final class p extends i95.w implements gq0.t {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f420475d = jz5.h.b(nq0.n.f420472d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f420476e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f420477f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f420478g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f420479h = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f420480i = new java.util.LinkedHashMap();

    public synchronized iq0.c Ai(yz5.a bizCreator, java.lang.String instanceKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizCreator, "bizCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceKey, "instanceKey");
        iq0.a aVar = (iq0.a) bizCreator.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        iq0.b bVar = iq0.c.f375175e;
        h0Var.f391656d = bVar.b(aVar.f375167a, instanceKey, false);
        ((mq0.s0) Ri()).Ai(aVar.f375167a, "", "", mq0.a.f412060v, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f391656d).f375180d)));
        if (((jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(h0Var.f391656d)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "acquire biz, which is existed, bizHandle: " + h0Var.f391656d);
            ((mq0.s0) Ri()).Ai(aVar.f375167a, "", "", mq0.a.f412062x, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f391656d).f375180d)));
            return (iq0.c) h0Var.f391656d;
        }
        jz5.l Zi = Zi(aVar);
        if (((java.lang.Boolean) Zi.f384367e).booleanValue()) {
            bVar.a((iq0.c) h0Var.f391656d);
            h0Var.f391656d = bVar.b(aVar.f375167a, instanceKey, true);
            ((mq0.s0) Ri()).Ai(aVar.f375167a, "", "", mq0.a.f412063y, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f391656d).f375180d)));
        } else {
            ((mq0.s0) Ri()).Ai(aVar.f375167a, "", "", mq0.a.f412061w, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f391656d).f375180d)));
        }
        jc3.i0 i0Var = (jc3.i0) Zi.f384366d;
        if (i0Var != null) {
            this.f420478g.put(h0Var.f391656d, bizCreator);
            this.f420477f.put(h0Var.f391656d, i0Var);
            if (!(i0Var instanceof hq0.b0)) {
                i0Var.S(new nq0.k(h0Var, this));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "acquire biz, handle: " + h0Var.f391656d + ", isPreload: " + ((iq0.c) h0Var.f391656d).f375179c);
        return (iq0.c) h0Var.f391656d;
    }

    public void Bi(iq0.c handle, iq0.e eVar, android.view.ViewGroup containerView, java.lang.String frameSetName, java.lang.String frameSetData, int i17, yz5.l lVar) {
        jc3.i0 i0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "handle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(handle);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (!(i0Var instanceof hq0.h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
            i0Var = null;
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            ((hq0.b0) hVar).N1(eVar, containerView, frameSetName, frameSetData, i17, lVar);
        }
    }

    public void Di(iq0.c handle) {
        jc3.i0 i0Var;
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "handle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "deactiveBiz");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(handle);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.mo133869x88fbd074();
            if (!(i0Var instanceof hq0.b0) || (aVar = (yz5.a) ((java.util.LinkedHashMap) this.f420478g).get(handle)) == null) {
                return;
            }
            double d17 = ((iq0.a) aVar.mo152xb9724478()).f375172f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "releaseBiz " + d17 + " later");
            if (d17 == 0.0d) {
                aj(handle);
                return;
            }
            if (d17 > 0.0d) {
                java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) this.f420480i).get(handle);
                if (runnable != null) {
                    this.f420479h.removeCallbacks(runnable);
                }
                nq0.o oVar = new nq0.o(this, handle);
                this.f420480i.put(handle, oVar);
                this.f420479h.postDelayed(oVar, (long) (1000 * d17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "releaseBiz " + d17 + " later");
            }
        }
    }

    public java.lang.String Ni(iq0.c handle) {
        jc3.i0 i0Var;
        java.lang.String e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "handle");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(handle);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (!(i0Var instanceof hq0.h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
            i0Var = null;
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar == null) {
            return "";
        }
        hq0.b0 b0Var = (hq0.b0) hVar;
        jc3.x E1 = b0Var.E1();
        return (E1 == null || (e17 = E1.e()) == null) ? ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi(b0Var.f364503x.f375167a) : e17;
    }

    public final mq0.d0 Ri() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f420475d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (mq0.d0) mo141623x754a37bb;
    }

    public void Ui(iq0.c handle, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d jsEvent) {
        jc3.i0 i0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "handle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsEvent, "jsEvent");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(handle);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.l(jsEvent);
        }
    }

    public synchronized gq0.y Vi(iq0.d bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        java.lang.String str = bizConfig.f375181a;
        mq0.d0 Ri = Ri();
        mq0.a aVar = mq0.a.f412057s;
        kz5.q0 q0Var = kz5.q0.f395534d;
        ((mq0.s0) Ri).Ai(str, "", "", aVar, true, "", q0Var);
        if (((jc3.i0) this.f420476e.get(str)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "preload, exceed cache size, bizName: ".concat(str));
            ((mq0.s0) Ri()).Ai(str, "", "", mq0.a.f412059u, true, "", kz5.b1.e(new jz5.l("errMsg", "exceed cache size")));
            return gq0.y.f356025f;
        }
        jz5.f0 f0Var = null;
        gq0.s bVar = bizConfig instanceof iq0.i ? new oq0.b() : bizConfig instanceof iq0.f ? new oq0.a() : null;
        if (bVar != null) {
            jz5.l a17 = bVar.a(bizConfig, new nq0.m(this, str, bizConfig));
            jc3.r0 r0Var = (jc3.r0) a17.f384366d;
            jc3.i0 i0Var = (jc3.i0) a17.f384367e;
            if (r0Var == jc3.r0.f380511d && i0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "preload success, bizName: ".concat(str));
                this.f420476e.put(str, i0Var);
                ((mq0.s0) Ri()).Ai(str, "", "", mq0.a.f412058t, true, "", q0Var);
                return gq0.y.f356023d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "preload fail, bizName: " + str + ", reason: " + r0Var);
            mq0.d0 Ri2 = Ri();
            ((mq0.s0) Ri2).Ai(str, "", "", mq0.a.f412059u, true, "", kz5.b1.e(new jz5.l("errMsg", "preload fail, reason " + r0Var)));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "preload, factory not match, bizName: ".concat(str));
            ((mq0.s0) Ri()).Ai(str, "", "", mq0.a.f412059u, true, "", kz5.b1.e(new jz5.l("errMsg", "factory not match")));
        }
        return gq0.y.f356024e;
    }

    public final jz5.l Zi(iq0.a aVar) {
        jc3.i0 b17;
        java.lang.String str = aVar.f375167a;
        gq0.s bVar = aVar instanceof iq0.h ? new oq0.b() : aVar instanceof iq0.g ? new oq0.a() : null;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "provideBizInstance, biz factory not found, bizName: " + str);
            return new jz5.l(null, java.lang.Boolean.FALSE);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f420476e;
        jc3.i0 i0Var = (jc3.i0) concurrentHashMap.get(str);
        if (i0Var == null || (b17 = bVar.b(i0Var, aVar)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "provideBizInstance, create biz, bizName: " + str);
            return new jz5.l(bVar.c(aVar), java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "provideBizInstance, use preload biz, bizName: " + str);
        concurrentHashMap.remove(str);
        return new jz5.l(b17, java.lang.Boolean.TRUE);
    }

    public final synchronized void aj(iq0.c cVar) {
        jc3.i0 i0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "releaseBiz");
        synchronized (cVar) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(cVar);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (!(i0Var instanceof hq0.h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
            i0Var = null;
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            ((hq0.b0) hVar).mo123041x5cd39ffa();
        }
        iq0.c.f375175e.a(cVar);
        this.f420477f.remove(cVar);
        this.f420478g.remove(cVar);
    }

    public void bj(iq0.c handle, java.lang.String script, yz5.l lVar) {
        jc3.i0 i0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "handle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(handle);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.t0(script, lVar);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        java.util.Map map = ge3.s.f352507a;
        for (java.lang.String str : ge3.s.f352507a.keySet()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).bj(str, new nq0.l(str));
        }
    }

    public void wi(iq0.c handle, android.app.Activity activity) {
        jc3.i0 i0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "handle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "active");
        java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) this.f420480i).get(handle);
        if (runnable != null) {
            this.f420479h.removeCallbacks(runnable);
        }
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f420477f).get(handle);
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.V(activity);
        }
    }
}
