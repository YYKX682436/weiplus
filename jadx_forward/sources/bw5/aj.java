package bw5;

/* loaded from: classes2.dex */
public class aj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106748d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f106749e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f106750f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.bj f106751g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f106752h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106753i = new boolean[6];

    static {
        new bw5.aj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.aj mo11468x92b714fd(byte[] bArr) {
        return (bw5.aj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.aj)) {
            return false;
        }
        bw5.aj ajVar = (bw5.aj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106748d), java.lang.Integer.valueOf(ajVar.f106748d)) && n51.f.a(this.f106749e, ajVar.f106749e) && n51.f.a(this.f106750f, ajVar.f106750f) && n51.f.a(this.f106751g, ajVar.f106751g) && n51.f.a(this.f106752h, ajVar.f106752h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.aj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106753i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106748d);
            }
            java.lang.String str = this.f106749e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f106750f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.bj bjVar = this.f106751g;
            if (bjVar != null && zArr[4]) {
                fVar.i(4, bjVar.mo75928xcd1e8d8());
                this.f106751g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f106752h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f106748d) : 0;
            java.lang.String str3 = this.f106749e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f106750f;
            if (gVar2 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            bw5.bj bjVar2 = this.f106751g;
            if (bjVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, bjVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f106752h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f106748d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f106749e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f106750f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f106752h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.bj bjVar3 = new bw5.bj();
            if (bArr != null && bArr.length > 0) {
                bjVar3.mo11468x92b714fd(bArr);
            }
            this.f106751g = bjVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
