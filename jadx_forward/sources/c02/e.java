package c02;

/* loaded from: classes2.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.k f119125d;

    /* renamed from: e, reason: collision with root package name */
    public c02.f f119126e;

    /* renamed from: f, reason: collision with root package name */
    public c02.d f119127f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.e)) {
            return false;
        }
        c02.e eVar = (c02.e) fVar;
        return n51.f.a(this.f119125d, eVar.f119125d) && n51.f.a(this.f119126e, eVar.f119126e) && n51.f.a(this.f119127f, eVar.f119127f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.k kVar = this.f119125d;
            if (kVar != null) {
                fVar.i(1, kVar.mo75928xcd1e8d8());
                this.f119125d.mo75956x3d5d1f78(fVar);
            }
            c02.f fVar2 = this.f119126e;
            if (fVar2 != null) {
                fVar.i(2, fVar2.mo75928xcd1e8d8());
                this.f119126e.mo75956x3d5d1f78(fVar);
            }
            c02.d dVar = this.f119127f;
            if (dVar != null) {
                fVar.i(3, dVar.mo75928xcd1e8d8());
                this.f119127f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            d02.k kVar2 = this.f119125d;
            int i18 = kVar2 != null ? 0 + b36.f.i(1, kVar2.mo75928xcd1e8d8()) : 0;
            c02.f fVar3 = this.f119126e;
            if (fVar3 != null) {
                i18 += b36.f.i(2, fVar3.mo75928xcd1e8d8());
            }
            c02.d dVar2 = this.f119127f;
            return dVar2 != null ? i18 + b36.f.i(3, dVar2.mo75928xcd1e8d8()) : i18;
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
        c02.e eVar = (c02.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.k kVar3 = new d02.k();
                if (bArr != null && bArr.length > 0) {
                    kVar3.mo11468x92b714fd(bArr);
                }
                eVar.f119125d = kVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                c02.f fVar4 = new c02.f();
                if (bArr2 != null && bArr2.length > 0) {
                    fVar4.mo11468x92b714fd(bArr2);
                }
                eVar.f119126e = fVar4;
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
            c02.d dVar3 = new c02.d();
            if (bArr3 != null && bArr3.length > 0) {
                dVar3.mo11468x92b714fd(bArr3);
            }
            eVar.f119127f = dVar3;
        }
        return 0;
    }
}
