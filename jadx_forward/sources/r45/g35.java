package r45;

/* loaded from: classes11.dex */
public class g35 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j35 f456386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456387e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456388f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456389g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f456390h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f456391i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g35)) {
            return false;
        }
        r45.g35 g35Var = (r45.g35) fVar;
        return n51.f.a(this.f76492x92037252, g35Var.f76492x92037252) && n51.f.a(this.f456386d, g35Var.f456386d) && n51.f.a(this.f456387e, g35Var.f456387e) && n51.f.a(this.f456388f, g35Var.f456388f) && n51.f.a(this.f456389g, g35Var.f456389g) && n51.f.a(this.f456390h, g35Var.f456390h) && n51.f.a(java.lang.Integer.valueOf(this.f456391i), java.lang.Integer.valueOf(g35Var.f456391i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456390h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.j35 j35Var = this.f456386d;
            if (j35Var != null) {
                fVar.i(2, j35Var.mo75928xcd1e8d8());
                this.f456386d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456387e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f456388f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f456389g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f456391i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j35 j35Var2 = this.f456386d;
            if (j35Var2 != null) {
                i18 += b36.f.i(2, j35Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f456387e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f456388f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f456389g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f456391i);
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
        r45.g35 g35Var = (r45.g35) objArr[1];
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
                    g35Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j35 j35Var3 = new r45.j35();
                    if (bArr3 != null && bArr3.length > 0) {
                        j35Var3.mo11468x92b714fd(bArr3);
                    }
                    g35Var.f456386d = j35Var3;
                }
                return 0;
            case 3:
                g35Var.f456387e = aVar2.k(intValue);
                return 0;
            case 4:
                g35Var.f456388f = aVar2.k(intValue);
                return 0;
            case 5:
                g35Var.f456389g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.g35 g35Var2 = new r45.g35();
                    if (bArr4 != null && bArr4.length > 0) {
                        g35Var2.mo11468x92b714fd(bArr4);
                    }
                    g35Var.f456390h.add(g35Var2);
                }
                return 0;
            case 7:
                g35Var.f456391i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
