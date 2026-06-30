package r45;

/* loaded from: classes8.dex */
public class q72 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f465258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465259e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465260f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465262h;

    /* renamed from: i, reason: collision with root package name */
    public long f465263i;

    /* renamed from: m, reason: collision with root package name */
    public long f465264m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465265n;

    /* renamed from: o, reason: collision with root package name */
    public int f465266o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q72)) {
            return false;
        }
        r45.q72 q72Var = (r45.q72) fVar;
        return n51.f.a(this.f76494x2de60e5e, q72Var.f76494x2de60e5e) && n51.f.a(this.f465258d, q72Var.f465258d) && n51.f.a(this.f465259e, q72Var.f465259e) && n51.f.a(this.f465260f, q72Var.f465260f) && n51.f.a(this.f465261g, q72Var.f465261g) && n51.f.a(this.f465262h, q72Var.f465262h) && n51.f.a(java.lang.Long.valueOf(this.f465263i), java.lang.Long.valueOf(q72Var.f465263i)) && n51.f.a(java.lang.Long.valueOf(this.f465264m), java.lang.Long.valueOf(q72Var.f465264m)) && n51.f.a(this.f465265n, q72Var.f465265n) && n51.f.a(java.lang.Integer.valueOf(this.f465266o), java.lang.Integer.valueOf(q72Var.f465266o));
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
            r45.kv0 kv0Var = this.f465258d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f465258d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f465259e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465260f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f465261g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f465262h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f465263i);
            fVar.h(8, this.f465264m);
            java.lang.String str4 = this.f465265n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f465266o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f465258d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f465259e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465260f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str6 = this.f465261g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f465262h;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            int h17 = i18 + b36.f.h(7, this.f465263i) + b36.f.h(8, this.f465264m);
            java.lang.String str8 = this.f465265n;
            if (str8 != null) {
                h17 += b36.f.j(9, str8);
            }
            return h17 + b36.f.e(10, this.f465266o);
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
        r45.q72 q72Var = (r45.q72) objArr[1];
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
                    q72Var.f76494x2de60e5e = heVar3;
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
                    q72Var.f465258d = kv0Var3;
                }
                return 0;
            case 3:
                q72Var.f465259e = aVar2.k(intValue);
                return 0;
            case 4:
                q72Var.f465260f = aVar2.d(intValue);
                return 0;
            case 5:
                q72Var.f465261g = aVar2.k(intValue);
                return 0;
            case 6:
                q72Var.f465262h = aVar2.k(intValue);
                return 0;
            case 7:
                q72Var.f465263i = aVar2.i(intValue);
                return 0;
            case 8:
                q72Var.f465264m = aVar2.i(intValue);
                return 0;
            case 9:
                q72Var.f465265n = aVar2.k(intValue);
                return 0;
            case 10:
                q72Var.f465266o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
