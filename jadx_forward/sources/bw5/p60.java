package bw5;

/* loaded from: classes2.dex */
public class p60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113010d;

    /* renamed from: e, reason: collision with root package name */
    public int f113011e;

    /* renamed from: f, reason: collision with root package name */
    public int f113012f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.ArrayMap f113013g = new android.util.ArrayMap();

    static {
        new bw5.p60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.p60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p60)) {
            return false;
        }
        bw5.p60 p60Var = (bw5.p60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113010d), java.lang.Integer.valueOf(p60Var.f113010d)) && n51.f.a(java.lang.Integer.valueOf(this.f113011e), java.lang.Integer.valueOf(p60Var.f113011e)) && n51.f.a(java.lang.Integer.valueOf(this.f113012f), java.lang.Integer.valueOf(p60Var.f113012f));
    }

    /* renamed from: hasFieldNumber */
    public boolean m12721x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f113013g.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m12721x6e095e9(1)) {
                fVar.e(1, this.f113010d);
            }
            if (m12721x6e095e9(2)) {
                fVar.e(2, this.f113011e);
            }
            if (m12721x6e095e9(100)) {
                fVar.e(100, this.f113012f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m12721x6e095e9(1) ? 0 + b36.f.e(1, this.f113010d) : 0;
            if (m12721x6e095e9(2)) {
                e17 += b36.f.e(2, this.f113011e);
            }
            return m12721x6e095e9(100) ? e17 + b36.f.e(100, this.f113012f) : e17;
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
        android.util.ArrayMap arrayMap = this.f113013g;
        if (intValue == 1) {
            this.f113010d = aVar2.g(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f113011e = aVar2.g(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        this.f113012f = aVar2.g(intValue);
        arrayMap.put(100, java.lang.Boolean.TRUE);
        return 0;
    }
}
