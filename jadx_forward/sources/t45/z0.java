package t45;

/* loaded from: classes4.dex */
public class z0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f497200d;

    /* renamed from: e, reason: collision with root package name */
    public int f497201e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f497202f;

    /* renamed from: g, reason: collision with root package name */
    public long f497203g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f497204h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.z0)) {
            return false;
        }
        t45.z0 z0Var = (t45.z0) fVar;
        return n51.f.a(this.f76494x2de60e5e, z0Var.f76494x2de60e5e) && n51.f.a(this.f497200d, z0Var.f497200d) && n51.f.a(java.lang.Integer.valueOf(this.f497201e), java.lang.Integer.valueOf(z0Var.f497201e)) && n51.f.a(this.f497202f, z0Var.f497202f) && n51.f.a(java.lang.Long.valueOf(this.f497203g), java.lang.Long.valueOf(z0Var.f497203g)) && n51.f.a(this.f497204h, z0Var.f497204h);
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
            java.lang.String str = this.f497200d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f497201e);
            java.lang.String str2 = this.f497202f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f497203g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f497204h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f497200d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f497201e);
            java.lang.String str4 = this.f497202f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int h17 = e17 + b36.f.h(5, this.f497203g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f497204h;
            return gVar2 != null ? h17 + b36.f.b(6, gVar2) : h17;
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
        t45.z0 z0Var = (t45.z0) objArr[1];
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
                    z0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                z0Var.f497200d = aVar2.k(intValue);
                return 0;
            case 3:
                z0Var.f497201e = aVar2.g(intValue);
                return 0;
            case 4:
                z0Var.f497202f = aVar2.k(intValue);
                return 0;
            case 5:
                z0Var.f497203g = aVar2.i(intValue);
                return 0;
            case 6:
                z0Var.f497204h = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
