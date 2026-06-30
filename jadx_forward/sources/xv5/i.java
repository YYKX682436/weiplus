package xv5;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f539021d;

    /* renamed from: e, reason: collision with root package name */
    public int f539022e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f539023f;

    /* renamed from: g, reason: collision with root package name */
    public xv5.j f539024g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f539025h = new boolean[5];

    static {
        new xv5.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public xv5.i mo11468x92b714fd(byte[] bArr) {
        return (xv5.i) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.i)) {
            return false;
        }
        xv5.i iVar = (xv5.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f539021d), java.lang.Integer.valueOf(iVar.f539021d)) && n51.f.a(java.lang.Integer.valueOf(this.f539022e), java.lang.Integer.valueOf(iVar.f539022e)) && n51.f.a(java.lang.Boolean.valueOf(this.f539023f), java.lang.Boolean.valueOf(iVar.f539023f)) && n51.f.a(this.f539024g, iVar.f539024g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new xv5.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f539025h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f539021d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f539022e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f539023f);
            }
            xv5.j jVar = this.f539024g;
            if (jVar != null && zArr[4]) {
                fVar.e(4, jVar.f539030d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f539021d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f539022e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f539023f);
            }
            xv5.j jVar2 = this.f539024g;
            return (jVar2 == null || !zArr[4]) ? e17 : e17 + b36.f.e(4, jVar2.f539030d);
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
            this.f539021d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f539022e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f539023f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f539024g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : xv5.j.CBTTableColumnAlignment_Right : xv5.j.CBTTableColumnAlignment_Center : xv5.j.CBTTableColumnAlignment_Left;
        zArr[4] = true;
        return 0;
    }
}
