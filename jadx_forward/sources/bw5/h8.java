package bw5;

/* loaded from: classes9.dex */
public class h8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109643d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109644e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.g8 f109645f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.d8 f109646g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.e8 f109647h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.f8 f109648i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109649m = new boolean[7];

    static {
        new bw5.h8();
    }

    public bw5.d8 b() {
        return this.f109649m[4] ? this.f109646g : new bw5.d8();
    }

    public bw5.e8 c() {
        return this.f109649m[5] ? this.f109647h : new bw5.e8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h8)) {
            return false;
        }
        bw5.h8 h8Var = (bw5.h8) fVar;
        return n51.f.a(this.f109643d, h8Var.f109643d) && n51.f.a(this.f109644e, h8Var.f109644e) && n51.f.a(this.f109645f, h8Var.f109645f) && n51.f.a(this.f109646g, h8Var.f109646g) && n51.f.a(this.f109647h, h8Var.f109647h) && n51.f.a(this.f109648i, h8Var.f109648i);
    }

    public bw5.g8 d() {
        return this.f109649m[3] ? this.f109645f : new bw5.g8();
    }

    public bw5.h8 e(bw5.g8 g8Var) {
        this.f109645f = g8Var;
        this.f109649m[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.h8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109649m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109643d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109644e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.g8 g8Var = this.f109645f;
            if (g8Var != null && zArr[3]) {
                fVar.i(3, g8Var.mo75928xcd1e8d8());
                this.f109645f.mo75956x3d5d1f78(fVar);
            }
            bw5.d8 d8Var = this.f109646g;
            if (d8Var != null && zArr[4]) {
                fVar.i(4, d8Var.mo75928xcd1e8d8());
                this.f109646g.mo75956x3d5d1f78(fVar);
            }
            bw5.e8 e8Var = this.f109647h;
            if (e8Var != null && zArr[5]) {
                fVar.i(5, e8Var.mo75928xcd1e8d8());
                this.f109647h.mo75956x3d5d1f78(fVar);
            }
            bw5.f8 f8Var = this.f109648i;
            if (f8Var != null && zArr[6]) {
                fVar.i(6, f8Var.mo75928xcd1e8d8());
                this.f109648i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f109643d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109644e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            bw5.g8 g8Var2 = this.f109645f;
            if (g8Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, g8Var2.mo75928xcd1e8d8());
            }
            bw5.d8 d8Var2 = this.f109646g;
            if (d8Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, d8Var2.mo75928xcd1e8d8());
            }
            bw5.e8 e8Var2 = this.f109647h;
            if (e8Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, e8Var2.mo75928xcd1e8d8());
            }
            bw5.f8 f8Var2 = this.f109648i;
            return (f8Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, f8Var2.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
                this.f109643d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109644e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.g8 g8Var3 = new bw5.g8();
                    if (bArr != null && bArr.length > 0) {
                        g8Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109645f = g8Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.d8 d8Var3 = new bw5.d8();
                    if (bArr2 != null && bArr2.length > 0) {
                        d8Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109646g = d8Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.e8 e8Var3 = new bw5.e8();
                    if (bArr3 != null && bArr3.length > 0) {
                        e8Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109647h = e8Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.f8 f8Var3 = new bw5.f8();
                    if (bArr4 != null && bArr4.length > 0) {
                        f8Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f109648i = f8Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.h8) super.mo11468x92b714fd(bArr);
    }
}
