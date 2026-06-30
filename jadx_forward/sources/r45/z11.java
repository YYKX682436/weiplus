package r45;

/* loaded from: classes2.dex */
public class z11 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f473116d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473117e;

    /* renamed from: f, reason: collision with root package name */
    public long f473118f;

    /* renamed from: g, reason: collision with root package name */
    public int f473119g;

    /* renamed from: h, reason: collision with root package name */
    public float f473120h;

    /* renamed from: i, reason: collision with root package name */
    public float f473121i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473122m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f473123n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f473124o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public r45.dx0 f473125p;

    /* renamed from: q, reason: collision with root package name */
    public int f473126q;

    /* renamed from: r, reason: collision with root package name */
    public int f473127r;

    /* renamed from: s, reason: collision with root package name */
    public long f473128s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473129t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z11)) {
            return false;
        }
        r45.z11 z11Var = (r45.z11) fVar;
        return n51.f.a(this.f76494x2de60e5e, z11Var.f76494x2de60e5e) && n51.f.a(this.f473116d, z11Var.f473116d) && n51.f.a(this.f473117e, z11Var.f473117e) && n51.f.a(java.lang.Long.valueOf(this.f473118f), java.lang.Long.valueOf(z11Var.f473118f)) && n51.f.a(java.lang.Integer.valueOf(this.f473119g), java.lang.Integer.valueOf(z11Var.f473119g)) && n51.f.a(java.lang.Float.valueOf(this.f473120h), java.lang.Float.valueOf(z11Var.f473120h)) && n51.f.a(java.lang.Float.valueOf(this.f473121i), java.lang.Float.valueOf(z11Var.f473121i)) && n51.f.a(this.f473122m, z11Var.f473122m) && n51.f.a(this.f473123n, z11Var.f473123n) && n51.f.a(this.f473124o, z11Var.f473124o) && n51.f.a(this.f473125p, z11Var.f473125p) && n51.f.a(java.lang.Integer.valueOf(this.f473126q), java.lang.Integer.valueOf(z11Var.f473126q)) && n51.f.a(java.lang.Integer.valueOf(this.f473127r), java.lang.Integer.valueOf(z11Var.f473127r)) && n51.f.a(java.lang.Long.valueOf(this.f473128s), java.lang.Long.valueOf(z11Var.f473128s)) && n51.f.a(this.f473129t, z11Var.f473129t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473124o;
        java.util.LinkedList linkedList2 = this.f473123n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f473116d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f473116d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473117e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f473118f);
            fVar.e(5, this.f473119g);
            fVar.d(6, this.f473120h);
            fVar.d(7, this.f473121i);
            java.lang.String str = this.f473122m;
            if (str != null) {
                fVar.j(8, str);
            }
            fVar.g(9, 8, linkedList2);
            fVar.g(10, 8, linkedList);
            r45.dx0 dx0Var = this.f473125p;
            if (dx0Var != null) {
                fVar.i(11, dx0Var.mo75928xcd1e8d8());
                this.f473125p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f473126q);
            fVar.e(13, this.f473127r);
            fVar.h(14, this.f473128s);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473129t;
            if (gVar2 != null) {
                fVar.b(15, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f473116d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f473117e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int h17 = i18 + b36.f.h(4, this.f473118f) + b36.f.e(5, this.f473119g) + b36.f.d(6, this.f473120h) + b36.f.d(7, this.f473121i);
            java.lang.String str2 = this.f473122m;
            if (str2 != null) {
                h17 += b36.f.j(8, str2);
            }
            int g17 = h17 + b36.f.g(9, 8, linkedList2) + b36.f.g(10, 8, linkedList);
            r45.dx0 dx0Var2 = this.f473125p;
            if (dx0Var2 != null) {
                g17 += b36.f.i(11, dx0Var2.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(12, this.f473126q) + b36.f.e(13, this.f473127r) + b36.f.h(14, this.f473128s);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f473129t;
            return gVar4 != null ? e17 + b36.f.b(15, gVar4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.z11 z11Var = (r45.z11) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    z11Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr3);
                    }
                    z11Var.f473116d = kv0Var3;
                }
                return 0;
            case 3:
                z11Var.f473117e = aVar2.d(intValue);
                return 0;
            case 4:
                z11Var.f473118f = aVar2.i(intValue);
                return 0;
            case 5:
                z11Var.f473119g = aVar2.g(intValue);
                return 0;
            case 6:
                z11Var.f473120h = aVar2.f(intValue);
                return 0;
            case 7:
                z11Var.f473121i = aVar2.f(intValue);
                return 0;
            case 8:
                z11Var.f473122m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.vd6 vd6Var = new r45.vd6();
                    if (bArr4 != null && bArr4.length > 0) {
                        vd6Var.mo11468x92b714fd(bArr4);
                    }
                    z11Var.f473123n.add(vd6Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e13 e13Var = new r45.e13();
                    if (bArr5 != null && bArr5.length > 0) {
                        e13Var.mo11468x92b714fd(bArr5);
                    }
                    z11Var.f473124o.add(e13Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr6 != null && bArr6.length > 0) {
                        dx0Var3.mo11468x92b714fd(bArr6);
                    }
                    z11Var.f473125p = dx0Var3;
                }
                return 0;
            case 12:
                z11Var.f473126q = aVar2.g(intValue);
                return 0;
            case 13:
                z11Var.f473127r = aVar2.g(intValue);
                return 0;
            case 14:
                z11Var.f473128s = aVar2.i(intValue);
                return 0;
            case 15:
                z11Var.f473129t = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
