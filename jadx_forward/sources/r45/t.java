package r45;

/* loaded from: classes2.dex */
public class t extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467573e;

    /* renamed from: f, reason: collision with root package name */
    public int f467574f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f467575g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t)) {
            return false;
        }
        r45.t tVar = (r45.t) fVar;
        return n51.f.a(this.f467572d, tVar.f467572d) && n51.f.a(this.f467573e, tVar.f467573e) && n51.f.a(java.lang.Integer.valueOf(this.f467574f), java.lang.Integer.valueOf(tVar.f467574f)) && n51.f.a(this.f467575g, tVar.f467575g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467575g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467572d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467573e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f467574f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467572d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f467573e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f467574f) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.t tVar = (r45.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tVar.f467572d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tVar.f467573e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tVar.f467574f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.b0 b0Var = new r45.b0();
            if (bArr2 != null && bArr2.length > 0) {
                b0Var.mo11468x92b714fd(bArr2);
            }
            tVar.f467575g.add(b0Var);
        }
        return 0;
    }
}
