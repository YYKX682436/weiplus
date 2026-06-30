package r45;

/* loaded from: classes4.dex */
public class bl3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452379d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f452380e;

    /* renamed from: f, reason: collision with root package name */
    public int f452381f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f452382g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f452383h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452384i;

    static {
        new r45.bl3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl3)) {
            return false;
        }
        r45.bl3 bl3Var = (r45.bl3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452379d), java.lang.Integer.valueOf(bl3Var.f452379d)) && n51.f.a(this.f452380e, bl3Var.f452380e) && n51.f.a(java.lang.Integer.valueOf(this.f452381f), java.lang.Integer.valueOf(bl3Var.f452381f)) && n51.f.a(java.lang.Boolean.valueOf(this.f452382g), java.lang.Boolean.valueOf(bl3Var.f452382g)) && n51.f.a(java.lang.Boolean.valueOf(this.f452383h), java.lang.Boolean.valueOf(bl3Var.f452383h)) && n51.f.a(java.lang.Boolean.valueOf(this.f452384i), java.lang.Boolean.valueOf(bl3Var.f452384i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.bl3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452379d);
            r45.cu5 cu5Var = this.f452380e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f452380e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f452381f);
            fVar.a(4, this.f452382g);
            fVar.a(5, this.f452383h);
            fVar.a(6, this.f452384i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452379d) + 0;
            r45.cu5 cu5Var2 = this.f452380e;
            if (cu5Var2 != null) {
                e17 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(3, this.f452381f) + b36.f.a(4, this.f452382g) + b36.f.a(5, this.f452383h) + b36.f.a(6, this.f452384i);
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
        switch (intValue) {
            case 1:
                this.f452379d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f452380e = cu5Var3;
                }
                return 0;
            case 3:
                this.f452381f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f452382g = aVar2.c(intValue);
                return 0;
            case 5:
                this.f452383h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f452384i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.bl3) super.mo11468x92b714fd(bArr);
    }
}
