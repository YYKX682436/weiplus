package bw5;

/* loaded from: classes2.dex */
public class oy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112936e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112938g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112940i;

    /* renamed from: p, reason: collision with root package name */
    public int f112944p;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f112937f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f112939h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f112941m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f112942n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f112943o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f112945q = new boolean[11];

    static {
        new bw5.oy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oy mo11468x92b714fd(byte[] bArr) {
        return (bw5.oy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oy)) {
            return false;
        }
        bw5.oy oyVar = (bw5.oy) fVar;
        return n51.f.a(this.f112935d, oyVar.f112935d) && n51.f.a(this.f112936e, oyVar.f112936e) && n51.f.a(this.f112937f, oyVar.f112937f) && n51.f.a(this.f112938g, oyVar.f112938g) && n51.f.a(this.f112939h, oyVar.f112939h) && n51.f.a(this.f112940i, oyVar.f112940i) && n51.f.a(this.f112941m, oyVar.f112941m) && n51.f.a(this.f112942n, oyVar.f112942n) && n51.f.a(this.f112943o, oyVar.f112943o) && n51.f.a(java.lang.Integer.valueOf(this.f112944p), java.lang.Integer.valueOf(oyVar.f112944p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112943o;
        java.util.LinkedList linkedList2 = this.f112942n;
        java.util.LinkedList linkedList3 = this.f112941m;
        java.util.LinkedList linkedList4 = this.f112939h;
        java.util.LinkedList linkedList5 = this.f112937f;
        int i18 = 0;
        boolean[] zArr = this.f112945q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112935d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112936e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList5);
            java.lang.String str3 = this.f112938g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            fVar.g(5, 1, linkedList4);
            java.lang.String str4 = this.f112940i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            fVar.g(7, 1, linkedList3);
            fVar.g(8, 1, linkedList2);
            fVar.g(9, 1, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f112944p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f112935d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            java.lang.String str6 = this.f112936e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList5);
            java.lang.String str7 = this.f112938g;
            if (str7 != null && zArr[4]) {
                g17 += b36.f.j(4, str7);
            }
            int g18 = g17 + b36.f.g(5, 1, linkedList4);
            java.lang.String str8 = this.f112940i;
            if (str8 != null && zArr[6]) {
                g18 += b36.f.j(6, str8);
            }
            int g19 = g18 + b36.f.g(7, 1, linkedList3) + b36.f.g(8, 1, linkedList2) + b36.f.g(9, 1, linkedList);
            return zArr[10] ? g19 + b36.f.e(10, this.f112944p) : g19;
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
                this.f112935d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112936e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                linkedList5.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f112938g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList4.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f112940i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList3.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                linkedList2.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                linkedList.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                this.f112944p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
