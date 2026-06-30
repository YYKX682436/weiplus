package d02;

/* loaded from: classes2.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306805d;

    /* renamed from: e, reason: collision with root package name */
    public d02.r f306806e;

    /* renamed from: f, reason: collision with root package name */
    public d02.r f306807f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306808g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.b)) {
            return false;
        }
        d02.b bVar = (d02.b) fVar;
        return n51.f.a(this.f306805d, bVar.f306805d) && n51.f.a(this.f306806e, bVar.f306806e) && n51.f.a(this.f306807f, bVar.f306807f) && n51.f.a(this.f306808g, bVar.f306808g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f306805d;
            if (str != null) {
                fVar.j(1, str);
            }
            d02.r rVar = this.f306806e;
            if (rVar != null) {
                fVar.i(2, rVar.mo75928xcd1e8d8());
                this.f306806e.mo75956x3d5d1f78(fVar);
            }
            d02.r rVar2 = this.f306807f;
            if (rVar2 != null) {
                fVar.i(3, rVar2.mo75928xcd1e8d8());
                this.f306807f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f306808g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f306805d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            d02.r rVar3 = this.f306806e;
            if (rVar3 != null) {
                j17 += b36.f.i(2, rVar3.mo75928xcd1e8d8());
            }
            d02.r rVar4 = this.f306807f;
            if (rVar4 != null) {
                j17 += b36.f.i(3, rVar4.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f306808g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        d02.b bVar = (d02.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f306805d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                d02.r rVar5 = new d02.r();
                if (bArr != null && bArr.length > 0) {
                    rVar5.mo11468x92b714fd(bArr);
                }
                bVar.f306806e = rVar5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            bVar.f306808g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            d02.r rVar6 = new d02.r();
            if (bArr2 != null && bArr2.length > 0) {
                rVar6.mo11468x92b714fd(bArr2);
            }
            bVar.f306807f = rVar6;
        }
        return 0;
    }
}
