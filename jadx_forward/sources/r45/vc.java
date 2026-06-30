package r45;

/* loaded from: classes8.dex */
public class vc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469621d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f469622e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kx3 f469623f;

    /* renamed from: g, reason: collision with root package name */
    public int f469624g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f469625h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469626i;

    /* renamed from: m, reason: collision with root package name */
    public int f469627m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vc)) {
            return false;
        }
        r45.vc vcVar = (r45.vc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469621d), java.lang.Integer.valueOf(vcVar.f469621d)) && n51.f.a(this.f469622e, vcVar.f469622e) && n51.f.a(this.f469623f, vcVar.f469623f) && n51.f.a(java.lang.Integer.valueOf(this.f469624g), java.lang.Integer.valueOf(vcVar.f469624g)) && n51.f.a(this.f469625h, vcVar.f469625h) && n51.f.a(this.f469626i, vcVar.f469626i) && n51.f.a(java.lang.Integer.valueOf(this.f469627m), java.lang.Integer.valueOf(vcVar.f469627m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469621d);
            r45.cu5 cu5Var = this.f469622e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f469622e.mo75956x3d5d1f78(fVar);
            }
            r45.kx3 kx3Var = this.f469623f;
            if (kx3Var != null) {
                fVar.i(3, kx3Var.mo75928xcd1e8d8());
                this.f469623f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f469624g);
            r45.cu5 cu5Var2 = this.f469625h;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.mo75928xcd1e8d8());
                this.f469625h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469626i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f469627m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469621d) + 0;
            r45.cu5 cu5Var3 = this.f469622e;
            if (cu5Var3 != null) {
                e17 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            r45.kx3 kx3Var2 = this.f469623f;
            if (kx3Var2 != null) {
                e17 += b36.f.i(3, kx3Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f469624g);
            r45.cu5 cu5Var4 = this.f469625h;
            if (cu5Var4 != null) {
                e18 += b36.f.i(5, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f469626i;
            if (str2 != null) {
                e18 += b36.f.j(6, str2);
            }
            return e18 + b36.f.e(7, this.f469627m);
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
        r45.vc vcVar = (r45.vc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vcVar.f469621d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    vcVar.f469622e = cu5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kx3 kx3Var3 = new r45.kx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        kx3Var3.mo11468x92b714fd(bArr2);
                    }
                    vcVar.f469623f = kx3Var3;
                }
                return 0;
            case 4:
                vcVar.f469624g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    vcVar.f469625h = cu5Var6;
                }
                return 0;
            case 6:
                vcVar.f469626i = aVar2.k(intValue);
                return 0;
            case 7:
                vcVar.f469627m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
