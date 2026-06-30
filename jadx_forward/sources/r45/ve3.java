package r45;

/* loaded from: classes8.dex */
public class ve3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f469687d;

    /* renamed from: e, reason: collision with root package name */
    public int f469688e;

    /* renamed from: f, reason: collision with root package name */
    public int f469689f;

    /* renamed from: g, reason: collision with root package name */
    public int f469690g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f469691h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469692i;

    /* renamed from: m, reason: collision with root package name */
    public long f469693m;

    static {
        new r45.ve3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve3)) {
            return false;
        }
        r45.ve3 ve3Var = (r45.ve3) fVar;
        return n51.f.a(this.f76494x2de60e5e, ve3Var.f76494x2de60e5e) && n51.f.a(this.f469687d, ve3Var.f469687d) && n51.f.a(java.lang.Integer.valueOf(this.f469688e), java.lang.Integer.valueOf(ve3Var.f469688e)) && n51.f.a(java.lang.Integer.valueOf(this.f469689f), java.lang.Integer.valueOf(ve3Var.f469689f)) && n51.f.a(java.lang.Integer.valueOf(this.f469690g), java.lang.Integer.valueOf(ve3Var.f469690g)) && n51.f.a(this.f469691h, ve3Var.f469691h) && n51.f.a(this.f469692i, ve3Var.f469692i) && n51.f.a(java.lang.Long.valueOf(this.f469693m), java.lang.Long.valueOf(ve3Var.f469693m));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f76494x2de60e5e;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ve3();
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
            r45.cu5 cu5Var = this.f469687d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f469687d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f469688e);
            fVar.e(4, this.f469689f);
            fVar.e(5, this.f469690g);
            r45.cu5 cu5Var2 = this.f469691h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.mo75928xcd1e8d8());
                this.f469691h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469692i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.h(8, this.f469693m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var3 = this.f469687d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f469688e) + b36.f.e(4, this.f469689f) + b36.f.e(5, this.f469690g);
            r45.cu5 cu5Var4 = this.f469691h;
            if (cu5Var4 != null) {
                e17 += b36.f.i(6, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f469692i;
            if (str2 != null) {
                e17 += b36.f.j(7, str2);
            }
            return e17 + b36.f.h(8, this.f469693m);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f469687d = cu5Var5;
                }
                return 0;
            case 3:
                this.f469688e = aVar2.g(intValue);
                return 0;
            case 4:
                this.f469689f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f469690g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    this.f469691h = cu5Var6;
                }
                return 0;
            case 7:
                this.f469692i = aVar2.k(intValue);
                return 0;
            case 8:
                this.f469693m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ve3) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        return this;
    }
}
