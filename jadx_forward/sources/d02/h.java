package d02;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.i f306851d;

    /* renamed from: e, reason: collision with root package name */
    public d02.i f306852e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.h)) {
            return false;
        }
        d02.h hVar = (d02.h) fVar;
        return n51.f.a(this.f306851d, hVar.f306851d) && n51.f.a(this.f306852e, hVar.f306852e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.i iVar = this.f306851d;
            if (iVar != null) {
                fVar.i(1, iVar.mo75928xcd1e8d8());
                this.f306851d.mo75956x3d5d1f78(fVar);
            }
            d02.i iVar2 = this.f306852e;
            if (iVar2 != null) {
                fVar.i(2, iVar2.mo75928xcd1e8d8());
                this.f306852e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            d02.i iVar3 = this.f306851d;
            int i18 = iVar3 != null ? 0 + b36.f.i(1, iVar3.mo75928xcd1e8d8()) : 0;
            d02.i iVar4 = this.f306852e;
            return iVar4 != null ? i18 + b36.f.i(2, iVar4.mo75928xcd1e8d8()) : i18;
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
        d02.h hVar = (d02.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.i iVar5 = new d02.i();
                if (bArr != null && bArr.length > 0) {
                    iVar5.mo11468x92b714fd(bArr);
                }
                hVar.f306851d = iVar5;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            d02.i iVar6 = new d02.i();
            if (bArr2 != null && bArr2.length > 0) {
                iVar6.mo11468x92b714fd(bArr2);
            }
            hVar.f306852e = iVar6;
        }
        return 0;
    }
}
