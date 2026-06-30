package r45;

/* loaded from: classes8.dex */
public class q07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465074d;

    /* renamed from: e, reason: collision with root package name */
    public long f465075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465077g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465078h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465079i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f465080m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465081n;

    /* renamed from: o, reason: collision with root package name */
    public long f465082o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q07)) {
            return false;
        }
        r45.q07 q07Var = (r45.q07) fVar;
        return n51.f.a(this.f465074d, q07Var.f465074d) && n51.f.a(java.lang.Long.valueOf(this.f465075e), java.lang.Long.valueOf(q07Var.f465075e)) && n51.f.a(this.f465076f, q07Var.f465076f) && n51.f.a(this.f465077g, q07Var.f465077g) && n51.f.a(this.f465078h, q07Var.f465078h) && n51.f.a(this.f465079i, q07Var.f465079i) && n51.f.a(this.f465080m, q07Var.f465080m) && n51.f.a(this.f465081n, q07Var.f465081n) && n51.f.a(java.lang.Long.valueOf(this.f465082o), java.lang.Long.valueOf(q07Var.f465082o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465080m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465074d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f465075e);
            java.lang.String str2 = this.f465076f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f465077g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f465078h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465079i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str5 = this.f465081n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.h(9, this.f465082o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f465074d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.h(2, this.f465075e);
            java.lang.String str7 = this.f465076f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f465077g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f465078h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465079i;
            if (gVar2 != null) {
                j17 += b36.f.b(6, gVar2);
            }
            int g17 = j17 + b36.f.g(7, 8, linkedList);
            java.lang.String str10 = this.f465081n;
            if (str10 != null) {
                g17 += b36.f.j(8, str10);
            }
            return g17 + b36.f.h(9, this.f465082o);
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
        r45.q07 q07Var = (r45.q07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q07Var.f465074d = aVar2.k(intValue);
                return 0;
            case 2:
                q07Var.f465075e = aVar2.i(intValue);
                return 0;
            case 3:
                q07Var.f465076f = aVar2.k(intValue);
                return 0;
            case 4:
                q07Var.f465077g = aVar2.k(intValue);
                return 0;
            case 5:
                q07Var.f465078h = aVar2.k(intValue);
                return 0;
            case 6:
                q07Var.f465079i = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.y07 y07Var = new r45.y07();
                    if (bArr2 != null && bArr2.length > 0) {
                        y07Var.mo11468x92b714fd(bArr2);
                    }
                    q07Var.f465080m.add(y07Var);
                }
                return 0;
            case 8:
                q07Var.f465081n = aVar2.k(intValue);
                return 0;
            case 9:
                q07Var.f465082o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
