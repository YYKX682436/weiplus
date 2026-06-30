package r45;

/* loaded from: classes9.dex */
public class rc3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qw f466256d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466257e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466258f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f466259g;

    /* renamed from: h, reason: collision with root package name */
    public int f466260h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rc3)) {
            return false;
        }
        r45.rc3 rc3Var = (r45.rc3) fVar;
        return n51.f.a(this.f466256d, rc3Var.f466256d) && n51.f.a(this.f466257e, rc3Var.f466257e) && n51.f.a(this.f466258f, rc3Var.f466258f) && n51.f.a(java.lang.Boolean.valueOf(this.f466259g), java.lang.Boolean.valueOf(rc3Var.f466259g)) && n51.f.a(java.lang.Integer.valueOf(this.f466260h), java.lang.Integer.valueOf(rc3Var.f466260h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qw qwVar = this.f466256d;
            if (qwVar != null) {
                fVar.i(1, qwVar.mo75928xcd1e8d8());
                this.f466256d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f466257e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466258f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f466259g);
            fVar.e(5, this.f466260h);
            return 0;
        }
        if (i17 == 1) {
            r45.qw qwVar2 = this.f466256d;
            int i18 = qwVar2 != null ? 0 + b36.f.i(1, qwVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f466257e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f466258f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.a(4, this.f466259g) + b36.f.e(5, this.f466260h);
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
        r45.rc3 rc3Var = (r45.rc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.qw qwVar3 = new r45.qw();
                if (bArr != null && bArr.length > 0) {
                    qwVar3.mo11468x92b714fd(bArr);
                }
                rc3Var.f466256d = qwVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rc3Var.f466257e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rc3Var.f466258f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            rc3Var.f466259g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rc3Var.f466260h = aVar2.g(intValue);
        return 0;
    }
}
