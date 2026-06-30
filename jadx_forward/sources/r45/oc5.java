package r45;

/* loaded from: classes10.dex */
public class oc5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f463682d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f463683e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463684f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463685g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oc5)) {
            return false;
        }
        r45.oc5 oc5Var = (r45.oc5) fVar;
        return n51.f.a(this.f463682d, oc5Var.f463682d) && n51.f.a(this.f463683e, oc5Var.f463683e) && n51.f.a(this.f463684f, oc5Var.f463684f) && n51.f.a(this.f463685g, oc5Var.f463685g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463683e;
        java.util.LinkedList linkedList2 = this.f463682d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f463684f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f463685g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f463684f;
            if (str3 != null) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f463685g;
            return str4 != null ? g17 + b36.f.j(4, str4) : g17;
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
        r45.oc5 oc5Var = (r45.oc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.nc5 nc5Var = new r45.nc5();
                if (bArr2 != null && bArr2.length > 0) {
                    nc5Var.mo11468x92b714fd(bArr2);
                }
                oc5Var.f463682d.add(nc5Var);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                oc5Var.f463684f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            oc5Var.f463685g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.ny5 ny5Var = new r45.ny5();
            if (bArr3 != null && bArr3.length > 0) {
                ny5Var.mo11468x92b714fd(bArr3);
            }
            oc5Var.f463683e.add(ny5Var);
        }
        return 0;
    }
}
