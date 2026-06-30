package r45;

/* loaded from: classes8.dex */
public class jv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.tm6 f459656d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459657e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wf5 f459658f;

    /* renamed from: g, reason: collision with root package name */
    public r45.wf5 f459659g;

    /* renamed from: h, reason: collision with root package name */
    public int f459660h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f459661i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f459662m;

    /* renamed from: n, reason: collision with root package name */
    public r45.vd f459663n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jv3)) {
            return false;
        }
        r45.jv3 jv3Var = (r45.jv3) fVar;
        return n51.f.a(this.f459656d, jv3Var.f459656d) && n51.f.a(this.f459657e, jv3Var.f459657e) && n51.f.a(this.f459658f, jv3Var.f459658f) && n51.f.a(this.f459659g, jv3Var.f459659g) && n51.f.a(java.lang.Integer.valueOf(this.f459660h), java.lang.Integer.valueOf(jv3Var.f459660h)) && n51.f.a(this.f459661i, jv3Var.f459661i) && n51.f.a(java.lang.Boolean.valueOf(this.f459662m), java.lang.Boolean.valueOf(jv3Var.f459662m)) && n51.f.a(this.f459663n, jv3Var.f459663n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459661i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.tm6 tm6Var = this.f459656d;
            if (tm6Var != null) {
                fVar.i(1, tm6Var.mo75928xcd1e8d8());
                this.f459656d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f459657e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.wf5 wf5Var = this.f459658f;
            if (wf5Var != null) {
                fVar.i(3, wf5Var.mo75928xcd1e8d8());
                this.f459658f.mo75956x3d5d1f78(fVar);
            }
            r45.wf5 wf5Var2 = this.f459659g;
            if (wf5Var2 != null) {
                fVar.i(4, wf5Var2.mo75928xcd1e8d8());
                this.f459659g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f459660h);
            fVar.g(6, 1, linkedList);
            fVar.a(7, this.f459662m);
            r45.vd vdVar = this.f459663n;
            if (vdVar != null) {
                fVar.i(8, vdVar.mo75928xcd1e8d8());
                this.f459663n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.tm6 tm6Var2 = this.f459656d;
            int i18 = tm6Var2 != null ? 0 + b36.f.i(1, tm6Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f459657e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.wf5 wf5Var3 = this.f459658f;
            if (wf5Var3 != null) {
                i18 += b36.f.i(3, wf5Var3.mo75928xcd1e8d8());
            }
            r45.wf5 wf5Var4 = this.f459659g;
            if (wf5Var4 != null) {
                i18 += b36.f.i(4, wf5Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f459660h) + b36.f.g(6, 1, linkedList) + b36.f.a(7, this.f459662m);
            r45.vd vdVar2 = this.f459663n;
            return vdVar2 != null ? e17 + b36.f.i(8, vdVar2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.jv3 jv3Var = (r45.jv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.tm6 tm6Var3 = new r45.tm6();
                    if (bArr2 != null && bArr2.length > 0) {
                        tm6Var3.mo11468x92b714fd(bArr2);
                    }
                    jv3Var.f459656d = tm6Var3;
                }
                return 0;
            case 2:
                jv3Var.f459657e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.wf5 wf5Var5 = new r45.wf5();
                    if (bArr3 != null && bArr3.length > 0) {
                        wf5Var5.mo11468x92b714fd(bArr3);
                    }
                    jv3Var.f459658f = wf5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wf5 wf5Var6 = new r45.wf5();
                    if (bArr4 != null && bArr4.length > 0) {
                        wf5Var6.mo11468x92b714fd(bArr4);
                    }
                    jv3Var.f459659g = wf5Var6;
                }
                return 0;
            case 5:
                jv3Var.f459660h = aVar2.g(intValue);
                return 0;
            case 6:
                jv3Var.f459661i.add(aVar2.k(intValue));
                return 0;
            case 7:
                jv3Var.f459662m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.vd vdVar3 = new r45.vd();
                    if (bArr5 != null && bArr5.length > 0) {
                        vdVar3.mo11468x92b714fd(bArr5);
                    }
                    jv3Var.f459663n = vdVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
