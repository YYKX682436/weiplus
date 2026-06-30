package bw5;

/* loaded from: classes4.dex */
public class rg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114058d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114059e;

    /* renamed from: f, reason: collision with root package name */
    public int f114060f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114061g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f114062h = new boolean[5];

    static {
        new bw5.rg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.rg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rg0)) {
            return false;
        }
        bw5.rg0 rg0Var = (bw5.rg0) fVar;
        return n51.f.a(this.f114058d, rg0Var.f114058d) && n51.f.a(this.f114059e, rg0Var.f114059e) && n51.f.a(java.lang.Integer.valueOf(this.f114060f), java.lang.Integer.valueOf(rg0Var.f114060f)) && n51.f.a(this.f114061g, rg0Var.f114061g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114062h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114058d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114059e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f114060f);
            }
            java.lang.String str3 = this.f114061g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f114058d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f114059e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f114060f);
            }
            java.lang.String str6 = this.f114061g;
            return (str6 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str6);
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
            this.f114058d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114059e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114060f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f114061g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
