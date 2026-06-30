package r45;

/* loaded from: classes2.dex */
public class vu0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f470106d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470107e;

    /* renamed from: f, reason: collision with root package name */
    public r45.dx0 f470108f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470109g;

    /* renamed from: h, reason: collision with root package name */
    public long f470110h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vu0)) {
            return false;
        }
        r45.vu0 vu0Var = (r45.vu0) fVar;
        return n51.f.a(this.f76494x2de60e5e, vu0Var.f76494x2de60e5e) && n51.f.a(this.f470106d, vu0Var.f470106d) && n51.f.a(this.f470107e, vu0Var.f470107e) && n51.f.a(this.f470108f, vu0Var.f470108f) && n51.f.a(this.f470109g, vu0Var.f470109g) && n51.f.a(java.lang.Long.valueOf(this.f470110h), java.lang.Long.valueOf(vu0Var.f470110h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f470106d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f470106d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470107e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.dx0 dx0Var = this.f470108f;
            if (dx0Var != null) {
                fVar.i(4, dx0Var.mo75928xcd1e8d8());
                this.f470108f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470109g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.h(6, this.f470110h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f470106d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f470107e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.dx0 dx0Var2 = this.f470108f;
            if (dx0Var2 != null) {
                i18 += b36.f.i(4, dx0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470109g;
            if (gVar2 != null) {
                i18 += b36.f.b(5, gVar2);
            }
            return i18 + b36.f.h(6, this.f470110h);
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
        r45.vu0 vu0Var = (r45.vu0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    vu0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    vu0Var.f470106d = kv0Var3;
                }
                return 0;
            case 3:
                vu0Var.f470107e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dx0Var3.mo11468x92b714fd(bArr3);
                    }
                    vu0Var.f470108f = dx0Var3;
                }
                return 0;
            case 5:
                vu0Var.f470109g = aVar2.d(intValue);
                return 0;
            case 6:
                vu0Var.f470110h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
