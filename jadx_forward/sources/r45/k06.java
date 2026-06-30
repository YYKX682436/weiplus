package r45;

/* loaded from: classes4.dex */
public class k06 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459806d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459808f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k06)) {
            return false;
        }
        r45.k06 k06Var = (r45.k06) fVar;
        return n51.f.a(this.f459806d, k06Var.f459806d) && n51.f.a(this.f459807e, k06Var.f459807e) && n51.f.a(this.f459808f, k06Var.f459808f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f459806d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f459807e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            java.lang.String str = this.f459808f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f459806d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f459807e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            java.lang.String str2 = this.f459808f;
            return str2 != null ? b17 + b36.f.j(3, str2) : b17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.k06 k06Var = (r45.k06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k06Var.f459806d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            k06Var.f459807e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k06Var.f459808f = aVar2.k(intValue);
        return 0;
    }
}
