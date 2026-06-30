package r45;

/* loaded from: classes7.dex */
public class pq3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kw6 f464838d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464839e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464840f;

    /* renamed from: g, reason: collision with root package name */
    public r45.i7 f464841g;

    /* renamed from: h, reason: collision with root package name */
    public r45.pw6 f464842h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq3)) {
            return false;
        }
        r45.pq3 pq3Var = (r45.pq3) fVar;
        return n51.f.a(this.f76492x92037252, pq3Var.f76492x92037252) && n51.f.a(this.f464838d, pq3Var.f464838d) && n51.f.a(this.f464839e, pq3Var.f464839e) && n51.f.a(this.f464840f, pq3Var.f464840f) && n51.f.a(this.f464841g, pq3Var.f464841g) && n51.f.a(this.f464842h, pq3Var.f464842h);
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
            r45.kw6 kw6Var = this.f464838d;
            if (kw6Var != null) {
                fVar.i(2, kw6Var.mo75928xcd1e8d8());
                this.f464838d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f464839e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f464840f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.i7 i7Var = this.f464841g;
            if (i7Var != null) {
                fVar.i(5, i7Var.mo75928xcd1e8d8());
                this.f464841g.mo75956x3d5d1f78(fVar);
            }
            r45.pw6 pw6Var = this.f464842h;
            if (pw6Var != null) {
                fVar.i(6, pw6Var.mo75928xcd1e8d8());
                this.f464842h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.kw6 kw6Var2 = this.f464838d;
            if (kw6Var2 != null) {
                i18 += b36.f.i(2, kw6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f464839e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f464840f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.i7 i7Var2 = this.f464841g;
            if (i7Var2 != null) {
                i18 += b36.f.i(5, i7Var2.mo75928xcd1e8d8());
            }
            r45.pw6 pw6Var2 = this.f464842h;
            return pw6Var2 != null ? i18 + b36.f.i(6, pw6Var2.mo75928xcd1e8d8()) : i18;
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
        r45.pq3 pq3Var = (r45.pq3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    pq3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kw6 kw6Var3 = new r45.kw6();
                    if (bArr2 != null && bArr2.length > 0) {
                        kw6Var3.mo11468x92b714fd(bArr2);
                    }
                    pq3Var.f464838d = kw6Var3;
                }
                return 0;
            case 3:
                pq3Var.f464839e = aVar2.k(intValue);
                return 0;
            case 4:
                pq3Var.f464840f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.i7 i7Var3 = new r45.i7();
                    if (bArr3 != null && bArr3.length > 0) {
                        i7Var3.mo11468x92b714fd(bArr3);
                    }
                    pq3Var.f464841g = i7Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.pw6 pw6Var3 = new r45.pw6();
                    if (bArr4 != null && bArr4.length > 0) {
                        pw6Var3.mo11468x92b714fd(bArr4);
                    }
                    pq3Var.f464842h = pw6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
