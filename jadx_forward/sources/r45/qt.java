package r45;

/* loaded from: classes8.dex */
public class qt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f465782d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465783e;

    /* renamed from: f, reason: collision with root package name */
    public int f465784f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465785g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465786h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qt)) {
            return false;
        }
        r45.qt qtVar = (r45.qt) fVar;
        return n51.f.a(this.f465782d, qtVar.f465782d) && n51.f.a(this.f465783e, qtVar.f465783e) && n51.f.a(java.lang.Integer.valueOf(this.f465784f), java.lang.Integer.valueOf(qtVar.f465784f)) && n51.f.a(this.f465785g, qtVar.f465785g) && n51.f.a(this.f465786h, qtVar.f465786h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f465782d);
            java.lang.String str = this.f465783e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f465784f);
            java.lang.String str2 = this.f465785g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465786h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f465782d) + 0;
            java.lang.String str4 = this.f465783e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            int e17 = g17 + b36.f.e(3, this.f465784f);
            java.lang.String str5 = this.f465785g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f465786h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465782d.clear();
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
        r45.qt qtVar = (r45.qt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.s90 s90Var = new r45.s90();
                if (bArr2 != null && bArr2.length > 0) {
                    s90Var.mo11468x92b714fd(bArr2);
                }
                qtVar.f465782d.add(s90Var);
            }
            return 0;
        }
        if (intValue == 2) {
            qtVar.f465783e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            qtVar.f465784f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            qtVar.f465785g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qtVar.f465786h = aVar2.k(intValue);
        return 0;
    }
}
