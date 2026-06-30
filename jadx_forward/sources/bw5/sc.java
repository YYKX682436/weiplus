package bw5;

/* loaded from: classes2.dex */
public class sc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114416d;

    /* renamed from: e, reason: collision with root package name */
    public int f114417e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114418f;

    /* renamed from: g, reason: collision with root package name */
    public int f114419g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.m3 f114420h;

    /* renamed from: i, reason: collision with root package name */
    public long f114421i;

    /* renamed from: m, reason: collision with root package name */
    public int f114422m;

    /* renamed from: o, reason: collision with root package name */
    public int f114424o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ec f114425p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114426q;

    /* renamed from: r, reason: collision with root package name */
    public long f114427r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.yt f114428s;

    /* renamed from: u, reason: collision with root package name */
    public bw5.y20 f114430u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f114431v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.pr f114432w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f114423n = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f114429t = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f114433x = new boolean[20];

    static {
        new bw5.sc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sc mo11468x92b714fd(byte[] bArr) {
        return (bw5.sc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sc)) {
            return false;
        }
        bw5.sc scVar = (bw5.sc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114416d), java.lang.Integer.valueOf(scVar.f114416d)) && n51.f.a(java.lang.Integer.valueOf(this.f114417e), java.lang.Integer.valueOf(scVar.f114417e)) && n51.f.a(this.f114418f, scVar.f114418f) && n51.f.a(java.lang.Integer.valueOf(this.f114419g), java.lang.Integer.valueOf(scVar.f114419g)) && n51.f.a(this.f114420h, scVar.f114420h) && n51.f.a(java.lang.Long.valueOf(this.f114421i), java.lang.Long.valueOf(scVar.f114421i)) && n51.f.a(java.lang.Integer.valueOf(this.f114422m), java.lang.Integer.valueOf(scVar.f114422m)) && n51.f.a(this.f114423n, scVar.f114423n) && n51.f.a(java.lang.Integer.valueOf(this.f114424o), java.lang.Integer.valueOf(scVar.f114424o)) && n51.f.a(this.f114425p, scVar.f114425p) && n51.f.a(this.f114426q, scVar.f114426q) && n51.f.a(java.lang.Long.valueOf(this.f114427r), java.lang.Long.valueOf(scVar.f114427r)) && n51.f.a(this.f114428s, scVar.f114428s) && n51.f.a(this.f114429t, scVar.f114429t) && n51.f.a(this.f114430u, scVar.f114430u) && n51.f.a(this.f114431v, scVar.f114431v) && n51.f.a(this.f114432w, scVar.f114432w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114429t;
        java.util.LinkedList linkedList2 = this.f114423n;
        boolean[] zArr = this.f114433x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114416d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114417e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114418f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f114419g);
            }
            bw5.m3 m3Var = this.f114420h;
            if (m3Var != null && zArr[5]) {
                fVar.i(5, m3Var.mo75928xcd1e8d8());
                this.f114420h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f114421i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114422m);
            }
            fVar.g(8, 8, linkedList2);
            if (zArr[10]) {
                fVar.e(10, this.f114424o);
            }
            bw5.ec ecVar = this.f114425p;
            if (ecVar != null && zArr[11]) {
                fVar.i(11, ecVar.mo75928xcd1e8d8());
                this.f114425p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114426q;
            if (gVar2 != null && zArr[12]) {
                fVar.b(12, gVar2);
            }
            if (zArr[13]) {
                fVar.h(13, this.f114427r);
            }
            bw5.yt ytVar = this.f114428s;
            if (ytVar != null && zArr[14]) {
                fVar.i(14, ytVar.mo75928xcd1e8d8());
                this.f114428s.mo75956x3d5d1f78(fVar);
            }
            fVar.g(15, 2, linkedList);
            bw5.y20 y20Var = this.f114430u;
            if (y20Var != null && zArr[17]) {
                fVar.i(17, y20Var.mo75928xcd1e8d8());
                this.f114430u.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f114431v;
            if (str != null && zArr[18]) {
                fVar.j(18, str);
            }
            bw5.pr prVar = this.f114432w;
            if (prVar != null && zArr[19]) {
                fVar.i(19, prVar.mo75928xcd1e8d8());
                this.f114432w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f114416d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f114417e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f114418f;
            if (gVar3 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar3);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f114419g);
            }
            bw5.m3 m3Var2 = this.f114420h;
            if (m3Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, m3Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f114421i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f114422m);
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList2);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f114424o);
            }
            bw5.ec ecVar2 = this.f114425p;
            if (ecVar2 != null && zArr[11]) {
                g17 += b36.f.i(11, ecVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f114426q;
            if (gVar4 != null && zArr[12]) {
                g17 += b36.f.b(12, gVar4);
            }
            if (zArr[13]) {
                g17 += b36.f.h(13, this.f114427r);
            }
            bw5.yt ytVar2 = this.f114428s;
            if (ytVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, ytVar2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(15, 2, linkedList);
            bw5.y20 y20Var2 = this.f114430u;
            if (y20Var2 != null && zArr[17]) {
                g18 += b36.f.i(17, y20Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f114431v;
            if (str2 != null && zArr[18]) {
                g18 += b36.f.j(18, str2);
            }
            bw5.pr prVar2 = this.f114432w;
            return (prVar2 == null || !zArr[19]) ? g18 : g18 + b36.f.i(19, prVar2.mo75928xcd1e8d8());
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
                this.f114416d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114417e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114418f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114419g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.m3 m3Var3 = new bw5.m3();
                    if (bArr != null && bArr.length > 0) {
                        m3Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114420h = m3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f114421i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114422m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ds dsVar = new bw5.ds();
                    if (bArr2 != null && bArr2.length > 0) {
                        dsVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(dsVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
            case 16:
            default:
                return -1;
            case 10:
                this.f114424o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.ec ecVar3 = new bw5.ec();
                    if (bArr3 != null && bArr3.length > 0) {
                        ecVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f114425p = ecVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f114426q = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114427r = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.yt ytVar3 = new bw5.yt();
                    if (bArr4 != null && bArr4.length > 0) {
                        ytVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f114428s = ytVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[15] = true;
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.y20 y20Var3 = new bw5.y20();
                    if (bArr5 != null && bArr5.length > 0) {
                        y20Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f114430u = y20Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f114431v = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.pr prVar3 = new bw5.pr();
                    if (bArr6 != null && bArr6.length > 0) {
                        prVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f114432w = prVar3;
                }
                zArr[19] = true;
                return 0;
        }
    }
}
