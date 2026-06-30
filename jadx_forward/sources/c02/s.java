package c02;

/* loaded from: classes2.dex */
public class s extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public c02.t f119157d;

    /* renamed from: e, reason: collision with root package name */
    public c02.k f119158e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.s)) {
            return false;
        }
        c02.s sVar = (c02.s) fVar;
        return n51.f.a(this.f76492x92037252, sVar.f76492x92037252) && n51.f.a(this.f119157d, sVar.f119157d) && n51.f.a(this.f119158e, sVar.f119158e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            c02.t tVar = this.f119157d;
            if (tVar != null) {
                fVar.i(2, tVar.mo75928xcd1e8d8());
                this.f119157d.mo75956x3d5d1f78(fVar);
            }
            c02.k kVar = this.f119158e;
            if (kVar != null) {
                fVar.i(3, kVar.mo75928xcd1e8d8());
                this.f119158e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            c02.t tVar2 = this.f119157d;
            if (tVar2 != null) {
                i18 += b36.f.i(2, tVar2.mo75928xcd1e8d8());
            }
            c02.k kVar2 = this.f119158e;
            return kVar2 != null ? i18 + b36.f.i(3, kVar2.mo75928xcd1e8d8()) : i18;
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
        c02.s sVar = (c02.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                sVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                c02.t tVar3 = new c02.t();
                if (bArr2 != null && bArr2.length > 0) {
                    tVar3.mo11468x92b714fd(bArr2);
                }
                sVar.f119157d = tVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            c02.k kVar3 = new c02.k();
            if (bArr3 != null && bArr3.length > 0) {
                kVar3.mo11468x92b714fd(bArr3);
            }
            sVar.f119158e = kVar3;
        }
        return 0;
    }
}
