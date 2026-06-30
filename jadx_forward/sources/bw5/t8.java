package bw5;

/* loaded from: classes9.dex */
public class t8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.s8 f114839d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.s8 f114840e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.r8 f114841f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114842g = new boolean[5];

    static {
        new bw5.t8();
    }

    public bw5.s8 b() {
        return this.f114842g[2] ? this.f114840e : new bw5.s8();
    }

    public bw5.s8 c() {
        return this.f114842g[1] ? this.f114839d : new bw5.s8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t8)) {
            return false;
        }
        bw5.t8 t8Var = (bw5.t8) fVar;
        return n51.f.a(this.f114839d, t8Var.f114839d) && n51.f.a(this.f114840e, t8Var.f114840e) && n51.f.a(this.f114841f, t8Var.f114841f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.t8 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t8) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114842g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.s8 s8Var = this.f114839d;
            if (s8Var != null && zArr[1]) {
                fVar.i(1, s8Var.mo75928xcd1e8d8());
                this.f114839d.mo75956x3d5d1f78(fVar);
            }
            bw5.s8 s8Var2 = this.f114840e;
            if (s8Var2 != null && zArr[2]) {
                fVar.i(2, s8Var2.mo75928xcd1e8d8());
                this.f114840e.mo75956x3d5d1f78(fVar);
            }
            bw5.r8 r8Var = this.f114841f;
            if (r8Var != null && zArr[4]) {
                fVar.i(4, r8Var.mo75928xcd1e8d8());
                this.f114841f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.s8 s8Var3 = this.f114839d;
            if (s8Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, s8Var3.mo75928xcd1e8d8());
            }
            bw5.s8 s8Var4 = this.f114840e;
            if (s8Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, s8Var4.mo75928xcd1e8d8());
            }
            bw5.r8 r8Var2 = this.f114841f;
            return (r8Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, r8Var2.mo75928xcd1e8d8());
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
                bw5.s8 s8Var5 = new bw5.s8();
                if (bArr != null && bArr.length > 0) {
                    s8Var5.mo11468x92b714fd(bArr);
                }
                this.f114839d = s8Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.s8 s8Var6 = new bw5.s8();
                if (bArr2 != null && bArr2.length > 0) {
                    s8Var6.mo11468x92b714fd(bArr2);
                }
                this.f114840e = s8Var6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.r8 r8Var3 = new bw5.r8();
            if (bArr3 != null && bArr3.length > 0) {
                r8Var3.mo11468x92b714fd(bArr3);
            }
            this.f114841f = r8Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
