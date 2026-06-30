package nd1;

/* loaded from: classes7.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.j1 f417851g;

    public i1(nd1.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, java.lang.String str) {
        this.f417851g = j1Var;
        this.f417848d = yVar;
        this.f417849e = i17;
        this.f417850f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417848d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        nd1.j1 j1Var = this.f417851g;
        int i17 = this.f417849e;
        if (a17 == null) {
            yVar.a(i17, j1Var.o("fail"));
        } else {
            a17.e3(this.f417850f);
            yVar.a(i17, j1Var.o("ok"));
        }
    }
}
