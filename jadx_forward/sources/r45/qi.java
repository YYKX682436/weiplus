package r45;

/* loaded from: classes4.dex */
public class qi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465539d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 f465540e;

    /* renamed from: f, reason: collision with root package name */
    public float f465541f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465542g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465543h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi)) {
            return false;
        }
        r45.qi qiVar = (r45.qi) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465539d), java.lang.Integer.valueOf(qiVar.f465539d)) && n51.f.a(this.f465540e, qiVar.f465540e) && n51.f.a(java.lang.Float.valueOf(this.f465541f), java.lang.Float.valueOf(qiVar.f465541f)) && n51.f.a(this.f465542g, qiVar.f465542g) && n51.f.a(this.f465543h, qiVar.f465543h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465539d);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b97615 = this.f465540e;
            if (c19798x64b97615 != null) {
                fVar.i(2, c19798x64b97615.mo75928xcd1e8d8());
                this.f465540e.mo75956x3d5d1f78(fVar);
            }
            fVar.d(3, this.f465541f);
            java.lang.String str = this.f465542g;
            if (str != null) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465543h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465539d) + 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b976152 = this.f465540e;
            if (c19798x64b976152 != null) {
                e17 += b36.f.i(2, c19798x64b976152.mo75928xcd1e8d8());
            }
            int d17 = e17 + b36.f.d(3, this.f465541f);
            java.lang.String str2 = this.f465542g;
            if (str2 != null) {
                d17 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465543h;
            return gVar2 != null ? d17 + b36.f.b(5, gVar2) : d17;
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
        r45.qi qiVar = (r45.qi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qiVar.f465539d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                qiVar.f465541f = aVar2.f(intValue);
                return 0;
            }
            if (intValue == 4) {
                qiVar.f465542g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            qiVar.f465543h = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b976153 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615();
            if (bArr != null && bArr.length > 0) {
                c19798x64b976153.mo11468x92b714fd(bArr);
            }
            qiVar.f465540e = c19798x64b976153;
        }
        return 0;
    }
}
