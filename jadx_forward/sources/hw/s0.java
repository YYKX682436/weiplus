package hw;

/* loaded from: classes7.dex */
public final class s0 extends hw.c0 {
    public android.widget.FrameLayout G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(fw.h flutterPlugin) {
        super(flutterPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPlugin, "flutterPlugin");
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicEcsTimeline";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicEcsTLBiz", "onJSException envId:" + envId + " msg:" + msg);
    }

    @Override // hw.c0, hq0.i0
    public void X0() {
        super.X0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = z65.c.a();
        ((ku5.t0) ku5.t0.f394148d).g(new hw.q0(this, c16416x87606a7b));
    }

    @Override // hw.c0, hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLBiz", "destroyBrandServiceBiz");
        if (z65.c.a()) {
            pm0.v.X(new hw.p0(this));
        }
        super.mo123041x5cd39ffa();
    }

    @Override // hw.c0, hq0.i0, jc3.u
    public void n() {
        super.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLBiz", "onMainScriptInjected");
        ((ku5.t0) ku5.t0.f394148d).q(hw.r0.f366962d);
    }

    @Override // hw.c0, hq0.i0, jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        super.mo123042x8cf48009();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLBiz", "onCreated");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLBiz", "onDestroy reason:" + i17);
    }

    @Override // hq0.i0
    /* renamed from: start */
    public void mo123044x68ac462() {
        super.mo123044x68ac462();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLBiz", "start");
    }
}
