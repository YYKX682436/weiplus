package r45;

/* loaded from: classes2.dex */
public class h10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457279e;

    /* renamed from: f, reason: collision with root package name */
    public long f457280f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e90 f457281g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h10)) {
            return false;
        }
        r45.h10 h10Var = (r45.h10) fVar;
        return n51.f.a(this.f76492x92037252, h10Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457278d), java.lang.Integer.valueOf(h10Var.f457278d)) && n51.f.a(this.f457279e, h10Var.f457279e) && n51.f.a(java.lang.Long.valueOf(this.f457280f), java.lang.Long.valueOf(h10Var.f457280f)) && n51.f.a(this.f457281g, h10Var.f457281g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f457278d);
            java.lang.String str = this.f457279e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f457280f);
            r45.e90 e90Var = this.f457281g;
            if (e90Var != null) {
                fVar.i(5, e90Var.mo75928xcd1e8d8());
                this.f457281g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457278d);
            java.lang.String str2 = this.f457279e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int h17 = i18 + b36.f.h(4, this.f457280f);
            r45.e90 e90Var2 = this.f457281g;
            return e90Var2 != null ? h17 + b36.f.i(5, e90Var2.mo75928xcd1e8d8()) : h17;
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
        r45.h10 h10Var = (r45.h10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                h10Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            h10Var.f457278d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h10Var.f457279e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            h10Var.f457280f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.e90 e90Var3 = new r45.e90();
            if (bArr2 != null && bArr2.length > 0) {
                e90Var3.mo11468x92b714fd(bArr2);
            }
            h10Var.f457281g = e90Var3;
        }
        return 0;
    }
}
