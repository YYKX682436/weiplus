package r45;

/* loaded from: classes4.dex */
public class kc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f460116d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f460117e;

    /* renamed from: f, reason: collision with root package name */
    public int f460118f;

    /* renamed from: g, reason: collision with root package name */
    public int f460119g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kc3)) {
            return false;
        }
        r45.kc3 kc3Var = (r45.kc3) fVar;
        return n51.f.a(this.f76492x92037252, kc3Var.f76492x92037252) && n51.f.a(this.f460116d, kc3Var.f460116d) && n51.f.a(java.lang.Integer.valueOf(this.f460117e), java.lang.Integer.valueOf(kc3Var.f460117e)) && n51.f.a(java.lang.Integer.valueOf(this.f460118f), java.lang.Integer.valueOf(kc3Var.f460118f)) && n51.f.a(java.lang.Integer.valueOf(this.f460119g), java.lang.Integer.valueOf(kc3Var.f460119g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460116d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f460117e);
            fVar.e(4, this.f460118f);
            fVar.e(5, this.f460119g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f460117e) + b36.f.e(4, this.f460118f) + b36.f.e(5, this.f460119g);
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
        r45.kc3 kc3Var = (r45.kc3) objArr[1];
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
                kc3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            kc3Var.f460116d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            kc3Var.f460117e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            kc3Var.f460118f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kc3Var.f460119g = aVar2.g(intValue);
        return 0;
    }
}
