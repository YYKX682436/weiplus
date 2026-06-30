package ip1;

/* loaded from: classes8.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.vq0 f375128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bw5.vq0 vq0Var) {
        super(0);
        this.f375128d = vq0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = true;
        bw5.vq0 vq0Var = this.f375128d;
        bw5.xb0 xb0Var = vq0Var != null ? vq0Var.f115999f[1] ? vq0Var.f115997d : new bw5.xb0() : null;
        if (xb0Var != null) {
            ip1.q qVar = ip1.q.f375129a;
            int i17 = xb0Var.f116578e;
            if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
                z17 = false;
            }
            if (z17) {
                ip1.q.f375136h = vq0Var;
                gp1.p pVar = ip1.q.f375134f;
                if (pVar != null) {
                    java.lang.String m13326x7531c8a2 = xb0Var.m13326x7531c8a2();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13326x7531c8a2, "getTitle(...)");
                    java.lang.String str = xb0Var.f116586p[9] ? xb0Var.f116585o : "";
                    oh4.j jVar = ((oh4.b) pVar).f426996a;
                    jVar.getClass();
                    pm0.v.X(new oh4.i(m13326x7531c8a2, jVar, str));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioPanelTaskBarController", "syncItem is not valid, type:" + xb0Var.f116578e + ", title:" + xb0Var.m13326x7531c8a2());
            }
        }
        return jz5.f0.f384359a;
    }
}
