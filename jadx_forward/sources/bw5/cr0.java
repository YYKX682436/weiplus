package bw5;

/* loaded from: classes11.dex */
public class cr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.v70 f107739d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f107740e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f107741f;

    /* renamed from: g, reason: collision with root package name */
    public int f107742g;

    /* renamed from: h, reason: collision with root package name */
    public int f107743h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f107744i = new boolean[6];

    static {
        new bw5.cr0();
    }

    public bw5.o50 b() {
        return this.f107744i[2] ? this.f107740e : new bw5.o50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.cr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.cr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cr0)) {
            return false;
        }
        bw5.cr0 cr0Var = (bw5.cr0) fVar;
        return n51.f.a(this.f107739d, cr0Var.f107739d) && n51.f.a(this.f107740e, cr0Var.f107740e) && n51.f.a(this.f107741f, cr0Var.f107741f) && n51.f.a(java.lang.Integer.valueOf(this.f107742g), java.lang.Integer.valueOf(cr0Var.f107742g)) && n51.f.a(java.lang.Integer.valueOf(this.f107743h), java.lang.Integer.valueOf(cr0Var.f107743h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107744i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v70 v70Var = this.f107739d;
            if (v70Var != null && zArr[1]) {
                fVar.i(1, v70Var.mo75928xcd1e8d8());
                this.f107739d.mo75956x3d5d1f78(fVar);
            }
            bw5.o50 o50Var = this.f107740e;
            if (o50Var != null && zArr[2]) {
                fVar.i(2, o50Var.mo75928xcd1e8d8());
                this.f107740e.mo75956x3d5d1f78(fVar);
            }
            bw5.v70 v70Var2 = this.f107741f;
            if (v70Var2 != null && zArr[3]) {
                fVar.i(3, v70Var2.mo75928xcd1e8d8());
                this.f107741f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107742g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107743h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.v70 v70Var3 = this.f107739d;
            if (v70Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v70Var3.mo75928xcd1e8d8());
            }
            bw5.o50 o50Var2 = this.f107740e;
            if (o50Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, o50Var2.mo75928xcd1e8d8());
            }
            bw5.v70 v70Var4 = this.f107741f;
            if (v70Var4 != null && zArr[3]) {
                i18 += b36.f.i(3, v70Var4.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107742g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f107743h) : i18;
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
                bw5.v70 v70Var5 = new bw5.v70();
                if (bArr != null && bArr.length > 0) {
                    v70Var5.mo11468x92b714fd(bArr);
                }
                this.f107739d = v70Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr2 != null && bArr2.length > 0) {
                    o50Var3.mo11468x92b714fd(bArr2);
                }
                this.f107740e = o50Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f107742g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f107743h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.v70 v70Var6 = new bw5.v70();
            if (bArr3 != null && bArr3.length > 0) {
                v70Var6.mo11468x92b714fd(bArr3);
            }
            this.f107741f = v70Var6;
        }
        zArr[3] = true;
        return 0;
    }
}
