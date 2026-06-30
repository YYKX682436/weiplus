package r45;

/* loaded from: classes4.dex */
public class bg7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452283d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452284e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f452285f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452286g;

    /* renamed from: h, reason: collision with root package name */
    public int f452287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452288i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bg7)) {
            return false;
        }
        r45.bg7 bg7Var = (r45.bg7) fVar;
        return n51.f.a(this.f452283d, bg7Var.f452283d) && n51.f.a(this.f452284e, bg7Var.f452284e) && n51.f.a(this.f452285f, bg7Var.f452285f) && n51.f.a(this.f452286g, bg7Var.f452286g) && n51.f.a(java.lang.Integer.valueOf(this.f452287h), java.lang.Integer.valueOf(bg7Var.f452287h)) && n51.f.a(this.f452288i, bg7Var.f452288i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452285f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452283d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452284e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f452286g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f452287h);
            java.lang.String str4 = this.f452288i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f452283d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f452284e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f452286g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            int e17 = g17 + b36.f.e(5, this.f452287h);
            java.lang.String str8 = this.f452288i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.bg7 bg7Var = (r45.bg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bg7Var.f452283d = aVar2.k(intValue);
                return 0;
            case 2:
                bg7Var.f452284e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.l25 l25Var = new r45.l25();
                    if (bArr2 != null && bArr2.length > 0) {
                        l25Var.mo11468x92b714fd(bArr2);
                    }
                    bg7Var.f452285f.add(l25Var);
                }
                return 0;
            case 4:
                bg7Var.f452286g = aVar2.k(intValue);
                return 0;
            case 5:
                bg7Var.f452287h = aVar2.g(intValue);
                return 0;
            case 6:
                bg7Var.f452288i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
