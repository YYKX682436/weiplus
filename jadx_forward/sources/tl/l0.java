package tl;

/* loaded from: classes12.dex */
public class l0 implements com.p314xaae8f345.mm.p944x882e457a.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f501592a;

    public l0(tl.p0 p0Var) {
        this.f501592a = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e1
    public void a() {
        tl.p0 p0Var = this.f501592a;
        p0Var.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "Record Failed file:" + p0Var.f501605e);
        if (!p0Var.m() || p0Var.f501606f == null) {
            w21.x0.b(p0Var.f501605e);
        } else {
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(p0Var.f501606f);
        }
        com.p314xaae8f345.mm.p944x882e457a.e1 e1Var = p0Var.f501619s;
        if (e1Var != null) {
            e1Var.a();
        }
    }
}
