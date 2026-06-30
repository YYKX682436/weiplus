package e10;

/* loaded from: classes7.dex */
public final class j extends e10.i implements jc3.z {

    /* renamed from: d, reason: collision with root package name */
    public final jc3.y0 f327869d;

    public j(jc3.y0 jsApiSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiSet, "jsApiSet");
        this.f327869d = jsApiSet;
    }

    @Override // jc3.a0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b b0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsPublicService", "onProvideConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.f229355i = false;
        jc3.y0 y0Var = this.f327869d;
        c16416x87606a7b.a(y0Var.f380545a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, new java.util.HashSet(y0Var.f380546b));
        return c16416x87606a7b;
    }

    @Override // jc3.a0
    public void h(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEcsPublicService", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // jc3.z
    public lc3.g0 k0(java.lang.String version) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return ((jc3.z) ((lc3.q) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, "MagicEcsPublicService", null, 2, null))).k0(version);
    }

    @Override // jc3.a0
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsPublicService", "onMainScriptInjected");
    }

    @Override // jc3.a0
    /* renamed from: onCreated */
    public void mo124517x8cf48009() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsPublicService", "onCreated");
    }

    @Override // jc3.a0
    /* renamed from: onDestroy */
    public void mo124518xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsPublicService", "onDestroy");
    }
}
