package ih1;

/* loaded from: classes7.dex */
public final class m implements gq0.v, jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f373043d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f373044e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f373045f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.List f373046g = kz5.p0.f395529d;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f373047h;

    /* renamed from: i, reason: collision with root package name */
    public final ih1.j f373048i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373049m;

    public m(ih1.u uVar) {
        this.f373049m = uVar;
        this.f373048i = new ih1.j(uVar, this);
    }

    @Override // gq0.v
    public void S3(java.lang.String frameSetId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f373049m;
        sb6.append(uVar.f373063a);
        sb6.append("], notifyFrameSetRemove, frameSetId: ");
        sb6.append(frameSetId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) uVar.f373064b).a();
    }

    @Override // gq0.v
    public java.util.List V2() {
        java.util.Collection values = this.f373043d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Collection<ih1.v> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (ih1.v vVar : collection) {
            arrayList.add(new gq0.u(vVar.f373077c, vVar.f373078d));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r20.f373046g.isEmpty() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(mq0.z r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.m.a(mq0.z, java.util.Map):void");
    }

    @Override // jc3.l0
    public void b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373049m.f373063a + "], notifyConnException, hasDestroy[" + this.f373049m.f373067e + ']');
        java.util.Collection values = this.f373043d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((ih1.v) obj).f373078d) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ih1.v) it.next()).f373077c);
        }
        this.f373046g = arrayList2;
        this.f373047h = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) this.f373049m.f373064b).a();
    }

    @Override // qp0.c
    public void ca(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getAppBrandService", event);
        ih1.u uVar = this.f373049m;
        if (b17) {
            callback.mo147xb9724478(0, "", kz5.c1.i(new jz5.l("service", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) uVar.f373064b).f170218a)));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("postMessageToWeApp", event) && hashMap != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get("bizName"), "MagicAdMiniProgram")) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) uVar.f373064b).f170218a.g(hashMap.get("eventName") != null ? java.lang.String.valueOf(hashMap.get("eventName")) : null, hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7) != null ? java.lang.String.valueOf(hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) : null);
            callback.mo147xb9724478(0, "", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0107  */
    @Override // jc3.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(boolean r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.m.d0(boolean):void");
    }

    @Override // gq0.v
    public void n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f373049m;
        sb6.append(uVar.f373063a);
        sb6.append("], onMainScriptInjected, notify frontend bizCreated");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) uVar.f373064b).f170218a.g("mbAd_notifyBizCreated", "");
    }

    @Override // gq0.v
    public void og(org.json.JSONObject data, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ym5.a1.f(new ih1.l(this.f373049m, data, this, callback));
    }

    @Override // jc3.l0
    /* renamed from: onDestroy */
    public void mo252xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373049m.f373063a + "], notifyDestroyBiz, hasDestroy[" + this.f373049m.f373067e + ']');
        java.util.Collection values = this.f373045f.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            this.f373044e.removeCallbacks((java.lang.Runnable) it.next());
        }
        this.f373045f.clear();
        java.util.Collection<ih1.v> values2 = this.f373043d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        ih1.u uVar = this.f373049m;
        for (ih1.v vVar : values2) {
            if (vVar.f373078d) {
                mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
                java.lang.String str = vVar.f373075a;
                java.lang.String a17 = vVar.f373076b.a();
                java.lang.String str2 = vVar.f373077c;
                ((mq0.s0) d0Var).Ai(str, a17, str2, mq0.a.f412048g, true, str2, kz5.c1.k(new jz5.l("appId", uVar.f373063a), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "destroyBiz")));
            }
        }
        this.f373043d.clear();
    }

    @Override // gq0.v
    public jc3.m xc(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return this.f373048i;
    }
}
