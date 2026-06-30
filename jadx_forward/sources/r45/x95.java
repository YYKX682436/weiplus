package r45;

/* loaded from: classes2.dex */
public class x95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471428d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471429e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471430f;

    /* renamed from: g, reason: collision with root package name */
    public int f471431g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471432h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f471433i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x95)) {
            return false;
        }
        r45.x95 x95Var = (r45.x95) fVar;
        return n51.f.a(this.f471428d, x95Var.f471428d) && n51.f.a(this.f471429e, x95Var.f471429e) && n51.f.a(this.f471430f, x95Var.f471430f) && n51.f.a(java.lang.Integer.valueOf(this.f471431g), java.lang.Integer.valueOf(x95Var.f471431g)) && n51.f.a(this.f471432h, x95Var.f471432h) && n51.f.a(this.f471433i, x95Var.f471433i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471433i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471428d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471429e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f471430f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f471431g);
            java.lang.String str4 = this.f471432h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f471428d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f471429e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f471430f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f471431g);
            java.lang.String str8 = this.f471432h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.g(6, 8, linkedList);
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
        r45.x95 x95Var = (r45.x95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x95Var.f471428d = aVar2.k(intValue);
                return 0;
            case 2:
                x95Var.f471429e = aVar2.k(intValue);
                return 0;
            case 3:
                x95Var.f471430f = aVar2.k(intValue);
                return 0;
            case 4:
                x95Var.f471431g = aVar2.g(intValue);
                return 0;
            case 5:
                x95Var.f471432h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.y95 y95Var = new r45.y95();
                    if (bArr2 != null && bArr2.length > 0) {
                        y95Var.mo11468x92b714fd(bArr2);
                    }
                    x95Var.f471433i.add(y95Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
