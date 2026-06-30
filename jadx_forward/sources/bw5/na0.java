package bw5;

/* loaded from: classes2.dex */
public class na0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112124d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mc0 f112125e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112126f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.mc0 f112127g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112128h = new boolean[5];

    static {
        new bw5.na0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.na0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.na0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.na0)) {
            return false;
        }
        bw5.na0 na0Var = (bw5.na0) fVar;
        return n51.f.a(this.f112124d, na0Var.f112124d) && n51.f.a(this.f112125e, na0Var.f112125e) && n51.f.a(java.lang.Boolean.valueOf(this.f112126f), java.lang.Boolean.valueOf(na0Var.f112126f)) && n51.f.a(this.f112127g, na0Var.f112127g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.na0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112128h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112124d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.mc0 mc0Var = this.f112125e;
            if (mc0Var != null && zArr[2]) {
                fVar.i(2, mc0Var.mo75928xcd1e8d8());
                this.f112125e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f112126f);
            }
            bw5.mc0 mc0Var2 = this.f112127g;
            if (mc0Var2 != null && zArr[4]) {
                fVar.i(4, mc0Var2.mo75928xcd1e8d8());
                this.f112127g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112124d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.mc0 mc0Var3 = this.f112125e;
            if (mc0Var3 != null && zArr[2]) {
                i18 += b36.f.i(2, mc0Var3.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f112126f);
            }
            bw5.mc0 mc0Var4 = this.f112127g;
            return (mc0Var4 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, mc0Var4.mo75928xcd1e8d8());
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
            this.f112124d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.mc0 mc0Var5 = new bw5.mc0();
                if (bArr != null && bArr.length > 0) {
                    mc0Var5.mo11468x92b714fd(bArr);
                }
                this.f112125e = mc0Var5;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112126f = aVar2.c(intValue);
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
            bw5.mc0 mc0Var6 = new bw5.mc0();
            if (bArr2 != null && bArr2.length > 0) {
                mc0Var6.mo11468x92b714fd(bArr2);
            }
            this.f112127g = mc0Var6;
        }
        zArr[4] = true;
        return 0;
    }
}
