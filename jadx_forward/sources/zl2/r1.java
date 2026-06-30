package zl2;

/* loaded from: classes3.dex */
public final class r1 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555477b;

    public r1(yz5.l lVar, java.lang.String str) {
        this.f555476a = lVar;
        this.f555477b = str;
    }

    @Override // r35.n3
    public final void a(int i17) {
        yz5.l lVar = this.f555476a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(i17 == 1));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
        am.zd zdVar = c5560x6f070be.f135879g;
        zdVar.f90084a = this.f555477b;
        zdVar.f90085b = 4;
        zdVar.f90086c = true;
        c5560x6f070be.e();
    }
}
