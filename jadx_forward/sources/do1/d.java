package do1;

/* loaded from: classes12.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f323605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f323606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t05.a f323607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17, t05.a aVar) {
        super(1);
        this.f323605d = f9Var;
        this.f323606e = j17;
        this.f323607f = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s15.h item = (s15.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.gp0 gp0Var = new r45.gp0();
        int i17 = item.f384955d;
        gp0Var.e0(item.m75945x2fec8307(i17 + 3));
        gp0Var.h0(item.m75939xb282bd08(i17 + 2));
        gp0Var.O0(item.m75945x2fec8307(i17 + 0));
        gp0Var.i0(item.n());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f323605d;
        java.lang.String H = bt3.g2.H(gp0Var, f9Var.Q0(), f9Var.m124847x74d37ac6(), 1);
        long l17 = com.p314xaae8f345.mm.vfs.w6.l(H);
        long j17 = this.f323606e;
        t05.a aVar = this.f323607f;
        if (l17 >= j17) {
            co1.i.b("MicroMsg.RoamBackupItemAppMsg", f9Var, java.lang.Integer.valueOf(aVar.m75939xb282bd08(aVar.f449898d + 6)), H);
            return java.lang.Boolean.TRUE;
        }
        java.lang.String t17 = bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.m124847x74d37ac6(), 1);
        if (com.p314xaae8f345.mm.vfs.w6.l(t17) < j17) {
            return java.lang.Boolean.FALSE;
        }
        co1.i.b("MicroMsg.RoamBackupItemAppMsg", f9Var, java.lang.Integer.valueOf(aVar.m75939xb282bd08(aVar.f449898d + 6)), t17);
        return java.lang.Boolean.TRUE;
    }
}
