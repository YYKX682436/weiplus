package r45;

/* loaded from: classes2.dex */
public class ya6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f472461d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f472462e;

    /* renamed from: f, reason: collision with root package name */
    public long f472463f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ya6)) {
            return false;
        }
        r45.ya6 ya6Var = (r45.ya6) fVar;
        return n51.f.a(this.f76492x92037252, ya6Var.f76492x92037252) && n51.f.a(this.f472461d, ya6Var.f472461d) && n51.f.a(java.lang.Long.valueOf(this.f472462e), java.lang.Long.valueOf(ya6Var.f472462e)) && n51.f.a(java.lang.Long.valueOf(this.f472463f), java.lang.Long.valueOf(ya6Var.f472463f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472461d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.h(3, this.f472462e);
            fVar.h(4, this.f472463f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.h(3, this.f472462e) + b36.f.h(4, this.f472463f);
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
        r45.ya6 ya6Var = (r45.ya6) objArr[1];
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
                ya6Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ya6Var.f472462e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ya6Var.f472463f = aVar2.i(intValue);
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
            ya6Var.f472461d.add(c19806x4c372b7);
        }
        return 0;
    }
}
