package bw5;

/* loaded from: classes2.dex */
public class ds extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f108135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108136e;

    /* renamed from: f, reason: collision with root package name */
    public long f108137f;

    /* renamed from: g, reason: collision with root package name */
    public long f108138g;

    /* renamed from: h, reason: collision with root package name */
    public int f108139h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108140i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108141m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108142n;

    /* renamed from: o, reason: collision with root package name */
    public int f108143o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108144p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f108145q = new boolean[12];

    static {
        new bw5.ds();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ds mo11468x92b714fd(byte[] bArr) {
        return (bw5.ds) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ds)) {
            return false;
        }
        bw5.ds dsVar = (bw5.ds) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108135d), java.lang.Long.valueOf(dsVar.f108135d)) && n51.f.a(this.f108136e, dsVar.f108136e) && n51.f.a(java.lang.Long.valueOf(this.f108137f), java.lang.Long.valueOf(dsVar.f108137f)) && n51.f.a(java.lang.Long.valueOf(this.f108138g), java.lang.Long.valueOf(dsVar.f108138g)) && n51.f.a(java.lang.Integer.valueOf(this.f108139h), java.lang.Integer.valueOf(dsVar.f108139h)) && n51.f.a(this.f108140i, dsVar.f108140i) && n51.f.a(this.f108141m, dsVar.f108141m) && n51.f.a(this.f108142n, dsVar.f108142n) && n51.f.a(java.lang.Integer.valueOf(this.f108143o), java.lang.Integer.valueOf(dsVar.f108143o)) && n51.f.a(this.f108144p, dsVar.f108144p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ds();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108145q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f108135d);
            }
            java.lang.String str = this.f108136e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f108137f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f108138g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108139h);
            }
            java.lang.String str2 = this.f108140i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f108141m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108142n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108143o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108144p;
            if (gVar2 != null && zArr[11]) {
                fVar.b(11, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f108135d) : 0;
            java.lang.String str4 = this.f108136e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f108137f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f108138g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f108139h);
            }
            java.lang.String str5 = this.f108140i;
            if (str5 != null && zArr[6]) {
                h17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f108141m;
            if (str6 != null && zArr[7]) {
                h17 += b36.f.j(7, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f108142n;
            if (gVar3 != null && zArr[8]) {
                h17 += b36.f.b(8, gVar3);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f108143o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f108144p;
            return (gVar4 == null || !zArr[11]) ? h17 : h17 + b36.f.b(11, gVar4);
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
        switch (intValue) {
            case 1:
                this.f108135d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108136e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108137f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108138g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108139h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108140i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108141m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108142n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f108143o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108144p = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
