package rv0;

/* loaded from: classes5.dex */
public final class w0 implements gy0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481834b;

    public w0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f481833a = n1Var;
        this.f481834b = a0Var;
    }

    @Override // gy0.h
    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        ex0.r K;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        rv0.n1 n1Var = this.f481833a;
        if (n1Var.p7().m7()) {
            boolean z17 = true;
            if ((n1Var.r7().recyclerView.mo7958x54496c8e() != 0) || (K = this.f481834b.K(segmentID)) == null) {
                return;
            }
            ug.m[] mVarArr = {ug.m.MovieClip, ug.m.ImageClip, ug.m.VideoClip, ug.m.Music, ug.m.Transition};
            ug.m mVar = K.f338702c;
            if (kz5.z.G(mVarArr, mVar)) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(n1Var.r7().m47429x4a0f3a9() / (n1Var.s7() != null ? r1.s(n1Var.r7().getTimelineLayoutType()) : 1.0f));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33969x7905b775, "fromSeconds(...)");
                int ordinal = mVar.ordinal();
                if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                    B = (K instanceof ex0.c ? (ex0.c) K : null) != null ? ((ex0.c) K).B() : K.l();
                } else {
                    B = K.l();
                }
                if (m33969x7905b775.m33986x9f3f7b48(B.m34009x8082fb99())) {
                    sub = K.l().m34009x8082fb99();
                } else {
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = B.m34007xde00a612();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a612, "getEndTime(...)");
                    if (!m33969x7905b775.m33971xf922bec1(m34007xde00a612) && !m33969x7905b775.m33975x22a7969a(m34007xde00a612)) {
                        z17 = false;
                    }
                    sub = z17 ? K.l().m34007xde00a612().sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L)) : com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
                }
                if (sub.m33983x7b953cf2()) {
                    gx0.bf.q7(n1Var.p7(), sub, true, 0L, 4, null);
                    n1Var.v7(sub);
                }
            }
        }
    }

    @Override // gy0.h
    public void b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        a(segmentID);
    }
}
