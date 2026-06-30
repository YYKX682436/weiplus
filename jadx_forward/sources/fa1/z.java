package fa1;

/* loaded from: classes7.dex */
public class z implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 f342236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f342237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f342238c;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 c11874x3ec834d0, long j17, int i17) {
        this.f342236a = c11874x3ec834d0;
        this.f342237b = j17;
        this.f342238c = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        boolean z17;
        r45.eq5 eq5Var = (r45.eq5) oVar.f152244b.f152233a;
        if (eq5Var != null && eq5Var.f455210d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 c11874x3ec834d0 = this.f342236a;
            synchronized (c11874x3ec834d0) {
                z17 = c11874x3ec834d0.f159730b == 0;
            }
            if (z17) {
                return;
            } else {
                this.f342236a.m50346x26609261(this.f342237b, eq5Var.f455210d.g(), this.f342238c);
            }
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WAGameMISSignatureManager", "hy: upload failed: %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
    }
}
