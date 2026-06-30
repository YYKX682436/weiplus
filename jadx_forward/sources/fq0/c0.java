package fq0;

/* loaded from: classes7.dex */
public final class c0 extends fq0.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Collection f346977d;

    /* renamed from: e, reason: collision with root package name */
    public jc3.b0 f346978e;

    /* renamed from: f, reason: collision with root package name */
    public lc3.q f346979f;

    public c0(java.util.Collection jsApiSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiSet, "jsApiSet");
        this.f346977d = jsApiSet;
    }

    @Override // jc3.a0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b b0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclService", "onProvideConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.a(this.f346977d);
        return c16416x87606a7b;
    }

    @Override // jc3.a0
    public void h(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclService", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // jc3.z
    public lc3.g0 k0(java.lang.String version) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclService", "hy: on request provide plugin from scl service");
        synchronized (this) {
            if (this.f346979f == null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                this.f346979f = (lc3.q) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, "MagicSclPublicService", null, 2, null);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f346979f);
        }
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        return ((jc3.z) ((lc3.q) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c18, "MagicSclPublicService", null, 2, null))).k0(version);
    }

    @Override // jc3.a0
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclService", "onMainScriptInjected");
    }

    @Override // jc3.a0
    /* renamed from: onCreated */
    public void mo124517x8cf48009() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclService", "onCreated");
    }

    @Override // jc3.a0
    /* renamed from: onDestroy */
    public void mo124518xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclService", "onDestroy");
        this.f346978e = null;
        this.f346979f = null;
        we3.e eVar = (we3.e) ((ve3.n) i95.n0.c(ve3.n.class));
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBExternalFinderLive", "clearAll");
        java.util.HashMap hashMap = eVar.f526805d;
        java.util.Collection values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((we3.k) it.next()).d();
        }
        hashMap.clear();
        xe3.p pVar = (xe3.p) ((ve3.s) i95.n0.c(ve3.s.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearAll, total items: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f535495d;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_service", sb6.toString());
        java.util.Collection<xe3.f> values2 = concurrentHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        for (xe3.f fVar : values2) {
            try {
                fVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "destroy " + fVar);
                rh3.r rVar = fVar.f535477d;
                rVar.mo162432x360802();
                rVar.mo162427x41012807();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_video_service", "destroy item failed", e17);
            }
        }
        concurrentHashMap.clear();
        pVar.f535496e.clear();
    }

    @Override // jc3.a0
    public void w(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclService", "onCanvasViewFirstFrameRender " + i17);
    }

    @Override // jc3.a0
    public void x0(jc3.b0 dispatcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        this.f346978e = dispatcher;
    }
}
