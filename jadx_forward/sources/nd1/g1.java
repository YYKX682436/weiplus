package nd1;

/* loaded from: classes7.dex */
public class g1 extends zl1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f417836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f417837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f417838c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd1.h1 f417839d;

    public g1(nd1.h1 h1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f417839d = h1Var;
        this.f417836a = v5Var;
        this.f417837b = d0Var;
        this.f417838c = i17;
    }

    @Override // zl1.z
    public void a(android.graphics.Bitmap bitmap, zl1.y yVar) {
        super.a(bitmap, yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f417836a;
        if (v5Var.mo50262x39e05d35()) {
            al1.b r17 = v5Var.r1();
            nd1.f1 f1Var = new nd1.f1(this);
            r17.getClass();
            r17.post(new al1.d(r17, bitmap, f1Var));
        }
        this.f417837b.a(this.f417838c, this.f417839d.o("ok"));
    }
}
