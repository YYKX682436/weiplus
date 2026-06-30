package r45;

/* loaded from: classes8.dex */
public class d6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final r45.d6 f453671g = new r45.d6();

    /* renamed from: d, reason: collision with root package name */
    public int f453672d;

    /* renamed from: e, reason: collision with root package name */
    public long f453673e;

    /* renamed from: f, reason: collision with root package name */
    public long f453674f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d6)) {
            return false;
        }
        r45.d6 d6Var = (r45.d6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453672d), java.lang.Integer.valueOf(d6Var.f453672d)) && n51.f.a(java.lang.Long.valueOf(this.f453673e), java.lang.Long.valueOf(d6Var.f453673e)) && n51.f.a(java.lang.Long.valueOf(this.f453674f), java.lang.Long.valueOf(d6Var.f453674f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.d6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453672d);
            fVar.h(2, this.f453673e);
            fVar.h(3, this.f453674f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f453672d) + 0 + b36.f.h(2, this.f453673e) + b36.f.h(3, this.f453674f);
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
            this.f453672d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f453673e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f453674f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.d6) super.mo11468x92b714fd(bArr);
    }
}
