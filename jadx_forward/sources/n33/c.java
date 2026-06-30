package n33;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f416017d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f416018e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f416019f;

    /* renamed from: g, reason: collision with root package name */
    public long f416020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f416021h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f416022i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f416023m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f416024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f416025o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n33.c)) {
            return false;
        }
        n33.c cVar = (n33.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f416017d), java.lang.Long.valueOf(cVar.f416017d)) && n51.f.a(java.lang.Boolean.valueOf(this.f416018e), java.lang.Boolean.valueOf(cVar.f416018e)) && n51.f.a(this.f416019f, cVar.f416019f) && n51.f.a(java.lang.Long.valueOf(this.f416020g), java.lang.Long.valueOf(cVar.f416020g)) && n51.f.a(this.f416021h, cVar.f416021h) && n51.f.a(this.f416022i, cVar.f416022i) && n51.f.a(this.f416023m, cVar.f416023m) && n51.f.a(this.f416024n, cVar.f416024n) && n51.f.a(this.f416025o, cVar.f416025o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f416017d);
            fVar.a(2, this.f416018e);
            java.lang.String str = this.f416019f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f416020g);
            java.lang.String str2 = this.f416021h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f416022i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f416023m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f416024n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f416025o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f416017d) + 0 + b36.f.a(2, this.f416018e);
            java.lang.String str7 = this.f416019f;
            if (str7 != null) {
                h17 += b36.f.j(3, str7);
            }
            int h18 = h17 + b36.f.h(4, this.f416020g);
            java.lang.String str8 = this.f416021h;
            if (str8 != null) {
                h18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f416022i;
            if (str9 != null) {
                h18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f416023m;
            if (str10 != null) {
                h18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f416024n;
            if (str11 != null) {
                h18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f416025o;
            return str12 != null ? h18 + b36.f.j(9, str12) : h18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        n33.c cVar = (n33.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f416017d = aVar2.i(intValue);
                return 0;
            case 2:
                cVar.f416018e = aVar2.c(intValue);
                return 0;
            case 3:
                cVar.f416019f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f416020g = aVar2.i(intValue);
                return 0;
            case 5:
                cVar.f416021h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f416022i = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f416023m = aVar2.k(intValue);
                return 0;
            case 8:
                cVar.f416024n = aVar2.k(intValue);
                return 0;
            case 9:
                cVar.f416025o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
