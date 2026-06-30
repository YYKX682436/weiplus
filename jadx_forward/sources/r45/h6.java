package r45;

/* loaded from: classes2.dex */
public class h6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457399d;

    /* renamed from: e, reason: collision with root package name */
    public int f457400e;

    /* renamed from: f, reason: collision with root package name */
    public int f457401f;

    static {
        new r45.h6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.h6 mo11468x92b714fd(byte[] bArr) {
        return (r45.h6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h6)) {
            return false;
        }
        r45.h6 h6Var = (r45.h6) fVar;
        return n51.f.a(this.f457399d, h6Var.f457399d) && n51.f.a(java.lang.Integer.valueOf(this.f457400e), java.lang.Integer.valueOf(h6Var.f457400e)) && n51.f.a(java.lang.Integer.valueOf(this.f457401f), java.lang.Integer.valueOf(h6Var.f457401f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.h6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457399d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f457400e);
            fVar.e(3, this.f457401f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f457399d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f457400e) + b36.f.e(3, this.f457401f);
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
            this.f457399d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f457400e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f457401f = aVar2.g(intValue);
        return 0;
    }
}
