package bw5;

/* loaded from: classes2.dex */
public class c30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f107432d;

    /* renamed from: e, reason: collision with root package name */
    public float f107433e;

    /* renamed from: f, reason: collision with root package name */
    public float f107434f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.hd f107435g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107436h = new boolean[5];

    static {
        new bw5.c30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c30)) {
            return false;
        }
        bw5.c30 c30Var = (bw5.c30) fVar;
        return n51.f.a(this.f107432d, c30Var.f107432d) && n51.f.a(java.lang.Float.valueOf(this.f107433e), java.lang.Float.valueOf(c30Var.f107433e)) && n51.f.a(java.lang.Float.valueOf(this.f107434f), java.lang.Float.valueOf(c30Var.f107434f)) && n51.f.a(this.f107435g, c30Var.f107435g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107436h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.sc scVar = this.f107432d;
            if (scVar != null && zArr[1]) {
                fVar.i(1, scVar.mo75928xcd1e8d8());
                this.f107432d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.d(2, this.f107433e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f107434f);
            }
            bw5.hd hdVar = this.f107435g;
            if (hdVar != null && zArr[4]) {
                fVar.i(4, hdVar.mo75928xcd1e8d8());
                this.f107435g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.sc scVar2 = this.f107432d;
            if (scVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, scVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f107433e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f107434f);
            }
            bw5.hd hdVar2 = this.f107435g;
            return (hdVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, hdVar2.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.sc scVar3 = new bw5.sc();
                if (bArr != null && bArr.length > 0) {
                    scVar3.mo11468x92b714fd(bArr);
                }
                this.f107432d = scVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107433e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107434f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.hd hdVar3 = new bw5.hd();
            if (bArr2 != null && bArr2.length > 0) {
                hdVar3.mo11468x92b714fd(bArr2);
            }
            this.f107435g = hdVar3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.c30) super.mo11468x92b714fd(bArr);
    }
}
