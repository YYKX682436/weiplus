package r45;

/* loaded from: classes4.dex */
public class nb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f462765d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f462766e;

    /* renamed from: f, reason: collision with root package name */
    public long f462767f;

    /* renamed from: g, reason: collision with root package name */
    public int f462768g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nb6)) {
            return false;
        }
        r45.nb6 nb6Var = (r45.nb6) fVar;
        return n51.f.a(this.f76492x92037252, nb6Var.f76492x92037252) && n51.f.a(this.f462765d, nb6Var.f462765d) && n51.f.a(java.lang.Long.valueOf(this.f462766e), java.lang.Long.valueOf(nb6Var.f462766e)) && n51.f.a(java.lang.Long.valueOf(this.f462767f), java.lang.Long.valueOf(nb6Var.f462767f)) && n51.f.a(java.lang.Integer.valueOf(this.f462768g), java.lang.Integer.valueOf(nb6Var.f462768g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462765d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.h(3, this.f462766e);
            fVar.h(4, this.f462767f);
            fVar.e(5, this.f462768g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.h(3, this.f462766e) + b36.f.h(4, this.f462767f) + b36.f.e(5, this.f462768g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.nb6 nb6Var = (r45.nb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                nb6Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                nb6Var.f462766e = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 4) {
                nb6Var.f462767f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            nb6Var.f462768g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
            if (bArr3 != null && bArr3.length > 0) {
                c19806x4c372b7.mo11468x92b714fd(bArr3);
            }
            nb6Var.f462765d.add(c19806x4c372b7);
        }
        return 0;
    }
}
