package r45;

/* loaded from: classes7.dex */
public class pm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464707d;

    /* renamed from: e, reason: collision with root package name */
    public int f464708e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464709f;

    /* renamed from: g, reason: collision with root package name */
    public int f464710g;

    static {
        new r45.pm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pm0)) {
            return false;
        }
        r45.pm0 pm0Var = (r45.pm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464707d), java.lang.Integer.valueOf(pm0Var.f464707d)) && n51.f.a(java.lang.Integer.valueOf(this.f464708e), java.lang.Integer.valueOf(pm0Var.f464708e)) && n51.f.a(this.f464709f, pm0Var.f464709f) && n51.f.a(java.lang.Integer.valueOf(this.f464710g), java.lang.Integer.valueOf(pm0Var.f464710g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.pm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464707d);
            fVar.e(2, this.f464708e);
            java.lang.String str = this.f464709f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f464710g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464707d) + 0 + b36.f.e(2, this.f464708e);
            java.lang.String str2 = this.f464709f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f464710g);
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
            this.f464707d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f464708e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f464709f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f464710g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.pm0) super.mo11468x92b714fd(bArr);
    }
}
