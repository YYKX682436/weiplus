package bw5;

/* loaded from: classes2.dex */
public class j50 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.f90 f110363d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.m40 f110364e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.h50 f110366g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g50 f110367h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.i50 f110368i;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110365f = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final android.util.ArrayMap f110369m = new android.util.ArrayMap();

    static {
        new bw5.j50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j50)) {
            return false;
        }
        bw5.j50 j50Var = (bw5.j50) fVar;
        return n51.f.a(this.f76492x92037252, j50Var.f76492x92037252) && n51.f.a(this.f110363d, j50Var.f110363d) && n51.f.a(this.f110364e, j50Var.f110364e) && n51.f.a(this.f110365f, j50Var.f110365f) && n51.f.a(this.f110366g, j50Var.f110366g) && n51.f.a(this.f110367h, j50Var.f110367h) && n51.f.a(this.f110368i, j50Var.f110368i);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return m12211x6e095e9(1) ? this.f76492x92037252 : new r45.ie();
    }

    /* renamed from: hasFieldNumber */
    public boolean m12211x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f110369m.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110365f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f76492x92037252 != null && m12211x6e095e9(1)) {
                fVar.i(1, this.f76492x92037252.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            if (this.f110363d != null && m12211x6e095e9(1001)) {
                fVar.i(1001, this.f110363d.mo75928xcd1e8d8());
                this.f110363d.mo75956x3d5d1f78(fVar);
            }
            if (this.f110364e != null && m12211x6e095e9(1002)) {
                fVar.i(1002, this.f110364e.mo75928xcd1e8d8());
                this.f110364e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (this.f110366g != null && m12211x6e095e9(4)) {
                fVar.i(4, this.f110366g.mo75928xcd1e8d8());
                this.f110366g.mo75956x3d5d1f78(fVar);
            }
            if (this.f110367h != null && m12211x6e095e9(5)) {
                fVar.i(5, this.f110367h.mo75928xcd1e8d8());
                this.f110367h.mo75956x3d5d1f78(fVar);
            }
            if (this.f110368i != null && m12211x6e095e9(6)) {
                fVar.i(6, this.f110368i.mo75928xcd1e8d8());
                this.f110368i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f76492x92037252 != null && m12211x6e095e9(1)) {
                i18 = 0 + b36.f.i(1, this.f76492x92037252.mo75928xcd1e8d8());
            }
            if (this.f110363d != null && m12211x6e095e9(1001)) {
                i18 += b36.f.i(1001, this.f110363d.mo75928xcd1e8d8());
            }
            if (this.f110364e != null && m12211x6e095e9(1002)) {
                i18 += b36.f.i(1002, this.f110364e.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (this.f110366g != null && m12211x6e095e9(4)) {
                g17 += b36.f.i(4, this.f110366g.mo75928xcd1e8d8());
            }
            if (this.f110367h != null && m12211x6e095e9(5)) {
                g17 += b36.f.i(5, this.f110367h.mo75928xcd1e8d8());
            }
            return (this.f110368i == null || !m12211x6e095e9(6)) ? g17 : g17 + b36.f.i(6, this.f110368i.mo75928xcd1e8d8());
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
        android.util.ArrayMap arrayMap = this.f110369m;
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
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.f50 f50Var = new bw5.f50();
                if (bArr2 != null && bArr2.length > 0) {
                    f50Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(f50Var);
            }
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.h50 h50Var = new bw5.h50();
                if (bArr3 != null && bArr3.length > 0) {
                    h50Var.mo11468x92b714fd(bArr3);
                }
                this.f110366g = h50Var;
            }
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.g50 g50Var = new bw5.g50();
                if (bArr4 != null && bArr4.length > 0) {
                    g50Var.mo11468x92b714fd(bArr4);
                }
                this.f110367h = g50Var;
            }
            arrayMap.put(5, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j28 = aVar2.j(intValue);
            int size5 = j28.size();
            for (int i37 = 0; i37 < size5; i37++) {
                byte[] bArr5 = (byte[]) j28.get(i37);
                bw5.i50 i50Var = new bw5.i50();
                if (bArr5 != null && bArr5.length > 0) {
                    i50Var.mo11468x92b714fd(bArr5);
                }
                this.f110368i = i50Var;
            }
            arrayMap.put(6, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 1001) {
            java.util.LinkedList j29 = aVar2.j(intValue);
            int size6 = j29.size();
            for (int i38 = 0; i38 < size6; i38++) {
                byte[] bArr6 = (byte[]) j29.get(i38);
                bw5.f90 f90Var = new bw5.f90();
                if (bArr6 != null && bArr6.length > 0) {
                    f90Var.mo11468x92b714fd(bArr6);
                }
                this.f110363d = f90Var;
            }
            arrayMap.put(1001, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 1002) {
            return -1;
        }
        java.util.LinkedList j37 = aVar2.j(intValue);
        int size7 = j37.size();
        for (int i39 = 0; i39 < size7; i39++) {
            byte[] bArr7 = (byte[]) j37.get(i39);
            bw5.m40 m40Var = new bw5.m40();
            if (bArr7 != null && bArr7.length > 0) {
                m40Var.mo11468x92b714fd(bArr7);
            }
            this.f110364e = m40Var;
        }
        arrayMap.put(1002, java.lang.Boolean.TRUE);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.j50) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f110369m.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
