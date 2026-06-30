package bw5;

/* loaded from: classes2.dex */
public class g40 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f109209d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v70 f109210e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109211f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109212g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109213h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.j70 f109214i;

    /* renamed from: m, reason: collision with root package name */
    public long f109215m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.l40 f109216n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f109217o = new boolean[10];

    static {
        new bw5.g40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g40)) {
            return false;
        }
        bw5.g40 g40Var = (bw5.g40) fVar;
        return n51.f.a(this.f76494x2de60e5e, g40Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f109209d), java.lang.Integer.valueOf(g40Var.f109209d)) && n51.f.a(this.f109210e, g40Var.f109210e) && n51.f.a(this.f109211f, g40Var.f109211f) && n51.f.a(this.f109212g, g40Var.f109212g) && n51.f.a(java.lang.Boolean.valueOf(this.f109213h), java.lang.Boolean.valueOf(g40Var.f109213h)) && n51.f.a(this.f109214i, g40Var.f109214i) && n51.f.a(java.lang.Long.valueOf(this.f109215m), java.lang.Long.valueOf(g40Var.f109215m)) && n51.f.a(this.f109216n, g40Var.f109216n);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f109217o[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109217o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109209d);
            }
            bw5.v70 v70Var = this.f109210e;
            if (v70Var != null && zArr[2]) {
                fVar.i(2, v70Var.mo75928xcd1e8d8());
                this.f109210e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f109211f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f109212g;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f109213h);
            }
            bw5.j70 j70Var = this.f109214i;
            if (j70Var != null && zArr[5]) {
                fVar.i(5, j70Var.mo75928xcd1e8d8());
                this.f109214i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f109215m);
            }
            bw5.l40 l40Var = this.f109216n;
            if (l40Var != null && zArr[9]) {
                fVar.i(9, l40Var.mo75928xcd1e8d8());
                this.f109216n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f109209d);
            }
            bw5.v70 v70Var2 = this.f109210e;
            if (v70Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v70Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f109211f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f109212g;
            if (str4 != null && zArr[6]) {
                i18 += b36.f.j(6, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f109213h);
            }
            bw5.j70 j70Var2 = this.f109214i;
            if (j70Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, j70Var2.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                i18 += b36.f.h(8, this.f109215m);
            }
            bw5.l40 l40Var2 = this.f109216n;
            return (l40Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, l40Var2.mo75928xcd1e8d8());
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
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109210e = v70Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f109211f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109213h = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.j70 j70Var3 = new bw5.j70();
                    if (bArr3 != null && bArr3.length > 0) {
                        j70Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109214i = j70Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f109212g = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109209d = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109215m = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.l40 l40Var3 = new bw5.l40();
                    if (bArr4 != null && bArr4.length > 0) {
                        l40Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f109216n = l40Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.g40) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f109217o[1] = true;
        return this;
    }
}
