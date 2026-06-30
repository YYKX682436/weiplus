package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes11.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a f159623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f159624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a c11872xdea30f5a, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(0);
        this.f159623d = c11872xdea30f5a;
        this.f159624e = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
        bw5.eq0 eq0Var = bw5.eq0.TingMusic;
        sl4.a a17 = jm4.t2.a(eq0Var);
        bw5.lp0 B0 = a17 instanceof cm4.a ? ((cm4.a) a17).B0() : null;
        boolean z17 = B0 != null && rk4.j5.h(B0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a c11872xdea30f5a = this.f159623d;
        boolean b17 = z17 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(B0.d().l().m12571x74292566(), c11872xdea30f5a.f159595e) : false;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f159624e;
        if (b17) {
            b66.g a18 = b66.i.f99700d.a(eq0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallTingController", "operate: " + c11872xdea30f5a.f159594d);
            java.lang.String str = c11872xdea30f5a.f159594d;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onEnterPage", str)) {
                if (a18 != null) {
                    ((b66.i) a18).e();
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onExitPage", str) && a18 != null) {
                ((b66.i) a18).d();
            }
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
            }
        } else if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
        }
        return jz5.f0.f384359a;
    }
}
