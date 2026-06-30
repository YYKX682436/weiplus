package p33;

/* loaded from: classes4.dex */
public class q extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f433164d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433165e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433166f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f433167g;

    /* renamed from: h, reason: collision with root package name */
    public long f433168h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f433169i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433170m;

    /* renamed from: n, reason: collision with root package name */
    public int f433171n;

    /* renamed from: o, reason: collision with root package name */
    public int f433172o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.q)) {
            return false;
        }
        p33.q qVar = (p33.q) fVar;
        return n51.f.a(this.f76492x92037252, qVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f433164d), java.lang.Integer.valueOf(qVar.f433164d)) && n51.f.a(this.f433165e, qVar.f433165e) && n51.f.a(this.f433166f, qVar.f433166f) && n51.f.a(java.lang.Boolean.valueOf(this.f433167g), java.lang.Boolean.valueOf(qVar.f433167g)) && n51.f.a(java.lang.Long.valueOf(this.f433168h), java.lang.Long.valueOf(qVar.f433168h)) && n51.f.a(this.f433169i, qVar.f433169i) && n51.f.a(this.f433170m, qVar.f433170m) && n51.f.a(java.lang.Integer.valueOf(this.f433171n), java.lang.Integer.valueOf(qVar.f433171n)) && n51.f.a(java.lang.Integer.valueOf(this.f433172o), java.lang.Integer.valueOf(qVar.f433172o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433169i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f433164d);
            java.lang.String str = this.f433165e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f433166f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f433167g);
            fVar.h(6, this.f433168h);
            fVar.g(7, 8, linkedList);
            java.lang.String str3 = this.f433170m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f433171n);
            fVar.e(10, this.f433172o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f433164d);
            java.lang.String str4 = this.f433165e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f433166f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int a17 = i18 + b36.f.a(5, this.f433167g) + b36.f.h(6, this.f433168h) + b36.f.g(7, 8, linkedList);
            java.lang.String str6 = this.f433170m;
            if (str6 != null) {
                a17 += b36.f.j(8, str6);
            }
            return a17 + b36.f.e(9, this.f433171n) + b36.f.e(10, this.f433172o);
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
        p33.q qVar = (p33.q) objArr[1];
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
                    qVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                qVar.f433164d = aVar2.g(intValue);
                return 0;
            case 3:
                qVar.f433165e = aVar2.k(intValue);
                return 0;
            case 4:
                qVar.f433166f = aVar2.k(intValue);
                return 0;
            case 5:
                qVar.f433167g = aVar2.c(intValue);
                return 0;
            case 6:
                qVar.f433168h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    p33.e0 e0Var = new p33.e0();
                    if (bArr3 != null && bArr3.length > 0) {
                        e0Var.mo11468x92b714fd(bArr3);
                    }
                    qVar.f433169i.add(e0Var);
                }
                return 0;
            case 8:
                qVar.f433170m = aVar2.k(intValue);
                return 0;
            case 9:
                qVar.f433171n = aVar2.g(intValue);
                return 0;
            case 10:
                qVar.f433172o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
