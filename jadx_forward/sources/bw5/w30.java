package bw5;

/* loaded from: classes2.dex */
public class w30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116103d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v30 f116104e;

    /* renamed from: f, reason: collision with root package name */
    public int f116105f;

    /* renamed from: g, reason: collision with root package name */
    public int f116106g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116107h = new boolean[5];

    static {
        new bw5.w30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.w30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w30)) {
            return false;
        }
        bw5.w30 w30Var = (bw5.w30) fVar;
        return n51.f.a(this.f116103d, w30Var.f116103d) && n51.f.a(this.f116104e, w30Var.f116104e) && n51.f.a(java.lang.Integer.valueOf(this.f116105f), java.lang.Integer.valueOf(w30Var.f116105f)) && n51.f.a(java.lang.Integer.valueOf(this.f116106g), java.lang.Integer.valueOf(w30Var.f116106g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116107h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116103d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v30 v30Var = this.f116104e;
            if (v30Var != null && zArr[2]) {
                fVar.i(2, v30Var.mo75928xcd1e8d8());
                this.f116104e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116105f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116106g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f116103d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v30 v30Var2 = this.f116104e;
            if (v30Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v30Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f116105f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f116106g) : i18;
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
            this.f116103d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f116105f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f116106g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v30 v30Var3 = new bw5.v30();
            if (bArr != null && bArr.length > 0) {
                v30Var3.mo11468x92b714fd(bArr);
            }
            this.f116104e = v30Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
