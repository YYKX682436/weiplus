package r45;

/* loaded from: classes8.dex */
public class gh4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456779d;

    /* renamed from: e, reason: collision with root package name */
    public int f456780e;

    /* renamed from: f, reason: collision with root package name */
    public int f456781f;

    /* renamed from: g, reason: collision with root package name */
    public int f456782g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456783h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f456784i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gh4)) {
            return false;
        }
        r45.gh4 gh4Var = (r45.gh4) fVar;
        return n51.f.a(this.f76492x92037252, gh4Var.f76492x92037252) && n51.f.a(this.f456779d, gh4Var.f456779d) && n51.f.a(java.lang.Integer.valueOf(this.f456780e), java.lang.Integer.valueOf(gh4Var.f456780e)) && n51.f.a(java.lang.Integer.valueOf(this.f456781f), java.lang.Integer.valueOf(gh4Var.f456781f)) && n51.f.a(java.lang.Integer.valueOf(this.f456782g), java.lang.Integer.valueOf(gh4Var.f456782g)) && n51.f.a(this.f456783h, gh4Var.f456783h) && n51.f.a(this.f456784i, gh4Var.f456784i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456784i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456779d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f456780e);
            fVar.e(4, this.f456781f);
            fVar.e(5, this.f456782g);
            java.lang.String str2 = this.f456783h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f456779d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f456780e) + b36.f.e(4, this.f456781f) + b36.f.e(5, this.f456782g);
            java.lang.String str4 = this.f456783h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.g(7, 8, linkedList);
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
        r45.gh4 gh4Var = (r45.gh4) objArr[1];
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
                    gh4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                gh4Var.f456779d = aVar2.k(intValue);
                return 0;
            case 3:
                gh4Var.f456780e = aVar2.g(intValue);
                return 0;
            case 4:
                gh4Var.f456781f = aVar2.g(intValue);
                return 0;
            case 5:
                gh4Var.f456782g = aVar2.g(intValue);
                return 0;
            case 6:
                gh4Var.f456783h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.eh4 eh4Var = new r45.eh4();
                    if (bArr3 != null && bArr3.length > 0) {
                        eh4Var.mo11468x92b714fd(bArr3);
                    }
                    gh4Var.f456784i.add(eh4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
