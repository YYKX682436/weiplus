package r45;

/* loaded from: classes12.dex */
public class we3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f470617d;

    /* renamed from: e, reason: collision with root package name */
    public int f470618e;

    /* renamed from: g, reason: collision with root package name */
    public r45.hj0 f470620g;

    /* renamed from: h, reason: collision with root package name */
    public int f470621h;

    /* renamed from: m, reason: collision with root package name */
    public int f470623m;

    /* renamed from: o, reason: collision with root package name */
    public int f470625o;

    /* renamed from: q, reason: collision with root package name */
    public int f470627q;

    /* renamed from: r, reason: collision with root package name */
    public int f470628r;

    /* renamed from: s, reason: collision with root package name */
    public int f470629s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f470631u;

    /* renamed from: v, reason: collision with root package name */
    public r45.cu5 f470632v;

    /* renamed from: x, reason: collision with root package name */
    public int f470634x;

    /* renamed from: y, reason: collision with root package name */
    public long f470635y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f470619f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f470622i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f470624n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f470626p = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f470630t = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f470633w = new java.util.LinkedList();

    static {
        new r45.we3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.we3 mo11468x92b714fd(byte[] bArr) {
        return (r45.we3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we3)) {
            return false;
        }
        r45.we3 we3Var = (r45.we3) fVar;
        return n51.f.a(this.f76492x92037252, we3Var.f76492x92037252) && n51.f.a(this.f470617d, we3Var.f470617d) && n51.f.a(java.lang.Integer.valueOf(this.f470618e), java.lang.Integer.valueOf(we3Var.f470618e)) && n51.f.a(this.f470619f, we3Var.f470619f) && n51.f.a(this.f470620g, we3Var.f470620g) && n51.f.a(java.lang.Integer.valueOf(this.f470621h), java.lang.Integer.valueOf(we3Var.f470621h)) && n51.f.a(this.f470622i, we3Var.f470622i) && n51.f.a(java.lang.Integer.valueOf(this.f470623m), java.lang.Integer.valueOf(we3Var.f470623m)) && n51.f.a(this.f470624n, we3Var.f470624n) && n51.f.a(java.lang.Integer.valueOf(this.f470625o), java.lang.Integer.valueOf(we3Var.f470625o)) && n51.f.a(this.f470626p, we3Var.f470626p) && n51.f.a(java.lang.Integer.valueOf(this.f470627q), java.lang.Integer.valueOf(we3Var.f470627q)) && n51.f.a(java.lang.Integer.valueOf(this.f470628r), java.lang.Integer.valueOf(we3Var.f470628r)) && n51.f.a(java.lang.Integer.valueOf(this.f470629s), java.lang.Integer.valueOf(we3Var.f470629s)) && n51.f.a(this.f470630t, we3Var.f470630t) && n51.f.a(this.f470631u, we3Var.f470631u) && n51.f.a(this.f470632v, we3Var.f470632v) && n51.f.a(this.f470633w, we3Var.f470633w) && n51.f.a(java.lang.Integer.valueOf(this.f470634x), java.lang.Integer.valueOf(we3Var.f470634x)) && n51.f.a(java.lang.Long.valueOf(this.f470635y), java.lang.Long.valueOf(we3Var.f470635y));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.we3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470633w;
        java.util.LinkedList linkedList2 = this.f470630t;
        java.util.LinkedList linkedList3 = this.f470626p;
        java.util.LinkedList linkedList4 = this.f470624n;
        java.util.LinkedList linkedList5 = this.f470622i;
        java.util.LinkedList linkedList6 = this.f470619f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f470617d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f470617d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f470618e);
            fVar.g(4, 8, linkedList6);
            r45.hj0 hj0Var = this.f470620g;
            if (hj0Var != null) {
                fVar.i(5, hj0Var.mo75928xcd1e8d8());
                this.f470620g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f470621h);
            fVar.g(7, 8, linkedList5);
            fVar.e(8, this.f470623m);
            fVar.g(9, 8, linkedList4);
            fVar.e(10, this.f470625o);
            fVar.g(11, 8, linkedList3);
            fVar.e(12, this.f470627q);
            fVar.e(13, this.f470628r);
            fVar.e(14, this.f470629s);
            fVar.g(15, 8, linkedList2);
            java.lang.String str = this.f470631u;
            if (str != null) {
                fVar.j(16, str);
            }
            r45.cu5 cu5Var2 = this.f470632v;
            if (cu5Var2 != null) {
                fVar.i(17, cu5Var2.mo75928xcd1e8d8());
                this.f470632v.mo75956x3d5d1f78(fVar);
            }
            fVar.g(18, 8, linkedList);
            fVar.e(19, this.f470634x);
            fVar.h(20, this.f470635y);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.cu5 cu5Var3 = this.f470617d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f470618e) + b36.f.g(4, 8, linkedList6);
            r45.hj0 hj0Var2 = this.f470620g;
            if (hj0Var2 != null) {
                e17 += b36.f.i(5, hj0Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f470621h) + b36.f.g(7, 8, linkedList5) + b36.f.e(8, this.f470623m) + b36.f.g(9, 8, linkedList4) + b36.f.e(10, this.f470625o) + b36.f.g(11, 8, linkedList3) + b36.f.e(12, this.f470627q) + b36.f.e(13, this.f470628r) + b36.f.e(14, this.f470629s) + b36.f.g(15, 8, linkedList2);
            java.lang.String str2 = this.f470631u;
            if (str2 != null) {
                e18 += b36.f.j(16, str2);
            }
            r45.cu5 cu5Var4 = this.f470632v;
            if (cu5Var4 != null) {
                e18 += b36.f.i(17, cu5Var4.mo75928xcd1e8d8());
            }
            return e18 + b36.f.g(18, 8, linkedList) + b36.f.e(19, this.f470634x) + b36.f.h(20, this.f470635y);
        }
        if (i17 == 2) {
            linkedList6.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f470617d = cu5Var5;
                }
                return 0;
            case 3:
                this.f470618e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zj0 zj0Var = new r45.zj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zj0Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList6.add(zj0Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.hj0 hj0Var3 = new r45.hj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hj0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f470620g = hj0Var3;
                }
                return 0;
            case 6:
                this.f470621h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.hj0 hj0Var4 = new r45.hj0();
                    if (bArr5 != null && bArr5.length > 0) {
                        hj0Var4.mo11468x92b714fd(bArr5);
                    }
                    linkedList5.add(hj0Var4);
                }
                return 0;
            case 8:
                this.f470623m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.nj0 nj0Var = new r45.nj0();
                    if (bArr6 != null && bArr6.length > 0) {
                        nj0Var.mo11468x92b714fd(bArr6);
                    }
                    linkedList4.add(nj0Var);
                }
                return 0;
            case 10:
                this.f470625o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.kj0 kj0Var = new r45.kj0();
                    if (bArr7 != null && bArr7.length > 0) {
                        kj0Var.mo11468x92b714fd(bArr7);
                    }
                    linkedList3.add(kj0Var);
                }
                return 0;
            case 12:
                this.f470627q = aVar2.g(intValue);
                return 0;
            case 13:
                this.f470628r = aVar2.g(intValue);
                return 0;
            case 14:
                this.f470629s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.kj0 kj0Var2 = new r45.kj0();
                    if (bArr8 != null && bArr8.length > 0) {
                        kj0Var2.mo11468x92b714fd(bArr8);
                    }
                    linkedList2.add(kj0Var2);
                }
                return 0;
            case 16:
                this.f470631u = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var6.b(bArr9);
                    }
                    this.f470632v = cu5Var6;
                }
                return 0;
            case 18:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.wj0 wj0Var = new r45.wj0();
                    if (bArr10 != null && bArr10.length > 0) {
                        wj0Var.mo11468x92b714fd(bArr10);
                    }
                    linkedList.add(wj0Var);
                }
                return 0;
            case 19:
                this.f470634x = aVar2.g(intValue);
                return 0;
            case 20:
                this.f470635y = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}
