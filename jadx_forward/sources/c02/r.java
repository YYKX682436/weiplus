package c02;

/* loaded from: classes4.dex */
public class r extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f119155d;

    /* renamed from: e, reason: collision with root package name */
    public c02.v f119156e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.r)) {
            return false;
        }
        c02.r rVar = (c02.r) fVar;
        return n51.f.a(this.f76494x2de60e5e, rVar.f76494x2de60e5e) && n51.f.a(this.f119155d, rVar.f119155d) && n51.f.a(this.f119156e, rVar.f119156e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f119155d;
            if (str != null) {
                fVar.j(2, str);
            }
            c02.v vVar = this.f119156e;
            if (vVar != null) {
                fVar.i(3, vVar.mo75928xcd1e8d8());
                this.f119156e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f119155d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            c02.v vVar2 = this.f119156e;
            return vVar2 != null ? i18 + b36.f.i(3, vVar2.mo75928xcd1e8d8()) : i18;
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
        c02.r rVar = (c02.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                rVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rVar.f119155d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            c02.v vVar3 = new c02.v();
            if (bArr2 != null && bArr2.length > 0) {
                vVar3.mo11468x92b714fd(bArr2);
            }
            rVar.f119156e = vVar3;
        }
        return 0;
    }
}
