package r45;

/* loaded from: classes9.dex */
public class ik extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f458635d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f458636e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458637f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458638g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ik)) {
            return false;
        }
        r45.ik ikVar = (r45.ik) fVar;
        return n51.f.a(this.f458635d, ikVar.f458635d) && n51.f.a(this.f458636e, ikVar.f458636e) && n51.f.a(this.f458637f, ikVar.f458637f) && n51.f.a(this.f458638g, ikVar.f458638g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(15, 8, this.f458635d);
            fVar.g(17, 1, this.f458636e);
            java.lang.String str = this.f458637f;
            if (str != null) {
                fVar.j(18, str);
            }
            java.lang.String str2 = this.f458638g;
            if (str2 != null) {
                fVar.j(19, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(15, 8, this.f458635d) + 0 + b36.f.g(17, 1, this.f458636e);
            java.lang.String str3 = this.f458637f;
            if (str3 != null) {
                g17 += b36.f.j(18, str3);
            }
            java.lang.String str4 = this.f458638g;
            return str4 != null ? g17 + b36.f.j(19, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458635d.clear();
            this.f458636e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ik ikVar = (r45.ik) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.d67 d67Var = new r45.d67();
                    if (bArr2 != null && bArr2.length > 0) {
                        d67Var.mo11468x92b714fd(bArr2);
                    }
                    ikVar.f458635d.add(d67Var);
                }
                return 0;
            case 16:
            default:
                return -1;
            case 17:
                ikVar.f458636e.add(aVar2.k(intValue));
                return 0;
            case 18:
                ikVar.f458637f = aVar2.k(intValue);
                return 0;
            case 19:
                ikVar.f458638g = aVar2.k(intValue);
                return 0;
        }
    }
}
