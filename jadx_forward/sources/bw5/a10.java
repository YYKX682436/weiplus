package bw5;

/* loaded from: classes2.dex */
public class a10 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106497d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f106498e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f106499f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f106500g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f106501h = new boolean[5];

    static {
        new bw5.a10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a10 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a10) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a10)) {
            return false;
        }
        bw5.a10 a10Var = (bw5.a10) fVar;
        return n51.f.a(this.f106497d, a10Var.f106497d) && n51.f.a(this.f106498e, a10Var.f106498e) && n51.f.a(this.f106499f, a10Var.f106499f) && n51.f.a(this.f106500g, a10Var.f106500g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106501h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f106497d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f106498e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.x7 x7Var = this.f106499f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.mo75928xcd1e8d8());
                this.f106499f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f106500g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f106497d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f106498e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.x7 x7Var2 = this.f106499f;
            if (x7Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, x7Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f106500g;
            return (gVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.b(4, gVar2);
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
            this.f106497d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f106498e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f106500g = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.mo11468x92b714fd(bArr);
            }
            this.f106499f = x7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
