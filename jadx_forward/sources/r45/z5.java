package r45;

/* loaded from: classes11.dex */
public class z5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473250d;

    /* renamed from: e, reason: collision with root package name */
    public int f473251e;

    /* renamed from: f, reason: collision with root package name */
    public int f473252f;

    /* renamed from: g, reason: collision with root package name */
    public int f473253g;

    static {
        new r45.z5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.z5 mo11468x92b714fd(byte[] bArr) {
        return (r45.z5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z5)) {
            return false;
        }
        r45.z5 z5Var = (r45.z5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473250d), java.lang.Integer.valueOf(z5Var.f473250d)) && n51.f.a(java.lang.Integer.valueOf(this.f473251e), java.lang.Integer.valueOf(z5Var.f473251e)) && n51.f.a(java.lang.Integer.valueOf(this.f473252f), java.lang.Integer.valueOf(z5Var.f473252f)) && n51.f.a(java.lang.Integer.valueOf(this.f473253g), java.lang.Integer.valueOf(z5Var.f473253g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.z5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473250d);
            fVar.e(2, this.f473251e);
            fVar.e(3, this.f473252f);
            fVar.e(4, this.f473253g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f473250d) + 0 + b36.f.e(2, this.f473251e) + b36.f.e(3, this.f473252f) + b36.f.e(4, this.f473253g);
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
            this.f473250d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f473251e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f473252f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f473253g = aVar2.g(intValue);
        return 0;
    }
}
