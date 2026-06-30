package r45;

/* loaded from: classes2.dex */
public class ag2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f451522d;

    /* renamed from: e, reason: collision with root package name */
    public int f451523e;

    /* renamed from: f, reason: collision with root package name */
    public long f451524f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ag2)) {
            return false;
        }
        r45.ag2 ag2Var = (r45.ag2) fVar;
        return n51.f.a(this.f451522d, ag2Var.f451522d) && n51.f.a(java.lang.Integer.valueOf(this.f451523e), java.lang.Integer.valueOf(ag2Var.f451523e)) && n51.f.a(java.lang.Long.valueOf(this.f451524f), java.lang.Long.valueOf(ag2Var.f451524f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f451522d;
            if (c19782x23db1cfa != null) {
                fVar.i(1, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f451522d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451523e);
            fVar.h(3, this.f451524f);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f451522d;
            return (c19782x23db1cfa2 != null ? 0 + b36.f.i(1, c19782x23db1cfa2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451523e) + b36.f.h(3, this.f451524f);
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
        r45.ag2 ag2Var = (r45.ag2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ag2Var.f451523e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            ag2Var.f451524f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            if (bArr != null && bArr.length > 0) {
                c19782x23db1cfa3.mo11468x92b714fd(bArr);
            }
            ag2Var.f451522d = c19782x23db1cfa3;
        }
        return 0;
    }
}
