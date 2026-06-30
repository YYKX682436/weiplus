package r45;

/* loaded from: classes4.dex */
public class gd5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456672d;

    /* renamed from: e, reason: collision with root package name */
    public long f456673e;

    /* renamed from: f, reason: collision with root package name */
    public long f456674f;

    static {
        new r45.gd5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gd5)) {
            return false;
        }
        r45.gd5 gd5Var = (r45.gd5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456672d), java.lang.Integer.valueOf(gd5Var.f456672d)) && n51.f.a(java.lang.Long.valueOf(this.f456673e), java.lang.Long.valueOf(gd5Var.f456673e)) && n51.f.a(java.lang.Long.valueOf(this.f456674f), java.lang.Long.valueOf(gd5Var.f456674f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.gd5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456672d);
            fVar.h(2, this.f456673e);
            fVar.h(3, this.f456674f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f456672d) + 0 + b36.f.h(2, this.f456673e) + b36.f.h(3, this.f456674f);
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
            this.f456672d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f456673e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f456674f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.gd5) super.mo11468x92b714fd(bArr);
    }
}
