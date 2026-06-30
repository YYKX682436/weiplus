package bw5;

/* loaded from: classes2.dex */
public class e50 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public int f108266e;

    /* renamed from: f, reason: collision with root package name */
    public int f108267f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f108268g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.m40 f108269h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.o50 f108270i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.o50 f108271m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.o50 f108272n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f108265d = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f108273o = new android.util.ArrayMap();

    static {
        new bw5.e50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e50)) {
            return false;
        }
        bw5.e50 e50Var = (bw5.e50) fVar;
        return n51.f.a(this.f76492x92037252, e50Var.f76492x92037252) && n51.f.a(this.f108265d, e50Var.f108265d) && n51.f.a(java.lang.Integer.valueOf(this.f108266e), java.lang.Integer.valueOf(e50Var.f108266e)) && n51.f.a(java.lang.Integer.valueOf(this.f108267f), java.lang.Integer.valueOf(e50Var.f108267f)) && n51.f.a(java.lang.Boolean.valueOf(this.f108268g), java.lang.Boolean.valueOf(e50Var.f108268g)) && n51.f.a(this.f108269h, e50Var.f108269h) && n51.f.a(this.f108270i, e50Var.f108270i) && n51.f.a(this.f108271m, e50Var.f108271m) && n51.f.a(this.f108272n, e50Var.f108272n);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return m11806x6e095e9(1) ? this.f76492x92037252 : new r45.ie();
    }

    /* renamed from: hasFieldNumber */
    public boolean m11806x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f108273o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108265d;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f76492x92037252 != null && m11806x6e095e9(1)) {
                fVar.i(1, this.f76492x92037252.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            if (m11806x6e095e9(4)) {
                fVar.e(4, this.f108266e);
            }
            if (m11806x6e095e9(5)) {
                fVar.e(5, this.f108267f);
            }
            if (m11806x6e095e9(6)) {
                fVar.a(6, this.f108268g);
            }
            if (this.f108269h != null && m11806x6e095e9(7)) {
                fVar.i(7, this.f108269h.mo75928xcd1e8d8());
                this.f108269h.mo75956x3d5d1f78(fVar);
            }
            if (this.f108270i != null && m11806x6e095e9(102)) {
                fVar.i(102, this.f108270i.mo75928xcd1e8d8());
                this.f108270i.mo75956x3d5d1f78(fVar);
            }
            if (this.f108271m != null && m11806x6e095e9(103)) {
                fVar.i(103, this.f108271m.mo75928xcd1e8d8());
                this.f108271m.mo75956x3d5d1f78(fVar);
            }
            if (this.f108272n != null && m11806x6e095e9(104)) {
                fVar.i(104, this.f108272n.mo75928xcd1e8d8());
                this.f108272n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f76492x92037252 != null && m11806x6e095e9(1)) {
                i18 = 0 + b36.f.i(1, this.f76492x92037252.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (m11806x6e095e9(4)) {
                g17 += b36.f.e(4, this.f108266e);
            }
            if (m11806x6e095e9(5)) {
                g17 += b36.f.e(5, this.f108267f);
            }
            if (m11806x6e095e9(6)) {
                g17 += b36.f.a(6, this.f108268g);
            }
            if (this.f108269h != null && m11806x6e095e9(7)) {
                g17 += b36.f.i(7, this.f108269h.mo75928xcd1e8d8());
            }
            if (this.f108270i != null && m11806x6e095e9(102)) {
                g17 += b36.f.i(102, this.f108270i.mo75928xcd1e8d8());
            }
            if (this.f108271m != null && m11806x6e095e9(103)) {
                g17 += b36.f.i(103, this.f108271m.mo75928xcd1e8d8());
            }
            return (this.f108272n == null || !m11806x6e095e9(104)) ? g17 : g17 + b36.f.i(104, this.f108272n.mo75928xcd1e8d8());
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
        android.util.ArrayMap arrayMap = this.f108273o;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar.mo11468x92b714fd(bArr);
                }
                this.f76492x92037252 = ieVar;
            }
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.o50 o50Var = new bw5.o50();
                if (bArr2 != null && bArr2.length > 0) {
                    o50Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(o50Var);
            }
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            this.f108266e = aVar2.g(intValue);
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 5) {
            this.f108267f = aVar2.g(intValue);
            arrayMap.put(5, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 6) {
            this.f108268g = aVar2.c(intValue);
            arrayMap.put(6, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 7) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.m40 m40Var = new bw5.m40();
                if (bArr3 != null && bArr3.length > 0) {
                    m40Var.mo11468x92b714fd(bArr3);
                }
                this.f108269h = m40Var;
            }
            arrayMap.put(7, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 102:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.o50 o50Var2 = new bw5.o50();
                    if (bArr4 != null && bArr4.length > 0) {
                        o50Var2.mo11468x92b714fd(bArr4);
                    }
                    this.f108270i = o50Var2;
                }
                arrayMap.put(102, java.lang.Boolean.TRUE);
                return 0;
            case 103:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr5 != null && bArr5.length > 0) {
                        o50Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f108271m = o50Var3;
                }
                arrayMap.put(103, java.lang.Boolean.TRUE);
                return 0;
            case 104:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.o50 o50Var4 = new bw5.o50();
                    if (bArr6 != null && bArr6.length > 0) {
                        o50Var4.mo11468x92b714fd(bArr6);
                    }
                    this.f108272n = o50Var4;
                }
                arrayMap.put(104, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f108273o.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
