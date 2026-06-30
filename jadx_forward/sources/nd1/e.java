package nd1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f417823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.f f417826g;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, nd1.f fVar) {
        this.f417823d = v5Var;
        this.f417824e = yVar;
        this.f417825f = i17;
        this.f417826g = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f417823d;
        if (v5Var.r1() == null) {
            v5Var.P2();
        } else {
            v5Var.d2();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417824e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        yVar.a(this.f417825f, this.f417826g.o("ok"));
    }
}
