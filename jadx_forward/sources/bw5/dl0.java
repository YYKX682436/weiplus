package bw5;

/* loaded from: classes8.dex */
public class dl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108057d;

    /* renamed from: e, reason: collision with root package name */
    public int f108058e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108059f;

    /* renamed from: g, reason: collision with root package name */
    public long f108060g;

    /* renamed from: h, reason: collision with root package name */
    public int f108061h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108062i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108063m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.zk0 f108064n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.al0 f108065o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f108066p = new boolean[10];

    static {
        new bw5.dl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dl0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.dl0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dl0)) {
            return false;
        }
        bw5.dl0 dl0Var = (bw5.dl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108057d), java.lang.Integer.valueOf(dl0Var.f108057d)) && n51.f.a(java.lang.Integer.valueOf(this.f108058e), java.lang.Integer.valueOf(dl0Var.f108058e)) && n51.f.a(this.f108059f, dl0Var.f108059f) && n51.f.a(java.lang.Long.valueOf(this.f108060g), java.lang.Long.valueOf(dl0Var.f108060g)) && n51.f.a(java.lang.Integer.valueOf(this.f108061h), java.lang.Integer.valueOf(dl0Var.f108061h)) && n51.f.a(this.f108062i, dl0Var.f108062i) && n51.f.a(this.f108063m, dl0Var.f108063m) && n51.f.a(this.f108064n, dl0Var.f108064n) && n51.f.a(this.f108065o, dl0Var.f108065o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108066p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108057d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108058e);
            }
            java.lang.String str = this.f108059f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f108060g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108061h);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108062i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.f108063m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.zk0 zk0Var = this.f108064n;
            if (zk0Var != null && zArr[8]) {
                fVar.i(8, zk0Var.mo75928xcd1e8d8());
                this.f108064n.mo75956x3d5d1f78(fVar);
            }
            bw5.al0 al0Var = this.f108065o;
            if (al0Var != null && zArr[9]) {
                fVar.i(9, al0Var.mo75928xcd1e8d8());
                this.f108065o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108057d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f108058e);
            }
            java.lang.String str3 = this.f108059f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f108060g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f108061h);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108062i;
            if (gVar2 != null && zArr[6]) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str4 = this.f108063m;
            if (str4 != null && zArr[7]) {
                e17 += b36.f.j(7, str4);
            }
            bw5.zk0 zk0Var2 = this.f108064n;
            if (zk0Var2 != null && zArr[8]) {
                e17 += b36.f.i(8, zk0Var2.mo75928xcd1e8d8());
            }
            bw5.al0 al0Var2 = this.f108065o;
            return (al0Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, al0Var2.mo75928xcd1e8d8());
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
                this.f108057d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108058e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108059f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108060g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108061h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108062i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108063m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.zk0 zk0Var3 = new bw5.zk0();
                    if (bArr != null && bArr.length > 0) {
                        zk0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f108064n = zk0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.al0 al0Var3 = new bw5.al0();
                    if (bArr2 != null && bArr2.length > 0) {
                        al0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f108065o = al0Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
