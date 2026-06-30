package r45;

/* loaded from: classes8.dex */
public class vf5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469720d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jv3 f469721e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o90 f469722f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ln f469723g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vf5)) {
            return false;
        }
        r45.vf5 vf5Var = (r45.vf5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469720d), java.lang.Integer.valueOf(vf5Var.f469720d)) && n51.f.a(this.f469721e, vf5Var.f469721e) && n51.f.a(this.f469722f, vf5Var.f469722f) && n51.f.a(this.f469723g, vf5Var.f469723g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469720d);
            r45.jv3 jv3Var = this.f469721e;
            if (jv3Var != null) {
                fVar.i(2, jv3Var.mo75928xcd1e8d8());
                this.f469721e.mo75956x3d5d1f78(fVar);
            }
            r45.o90 o90Var = this.f469722f;
            if (o90Var != null) {
                fVar.i(3, o90Var.mo75928xcd1e8d8());
                this.f469722f.mo75956x3d5d1f78(fVar);
            }
            r45.ln lnVar = this.f469723g;
            if (lnVar != null) {
                fVar.i(4, lnVar.mo75928xcd1e8d8());
                this.f469723g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469720d) + 0;
            r45.jv3 jv3Var2 = this.f469721e;
            if (jv3Var2 != null) {
                e17 += b36.f.i(2, jv3Var2.mo75928xcd1e8d8());
            }
            r45.o90 o90Var2 = this.f469722f;
            if (o90Var2 != null) {
                e17 += b36.f.i(3, o90Var2.mo75928xcd1e8d8());
            }
            r45.ln lnVar2 = this.f469723g;
            return lnVar2 != null ? e17 + b36.f.i(4, lnVar2.mo75928xcd1e8d8()) : e17;
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
        r45.vf5 vf5Var = (r45.vf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vf5Var.f469720d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.jv3 jv3Var3 = new r45.jv3();
                if (bArr != null && bArr.length > 0) {
                    jv3Var3.mo11468x92b714fd(bArr);
                }
                vf5Var.f469721e = jv3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.o90 o90Var3 = new r45.o90();
                if (bArr2 != null && bArr2.length > 0) {
                    o90Var3.mo11468x92b714fd(bArr2);
                }
                vf5Var.f469722f = o90Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.ln lnVar3 = new r45.ln();
            if (bArr3 != null && bArr3.length > 0) {
                lnVar3.mo11468x92b714fd(bArr3);
            }
            vf5Var.f469723g = lnVar3;
        }
        return 0;
    }
}
