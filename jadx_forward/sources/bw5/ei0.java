package bw5;

/* loaded from: classes15.dex */
public class ei0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108461g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.fi0 f108462h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f108463i = new boolean[6];

    static {
        new bw5.ei0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ei0)) {
            return false;
        }
        bw5.ei0 ei0Var = (bw5.ei0) fVar;
        return n51.f.a(this.f108458d, ei0Var.f108458d) && n51.f.a(this.f108459e, ei0Var.f108459e) && n51.f.a(this.f108460f, ei0Var.f108460f) && n51.f.a(this.f108461g, ei0Var.f108461g) && n51.f.a(this.f108462h, ei0Var.f108462h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ei0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108463i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108458d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108459e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108460f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f108461g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            bw5.fi0 fi0Var = this.f108462h;
            if (fi0Var != null && zArr[5]) {
                fVar.e(5, fi0Var.f108836d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f108458d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f108459e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f108460f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f108461g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            bw5.fi0 fi0Var2 = this.f108462h;
            return (fi0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.e(5, fi0Var2.f108836d);
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
            this.f108458d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108459e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f108460f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f108461g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f108462h = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.fi0.ARCHIVE : bw5.fi0.VIDEO : bw5.fi0.IMAGE : bw5.fi0.DOCUMENT;
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ei0) super.mo11468x92b714fd(bArr);
    }
}
