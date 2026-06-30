package pj4;

/* loaded from: classes11.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436495d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.q f436496e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436497f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f436498g;

    /* renamed from: h, reason: collision with root package name */
    public long f436499h;

    /* renamed from: i, reason: collision with root package name */
    public int f436500i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f436501m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f436502n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f436503o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.b)) {
            return false;
        }
        pj4.b bVar = (pj4.b) fVar;
        return n51.f.a(this.f436495d, bVar.f436495d) && n51.f.a(this.f436496e, bVar.f436496e) && n51.f.a(this.f436497f, bVar.f436497f) && n51.f.a(java.lang.Boolean.valueOf(this.f436498g), java.lang.Boolean.valueOf(bVar.f436498g)) && n51.f.a(java.lang.Long.valueOf(this.f436499h), java.lang.Long.valueOf(bVar.f436499h)) && n51.f.a(java.lang.Integer.valueOf(this.f436500i), java.lang.Integer.valueOf(bVar.f436500i)) && n51.f.a(this.f436501m, bVar.f436501m) && n51.f.a(this.f436502n, bVar.f436502n) && n51.f.a(this.f436503o, bVar.f436503o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436495d;
            if (str != null) {
                fVar.j(1, str);
            }
            pj4.q qVar = this.f436496e;
            if (qVar != null) {
                fVar.i(2, qVar.mo75928xcd1e8d8());
                this.f436496e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f436497f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f436498g);
            fVar.h(5, this.f436499h);
            fVar.e(6, this.f436500i);
            java.lang.String str3 = this.f436501m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f436502n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f436503o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f436495d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            pj4.q qVar2 = this.f436496e;
            if (qVar2 != null) {
                j17 += b36.f.i(2, qVar2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f436497f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int a17 = j17 + b36.f.a(4, this.f436498g) + b36.f.h(5, this.f436499h) + b36.f.e(6, this.f436500i);
            java.lang.String str8 = this.f436501m;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f436502n;
            if (str9 != null) {
                a17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f436503o;
            return str10 != null ? a17 + b36.f.j(9, str10) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        pj4.b bVar = (pj4.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f436495d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    pj4.q qVar3 = new pj4.q();
                    if (bArr != null && bArr.length > 0) {
                        qVar3.mo11468x92b714fd(bArr);
                    }
                    bVar.f436496e = qVar3;
                }
                return 0;
            case 3:
                bVar.f436497f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f436498g = aVar2.c(intValue);
                return 0;
            case 5:
                bVar.f436499h = aVar2.i(intValue);
                return 0;
            case 6:
                bVar.f436500i = aVar2.g(intValue);
                return 0;
            case 7:
                bVar.f436501m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f436502n = aVar2.k(intValue);
                return 0;
            case 9:
                bVar.f436503o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
