package r45;

/* loaded from: classes2.dex */
public class sb3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467139d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f467140e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f467141f;

    /* renamed from: g, reason: collision with root package name */
    public int f467142g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sb3)) {
            return false;
        }
        r45.sb3 sb3Var = (r45.sb3) fVar;
        return n51.f.a(this.f76492x92037252, sb3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467139d), java.lang.Integer.valueOf(sb3Var.f467139d)) && n51.f.a(this.f467140e, sb3Var.f467140e) && n51.f.a(java.lang.Integer.valueOf(this.f467141f), java.lang.Integer.valueOf(sb3Var.f467141f)) && n51.f.a(java.lang.Integer.valueOf(this.f467142g), java.lang.Integer.valueOf(sb3Var.f467142g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467140e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467139d);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f467141f);
            fVar.e(7, this.f467142g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467139d) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f467141f) + b36.f.e(7, this.f467142g);
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
        r45.sb3 sb3Var = (r45.sb3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                sb3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            sb3Var.f467139d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            if (intValue == 6) {
                sb3Var.f467141f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 7) {
                return -1;
            }
            sb3Var.f467142g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.fo4 fo4Var = new r45.fo4();
            if (bArr3 != null && bArr3.length > 0) {
                fo4Var.mo11468x92b714fd(bArr3);
            }
            sb3Var.f467140e.add(fo4Var);
        }
        return 0;
    }
}
