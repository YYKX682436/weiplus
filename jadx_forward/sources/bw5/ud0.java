package bw5;

/* loaded from: classes7.dex */
public class ud0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ie f115382d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wd0 f115383e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.zd0 f115384f;

    /* renamed from: g, reason: collision with root package name */
    public long f115385g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115386h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.n20 f115387i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f115388m = new boolean[7];

    static {
        new bw5.ud0();
    }

    public bw5.wd0 b() {
        return this.f115388m[2] ? this.f115383e : new bw5.wd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.ud0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ud0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ud0)) {
            return false;
        }
        bw5.ud0 ud0Var = (bw5.ud0) fVar;
        return n51.f.a(this.f115382d, ud0Var.f115382d) && n51.f.a(this.f115383e, ud0Var.f115383e) && n51.f.a(this.f115384f, ud0Var.f115384f) && n51.f.a(java.lang.Long.valueOf(this.f115385g), java.lang.Long.valueOf(ud0Var.f115385g)) && n51.f.a(this.f115386h, ud0Var.f115386h) && n51.f.a(this.f115387i, ud0Var.f115387i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ud0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115388m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f115382d;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f115382d.mo75956x3d5d1f78(fVar);
            }
            bw5.wd0 wd0Var = this.f115383e;
            if (wd0Var != null && zArr[2]) {
                fVar.i(2, wd0Var.mo75928xcd1e8d8());
                this.f115383e.mo75956x3d5d1f78(fVar);
            }
            bw5.zd0 zd0Var = this.f115384f;
            if (zd0Var != null && zArr[3]) {
                fVar.i(3, zd0Var.mo75928xcd1e8d8());
                this.f115384f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f115385g);
            }
            java.lang.String str = this.f115386h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            bw5.n20 n20Var = this.f115387i;
            if (n20Var != null && zArr[6]) {
                fVar.i(6, n20Var.mo75928xcd1e8d8());
                this.f115387i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f115382d;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            bw5.wd0 wd0Var2 = this.f115383e;
            if (wd0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, wd0Var2.mo75928xcd1e8d8());
            }
            bw5.zd0 zd0Var2 = this.f115384f;
            if (zd0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, zd0Var2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f115385g);
            }
            java.lang.String str2 = this.f115386h;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            bw5.n20 n20Var2 = this.f115387i;
            return (n20Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, n20Var2.mo75928xcd1e8d8());
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
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    this.f115382d = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.wd0 wd0Var3 = new bw5.wd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        wd0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f115383e = wd0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.zd0 zd0Var3 = new bw5.zd0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zd0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f115384f = zd0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f115385g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115386h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.n20 n20Var3 = new bw5.n20();
                    if (bArr4 != null && bArr4.length > 0) {
                        n20Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f115387i = n20Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
