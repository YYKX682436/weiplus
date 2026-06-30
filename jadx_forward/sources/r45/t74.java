package r45;

/* loaded from: classes4.dex */
public class t74 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f467728d;

    /* renamed from: e, reason: collision with root package name */
    public long f467729e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o63 f467730f;

    /* renamed from: g, reason: collision with root package name */
    public r45.il4 f467731g;

    /* renamed from: h, reason: collision with root package name */
    public r45.a94 f467732h;

    /* renamed from: i, reason: collision with root package name */
    public long f467733i;

    /* renamed from: m, reason: collision with root package name */
    public r45.v94 f467734m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t74)) {
            return false;
        }
        r45.t74 t74Var = (r45.t74) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f467728d), java.lang.Long.valueOf(t74Var.f467728d)) && n51.f.a(java.lang.Long.valueOf(this.f467729e), java.lang.Long.valueOf(t74Var.f467729e)) && n51.f.a(this.f467730f, t74Var.f467730f) && n51.f.a(this.f467731g, t74Var.f467731g) && n51.f.a(this.f467732h, t74Var.f467732h) && n51.f.a(java.lang.Long.valueOf(this.f467733i), java.lang.Long.valueOf(t74Var.f467733i)) && n51.f.a(this.f467734m, t74Var.f467734m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f467728d);
            fVar.h(2, this.f467729e);
            r45.o63 o63Var = this.f467730f;
            if (o63Var != null) {
                fVar.i(3, o63Var.mo75928xcd1e8d8());
                this.f467730f.mo75956x3d5d1f78(fVar);
            }
            r45.il4 il4Var = this.f467731g;
            if (il4Var != null) {
                fVar.i(4, il4Var.mo75928xcd1e8d8());
                this.f467731g.mo75956x3d5d1f78(fVar);
            }
            r45.a94 a94Var = this.f467732h;
            if (a94Var != null) {
                fVar.i(5, a94Var.mo75928xcd1e8d8());
                this.f467732h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f467733i);
            r45.v94 v94Var = this.f467734m;
            if (v94Var != null) {
                fVar.i(8, v94Var.mo75928xcd1e8d8());
                this.f467734m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f467728d) + 0 + b36.f.h(2, this.f467729e);
            r45.o63 o63Var2 = this.f467730f;
            if (o63Var2 != null) {
                h17 += b36.f.i(3, o63Var2.mo75928xcd1e8d8());
            }
            r45.il4 il4Var2 = this.f467731g;
            if (il4Var2 != null) {
                h17 += b36.f.i(4, il4Var2.mo75928xcd1e8d8());
            }
            r45.a94 a94Var2 = this.f467732h;
            if (a94Var2 != null) {
                h17 += b36.f.i(5, a94Var2.mo75928xcd1e8d8());
            }
            int h18 = h17 + b36.f.h(6, this.f467733i);
            r45.v94 v94Var2 = this.f467734m;
            return v94Var2 != null ? h18 + b36.f.i(8, v94Var2.mo75928xcd1e8d8()) : h18;
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
        r45.t74 t74Var = (r45.t74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                t74Var.f467728d = aVar2.i(intValue);
                return 0;
            case 2:
                t74Var.f467729e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.o63 o63Var3 = new r45.o63();
                    if (bArr != null && bArr.length > 0) {
                        o63Var3.mo11468x92b714fd(bArr);
                    }
                    t74Var.f467730f = o63Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.il4 il4Var3 = new r45.il4();
                    if (bArr2 != null && bArr2.length > 0) {
                        il4Var3.mo11468x92b714fd(bArr2);
                    }
                    t74Var.f467731g = il4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.a94 a94Var3 = new r45.a94();
                    if (bArr3 != null && bArr3.length > 0) {
                        a94Var3.mo11468x92b714fd(bArr3);
                    }
                    t74Var.f467732h = a94Var3;
                }
                return 0;
            case 6:
                t74Var.f467733i = aVar2.i(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.v94 v94Var3 = new r45.v94();
                    if (bArr4 != null && bArr4.length > 0) {
                        v94Var3.mo11468x92b714fd(bArr4);
                    }
                    t74Var.f467734m = v94Var3;
                }
                return 0;
        }
    }
}
