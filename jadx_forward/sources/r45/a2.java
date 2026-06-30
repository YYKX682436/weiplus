package r45;

/* loaded from: classes9.dex */
public class a2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b2 f451182d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b2 f451183e;

    /* renamed from: f, reason: collision with root package name */
    public r45.b2 f451184f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b2 f451185g;

    /* renamed from: h, reason: collision with root package name */
    public r45.b2 f451186h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a2)) {
            return false;
        }
        r45.a2 a2Var = (r45.a2) fVar;
        return n51.f.a(this.f451182d, a2Var.f451182d) && n51.f.a(this.f451183e, a2Var.f451183e) && n51.f.a(this.f451184f, a2Var.f451184f) && n51.f.a(this.f451185g, a2Var.f451185g) && n51.f.a(this.f451186h, a2Var.f451186h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b2 b2Var = this.f451182d;
            if (b2Var != null) {
                fVar.i(1, b2Var.mo75928xcd1e8d8());
                this.f451182d.mo75956x3d5d1f78(fVar);
            }
            r45.b2 b2Var2 = this.f451183e;
            if (b2Var2 != null) {
                fVar.i(2, b2Var2.mo75928xcd1e8d8());
                this.f451183e.mo75956x3d5d1f78(fVar);
            }
            r45.b2 b2Var3 = this.f451184f;
            if (b2Var3 != null) {
                fVar.i(3, b2Var3.mo75928xcd1e8d8());
                this.f451184f.mo75956x3d5d1f78(fVar);
            }
            r45.b2 b2Var4 = this.f451185g;
            if (b2Var4 != null) {
                fVar.i(4, b2Var4.mo75928xcd1e8d8());
                this.f451185g.mo75956x3d5d1f78(fVar);
            }
            r45.b2 b2Var5 = this.f451186h;
            if (b2Var5 != null) {
                fVar.i(5, b2Var5.mo75928xcd1e8d8());
                this.f451186h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.b2 b2Var6 = this.f451182d;
            int i18 = b2Var6 != null ? 0 + b36.f.i(1, b2Var6.mo75928xcd1e8d8()) : 0;
            r45.b2 b2Var7 = this.f451183e;
            if (b2Var7 != null) {
                i18 += b36.f.i(2, b2Var7.mo75928xcd1e8d8());
            }
            r45.b2 b2Var8 = this.f451184f;
            if (b2Var8 != null) {
                i18 += b36.f.i(3, b2Var8.mo75928xcd1e8d8());
            }
            r45.b2 b2Var9 = this.f451185g;
            if (b2Var9 != null) {
                i18 += b36.f.i(4, b2Var9.mo75928xcd1e8d8());
            }
            r45.b2 b2Var10 = this.f451186h;
            return b2Var10 != null ? i18 + b36.f.i(5, b2Var10.mo75928xcd1e8d8()) : i18;
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
        r45.a2 a2Var = (r45.a2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.b2 b2Var11 = new r45.b2();
                if (bArr != null && bArr.length > 0) {
                    b2Var11.mo11468x92b714fd(bArr);
                }
                a2Var.f451182d = b2Var11;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.b2 b2Var12 = new r45.b2();
                if (bArr2 != null && bArr2.length > 0) {
                    b2Var12.mo11468x92b714fd(bArr2);
                }
                a2Var.f451183e = b2Var12;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.b2 b2Var13 = new r45.b2();
                if (bArr3 != null && bArr3.length > 0) {
                    b2Var13.mo11468x92b714fd(bArr3);
                }
                a2Var.f451184f = b2Var13;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.b2 b2Var14 = new r45.b2();
                if (bArr4 != null && bArr4.length > 0) {
                    b2Var14.mo11468x92b714fd(bArr4);
                }
                a2Var.f451185g = b2Var14;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.b2 b2Var15 = new r45.b2();
            if (bArr5 != null && bArr5.length > 0) {
                b2Var15.mo11468x92b714fd(bArr5);
            }
            a2Var.f451186h = b2Var15;
        }
        return 0;
    }
}
