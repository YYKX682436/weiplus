package gg1;

/* loaded from: classes7.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f353150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z17, gg1.c1 c1Var) {
        super(1);
        this.f353150d = z17;
        this.f353151e = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = this.f353150d ? 4 : 2;
        gg1.g gVar = this.f353151e.f353074g;
        if (gVar != null) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g1((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1) gVar, i17, intValue));
        }
        this.f353151e.f353072e.f353127g.d();
        return jz5.f0.f384359a;
    }
}
