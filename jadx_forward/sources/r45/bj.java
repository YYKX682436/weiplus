package r45;

/* loaded from: classes4.dex */
public class bj extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452323e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452324f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 f452325g;

    /* renamed from: h, reason: collision with root package name */
    public long f452326h;

    /* renamed from: i, reason: collision with root package name */
    public int f452327i;

    /* renamed from: m, reason: collision with root package name */
    public int f452328m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452329n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj)) {
            return false;
        }
        r45.bj bjVar = (r45.bj) fVar;
        return n51.f.a(this.f76492x92037252, bjVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f452322d), java.lang.Integer.valueOf(bjVar.f452322d)) && n51.f.a(this.f452323e, bjVar.f452323e) && n51.f.a(this.f452324f, bjVar.f452324f) && n51.f.a(this.f452325g, bjVar.f452325g) && n51.f.a(java.lang.Long.valueOf(this.f452326h), java.lang.Long.valueOf(bjVar.f452326h)) && n51.f.a(java.lang.Integer.valueOf(this.f452327i), java.lang.Integer.valueOf(bjVar.f452327i)) && n51.f.a(java.lang.Integer.valueOf(this.f452328m), java.lang.Integer.valueOf(bjVar.f452328m)) && n51.f.a(this.f452329n, bjVar.f452329n);
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
            fVar.e(2, this.f452322d);
            java.lang.String str = this.f452323e;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f452324f;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b97615 = this.f452325g;
            if (c19798x64b97615 != null) {
                fVar.i(9, c19798x64b97615.mo75928xcd1e8d8());
                this.f452325g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(11, this.f452326h);
            fVar.e(14, this.f452327i);
            fVar.e(15, this.f452328m);
            java.lang.String str3 = this.f452329n;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452322d);
            java.lang.String str4 = this.f452323e;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            java.lang.String str5 = this.f452324f;
            if (str5 != null) {
                i18 += b36.f.j(8, str5);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b976152 = this.f452325g;
            if (c19798x64b976152 != null) {
                i18 += b36.f.i(9, c19798x64b976152.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(11, this.f452326h) + b36.f.e(14, this.f452327i) + b36.f.e(15, this.f452328m);
            java.lang.String str6 = this.f452329n;
            return str6 != null ? h17 + b36.f.j(21, str6) : h17;
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
        r45.bj bjVar = (r45.bj) objArr[1];
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
                bjVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bjVar.f452322d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 7) {
            bjVar.f452323e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 8) {
            bjVar.f452324f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 9) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b976153 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615();
                if (bArr2 != null && bArr2.length > 0) {
                    c19798x64b976153.mo11468x92b714fd(bArr2);
                }
                bjVar.f452325g = c19798x64b976153;
            }
            return 0;
        }
        if (intValue == 11) {
            bjVar.f452326h = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 21) {
            bjVar.f452329n = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 14) {
            bjVar.f452327i = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 15) {
            return -1;
        }
        bjVar.f452328m = aVar2.g(intValue);
        return 0;
    }
}
