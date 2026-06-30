package r45;

/* loaded from: classes4.dex */
public class zm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f473735e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f473736f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473737g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473738h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473739i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zm)) {
            return false;
        }
        r45.zm zmVar = (r45.zm) fVar;
        return n51.f.a(this.f473734d, zmVar.f473734d) && n51.f.a(this.f473735e, zmVar.f473735e) && n51.f.a(java.lang.Integer.valueOf(this.f473736f), java.lang.Integer.valueOf(zmVar.f473736f)) && n51.f.a(this.f473737g, zmVar.f473737g) && n51.f.a(this.f473738h, zmVar.f473738h) && n51.f.a(this.f473739i, zmVar.f473739i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473735e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473734d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f473736f);
            java.lang.String str2 = this.f473737g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f473738h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f473739i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f473734d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f473736f);
            java.lang.String str6 = this.f473737g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f473738h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f473739i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.zm zmVar = (r45.zm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zmVar.f473734d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.fl flVar = new r45.fl();
                    if (bArr2 != null && bArr2.length > 0) {
                        flVar.mo11468x92b714fd(bArr2);
                    }
                    zmVar.f473735e.add(flVar);
                }
                return 0;
            case 3:
                zmVar.f473736f = aVar2.g(intValue);
                return 0;
            case 4:
                zmVar.f473737g = aVar2.k(intValue);
                return 0;
            case 5:
                zmVar.f473738h = aVar2.k(intValue);
                return 0;
            case 6:
                zmVar.f473739i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
