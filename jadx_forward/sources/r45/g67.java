package r45;

/* loaded from: classes4.dex */
public class g67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456463d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456464e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456465f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456466g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g67)) {
            return false;
        }
        r45.g67 g67Var = (r45.g67) fVar;
        return n51.f.a(this.f456463d, g67Var.f456463d) && n51.f.a(this.f456464e, g67Var.f456464e) && n51.f.a(this.f456465f, g67Var.f456465f) && n51.f.a(this.f456466g, g67Var.f456466g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456463d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456464e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f456465f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456466g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f456463d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456464e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f456465f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f456466g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
        r45.g67 g67Var = (r45.g67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g67Var.f456463d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            g67Var.f456464e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            g67Var.f456465f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g67Var.f456466g = aVar2.k(intValue);
        return 0;
    }
}
