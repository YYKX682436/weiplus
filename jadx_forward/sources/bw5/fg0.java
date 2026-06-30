package bw5;

/* loaded from: classes2.dex */
public class fg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f108793d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108794e;

    /* renamed from: f, reason: collision with root package name */
    public long f108795f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108796g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108798i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108799m;

    /* renamed from: n, reason: collision with root package name */
    public int f108800n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108801o;

    /* renamed from: p, reason: collision with root package name */
    public int f108802p;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f108797h = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f108803q = new boolean[12];

    static {
        new bw5.fg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fg0)) {
            return false;
        }
        bw5.fg0 fg0Var = (bw5.fg0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108793d), java.lang.Long.valueOf(fg0Var.f108793d)) && n51.f.a(this.f108794e, fg0Var.f108794e) && n51.f.a(java.lang.Long.valueOf(this.f108795f), java.lang.Long.valueOf(fg0Var.f108795f)) && n51.f.a(this.f108796g, fg0Var.f108796g) && n51.f.a(this.f108797h, fg0Var.f108797h) && n51.f.a(this.f108798i, fg0Var.f108798i) && n51.f.a(this.f108799m, fg0Var.f108799m) && n51.f.a(java.lang.Integer.valueOf(this.f108800n), java.lang.Integer.valueOf(fg0Var.f108800n)) && n51.f.a(this.f108801o, fg0Var.f108801o) && n51.f.a(java.lang.Integer.valueOf(this.f108802p), java.lang.Integer.valueOf(fg0Var.f108802p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108797h;
        boolean[] zArr = this.f108803q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f108793d);
            }
            java.lang.String str = this.f108794e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f108795f);
            }
            java.lang.String str2 = this.f108796g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, linkedList);
            java.lang.String str3 = this.f108798i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f108799m;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f108800n);
            }
            java.lang.String str5 = this.f108801o;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f108802p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f108793d) : 0;
            java.lang.String str6 = this.f108794e;
            if (str6 != null && zArr[2]) {
                h17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f108795f);
            }
            java.lang.String str7 = this.f108796g;
            if (str7 != null && zArr[5]) {
                h17 += b36.f.j(5, str7);
            }
            int g17 = h17 + b36.f.g(6, 1, linkedList);
            java.lang.String str8 = this.f108798i;
            if (str8 != null && zArr[7]) {
                g17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f108799m;
            if (str9 != null && zArr[8]) {
                g17 += b36.f.j(8, str9);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f108800n);
            }
            java.lang.String str10 = this.f108801o;
            if (str10 != null && zArr[10]) {
                g17 += b36.f.j(10, str10);
            }
            return zArr[11] ? g17 + b36.f.e(11, this.f108802p) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f108793d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108794e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108795f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f108796g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                this.f108798i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108799m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108800n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108801o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108802p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
