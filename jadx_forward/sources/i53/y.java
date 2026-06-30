package i53;

/* loaded from: classes8.dex */
public class y implements i53.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f370318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.z f370319b;

    public y(i53.z zVar, java.util.LinkedList linkedList) {
        this.f370319b = zVar;
        this.f370318a = linkedList;
    }

    public void a(boolean z17) {
        i53.z zVar = this.f370319b;
        i53.d3 d3Var = (i53.d3) zVar.f370334h.f370074d.remove(zVar.f370331e.f67215x11522065);
        if (d3Var != null) {
            d3Var.d();
        }
        if (!z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().L0(zVar.f370331e.f67215x11522065, 1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(zVar.f370331e.f67215x11522065, 1);
            zVar.f370334h.Bi(zVar.f370331e.f67215x11522065, -1);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().L0(zVar.f370331e.f67215x11522065, 2);
            i53.d0 d0Var = zVar.f370334h;
            i53.x xVar = zVar.f370331e;
            d0Var.Vi(xVar.f67215x11522065, xVar.f67212xf10bdf85, this.f370318a, xVar.f67204xedd646cf, xVar.f67214xf10c4fa7, zVar.f370333g);
        }
    }
}
