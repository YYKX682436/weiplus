package cl;

/* loaded from: classes7.dex */
public class a3 implements com.p159x477cd522.p160x333422.InterfaceC1457xf776215b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f124131b;

    public a3(cl.l3 l3Var, int i17) {
        this.f124131b = l3Var;
        this.f124130a = i17;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1457xf776215b
    /* renamed from: invoke */
    public void mo15012xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var;
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 1 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 4) {
            return;
        }
        cl.m3 m3Var = this.f124131b.f124220c;
        java.lang.String mo16298x2fec8307 = c1469x28b0ccd7.mo16298x2fec8307(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 x9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9) m3Var).f173984a;
        if (x9Var.f173923j.get()) {
            e9Var = null;
        } else {
            e9Var = x9Var.f173914a;
            java.util.Objects.requireNonNull(e9Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = e9Var != null ? e9Var.getF229341e() : null;
        int i17 = this.f124130a;
        if (f229341e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWorkerContainer", "onWorkerMessage(appId:%s, id:%d, msg:%s), mService.getJsRuntime() is null", x9Var.f173918e, java.lang.Integer.valueOf(i17), mo16298x2fec8307);
        } else {
            f229341e.mo14660x738236e6(java.lang.String.format(java.util.Locale.ENGLISH, "typeof WeixinWorker.workerMsgHandler !== 'undefined' && WeixinWorker.workerMsgHandler(%d, %s);", java.lang.Integer.valueOf(i17), mo16298x2fec8307), null);
        }
    }
}
