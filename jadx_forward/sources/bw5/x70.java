package bw5;

/* loaded from: classes2.dex */
public class x70 extends r45.mr5 {

    /* renamed from: e, reason: collision with root package name */
    public int f116519e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.z90 f116520f;

    /* renamed from: g, reason: collision with root package name */
    public int f116521g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116522h;

    /* renamed from: i, reason: collision with root package name */
    public int f116523i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.v70 f116524m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.xa0 f116525n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f116526o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116518d = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116527p = new boolean[11];

    static {
        new bw5.x70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x70)) {
            return false;
        }
        bw5.x70 x70Var = (bw5.x70) fVar;
        return n51.f.a(this.f76494x2de60e5e, x70Var.f76494x2de60e5e) && n51.f.a(this.f116518d, x70Var.f116518d) && n51.f.a(java.lang.Integer.valueOf(this.f116519e), java.lang.Integer.valueOf(x70Var.f116519e)) && n51.f.a(this.f116520f, x70Var.f116520f) && n51.f.a(java.lang.Integer.valueOf(this.f116521g), java.lang.Integer.valueOf(x70Var.f116521g)) && n51.f.a(this.f116522h, x70Var.f116522h) && n51.f.a(java.lang.Integer.valueOf(this.f116523i), java.lang.Integer.valueOf(x70Var.f116523i)) && n51.f.a(this.f116524m, x70Var.f116524m) && n51.f.a(this.f116525n, x70Var.f116525n) && n51.f.a(java.lang.Boolean.valueOf(this.f116526o), java.lang.Boolean.valueOf(x70Var.f116526o));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f116527p[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116518d;
        int i18 = 0;
        boolean[] zArr = this.f116527p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f116519e);
            }
            bw5.z90 z90Var = this.f116520f;
            if (z90Var != null && zArr[4]) {
                fVar.i(4, z90Var.mo75928xcd1e8d8());
                this.f116520f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116521g);
            }
            java.lang.String str = this.f116522h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f116523i);
            }
            bw5.v70 v70Var = this.f116524m;
            if (v70Var != null && zArr[8]) {
                fVar.i(8, v70Var.mo75928xcd1e8d8());
                this.f116524m.mo75956x3d5d1f78(fVar);
            }
            bw5.xa0 xa0Var = this.f116525n;
            if (xa0Var != null && zArr[9]) {
                fVar.i(9, xa0Var.mo75928xcd1e8d8());
                this.f116525n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f116526o);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f116519e);
            }
            bw5.z90 z90Var2 = this.f116520f;
            if (z90Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, z90Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f116521g);
            }
            java.lang.String str2 = this.f116522h;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f116523i);
            }
            bw5.v70 v70Var2 = this.f116524m;
            if (v70Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, v70Var2.mo75928xcd1e8d8());
            }
            bw5.xa0 xa0Var2 = this.f116525n;
            if (xa0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, xa0Var2.mo75928xcd1e8d8());
            }
            return zArr[10] ? g17 + b36.f.a(10, this.f116526o) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                linkedList.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f116519e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.z90 z90Var3 = new bw5.z90();
                    if (bArr2 != null && bArr2.length > 0) {
                        z90Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116520f = z90Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f116521g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116522h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116523i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr3 != null && bArr3.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f116524m = v70Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr4 != null && bArr4.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f116525n = xa0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f116526o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.x70) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f116527p[1] = true;
        return this;
    }
}
