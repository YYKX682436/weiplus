package bw5;

/* loaded from: classes2.dex */
public class gh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109389d;

    /* renamed from: e, reason: collision with root package name */
    public int f109390e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109391f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f109392g = new boolean[4];

    static {
        new bw5.gh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.gh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gh0)) {
            return false;
        }
        bw5.gh0 gh0Var = (bw5.gh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109389d), java.lang.Integer.valueOf(gh0Var.f109389d)) && n51.f.a(java.lang.Integer.valueOf(this.f109390e), java.lang.Integer.valueOf(gh0Var.f109390e)) && n51.f.a(this.f109391f, gh0Var.f109391f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109392g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109389d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109390e);
            }
            java.lang.String str = this.f109391f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109389d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109390e);
            }
            java.lang.String str2 = this.f109391f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
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
            this.f109389d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109390e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f109391f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
