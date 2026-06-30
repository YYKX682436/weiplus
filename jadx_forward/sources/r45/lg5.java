package r45;

/* loaded from: classes2.dex */
public class lg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f460990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460991e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460992f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f460993g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public r45.ka5 f460994h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460995i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lg5)) {
            return false;
        }
        r45.lg5 lg5Var = (r45.lg5) fVar;
        return n51.f.a(this.f76492x92037252, lg5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f460990d), java.lang.Integer.valueOf(lg5Var.f460990d)) && n51.f.a(this.f460991e, lg5Var.f460991e) && n51.f.a(this.f460992f, lg5Var.f460992f) && n51.f.a(this.f460993g, lg5Var.f460993g) && n51.f.a(this.f460994h, lg5Var.f460994h) && n51.f.a(this.f460995i, lg5Var.f460995i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460993g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f460990d);
            java.lang.String str = this.f460991e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f460992f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            r45.ka5 ka5Var = this.f460994h;
            if (ka5Var != null) {
                fVar.i(6, ka5Var.mo75928xcd1e8d8());
                this.f460994h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f460995i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460990d);
            java.lang.String str4 = this.f460991e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f460992f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            r45.ka5 ka5Var2 = this.f460994h;
            if (ka5Var2 != null) {
                g17 += b36.f.i(6, ka5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f460995i;
            return str6 != null ? g17 + b36.f.j(7, str6) : g17;
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
        r45.lg5 lg5Var = (r45.lg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    lg5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lg5Var.f460990d = aVar2.g(intValue);
                return 0;
            case 3:
                lg5Var.f460991e = aVar2.k(intValue);
                return 0;
            case 4:
                lg5Var.f460992f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.od odVar = new r45.od();
                    if (bArr3 != null && bArr3.length > 0) {
                        odVar.mo11468x92b714fd(bArr3);
                    }
                    lg5Var.f460993g.add(odVar);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ka5 ka5Var3 = new r45.ka5();
                    if (bArr4 != null && bArr4.length > 0) {
                        ka5Var3.mo11468x92b714fd(bArr4);
                    }
                    lg5Var.f460994h = ka5Var3;
                }
                return 0;
            case 7:
                lg5Var.f460995i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
