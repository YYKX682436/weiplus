package bw5;

/* loaded from: classes2.dex */
public class oc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112582d;

    /* renamed from: e, reason: collision with root package name */
    public int f112583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112584f;

    /* renamed from: g, reason: collision with root package name */
    public int f112585g;

    /* renamed from: h, reason: collision with root package name */
    public int f112586h;

    /* renamed from: i, reason: collision with root package name */
    public int f112587i;

    /* renamed from: m, reason: collision with root package name */
    public int f112588m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112589n;

    /* renamed from: o, reason: collision with root package name */
    public int f112590o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f112591p;

    /* renamed from: q, reason: collision with root package name */
    public int f112592q;

    /* renamed from: r, reason: collision with root package name */
    public int f112593r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f112594s = new boolean[13];

    static {
        new bw5.oc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.oc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oc0)) {
            return false;
        }
        bw5.oc0 oc0Var = (bw5.oc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112582d), java.lang.Integer.valueOf(oc0Var.f112582d)) && n51.f.a(java.lang.Integer.valueOf(this.f112583e), java.lang.Integer.valueOf(oc0Var.f112583e)) && n51.f.a(this.f112584f, oc0Var.f112584f) && n51.f.a(java.lang.Integer.valueOf(this.f112585g), java.lang.Integer.valueOf(oc0Var.f112585g)) && n51.f.a(java.lang.Integer.valueOf(this.f112586h), java.lang.Integer.valueOf(oc0Var.f112586h)) && n51.f.a(java.lang.Integer.valueOf(this.f112587i), java.lang.Integer.valueOf(oc0Var.f112587i)) && n51.f.a(java.lang.Integer.valueOf(this.f112588m), java.lang.Integer.valueOf(oc0Var.f112588m)) && n51.f.a(this.f112589n, oc0Var.f112589n) && n51.f.a(java.lang.Integer.valueOf(this.f112590o), java.lang.Integer.valueOf(oc0Var.f112590o)) && n51.f.a(this.f112591p, oc0Var.f112591p) && n51.f.a(java.lang.Integer.valueOf(this.f112592q), java.lang.Integer.valueOf(oc0Var.f112592q)) && n51.f.a(java.lang.Integer.valueOf(this.f112593r), java.lang.Integer.valueOf(oc0Var.f112593r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112594s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112582d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112583e);
            }
            java.lang.String str = this.f112584f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112585g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f112586h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f112587i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f112588m);
            }
            java.lang.String str2 = this.f112589n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112590o);
            }
            java.lang.String str3 = this.f112591p;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            if (zArr[11]) {
                fVar.e(11, this.f112592q);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.e(12, this.f112593r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112582d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f112583e);
            }
            java.lang.String str4 = this.f112584f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f112585g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f112586h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f112587i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f112588m);
            }
            java.lang.String str5 = this.f112589n;
            if (str5 != null && zArr[8]) {
                e17 += b36.f.j(8, str5);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f112590o);
            }
            java.lang.String str6 = this.f112591p;
            if (str6 != null && zArr[10]) {
                e17 += b36.f.j(10, str6);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f112592q);
            }
            return zArr[12] ? e17 + b36.f.e(12, this.f112593r) : e17;
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
                this.f112582d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112583e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112584f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112585g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112586h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112587i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112588m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112589n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112590o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112591p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f112592q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f112593r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
