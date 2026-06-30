package r45;

/* loaded from: classes4.dex */
public class jq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459596e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f459597f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jq6)) {
            return false;
        }
        r45.jq6 jq6Var = (r45.jq6) fVar;
        return n51.f.a(this.f459595d, jq6Var.f459595d) && n51.f.a(this.f459596e, jq6Var.f459596e) && n51.f.a(this.f459597f, jq6Var.f459597f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459597f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459595d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459596e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f459595d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f459596e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, linkedList);
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
        r45.jq6 jq6Var = (r45.jq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jq6Var.f459595d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jq6Var.f459596e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.d53 d53Var = new r45.d53();
            if (bArr2 != null && bArr2.length > 0) {
                d53Var.mo11468x92b714fd(bArr2);
            }
            jq6Var.f459597f.add(d53Var);
        }
        return 0;
    }
}
