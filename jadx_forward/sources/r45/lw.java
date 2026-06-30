package r45;

/* loaded from: classes8.dex */
public class lw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461401d;

    /* renamed from: e, reason: collision with root package name */
    public int f461402e;

    /* renamed from: f, reason: collision with root package name */
    public int f461403f;

    /* renamed from: g, reason: collision with root package name */
    public long f461404g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461405h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461406i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461407m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461408n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lw)) {
            return false;
        }
        r45.lw lwVar = (r45.lw) fVar;
        return n51.f.a(this.f76492x92037252, lwVar.f76492x92037252) && n51.f.a(this.f461401d, lwVar.f461401d) && n51.f.a(java.lang.Integer.valueOf(this.f461402e), java.lang.Integer.valueOf(lwVar.f461402e)) && n51.f.a(java.lang.Integer.valueOf(this.f461403f), java.lang.Integer.valueOf(lwVar.f461403f)) && n51.f.a(java.lang.Long.valueOf(this.f461404g), java.lang.Long.valueOf(lwVar.f461404g)) && n51.f.a(this.f461405h, lwVar.f461405h) && n51.f.a(this.f461406i, lwVar.f461406i) && n51.f.a(java.lang.Boolean.valueOf(this.f461407m), java.lang.Boolean.valueOf(lwVar.f461407m)) && n51.f.a(this.f461408n, lwVar.f461408n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461401d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f461402e);
            fVar.e(4, this.f461403f);
            fVar.h(5, this.f461404g);
            java.lang.String str2 = this.f461405h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461406i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.a(8, this.f461407m);
            java.lang.String str3 = this.f461408n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f461401d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f461402e) + b36.f.e(4, this.f461403f) + b36.f.h(5, this.f461404g);
            java.lang.String str5 = this.f461405h;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461406i;
            if (gVar2 != null) {
                e17 += b36.f.b(7, gVar2);
            }
            int a17 = e17 + b36.f.a(8, this.f461407m);
            java.lang.String str6 = this.f461408n;
            return str6 != null ? a17 + b36.f.j(9, str6) : a17;
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
        r45.lw lwVar = (r45.lw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    lwVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lwVar.f461401d = aVar2.k(intValue);
                return 0;
            case 3:
                lwVar.f461402e = aVar2.g(intValue);
                return 0;
            case 4:
                lwVar.f461403f = aVar2.g(intValue);
                return 0;
            case 5:
                lwVar.f461404g = aVar2.i(intValue);
                return 0;
            case 6:
                lwVar.f461405h = aVar2.k(intValue);
                return 0;
            case 7:
                lwVar.f461406i = aVar2.d(intValue);
                return 0;
            case 8:
                lwVar.f461407m = aVar2.c(intValue);
                return 0;
            case 9:
                lwVar.f461408n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
