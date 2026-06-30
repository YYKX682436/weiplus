package bw5;

/* loaded from: classes9.dex */
public class p7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113014d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f113015e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113017g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113018h = new boolean[5];

    static {
        new bw5.p7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.p7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p7)) {
            return false;
        }
        bw5.p7 p7Var = (bw5.p7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113014d), java.lang.Integer.valueOf(p7Var.f113014d)) && n51.f.a(java.lang.Boolean.valueOf(this.f113015e), java.lang.Boolean.valueOf(p7Var.f113015e)) && n51.f.a(java.lang.Boolean.valueOf(this.f113016f), java.lang.Boolean.valueOf(p7Var.f113016f)) && n51.f.a(java.lang.Boolean.valueOf(this.f113017g), java.lang.Boolean.valueOf(p7Var.f113017g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113018h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113014d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f113015e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f113016f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113017g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113014d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f113015e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f113016f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f113017g) : e17;
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
            this.f113014d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113015e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113016f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f113017g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
