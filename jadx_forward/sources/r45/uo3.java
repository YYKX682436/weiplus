package r45;

/* loaded from: classes2.dex */
public class uo3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469059d;

    /* renamed from: f, reason: collision with root package name */
    public int f469061f;

    /* renamed from: g, reason: collision with root package name */
    public int f469062g;

    /* renamed from: i, reason: collision with root package name */
    public int f469064i;

    /* renamed from: n, reason: collision with root package name */
    public r45.kt3 f469066n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f469060e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f469063h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f469065m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uo3)) {
            return false;
        }
        r45.uo3 uo3Var = (r45.uo3) fVar;
        return n51.f.a(this.f76492x92037252, uo3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469059d), java.lang.Integer.valueOf(uo3Var.f469059d)) && n51.f.a(this.f469060e, uo3Var.f469060e) && n51.f.a(java.lang.Integer.valueOf(this.f469061f), java.lang.Integer.valueOf(uo3Var.f469061f)) && n51.f.a(java.lang.Integer.valueOf(this.f469062g), java.lang.Integer.valueOf(uo3Var.f469062g)) && n51.f.a(this.f469063h, uo3Var.f469063h) && n51.f.a(java.lang.Integer.valueOf(this.f469064i), java.lang.Integer.valueOf(uo3Var.f469064i)) && n51.f.a(this.f469065m, uo3Var.f469065m) && n51.f.a(this.f469066n, uo3Var.f469066n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469065m;
        java.util.LinkedList linkedList2 = this.f469063h;
        java.util.LinkedList linkedList3 = this.f469060e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f469059d);
            fVar.g(3, 8, linkedList3);
            fVar.e(4, this.f469061f);
            fVar.e(5, this.f469062g);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f469064i);
            fVar.g(8, 8, linkedList);
            r45.kt3 kt3Var = this.f469066n;
            if (kt3Var != null) {
                fVar.i(9, kt3Var.mo75928xcd1e8d8());
                this.f469066n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469059d) + b36.f.g(3, 8, linkedList3) + b36.f.e(4, this.f469061f) + b36.f.e(5, this.f469062g) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f469064i) + b36.f.g(8, 8, linkedList);
            r45.kt3 kt3Var2 = this.f469066n;
            return kt3Var2 != null ? i18 + b36.f.i(9, kt3Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.uo3 uo3Var = (r45.uo3) objArr[1];
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
                    uo3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                uo3Var.f469059d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ti5 ti5Var = new r45.ti5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ti5Var.mo11468x92b714fd(bArr3);
                    }
                    uo3Var.f469060e.add(ti5Var);
                }
                return 0;
            case 4:
                uo3Var.f469061f = aVar2.g(intValue);
                return 0;
            case 5:
                uo3Var.f469062g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.m2 m2Var = new r45.m2();
                    if (bArr4 != null && bArr4.length > 0) {
                        m2Var.mo11468x92b714fd(bArr4);
                    }
                    uo3Var.f469063h.add(m2Var);
                }
                return 0;
            case 7:
                uo3Var.f469064i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.nt3 nt3Var = new r45.nt3();
                    if (bArr5 != null && bArr5.length > 0) {
                        nt3Var.mo11468x92b714fd(bArr5);
                    }
                    uo3Var.f469065m.add(nt3Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.kt3 kt3Var3 = new r45.kt3();
                    if (bArr6 != null && bArr6.length > 0) {
                        kt3Var3.mo11468x92b714fd(bArr6);
                    }
                    uo3Var.f469066n = kt3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
