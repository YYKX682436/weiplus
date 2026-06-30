package r45;

/* loaded from: classes8.dex */
public class gg3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456747d;

    /* renamed from: e, reason: collision with root package name */
    public long f456748e;

    /* renamed from: f, reason: collision with root package name */
    public r45.j4 f456749f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456750g;

    /* renamed from: h, reason: collision with root package name */
    public int f456751h;

    /* renamed from: i, reason: collision with root package name */
    public r45.tp f456752i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f456753m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg3)) {
            return false;
        }
        r45.gg3 gg3Var = (r45.gg3) fVar;
        return n51.f.a(this.f76492x92037252, gg3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456747d), java.lang.Integer.valueOf(gg3Var.f456747d)) && n51.f.a(java.lang.Long.valueOf(this.f456748e), java.lang.Long.valueOf(gg3Var.f456748e)) && n51.f.a(this.f456749f, gg3Var.f456749f) && n51.f.a(this.f456750g, gg3Var.f456750g) && n51.f.a(java.lang.Integer.valueOf(this.f456751h), java.lang.Integer.valueOf(gg3Var.f456751h)) && n51.f.a(this.f456752i, gg3Var.f456752i) && n51.f.a(this.f456753m, gg3Var.f456753m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456753m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f456747d);
            fVar.h(3, this.f456748e);
            r45.j4 j4Var = this.f456749f;
            if (j4Var != null) {
                fVar.i(4, j4Var.mo75928xcd1e8d8());
                this.f456749f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456750g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f456751h);
            r45.tp tpVar = this.f456752i;
            if (tpVar != null) {
                fVar.i(7, tpVar.mo75928xcd1e8d8());
                this.f456752i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456747d) + b36.f.h(3, this.f456748e);
            r45.j4 j4Var2 = this.f456749f;
            if (j4Var2 != null) {
                i18 += b36.f.i(4, j4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f456750g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            int e17 = i18 + b36.f.e(6, this.f456751h);
            r45.tp tpVar2 = this.f456752i;
            if (tpVar2 != null) {
                e17 += b36.f.i(7, tpVar2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.g(8, 8, linkedList);
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
        r45.gg3 gg3Var = (r45.gg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    gg3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                gg3Var.f456747d = aVar2.g(intValue);
                return 0;
            case 3:
                gg3Var.f456748e = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j4 j4Var3 = new r45.j4();
                    if (bArr3 != null && bArr3.length > 0) {
                        j4Var3.mo11468x92b714fd(bArr3);
                    }
                    gg3Var.f456749f = j4Var3;
                }
                return 0;
            case 5:
                gg3Var.f456750g = aVar2.k(intValue);
                return 0;
            case 6:
                gg3Var.f456751h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tp tpVar3 = new r45.tp();
                    if (bArr4 != null && bArr4.length > 0) {
                        tpVar3.mo11468x92b714fd(bArr4);
                    }
                    gg3Var.f456752i = tpVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.j4 j4Var4 = new r45.j4();
                    if (bArr5 != null && bArr5.length > 0) {
                        j4Var4.mo11468x92b714fd(bArr5);
                    }
                    gg3Var.f456753m.add(j4Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
