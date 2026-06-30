package r45;

/* loaded from: classes2.dex */
public class us4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f469146d;

    /* renamed from: e, reason: collision with root package name */
    public long f469147e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469148f;

    /* renamed from: g, reason: collision with root package name */
    public long f469149g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469150h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f469151i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f469152m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469153n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.us4)) {
            return false;
        }
        r45.us4 us4Var = (r45.us4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f469146d), java.lang.Long.valueOf(us4Var.f469146d)) && n51.f.a(java.lang.Long.valueOf(this.f469147e), java.lang.Long.valueOf(us4Var.f469147e)) && n51.f.a(this.f469148f, us4Var.f469148f) && n51.f.a(java.lang.Long.valueOf(this.f469149g), java.lang.Long.valueOf(us4Var.f469149g)) && n51.f.a(this.f469150h, us4Var.f469150h) && n51.f.a(this.f469151i, us4Var.f469151i) && n51.f.a(this.f469152m, us4Var.f469152m) && n51.f.a(this.f469153n, us4Var.f469153n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469152m;
        java.util.LinkedList linkedList2 = this.f469151i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f469146d);
            fVar.h(2, this.f469147e);
            java.lang.String str = this.f469148f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f469149g);
            java.lang.String str2 = this.f469150h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, linkedList2);
            fVar.g(7, 8, linkedList);
            java.lang.String str3 = this.f469153n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f469146d) + 0 + b36.f.h(2, this.f469147e);
            java.lang.String str4 = this.f469148f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int h18 = h17 + b36.f.h(4, this.f469149g);
            java.lang.String str5 = this.f469150h;
            if (str5 != null) {
                h18 += b36.f.j(5, str5);
            }
            int g17 = h18 + b36.f.g(6, 1, linkedList2) + b36.f.g(7, 8, linkedList);
            java.lang.String str6 = this.f469153n;
            return str6 != null ? g17 + b36.f.j(8, str6) : g17;
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
        r45.us4 us4Var = (r45.us4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                us4Var.f469146d = aVar2.i(intValue);
                return 0;
            case 2:
                us4Var.f469147e = aVar2.i(intValue);
                return 0;
            case 3:
                us4Var.f469148f = aVar2.k(intValue);
                return 0;
            case 4:
                us4Var.f469149g = aVar2.i(intValue);
                return 0;
            case 5:
                us4Var.f469150h = aVar2.k(intValue);
                return 0;
            case 6:
                us4Var.f469151i.add(aVar2.k(intValue));
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nh4 nh4Var = new r45.nh4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nh4Var.mo11468x92b714fd(bArr2);
                    }
                    us4Var.f469152m.add(nh4Var);
                }
                return 0;
            case 8:
                us4Var.f469153n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
