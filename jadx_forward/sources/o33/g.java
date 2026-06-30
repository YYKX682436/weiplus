package o33;

/* loaded from: classes2.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f424274d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f424275e;

    /* renamed from: f, reason: collision with root package name */
    public o33.e f424276f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o33.g)) {
            return false;
        }
        o33.g gVar = (o33.g) fVar;
        return n51.f.a(this.f424274d, gVar.f424274d) && n51.f.a(java.lang.Boolean.valueOf(this.f424275e), java.lang.Boolean.valueOf(gVar.f424275e)) && n51.f.a(this.f424276f, gVar.f424276f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f424274d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f424275e);
            o33.e eVar = this.f424276f;
            if (eVar != null) {
                fVar.i(3, eVar.mo75928xcd1e8d8());
                this.f424276f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f424274d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f424275e);
            o33.e eVar2 = this.f424276f;
            return eVar2 != null ? j17 + b36.f.i(3, eVar2.mo75928xcd1e8d8()) : j17;
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
        o33.g gVar = (o33.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gVar.f424274d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gVar.f424275e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            o33.e eVar3 = new o33.e();
            if (bArr != null && bArr.length > 0) {
                eVar3.mo11468x92b714fd(bArr);
            }
            gVar.f424276f = eVar3;
        }
        return 0;
    }
}
