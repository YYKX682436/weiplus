package r45;

/* loaded from: classes11.dex */
public class b07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451950d;

    /* renamed from: e, reason: collision with root package name */
    public int f451951e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451952f;

    /* renamed from: g, reason: collision with root package name */
    public int f451953g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f451954h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451955i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451956m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b07)) {
            return false;
        }
        r45.b07 b07Var = (r45.b07) fVar;
        return n51.f.a(this.f451950d, b07Var.f451950d) && n51.f.a(java.lang.Integer.valueOf(this.f451951e), java.lang.Integer.valueOf(b07Var.f451951e)) && n51.f.a(this.f451952f, b07Var.f451952f) && n51.f.a(java.lang.Integer.valueOf(this.f451953g), java.lang.Integer.valueOf(b07Var.f451953g)) && n51.f.a(this.f451954h, b07Var.f451954h) && n51.f.a(this.f451955i, b07Var.f451955i) && n51.f.a(this.f451956m, b07Var.f451956m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451954h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451950d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f451951e);
            java.lang.String str2 = this.f451952f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f451953g);
            fVar.g(5, 8, linkedList);
            java.lang.String str3 = this.f451955i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f451956m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f451950d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f451951e);
            java.lang.String str6 = this.f451952f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f451953g) + b36.f.g(5, 8, linkedList);
            java.lang.String str7 = this.f451955i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f451956m;
            return str8 != null ? e17 + b36.f.j(7, str8) : e17;
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
        r45.b07 b07Var = (r45.b07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b07Var.f451950d = aVar2.k(intValue);
                return 0;
            case 2:
                b07Var.f451951e = aVar2.g(intValue);
                return 0;
            case 3:
                b07Var.f451952f = aVar2.k(intValue);
                return 0;
            case 4:
                b07Var.f451953g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.b45 b45Var = new r45.b45();
                    if (bArr2 != null && bArr2.length > 0) {
                        b45Var.mo11468x92b714fd(bArr2);
                    }
                    b07Var.f451954h.add(b45Var);
                }
                return 0;
            case 6:
                b07Var.f451955i = aVar2.k(intValue);
                return 0;
            case 7:
                b07Var.f451956m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
