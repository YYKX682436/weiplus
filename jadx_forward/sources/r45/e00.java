package r45;

/* loaded from: classes2.dex */
public class e00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454419d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454420e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454421f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f454422g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e00)) {
            return false;
        }
        r45.e00 e00Var = (r45.e00) fVar;
        return n51.f.a(this.f454419d, e00Var.f454419d) && n51.f.a(this.f454420e, e00Var.f454420e) && n51.f.a(this.f454421f, e00Var.f454421f) && n51.f.a(java.lang.Boolean.valueOf(this.f454422g), java.lang.Boolean.valueOf(e00Var.f454422g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454419d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454420e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454421f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f454422g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454419d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f454420e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f454421f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.a(4, this.f454422g);
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
        r45.e00 e00Var = (r45.e00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e00Var.f454419d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e00Var.f454420e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e00Var.f454421f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e00Var.f454422g = aVar2.c(intValue);
        return 0;
    }
}
