package r45;

/* loaded from: classes2.dex */
public class cq2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f453317d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453319f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cq2)) {
            return false;
        }
        r45.cq2 cq2Var = (r45.cq2) fVar;
        return n51.f.a(this.f453317d, cq2Var.f453317d) && n51.f.a(this.f453318e, cq2Var.f453318e) && n51.f.a(this.f453319f, cq2Var.f453319f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453317d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f453318e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453319f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str3 = this.f453318e;
            if (str3 != null) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f453319f;
            return str4 != null ? g17 + b36.f.j(3, str4) : g17;
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
        r45.cq2 cq2Var = (r45.cq2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                cq2Var.f453318e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            cq2Var.f453319f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.bq2 bq2Var = new r45.bq2();
            if (bArr2 != null && bArr2.length > 0) {
                bq2Var.mo11468x92b714fd(bArr2);
            }
            cq2Var.f453317d.add(bq2Var);
        }
        return 0;
    }
}
