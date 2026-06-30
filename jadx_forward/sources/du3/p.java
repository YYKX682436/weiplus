package du3;

/* loaded from: classes.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.q f325207a;

    public p(du3.q qVar) {
        this.f325207a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.b()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((r45.pg7) ((r45.z86) fVar.f152151d).m75936x14adae67(1)).m75941xfb821914(0), "getAiImgEditTags(...)");
            if (!r0.isEmpty()) {
                java.util.Iterator it = ((r45.pg7) ((r45.z86) fVar.f152151d).m75936x14adae67(1)).m75941xfb821914(0).iterator();
                while (it.hasNext()) {
                    r45.y6 y6Var = (r45.y6) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f325207a.f325213e, "ai tag info:" + y6Var.m75945x2fec8307(0) + ' ' + y6Var.m75945x2fec8307(1));
                }
                return ((ku5.t0) ku5.t0.f394148d).B(new du3.o(this.f325207a, fVar));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f325207a.f325213e, "request error:" + fVar);
        return jz5.f0.f384359a;
    }
}
