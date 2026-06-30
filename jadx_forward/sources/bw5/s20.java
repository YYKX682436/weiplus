package bw5;

/* loaded from: classes8.dex */
public class s20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114302d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114303e;

    /* renamed from: f, reason: collision with root package name */
    public long f114304f;

    /* renamed from: g, reason: collision with root package name */
    public int f114305g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114306h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f114307i = new boolean[6];

    static {
        new bw5.s20();
    }

    public java.lang.String b() {
        return this.f114307i[5] ? this.f114306h : "";
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c() {
        return this.f114307i[2] ? this.f114303e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s20)) {
            return false;
        }
        bw5.s20 s20Var = (bw5.s20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114302d), java.lang.Integer.valueOf(s20Var.f114302d)) && n51.f.a(this.f114303e, s20Var.f114303e) && n51.f.a(java.lang.Long.valueOf(this.f114304f), java.lang.Long.valueOf(s20Var.f114304f)) && n51.f.a(java.lang.Integer.valueOf(this.f114305g), java.lang.Integer.valueOf(s20Var.f114305g)) && n51.f.a(this.f114306h, s20Var.f114306h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.s20 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s20) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114307i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114302d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114303e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f114304f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f114305g);
            }
            java.lang.String str = this.f114306h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114302d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114303e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f114304f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f114305g);
            }
            java.lang.String str2 = this.f114306h;
            return (str2 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str2);
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
        if (intValue == 1) {
            this.f114302d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114303e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114304f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f114305g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f114306h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
