package bw5;

/* loaded from: classes11.dex */
public class k0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.k0 f110721m = new bw5.k0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.p0 f110722d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.q0 f110723e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o0 f110724f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.g0 f110725g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.aj0 f110726h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110727i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k0)) {
            return false;
        }
        bw5.k0 k0Var = (bw5.k0) fVar;
        return n51.f.a(this.f110722d, k0Var.f110722d) && n51.f.a(this.f110723e, k0Var.f110723e) && n51.f.a(this.f110724f, k0Var.f110724f) && n51.f.a(this.f110725g, k0Var.f110725g) && n51.f.a(this.f110726h, k0Var.f110726h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110727i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.p0 p0Var = this.f110722d;
            if (p0Var != null && zArr[1]) {
                fVar.i(1, p0Var.mo75928xcd1e8d8());
                this.f110722d.mo75956x3d5d1f78(fVar);
            }
            bw5.q0 q0Var = this.f110723e;
            if (q0Var != null && zArr[2]) {
                fVar.i(2, q0Var.mo75928xcd1e8d8());
                this.f110723e.mo75956x3d5d1f78(fVar);
            }
            bw5.o0 o0Var = this.f110724f;
            if (o0Var != null && zArr[3]) {
                fVar.i(3, o0Var.mo75928xcd1e8d8());
                this.f110724f.mo75956x3d5d1f78(fVar);
            }
            bw5.g0 g0Var = this.f110725g;
            if (g0Var != null && zArr[4]) {
                fVar.i(4, g0Var.mo75928xcd1e8d8());
                this.f110725g.mo75956x3d5d1f78(fVar);
            }
            bw5.aj0 aj0Var = this.f110726h;
            if (aj0Var != null && zArr[5]) {
                fVar.i(5, aj0Var.mo75928xcd1e8d8());
                this.f110726h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.p0 p0Var2 = this.f110722d;
            if (p0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, p0Var2.mo75928xcd1e8d8());
            }
            bw5.q0 q0Var2 = this.f110723e;
            if (q0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, q0Var2.mo75928xcd1e8d8());
            }
            bw5.o0 o0Var2 = this.f110724f;
            if (o0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, o0Var2.mo75928xcd1e8d8());
            }
            bw5.g0 g0Var2 = this.f110725g;
            if (g0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, g0Var2.mo75928xcd1e8d8());
            }
            bw5.aj0 aj0Var2 = this.f110726h;
            return (aj0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, aj0Var2.mo75928xcd1e8d8());
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
                bw5.p0 p0Var3 = new bw5.p0();
                if (bArr != null && bArr.length > 0) {
                    p0Var3.mo11468x92b714fd(bArr);
                }
                this.f110722d = p0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.q0 q0Var3 = new bw5.q0();
                if (bArr2 != null && bArr2.length > 0) {
                    q0Var3.mo11468x92b714fd(bArr2);
                }
                this.f110723e = q0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.o0 o0Var3 = new bw5.o0();
                if (bArr3 != null && bArr3.length > 0) {
                    o0Var3.mo11468x92b714fd(bArr3);
                }
                this.f110724f = o0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.g0 g0Var3 = new bw5.g0();
                if (bArr4 != null && bArr4.length > 0) {
                    g0Var3.mo11468x92b714fd(bArr4);
                }
                this.f110725g = g0Var3;
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
            bw5.aj0 aj0Var3 = new bw5.aj0();
            if (bArr5 != null && bArr5.length > 0) {
                aj0Var3.mo11468x92b714fd(bArr5);
            }
            this.f110726h = aj0Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.k0) super.mo11468x92b714fd(bArr);
    }
}
