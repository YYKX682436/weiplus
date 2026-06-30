package bw5;

/* loaded from: classes2.dex */
public class r00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f113890d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.q00 f113891e;

    /* renamed from: f, reason: collision with root package name */
    public int f113892f;

    /* renamed from: g, reason: collision with root package name */
    public int f113893g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113894h = new boolean[5];

    static {
        new bw5.r00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.r00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r00)) {
            return false;
        }
        bw5.r00 r00Var = (bw5.r00) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f113890d), java.lang.Boolean.valueOf(r00Var.f113890d)) && n51.f.a(this.f113891e, r00Var.f113891e) && n51.f.a(java.lang.Integer.valueOf(this.f113892f), java.lang.Integer.valueOf(r00Var.f113892f)) && n51.f.a(java.lang.Integer.valueOf(this.f113893g), java.lang.Integer.valueOf(r00Var.f113893g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113894h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f113890d);
            }
            bw5.q00 q00Var = this.f113891e;
            if (q00Var != null && zArr[2]) {
                fVar.i(2, q00Var.mo75928xcd1e8d8());
                this.f113891e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113892f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113893g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f113890d) : 0;
            bw5.q00 q00Var2 = this.f113891e;
            if (q00Var2 != null && zArr[2]) {
                a17 += b36.f.i(2, q00Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f113892f);
            }
            return zArr[4] ? a17 + b36.f.e(4, this.f113893g) : a17;
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
            this.f113890d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f113892f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f113893g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.q00 q00Var3 = new bw5.q00();
            if (bArr != null && bArr.length > 0) {
                q00Var3.mo11468x92b714fd(bArr);
            }
            this.f113891e = q00Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
