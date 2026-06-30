package r45;

/* loaded from: classes11.dex */
public class gl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f456857e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456858f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ul f456859g;

    /* renamed from: i, reason: collision with root package name */
    public int f456861i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f456856d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f456860h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gl)) {
            return false;
        }
        r45.gl glVar = (r45.gl) fVar;
        return n51.f.a(this.f456856d, glVar.f456856d) && n51.f.a(java.lang.Integer.valueOf(this.f456857e), java.lang.Integer.valueOf(glVar.f456857e)) && n51.f.a(this.f456858f, glVar.f456858f) && n51.f.a(this.f456859g, glVar.f456859g) && n51.f.a(this.f456860h, glVar.f456860h) && n51.f.a(java.lang.Integer.valueOf(this.f456861i), java.lang.Integer.valueOf(glVar.f456861i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456860h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f456856d);
            fVar.e(3, this.f456857e);
            java.lang.String str = this.f456858f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.ul ulVar = this.f456859g;
            if (ulVar != null) {
                fVar.i(5, ulVar.mo75928xcd1e8d8());
                this.f456859g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f456861i);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f456856d) + 0 + b36.f.e(3, this.f456857e);
            java.lang.String str2 = this.f456858f;
            if (str2 != null) {
                g17 += b36.f.j(4, str2);
            }
            r45.ul ulVar2 = this.f456859g;
            if (ulVar2 != null) {
                g17 += b36.f.i(5, ulVar2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f456861i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456856d.clear();
            linkedList.clear();
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
        r45.gl glVar = (r45.gl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.s5 s5Var = new r45.s5();
                if (bArr2 != null && bArr2.length > 0) {
                    s5Var.mo11468x92b714fd(bArr2);
                }
                glVar.f456856d.add(s5Var);
            }
            return 0;
        }
        if (intValue == 3) {
            glVar.f456857e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            glVar.f456858f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.ul ulVar3 = new r45.ul();
                if (bArr3 != null && bArr3.length > 0) {
                    ulVar3.mo11468x92b714fd(bArr3);
                }
                glVar.f456859g = ulVar3;
            }
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            glVar.f456861i = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.s5 s5Var2 = new r45.s5();
            if (bArr4 != null && bArr4.length > 0) {
                s5Var2.mo11468x92b714fd(bArr4);
            }
            glVar.f456860h.add(s5Var2);
        }
        return 0;
    }
}
