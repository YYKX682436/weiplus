package r45;

/* loaded from: classes12.dex */
public class zd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f473455d;

    /* renamed from: e, reason: collision with root package name */
    public r45.z57 f473456e;

    /* renamed from: f, reason: collision with root package name */
    public r45.sb7 f473457f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f473458g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f473459h;

    /* renamed from: i, reason: collision with root package name */
    public int f473460i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473461m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd)) {
            return false;
        }
        r45.zd zdVar = (r45.zd) fVar;
        return n51.f.a(this.f473455d, zdVar.f473455d) && n51.f.a(this.f473456e, zdVar.f473456e) && n51.f.a(this.f473457f, zdVar.f473457f) && n51.f.a(this.f473458g, zdVar.f473458g) && n51.f.a(this.f473459h, zdVar.f473459h) && n51.f.a(java.lang.Integer.valueOf(this.f473460i), java.lang.Integer.valueOf(zdVar.f473460i)) && n51.f.a(this.f473461m, zdVar.f473461m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f473455d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.mo75928xcd1e8d8());
                this.f473455d.mo75956x3d5d1f78(fVar);
            }
            r45.z57 z57Var = this.f473456e;
            if (z57Var != null) {
                fVar.i(2, z57Var.mo75928xcd1e8d8());
                this.f473456e.mo75956x3d5d1f78(fVar);
            }
            r45.sb7 sb7Var = this.f473457f;
            if (sb7Var != null) {
                fVar.i(3, sb7Var.mo75928xcd1e8d8());
                this.f473457f.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f473458g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.mo75928xcd1e8d8());
                this.f473458g.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f473459h;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.mo75928xcd1e8d8());
                this.f473459h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f473460i);
            java.lang.String str = this.f473461m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var4 = this.f473455d;
            int i18 = cu5Var4 != null ? 0 + b36.f.i(1, cu5Var4.mo75928xcd1e8d8()) : 0;
            r45.z57 z57Var2 = this.f473456e;
            if (z57Var2 != null) {
                i18 += b36.f.i(2, z57Var2.mo75928xcd1e8d8());
            }
            r45.sb7 sb7Var2 = this.f473457f;
            if (sb7Var2 != null) {
                i18 += b36.f.i(3, sb7Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var5 = this.f473458g;
            if (cu5Var5 != null) {
                i18 += b36.f.i(4, cu5Var5.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f473459h;
            if (cu5Var6 != null) {
                i18 += b36.f.i(5, cu5Var6.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f473460i);
            java.lang.String str2 = this.f473461m;
            return str2 != null ? e17 + b36.f.j(7, str2) : e17;
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
        r45.zd zdVar = (r45.zd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var7.b(bArr);
                    }
                    zdVar.f473455d = cu5Var7;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.z57 z57Var3 = new r45.z57();
                    if (bArr2 != null && bArr2.length > 0) {
                        z57Var3.mo11468x92b714fd(bArr2);
                    }
                    zdVar.f473456e = z57Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.sb7 sb7Var3 = new r45.sb7();
                    if (bArr3 != null && bArr3.length > 0) {
                        sb7Var3.mo11468x92b714fd(bArr3);
                    }
                    zdVar.f473457f = sb7Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var8.b(bArr4);
                    }
                    zdVar.f473458g = cu5Var8;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var9.b(bArr5);
                    }
                    zdVar.f473459h = cu5Var9;
                }
                return 0;
            case 6:
                zdVar.f473460i = aVar2.g(intValue);
                return 0;
            case 7:
                zdVar.f473461m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
