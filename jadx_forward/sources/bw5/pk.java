package bw5;

/* loaded from: classes2.dex */
public class pk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113236e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113237f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113238g;

    /* renamed from: h, reason: collision with root package name */
    public int f113239h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f113240i = new boolean[6];

    static {
        new bw5.pk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pk mo11468x92b714fd(byte[] bArr) {
        return (bw5.pk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pk)) {
            return false;
        }
        bw5.pk pkVar = (bw5.pk) fVar;
        return n51.f.a(this.f113235d, pkVar.f113235d) && n51.f.a(this.f113236e, pkVar.f113236e) && n51.f.a(this.f113237f, pkVar.f113237f) && n51.f.a(java.lang.Boolean.valueOf(this.f113238g), java.lang.Boolean.valueOf(pkVar.f113238g)) && n51.f.a(java.lang.Integer.valueOf(this.f113239h), java.lang.Integer.valueOf(pkVar.f113239h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113240i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113235d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113236e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113237f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113238g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113239h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f113235d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f113236e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f113237f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f113238g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f113239h) : i18;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f113235d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113236e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113237f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f113238g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f113239h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
