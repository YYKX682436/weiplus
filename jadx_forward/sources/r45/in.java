package r45;

/* loaded from: classes7.dex */
public class in extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458690e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f458691f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in)) {
            return false;
        }
        r45.in inVar = (r45.in) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458689d), java.lang.Integer.valueOf(inVar.f458689d)) && n51.f.a(this.f458690e, inVar.f458690e) && n51.f.a(this.f458691f, inVar.f458691f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458691f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458689d);
            java.lang.String str = this.f458690e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458689d) + 0;
            java.lang.String str2 = this.f458690e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
        r45.in inVar = (r45.in) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            inVar.f458689d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            inVar.f458690e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ch6 ch6Var = new r45.ch6();
            if (bArr2 != null && bArr2.length > 0) {
                ch6Var.mo11468x92b714fd(bArr2);
            }
            inVar.f458691f.add(ch6Var);
        }
        return 0;
    }
}
