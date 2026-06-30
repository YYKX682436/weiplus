package bw5;

/* loaded from: classes2.dex */
public class mh extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111767d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111768e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111769f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ls0 f111770g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111771h = new boolean[5];

    static {
        new bw5.mh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mh mo11468x92b714fd(byte[] bArr) {
        return (bw5.mh) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mh)) {
            return false;
        }
        bw5.mh mhVar = (bw5.mh) fVar;
        return n51.f.a(this.f111767d, mhVar.f111767d) && n51.f.a(this.f111768e, mhVar.f111768e) && n51.f.a(this.f111769f, mhVar.f111769f) && n51.f.a(this.f111770g, mhVar.f111770g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111771h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111767d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111768e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f111769f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            bw5.ls0 ls0Var = this.f111770g;
            if (ls0Var != null && zArr[4]) {
                fVar.e(4, ls0Var.f111489d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f111767d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f111768e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f111769f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            bw5.ls0 ls0Var2 = this.f111770g;
            return (ls0Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.e(4, ls0Var2.f111489d);
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
            this.f111767d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111768e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111769f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f111770g = g17 != 1 ? g17 != 2 ? null : bw5.ls0.emFinderBannerStyleType_Remind : bw5.ls0.emFinderBannerStyleType_Warning;
        zArr[4] = true;
        return 0;
    }
}
