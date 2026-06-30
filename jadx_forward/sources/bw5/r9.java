package bw5;

/* loaded from: classes12.dex */
public class r9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113976e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113977f;

    /* renamed from: g, reason: collision with root package name */
    public int f113978g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.x7 f113979h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.l9 f113980i;

    /* renamed from: m, reason: collision with root package name */
    public long f113981m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f113982n = new android.util.ArrayMap();

    static {
        new bw5.r9();
    }

    public bw5.l9 b() {
        return m12881x6e095e9(6) ? this.f113980i : new bw5.l9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.r9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.r9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r9)) {
            return false;
        }
        bw5.r9 r9Var = (bw5.r9) fVar;
        return n51.f.a(this.f113975d, r9Var.f113975d) && n51.f.a(this.f113976e, r9Var.f113976e) && n51.f.a(this.f113977f, r9Var.f113977f) && n51.f.a(java.lang.Integer.valueOf(this.f113978g), java.lang.Integer.valueOf(r9Var.f113978g)) && n51.f.a(this.f113979h, r9Var.f113979h) && n51.f.a(this.f113980i, r9Var.f113980i) && n51.f.a(java.lang.Long.valueOf(this.f113981m), java.lang.Long.valueOf(r9Var.f113981m));
    }

    /* renamed from: getAppid */
    public java.lang.String m12879x74292946() {
        return m12881x6e095e9(1) ? this.f113975d : "";
    }

    /* renamed from: getName */
    public java.lang.String m12880xfb82e301() {
        return m12881x6e095e9(2) ? this.f113976e : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m12881x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f113982n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f113975d != null && m12881x6e095e9(1)) {
                fVar.j(1, this.f113975d);
            }
            if (this.f113976e != null && m12881x6e095e9(2)) {
                fVar.j(2, this.f113976e);
            }
            if (this.f113977f != null && m12881x6e095e9(3)) {
                fVar.j(3, this.f113977f);
            }
            if (m12881x6e095e9(4)) {
                fVar.e(4, this.f113978g);
            }
            if (this.f113979h != null && m12881x6e095e9(5)) {
                fVar.i(5, this.f113979h.mo75928xcd1e8d8());
                this.f113979h.mo75956x3d5d1f78(fVar);
            }
            if (this.f113980i != null && m12881x6e095e9(6)) {
                fVar.i(6, this.f113980i.mo75928xcd1e8d8());
                this.f113980i.mo75956x3d5d1f78(fVar);
            }
            if (m12881x6e095e9(100)) {
                fVar.h(100, this.f113981m);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f113975d != null && m12881x6e095e9(1)) {
                i18 = 0 + b36.f.j(1, this.f113975d);
            }
            if (this.f113976e != null && m12881x6e095e9(2)) {
                i18 += b36.f.j(2, this.f113976e);
            }
            if (this.f113977f != null && m12881x6e095e9(3)) {
                i18 += b36.f.j(3, this.f113977f);
            }
            if (m12881x6e095e9(4)) {
                i18 += b36.f.e(4, this.f113978g);
            }
            if (this.f113979h != null && m12881x6e095e9(5)) {
                i18 += b36.f.i(5, this.f113979h.mo75928xcd1e8d8());
            }
            if (this.f113980i != null && m12881x6e095e9(6)) {
                i18 += b36.f.i(6, this.f113980i.mo75928xcd1e8d8());
            }
            return m12881x6e095e9(100) ? i18 + b36.f.h(100, this.f113981m) : i18;
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
        android.util.ArrayMap arrayMap = this.f113982n;
        if (intValue == 100) {
            this.f113981m = aVar2.i(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f113975d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f113976e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f113977f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f113978g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x7 x7Var = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var.mo11468x92b714fd(bArr);
                    }
                    this.f113979h = x7Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.l9 l9Var = new bw5.l9();
                    if (bArr2 != null && bArr2.length > 0) {
                        l9Var.mo11468x92b714fd(bArr2);
                    }
                    this.f113980i = l9Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
