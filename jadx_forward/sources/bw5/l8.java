package bw5;

/* loaded from: classes8.dex */
public class l8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.m8 f111210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111211e;

    /* renamed from: f, reason: collision with root package name */
    public long f111212f;

    /* renamed from: g, reason: collision with root package name */
    public int f111213g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111214h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f111215i = new boolean[6];

    static {
        new bw5.l8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l8)) {
            return false;
        }
        bw5.l8 l8Var = (bw5.l8) fVar;
        return n51.f.a(this.f111210d, l8Var.f111210d) && n51.f.a(this.f111211e, l8Var.f111211e) && n51.f.a(java.lang.Long.valueOf(this.f111212f), java.lang.Long.valueOf(l8Var.f111212f)) && n51.f.a(java.lang.Integer.valueOf(this.f111213g), java.lang.Integer.valueOf(l8Var.f111213g)) && n51.f.a(this.f111214h, l8Var.f111214h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111215i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.m8 m8Var = this.f111210d;
            if (m8Var != null && zArr[1]) {
                fVar.e(1, m8Var.f111642d);
            }
            java.lang.String str = this.f111211e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f111212f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111213g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111214h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.m8 m8Var2 = this.f111210d;
            if (m8Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, m8Var2.f111642d);
            }
            java.lang.String str2 = this.f111211e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f111212f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f111213g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111214h;
            return (gVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.b(5, gVar2);
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
            int g17 = aVar2.g(intValue);
            this.f111210d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.m8.EcsOpenPreloadScene_TouchDown : bw5.m8.EcsOpenPreloadScene_Expose : bw5.m8.EcsOpenPreloadScene_Default;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111211e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111212f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f111213g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f111214h = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.l8) super.mo11468x92b714fd(bArr);
    }
}
