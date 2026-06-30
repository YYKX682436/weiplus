package tb5;

@yn.c(m177365x976763e5 = tb5.n0.class)
/* loaded from: classes9.dex */
public final class d0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements tb5.n0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f498575e;

    /* renamed from: f, reason: collision with root package name */
    public tb5.a0 f498576f = new tb5.a0();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        this.f498576f.f498561c = c01.id.c();
        tb5.a0 a0Var = this.f498576f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitorComponent", "initMs:" + a0Var.f498559a + ",onListFirstLayout:" + a0Var.f498560b + ",exitAnimEndMs:" + a0Var.f498561c + ",cost:" + java.lang.Math.max(a0Var.f498560b - a0Var.f498559a, 0L) + "ms,loadingHasShow:" + a0Var.f498563e + ",stage:" + kz5.n0.g0(kz5.e1.v(tb5.f0.b(a0Var.f498562d)), null, null, null, 0, null, tb5.z.f498640d, 31, null));
        boolean z17 = c06.e.f119249d.d(1000) == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitorComponent", "hitSampling: " + z17);
        if (z17 || this.f498576f.f498563e) {
            tb5.a0 a0Var2 = this.f498576f;
            java.util.Map l17 = kz5.c1.l(new jz5.l("initMs", java.lang.Long.valueOf(a0Var2.f498559a)), new jz5.l("firstFrameShowMs", java.lang.Long.valueOf(a0Var2.f498560b)), new jz5.l("exitAnimEndMs", java.lang.Long.valueOf(a0Var2.f498561c)), new jz5.l("cost", java.lang.Long.valueOf(java.lang.Math.max(a0Var2.f498560b - a0Var2.f498559a, 0L))), new jz5.l("loadingHasShow", java.lang.Boolean.valueOf(a0Var2.f498563e)));
            l17.putAll(tb5.f0.b(a0Var2.f498562d));
            java.lang.String G1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f280113d.x());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G1, "secPrint(...)");
            l17.put("talker", G1);
            km.a.a("chatting_msg_load_rpt", l17);
        }
    }

    @Override // yn.d
    public void S(xm3.o0 o0Var) {
        if (this.f498575e) {
            return;
        }
        this.f498575e = true;
        this.f280113d.f542243e.a0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        tb5.a0 a0Var = new tb5.a0();
        this.f498576f = a0Var;
        a0Var.f498559a = c01.id.c();
        this.f498575e = false;
    }

    @Override // yn.d
    public void a0() {
        m0("onFirstDataLoadFinsih", hd5.n.ACTION_ENTER);
    }

    @Override // yn.d
    public void e0() {
        this.f498576f.f498560b = c01.id.c();
        m0("onListFirstLayout", hd5.n.ACTION_ENTER);
    }

    public void m0(java.lang.String stage, hd5.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        if (nVar != hd5.n.ACTION_ENTER) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitorComponent", "recordMsgLoad[" + stage + ']');
        this.f498576f.f498562d.put(stage, java.lang.Long.valueOf(c01.id.c()));
    }
}
