package r45;

/* loaded from: classes15.dex */
public class t53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467685d;

    /* renamed from: e, reason: collision with root package name */
    public long f467686e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f467687f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f467688g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f467689h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t53)) {
            return false;
        }
        r45.t53 t53Var = (r45.t53) fVar;
        return n51.f.a(this.f467685d, t53Var.f467685d) && n51.f.a(java.lang.Long.valueOf(this.f467686e), java.lang.Long.valueOf(t53Var.f467686e)) && n51.f.a(java.lang.Long.valueOf(this.f467687f), java.lang.Long.valueOf(t53Var.f467687f)) && n51.f.a(this.f467688g, t53Var.f467688g) && n51.f.a(this.f467689h, t53Var.f467689h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467689h;
        java.util.LinkedList linkedList2 = this.f467688g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467685d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f467686e);
            fVar.h(3, this.f467687f);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f467685d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f467686e) + b36.f.h(3, this.f467687f) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.t53 t53Var = (r45.t53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t53Var.f467685d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            t53Var.f467686e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            t53Var.f467687f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.kw3 kw3Var = new r45.kw3();
                if (bArr2 != null && bArr2.length > 0) {
                    kw3Var.mo11468x92b714fd(bArr2);
                }
                t53Var.f467688g.add(kw3Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.a07 a07Var = new r45.a07();
            if (bArr3 != null && bArr3.length > 0) {
                a07Var.mo11468x92b714fd(bArr3);
            }
            t53Var.f467689h.add(a07Var);
        }
        return 0;
    }
}
