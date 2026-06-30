package ot0;

/* loaded from: classes8.dex */
public class m0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f430109d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f430110e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430111f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430112g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f430113h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f430114i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f430115m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.m0)) {
            return false;
        }
        ot0.m0 m0Var = (ot0.m0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f430109d), java.lang.Integer.valueOf(m0Var.f430109d)) && n51.f.a(this.f430110e, m0Var.f430110e) && n51.f.a(this.f430111f, m0Var.f430111f) && n51.f.a(this.f430112g, m0Var.f430112g) && n51.f.a(this.f430113h, m0Var.f430113h) && n51.f.a(this.f430114i, m0Var.f430114i) && n51.f.a(java.lang.Integer.valueOf(this.f430115m), java.lang.Integer.valueOf(m0Var.f430115m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f430114i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f430109d);
            java.lang.String str = this.f430110e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f430111f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f430112g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f430113h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f430115m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f430109d) + 0;
            java.lang.String str5 = this.f430110e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f430111f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f430112g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f430113h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f430115m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ot0.m0 m0Var = (ot0.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m0Var.f430109d = aVar2.g(intValue);
                return 0;
            case 2:
                m0Var.f430110e = aVar2.k(intValue);
                return 0;
            case 3:
                m0Var.f430111f = aVar2.k(intValue);
                return 0;
            case 4:
                m0Var.f430112g = aVar2.k(intValue);
                return 0;
            case 5:
                m0Var.f430113h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ot0.s0 s0Var = new ot0.s0();
                    if (bArr2 != null && bArr2.length > 0) {
                        s0Var.mo11468x92b714fd(bArr2);
                    }
                    m0Var.f430114i.add(s0Var);
                }
                return 0;
            case 7:
                m0Var.f430115m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
