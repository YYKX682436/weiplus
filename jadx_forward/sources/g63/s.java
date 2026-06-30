package g63;

/* loaded from: classes8.dex */
public final class s extends g63.q0 {

    /* renamed from: b, reason: collision with root package name */
    public g63.c f350705b;

    /* renamed from: c, reason: collision with root package name */
    public g63.d f350706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g63.p0 delegate) {
        super(delegate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
    }

    public static final void a(g63.s sVar, z53.i iVar, long j17, int i17) {
        sVar.getClass();
        java.lang.String str = j17 == 72 ? "2" : null;
        boolean u07 = iVar.u0();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
        g63.p0 p0Var = sVar.f350697a;
        if (u07) {
            int x17 = ((g63.j) p0Var).x();
            java.lang.String field_sessionId = iVar.f67669xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            dVar.e(i17 + 1, j17, x17, field_sessionId, 0L, "", 0L, "", iVar.t0(), e63.a.f331350a, str);
            return;
        }
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar.f67668x5568d387);
        if (Di != null) {
            int x18 = ((g63.j) p0Var).x();
            java.lang.String field_sessionId2 = iVar.f67669xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
            long j18 = Di.f67426x9f600742;
            java.lang.String field_selfUserName = iVar.f67668x5568d387;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
            y53.m mVar = iVar.F;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar);
            long j19 = mVar.f67426x9f600742;
            java.lang.String field_talker = iVar.f67670x114ef53e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
            dVar.e(i17 + 1, j17, x18, field_sessionId2, j18, field_selfUserName, j19, field_talker, iVar.t0(), e63.a.f331350a, str);
        }
    }
}
