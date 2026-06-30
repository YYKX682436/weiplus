package r45;

/* loaded from: classes11.dex */
public class ga extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456563d;

    /* renamed from: e, reason: collision with root package name */
    public int f456564e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456565f;

    /* renamed from: g, reason: collision with root package name */
    public r45.la f456566g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ha f456567h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ga)) {
            return false;
        }
        r45.ga gaVar = (r45.ga) fVar;
        return n51.f.a(this.f76492x92037252, gaVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456563d), java.lang.Integer.valueOf(gaVar.f456563d)) && n51.f.a(java.lang.Integer.valueOf(this.f456564e), java.lang.Integer.valueOf(gaVar.f456564e)) && n51.f.a(this.f456565f, gaVar.f456565f) && n51.f.a(this.f456566g, gaVar.f456566g) && n51.f.a(this.f456567h, gaVar.f456567h);
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
            fVar.e(2, this.f456563d);
            fVar.e(3, this.f456564e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456565f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            r45.la laVar = this.f456566g;
            if (laVar != null) {
                fVar.i(5, laVar.mo75928xcd1e8d8());
                this.f456566g.mo75956x3d5d1f78(fVar);
            }
            r45.ha haVar = this.f456567h;
            if (haVar != null) {
                fVar.i(6, haVar.mo75928xcd1e8d8());
                this.f456567h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456563d) + b36.f.e(3, this.f456564e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456565f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            r45.la laVar2 = this.f456566g;
            if (laVar2 != null) {
                i18 += b36.f.i(5, laVar2.mo75928xcd1e8d8());
            }
            r45.ha haVar2 = this.f456567h;
            return haVar2 != null ? i18 + b36.f.i(6, haVar2.mo75928xcd1e8d8()) : i18;
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
        r45.ga gaVar = (r45.ga) objArr[1];
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
                    gaVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                gaVar.f456563d = aVar2.g(intValue);
                return 0;
            case 3:
                gaVar.f456564e = aVar2.g(intValue);
                return 0;
            case 4:
                gaVar.f456565f = aVar2.d(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.la laVar3 = new r45.la();
                    if (bArr2 != null && bArr2.length > 0) {
                        laVar3.mo11468x92b714fd(bArr2);
                    }
                    gaVar.f456566g = laVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ha haVar3 = new r45.ha();
                    if (bArr3 != null && bArr3.length > 0) {
                        haVar3.mo11468x92b714fd(bArr3);
                    }
                    gaVar.f456567h = haVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
