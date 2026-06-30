package nd1;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.c2 f417805f;

    public b2(nd1.c2 c2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17) {
        this.f417805f = c2Var;
        this.f417803d = yVar;
        this.f417804e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417803d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        nd1.c2 c2Var = this.f417805f;
        int i17 = this.f417804e;
        if (a17 == null) {
            yVar.a(i17, c2Var.o("fail:page don't exist"));
        } else {
            a17.d3(true);
            yVar.a(i17, c2Var.o("ok"));
        }
    }
}
