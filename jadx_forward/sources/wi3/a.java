package wi3;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f527698d;

    /* renamed from: e, reason: collision with root package name */
    public wi3.b f527699e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.a)) {
            return false;
        }
        wi3.a aVar = (wi3.a) fVar;
        return n51.f.a(this.f527698d, aVar.f527698d) && n51.f.a(this.f527699e, aVar.f527699e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f527698d;
            if (str != null) {
                fVar.j(1, str);
            }
            wi3.b bVar = this.f527699e;
            if (bVar != null) {
                fVar.i(2, bVar.mo75928xcd1e8d8());
                this.f527699e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f527698d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            wi3.b bVar2 = this.f527699e;
            return bVar2 != null ? j17 + b36.f.i(2, bVar2.mo75928xcd1e8d8()) : j17;
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
        wi3.a aVar3 = (wi3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f527698d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            wi3.b bVar3 = new wi3.b();
            if (bArr != null && bArr.length > 0) {
                bVar3.mo11468x92b714fd(bArr);
            }
            aVar3.f527699e = bVar3;
        }
        return 0;
    }
}
