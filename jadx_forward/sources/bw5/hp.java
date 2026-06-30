package bw5;

/* loaded from: classes2.dex */
public class hp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109834e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f109835f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109836g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109837h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f109838i;

    /* renamed from: n, reason: collision with root package name */
    public int f109840n;

    /* renamed from: o, reason: collision with root package name */
    public long f109841o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f109842p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109843q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109844r;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f109839m = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f109845s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f109846t = new boolean[14];

    static {
        new bw5.hp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hp mo11468x92b714fd(byte[] bArr) {
        return (bw5.hp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hp)) {
            return false;
        }
        bw5.hp hpVar = (bw5.hp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109833d), java.lang.Integer.valueOf(hpVar.f109833d)) && n51.f.a(this.f109834e, hpVar.f109834e) && n51.f.a(java.lang.Boolean.valueOf(this.f109835f), java.lang.Boolean.valueOf(hpVar.f109835f)) && n51.f.a(java.lang.Boolean.valueOf(this.f109836g), java.lang.Boolean.valueOf(hpVar.f109836g)) && n51.f.a(java.lang.Boolean.valueOf(this.f109837h), java.lang.Boolean.valueOf(hpVar.f109837h)) && n51.f.a(java.lang.Boolean.valueOf(this.f109838i), java.lang.Boolean.valueOf(hpVar.f109838i)) && n51.f.a(this.f109839m, hpVar.f109839m) && n51.f.a(java.lang.Integer.valueOf(this.f109840n), java.lang.Integer.valueOf(hpVar.f109840n)) && n51.f.a(java.lang.Long.valueOf(this.f109841o), java.lang.Long.valueOf(hpVar.f109841o)) && n51.f.a(this.f109842p, hpVar.f109842p) && n51.f.a(this.f109843q, hpVar.f109843q) && n51.f.a(this.f109844r, hpVar.f109844r) && n51.f.a(this.f109845s, hpVar.f109845s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109845s;
        java.util.LinkedList linkedList2 = this.f109839m;
        boolean[] zArr = this.f109846t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109833d);
            }
            java.lang.String str = this.f109834e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f109835f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f109836g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f109837h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f109838i);
            }
            fVar.g(7, 8, linkedList2);
            if (zArr[8]) {
                fVar.e(8, this.f109840n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f109841o);
            }
            java.lang.String str2 = this.f109842p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f109843q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f109844r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            fVar.g(13, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f109833d) + 0 : 0;
            java.lang.String str5 = this.f109834e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f109835f);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f109836g);
            }
            if (zArr[5]) {
                e17 += b36.f.a(5, this.f109837h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f109838i);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList2);
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f109840n);
            }
            if (zArr[9]) {
                g17 += b36.f.h(9, this.f109841o);
            }
            java.lang.String str6 = this.f109842p;
            if (str6 != null && zArr[10]) {
                g17 += b36.f.j(10, str6);
            }
            java.lang.String str7 = this.f109843q;
            if (str7 != null && zArr[11]) {
                g17 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f109844r;
            if (str8 != null && zArr[12]) {
                g17 += b36.f.j(12, str8);
            }
            return g17 + b36.f.g(13, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f109833d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109834e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109835f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109836g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109837h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109838i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.hp hpVar = new bw5.hp();
                    if (bArr != null && bArr.length > 0) {
                        hpVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(hpVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f109840n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109841o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109842p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109843q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109844r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                linkedList.add(aVar2.k(intValue));
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
