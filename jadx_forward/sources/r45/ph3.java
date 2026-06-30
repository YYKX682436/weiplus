package r45;

/* loaded from: classes2.dex */
public class ph3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f464589d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f464590e;

    /* renamed from: f, reason: collision with root package name */
    public int f464591f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464592g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ph3)) {
            return false;
        }
        r45.ph3 ph3Var = (r45.ph3) fVar;
        return n51.f.a(this.f76492x92037252, ph3Var.f76492x92037252) && n51.f.a(this.f464589d, ph3Var.f464589d) && n51.f.a(java.lang.Integer.valueOf(this.f464590e), java.lang.Integer.valueOf(ph3Var.f464590e)) && n51.f.a(java.lang.Integer.valueOf(this.f464591f), java.lang.Integer.valueOf(ph3Var.f464591f)) && n51.f.a(this.f464592g, ph3Var.f464592g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464589d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f464590e);
            fVar.e(4, this.f464591f);
            java.lang.String str = this.f464592g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f464590e) + b36.f.e(4, this.f464591f);
            java.lang.String str2 = this.f464592g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.ph3 ph3Var = (r45.ph3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                ph3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ph3Var.f464590e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                ph3Var.f464591f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ph3Var.f464592g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.gm0 gm0Var = new r45.gm0();
            if (bArr3 != null && bArr3.length > 0) {
                gm0Var.mo11468x92b714fd(bArr3);
            }
            ph3Var.f464589d.add(gm0Var);
        }
        return 0;
    }
}
