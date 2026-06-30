package bw5;

/* loaded from: classes2.dex */
public class s30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114315d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f114316e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f114317f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f114318g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.ArrayMap f114319h = new android.util.ArrayMap();

    static {
        new bw5.s30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s30)) {
            return false;
        }
        bw5.s30 s30Var = (bw5.s30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114315d), java.lang.Boolean.valueOf(s30Var.f114315d)) && n51.f.a(java.lang.Boolean.valueOf(this.f114316e), java.lang.Boolean.valueOf(s30Var.f114316e)) && n51.f.a(java.lang.Boolean.valueOf(this.f114317f), java.lang.Boolean.valueOf(s30Var.f114317f)) && n51.f.a(java.lang.Boolean.valueOf(this.f114318g), java.lang.Boolean.valueOf(s30Var.f114318g));
    }

    /* renamed from: hasFieldNumber */
    public boolean m12937x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f114319h.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m12937x6e095e9(1)) {
                fVar.a(1, this.f114315d);
            }
            if (m12937x6e095e9(2)) {
                fVar.a(2, this.f114316e);
            }
            if (m12937x6e095e9(3)) {
                fVar.a(3, this.f114317f);
            }
            if (m12937x6e095e9(101)) {
                fVar.a(101, this.f114318g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = m12937x6e095e9(1) ? 0 + b36.f.a(1, this.f114315d) : 0;
            if (m12937x6e095e9(2)) {
                a17 += b36.f.a(2, this.f114316e);
            }
            if (m12937x6e095e9(3)) {
                a17 += b36.f.a(3, this.f114317f);
            }
            return m12937x6e095e9(101) ? a17 + b36.f.a(101, this.f114318g) : a17;
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
        android.util.ArrayMap arrayMap = this.f114319h;
        if (intValue == 1) {
            this.f114315d = aVar2.c(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f114316e = aVar2.c(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f114317f = aVar2.c(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        this.f114318g = aVar2.c(intValue);
        arrayMap.put(101, java.lang.Boolean.TRUE);
        return 0;
    }
}
