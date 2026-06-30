package r45;

/* loaded from: classes8.dex */
public class kt1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f460464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460465e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460466f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460467g;

    /* renamed from: h, reason: collision with root package name */
    public long f460468h;

    /* renamed from: i, reason: collision with root package name */
    public long f460469i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460470m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kt1)) {
            return false;
        }
        r45.kt1 kt1Var = (r45.kt1) fVar;
        return n51.f.a(this.f76494x2de60e5e, kt1Var.f76494x2de60e5e) && n51.f.a(this.f460464d, kt1Var.f460464d) && n51.f.a(this.f460465e, kt1Var.f460465e) && n51.f.a(this.f460466f, kt1Var.f460466f) && n51.f.a(this.f460467g, kt1Var.f460467g) && n51.f.a(java.lang.Long.valueOf(this.f460468h), java.lang.Long.valueOf(kt1Var.f460468h)) && n51.f.a(java.lang.Long.valueOf(this.f460469i), java.lang.Long.valueOf(kt1Var.f460469i)) && n51.f.a(this.f460470m, kt1Var.f460470m);
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
            r45.kv0 kv0Var = this.f460464d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f460464d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460465e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f460466f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f460467g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f460468h);
            fVar.h(7, this.f460469i);
            java.lang.String str3 = this.f460470m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f460464d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f460465e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f460466f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str5 = this.f460467g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f460468h) + b36.f.h(7, this.f460469i);
            java.lang.String str6 = this.f460470m;
            return str6 != null ? h17 + b36.f.j(8, str6) : h17;
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
        r45.kt1 kt1Var = (r45.kt1) objArr[1];
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
                    kt1Var.f76494x2de60e5e = heVar3;
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
                    kt1Var.f460464d = kv0Var3;
                }
                return 0;
            case 3:
                kt1Var.f460465e = aVar2.k(intValue);
                return 0;
            case 4:
                kt1Var.f460466f = aVar2.d(intValue);
                return 0;
            case 5:
                kt1Var.f460467g = aVar2.k(intValue);
                return 0;
            case 6:
                kt1Var.f460468h = aVar2.i(intValue);
                return 0;
            case 7:
                kt1Var.f460469i = aVar2.i(intValue);
                return 0;
            case 8:
                kt1Var.f460470m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
