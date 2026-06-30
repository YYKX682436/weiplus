package bw5;

/* loaded from: classes2.dex */
public class z60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.b50 f117371d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sb0 f117372e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pb0 f117373f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ka0 f117374g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.rb0 f117375h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117376i = new boolean[6];

    static {
        new bw5.z60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.z60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z60)) {
            return false;
        }
        bw5.z60 z60Var = (bw5.z60) fVar;
        return n51.f.a(this.f117371d, z60Var.f117371d) && n51.f.a(this.f117372e, z60Var.f117372e) && n51.f.a(this.f117373f, z60Var.f117373f) && n51.f.a(this.f117374g, z60Var.f117374g) && n51.f.a(this.f117375h, z60Var.f117375h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117376i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.b50 b50Var = this.f117371d;
            if (b50Var != null && zArr[1]) {
                fVar.i(1, b50Var.mo75928xcd1e8d8());
                this.f117371d.mo75956x3d5d1f78(fVar);
            }
            bw5.sb0 sb0Var = this.f117372e;
            if (sb0Var != null && zArr[2]) {
                fVar.i(2, sb0Var.mo75928xcd1e8d8());
                this.f117372e.mo75956x3d5d1f78(fVar);
            }
            bw5.pb0 pb0Var = this.f117373f;
            if (pb0Var != null && zArr[3]) {
                fVar.i(3, pb0Var.mo75928xcd1e8d8());
                this.f117373f.mo75956x3d5d1f78(fVar);
            }
            bw5.ka0 ka0Var = this.f117374g;
            if (ka0Var != null && zArr[4]) {
                fVar.i(4, ka0Var.mo75928xcd1e8d8());
                this.f117374g.mo75956x3d5d1f78(fVar);
            }
            bw5.rb0 rb0Var = this.f117375h;
            if (rb0Var != null && zArr[5]) {
                fVar.i(5, rb0Var.mo75928xcd1e8d8());
                this.f117375h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.b50 b50Var2 = this.f117371d;
            if (b50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, b50Var2.mo75928xcd1e8d8());
            }
            bw5.sb0 sb0Var2 = this.f117372e;
            if (sb0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, sb0Var2.mo75928xcd1e8d8());
            }
            bw5.pb0 pb0Var2 = this.f117373f;
            if (pb0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, pb0Var2.mo75928xcd1e8d8());
            }
            bw5.ka0 ka0Var2 = this.f117374g;
            if (ka0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, ka0Var2.mo75928xcd1e8d8());
            }
            bw5.rb0 rb0Var2 = this.f117375h;
            return (rb0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, rb0Var2.mo75928xcd1e8d8());
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
                bw5.b50 b50Var3 = new bw5.b50();
                if (bArr != null && bArr.length > 0) {
                    b50Var3.mo11468x92b714fd(bArr);
                }
                this.f117371d = b50Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.sb0 sb0Var3 = new bw5.sb0();
                if (bArr2 != null && bArr2.length > 0) {
                    sb0Var3.mo11468x92b714fd(bArr2);
                }
                this.f117372e = sb0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.pb0 pb0Var3 = new bw5.pb0();
                if (bArr3 != null && bArr3.length > 0) {
                    pb0Var3.mo11468x92b714fd(bArr3);
                }
                this.f117373f = pb0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.ka0 ka0Var3 = new bw5.ka0();
                if (bArr4 != null && bArr4.length > 0) {
                    ka0Var3.mo11468x92b714fd(bArr4);
                }
                this.f117374g = ka0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            bw5.rb0 rb0Var3 = new bw5.rb0();
            if (bArr5 != null && bArr5.length > 0) {
                rb0Var3.mo11468x92b714fd(bArr5);
            }
            this.f117375h = rb0Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
