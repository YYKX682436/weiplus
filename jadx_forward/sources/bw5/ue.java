package bw5;

/* loaded from: classes2.dex */
public class ue extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f115389d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115390e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115391f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115392g;

    /* renamed from: h, reason: collision with root package name */
    public int f115393h;

    /* renamed from: i, reason: collision with root package name */
    public int f115394i;

    /* renamed from: m, reason: collision with root package name */
    public int f115395m;

    /* renamed from: n, reason: collision with root package name */
    public int f115396n;

    /* renamed from: o, reason: collision with root package name */
    public long f115397o;

    /* renamed from: p, reason: collision with root package name */
    public int f115398p;

    /* renamed from: q, reason: collision with root package name */
    public int f115399q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ae f115400r;

    /* renamed from: s, reason: collision with root package name */
    public int f115401s;

    /* renamed from: t, reason: collision with root package name */
    public int f115402t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f115403u = new boolean[15];

    static {
        new bw5.ue();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ue mo11468x92b714fd(byte[] bArr) {
        return (bw5.ue) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ue)) {
            return false;
        }
        bw5.ue ueVar = (bw5.ue) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f115389d), java.lang.Long.valueOf(ueVar.f115389d)) && n51.f.a(this.f115390e, ueVar.f115390e) && n51.f.a(this.f115391f, ueVar.f115391f) && n51.f.a(this.f115392g, ueVar.f115392g) && n51.f.a(java.lang.Integer.valueOf(this.f115393h), java.lang.Integer.valueOf(ueVar.f115393h)) && n51.f.a(java.lang.Integer.valueOf(this.f115394i), java.lang.Integer.valueOf(ueVar.f115394i)) && n51.f.a(java.lang.Integer.valueOf(this.f115395m), java.lang.Integer.valueOf(ueVar.f115395m)) && n51.f.a(java.lang.Integer.valueOf(this.f115396n), java.lang.Integer.valueOf(ueVar.f115396n)) && n51.f.a(java.lang.Long.valueOf(this.f115397o), java.lang.Long.valueOf(ueVar.f115397o)) && n51.f.a(java.lang.Integer.valueOf(this.f115398p), java.lang.Integer.valueOf(ueVar.f115398p)) && n51.f.a(java.lang.Integer.valueOf(this.f115399q), java.lang.Integer.valueOf(ueVar.f115399q)) && n51.f.a(this.f115400r, ueVar.f115400r) && n51.f.a(java.lang.Integer.valueOf(this.f115401s), java.lang.Integer.valueOf(ueVar.f115401s)) && n51.f.a(java.lang.Integer.valueOf(this.f115402t), java.lang.Integer.valueOf(ueVar.f115402t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ue();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115403u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f115389d);
            }
            java.lang.String str = this.f115390e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f115391f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f115392g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115393h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115394i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115395m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115396n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f115397o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f115398p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f115399q);
            }
            bw5.ae aeVar = this.f115400r;
            if (aeVar != null && zArr[12]) {
                fVar.i(12, aeVar.mo75928xcd1e8d8());
                this.f115400r.mo75956x3d5d1f78(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f115401s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f115402t);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f115389d) : 0;
            java.lang.String str4 = this.f115390e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f115391f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f115392g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f115393h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f115394i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f115395m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f115396n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f115397o);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f115398p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f115399q);
            }
            bw5.ae aeVar2 = this.f115400r;
            if (aeVar2 != null && zArr[12]) {
                h17 += b36.f.i(12, aeVar2.mo75928xcd1e8d8());
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f115401s);
            }
            return zArr[14] ? h17 + b36.f.e(14, this.f115402t) : h17;
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
                this.f115389d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115390e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115391f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115392g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115393h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115394i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115395m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115396n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115397o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115398p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115399q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f115400r = aeVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f115401s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f115402t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
