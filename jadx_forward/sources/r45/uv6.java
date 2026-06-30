package r45;

/* loaded from: classes4.dex */
public class uv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469219d;

    /* renamed from: e, reason: collision with root package name */
    public int f469220e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469221f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469222g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469223h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469224i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f469225m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv6)) {
            return false;
        }
        r45.uv6 uv6Var = (r45.uv6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469219d), java.lang.Integer.valueOf(uv6Var.f469219d)) && n51.f.a(java.lang.Integer.valueOf(this.f469220e), java.lang.Integer.valueOf(uv6Var.f469220e)) && n51.f.a(this.f469221f, uv6Var.f469221f) && n51.f.a(this.f469222g, uv6Var.f469222g) && n51.f.a(this.f469223h, uv6Var.f469223h) && n51.f.a(this.f469224i, uv6Var.f469224i) && n51.f.a(this.f469225m, uv6Var.f469225m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469225m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469219d);
            fVar.e(2, this.f469220e);
            java.lang.String str = this.f469221f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f469222g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f469223h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f469224i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469219d) + 0 + b36.f.e(2, this.f469220e);
            java.lang.String str5 = this.f469221f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f469222g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f469223h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f469224i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
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
        r45.uv6 uv6Var = (r45.uv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uv6Var.f469219d = aVar2.g(intValue);
                return 0;
            case 2:
                uv6Var.f469220e = aVar2.g(intValue);
                return 0;
            case 3:
                uv6Var.f469221f = aVar2.k(intValue);
                return 0;
            case 4:
                uv6Var.f469222g = aVar2.k(intValue);
                return 0;
            case 5:
                uv6Var.f469223h = aVar2.k(intValue);
                return 0;
            case 6:
                uv6Var.f469224i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mv mvVar = new r45.mv();
                    if (bArr2 != null && bArr2.length > 0) {
                        mvVar.mo11468x92b714fd(bArr2);
                    }
                    uv6Var.f469225m.add(mvVar);
                }
                return 0;
            default:
                return -1;
        }
    }
}
