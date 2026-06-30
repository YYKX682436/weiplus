package r45;

/* loaded from: classes8.dex */
public class r5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466079d;

    /* renamed from: e, reason: collision with root package name */
    public int f466080e;

    /* renamed from: f, reason: collision with root package name */
    public int f466081f;

    static {
        new r45.r5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.r5 mo11468x92b714fd(byte[] bArr) {
        return (r45.r5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r5)) {
            return false;
        }
        r45.r5 r5Var = (r45.r5) fVar;
        return n51.f.a(this.f466079d, r5Var.f466079d) && n51.f.a(java.lang.Integer.valueOf(this.f466080e), java.lang.Integer.valueOf(r5Var.f466080e)) && n51.f.a(java.lang.Integer.valueOf(this.f466081f), java.lang.Integer.valueOf(r5Var.f466081f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.r5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466079d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f466080e);
            fVar.e(3, this.f466081f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f466079d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f466080e) + b36.f.e(3, this.f466081f);
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
            this.f466079d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f466080e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f466081f = aVar2.g(intValue);
        return 0;
    }
}
