package c02;

/* loaded from: classes2.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public c02.e f119135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f119136e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.j)) {
            return false;
        }
        c02.j jVar = (c02.j) fVar;
        return n51.f.a(this.f119135d, jVar.f119135d) && n51.f.a(this.f119136e, jVar.f119136e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            c02.e eVar = this.f119135d;
            if (eVar != null) {
                fVar.i(1, eVar.mo75928xcd1e8d8());
                this.f119135d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f119136e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            c02.e eVar2 = this.f119135d;
            int i18 = eVar2 != null ? 0 + b36.f.i(1, eVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f119136e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        c02.j jVar = (c02.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            jVar.f119136e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            c02.e eVar3 = new c02.e();
            if (bArr != null && bArr.length > 0) {
                eVar3.mo11468x92b714fd(bArr);
            }
            jVar.f119135d = eVar3;
        }
        return 0;
    }
}
