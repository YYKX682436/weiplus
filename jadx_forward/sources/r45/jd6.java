package r45;

/* loaded from: classes7.dex */
public class jd6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.id6 f459259d;

    /* renamed from: e, reason: collision with root package name */
    public r45.id6 f459260e;

    /* renamed from: f, reason: collision with root package name */
    public r45.id6 f459261f;

    /* renamed from: g, reason: collision with root package name */
    public int f459262g;

    /* renamed from: h, reason: collision with root package name */
    public int f459263h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jd6)) {
            return false;
        }
        r45.jd6 jd6Var = (r45.jd6) fVar;
        return n51.f.a(this.f459259d, jd6Var.f459259d) && n51.f.a(this.f459260e, jd6Var.f459260e) && n51.f.a(this.f459261f, jd6Var.f459261f) && n51.f.a(java.lang.Integer.valueOf(this.f459262g), java.lang.Integer.valueOf(jd6Var.f459262g)) && n51.f.a(java.lang.Integer.valueOf(this.f459263h), java.lang.Integer.valueOf(jd6Var.f459263h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.id6 id6Var = this.f459259d;
            if (id6Var != null) {
                fVar.i(1, id6Var.mo75928xcd1e8d8());
                this.f459259d.mo75956x3d5d1f78(fVar);
            }
            r45.id6 id6Var2 = this.f459260e;
            if (id6Var2 != null) {
                fVar.i(2, id6Var2.mo75928xcd1e8d8());
                this.f459260e.mo75956x3d5d1f78(fVar);
            }
            r45.id6 id6Var3 = this.f459261f;
            if (id6Var3 != null) {
                fVar.i(3, id6Var3.mo75928xcd1e8d8());
                this.f459261f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f459262g);
            fVar.e(5, this.f459263h);
            return 0;
        }
        if (i17 == 1) {
            r45.id6 id6Var4 = this.f459259d;
            int i18 = id6Var4 != null ? 0 + b36.f.i(1, id6Var4.mo75928xcd1e8d8()) : 0;
            r45.id6 id6Var5 = this.f459260e;
            if (id6Var5 != null) {
                i18 += b36.f.i(2, id6Var5.mo75928xcd1e8d8());
            }
            r45.id6 id6Var6 = this.f459261f;
            if (id6Var6 != null) {
                i18 += b36.f.i(3, id6Var6.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(4, this.f459262g) + b36.f.e(5, this.f459263h);
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
        r45.jd6 jd6Var = (r45.jd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.id6 id6Var7 = new r45.id6();
                if (bArr != null && bArr.length > 0) {
                    id6Var7.mo11468x92b714fd(bArr);
                }
                jd6Var.f459259d = id6Var7;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.id6 id6Var8 = new r45.id6();
                if (bArr2 != null && bArr2.length > 0) {
                    id6Var8.mo11468x92b714fd(bArr2);
                }
                jd6Var.f459260e = id6Var8;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                jd6Var.f459262g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            jd6Var.f459263h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.id6 id6Var9 = new r45.id6();
            if (bArr3 != null && bArr3.length > 0) {
                id6Var9.mo11468x92b714fd(bArr3);
            }
            jd6Var.f459261f = id6Var9;
        }
        return 0;
    }
}
