package bw5;

/* loaded from: classes2.dex */
public class d50 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f107860d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107861e;

    /* renamed from: f, reason: collision with root package name */
    public int f107862f;

    /* renamed from: g, reason: collision with root package name */
    public int f107863g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107864h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107865i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa0 f107866m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.l40 f107867n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.e90 f107868o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f107869p = new boolean[12];

    static {
        new bw5.d50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d50)) {
            return false;
        }
        bw5.d50 d50Var = (bw5.d50) fVar;
        return n51.f.a(this.f76494x2de60e5e, d50Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f107860d), java.lang.Integer.valueOf(d50Var.f107860d)) && n51.f.a(this.f107861e, d50Var.f107861e) && n51.f.a(java.lang.Integer.valueOf(this.f107862f), java.lang.Integer.valueOf(d50Var.f107862f)) && n51.f.a(java.lang.Integer.valueOf(this.f107863g), java.lang.Integer.valueOf(d50Var.f107863g)) && n51.f.a(this.f107864h, d50Var.f107864h) && n51.f.a(java.lang.Boolean.valueOf(this.f107865i), java.lang.Boolean.valueOf(d50Var.f107865i)) && n51.f.a(this.f107866m, d50Var.f107866m) && n51.f.a(this.f107867n, d50Var.f107867n) && n51.f.a(this.f107868o, d50Var.f107868o);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f107869p[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.d50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107869p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107860d);
            }
            java.lang.String str = this.f107861e;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107862f);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107863g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107864h;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f107865i);
            }
            bw5.xa0 xa0Var = this.f107866m;
            if (xa0Var != null && zArr[9]) {
                fVar.i(9, xa0Var.mo75928xcd1e8d8());
                this.f107866m.mo75956x3d5d1f78(fVar);
            }
            bw5.l40 l40Var = this.f107867n;
            if (l40Var != null && zArr[10]) {
                fVar.i(10, l40Var.mo75928xcd1e8d8());
                this.f107867n.mo75956x3d5d1f78(fVar);
            }
            bw5.e90 e90Var = this.f107868o;
            if (e90Var != null && zArr[11]) {
                fVar.i(11, e90Var.mo75928xcd1e8d8());
                this.f107868o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f107860d);
            }
            java.lang.String str2 = this.f107861e;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107862f);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107863g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107864h;
            if (gVar2 != null && zArr[7]) {
                i18 += b36.f.b(7, gVar2);
            }
            if (zArr[8]) {
                i18 += b36.f.a(8, this.f107865i);
            }
            bw5.xa0 xa0Var2 = this.f107866m;
            if (xa0Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, xa0Var2.mo75928xcd1e8d8());
            }
            bw5.l40 l40Var2 = this.f107867n;
            if (l40Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, l40Var2.mo75928xcd1e8d8());
            }
            bw5.e90 e90Var2 = this.f107868o;
            return (e90Var2 == null || !zArr[11]) ? i18 : i18 + b36.f.i(11, e90Var2.mo75928xcd1e8d8());
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
            default:
                return -1;
            case 3:
                this.f107860d = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107861e = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107862f = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107863g = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107864h = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107865i = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107866m = xa0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.l40 l40Var3 = new bw5.l40();
                    if (bArr3 != null && bArr3.length > 0) {
                        l40Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f107867n = l40Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.e90 e90Var3 = new bw5.e90();
                    if (bArr4 != null && bArr4.length > 0) {
                        e90Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f107868o = e90Var3;
                }
                zArr[11] = true;
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.d50) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f107869p[1] = true;
        return this;
    }
}
