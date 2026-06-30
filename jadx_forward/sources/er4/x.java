package er4;

/* loaded from: classes14.dex */
public class x extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final er4.x f337728n = new er4.x();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f337729d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337730e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f337731f;

    /* renamed from: g, reason: collision with root package name */
    public er4.i f337732g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f337733h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f337734i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f337735m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.x)) {
            return false;
        }
        er4.x xVar = (er4.x) fVar;
        return n51.f.a(this.f337729d, xVar.f337729d) && n51.f.a(this.f337730e, xVar.f337730e) && n51.f.a(this.f337731f, xVar.f337731f) && n51.f.a(this.f337732g, xVar.f337732g) && n51.f.a(java.lang.Boolean.valueOf(this.f337733h), java.lang.Boolean.valueOf(xVar.f337733h)) && n51.f.a(this.f337734i, xVar.f337734i);
    }

    /* renamed from: getName */
    public java.lang.String m128056xfb82e301() {
        return this.f337735m[1] ? this.f337729d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.x();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f337735m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f337729d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f337730e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f337731f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            er4.i iVar = this.f337732g;
            if (iVar != null && zArr[4]) {
                fVar.e(4, iVar.f337636d);
            }
            if (zArr[5]) {
                fVar.a(5, this.f337733h);
            }
            java.lang.String str4 = this.f337734i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f337729d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f337730e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f337731f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            er4.i iVar2 = this.f337732g;
            if (iVar2 != null && zArr[4]) {
                i18 += b36.f.e(4, iVar2.f337636d);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f337733h);
            }
            java.lang.String str8 = this.f337734i;
            return (str8 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str8);
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
        switch (intValue) {
            case 1:
                this.f337729d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f337730e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f337731f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f337732g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : er4.i.MP_UNKOWN : er4.i.MP_FEMALE : er4.i.MP_MALE;
                zArr[4] = true;
                return 0;
            case 5:
                this.f337733h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f337734i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.x) super.mo11468x92b714fd(bArr);
    }
}
