package r45;

/* loaded from: classes4.dex */
public class wj extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gi5 f470746d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f470747e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f470748f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wj)) {
            return false;
        }
        r45.wj wjVar = (r45.wj) fVar;
        return n51.f.a(this.f76492x92037252, wjVar.f76492x92037252) && n51.f.a(this.f470746d, wjVar.f470746d) && n51.f.a(this.f470747e, wjVar.f470747e) && n51.f.a(java.lang.Boolean.valueOf(this.f470748f), java.lang.Boolean.valueOf(wjVar.f470748f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470747e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.gi5 gi5Var = this.f470746d;
            if (gi5Var != null) {
                fVar.i(2, gi5Var.mo75928xcd1e8d8());
                this.f470746d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.a(4, this.f470748f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.gi5 gi5Var2 = this.f470746d;
            if (gi5Var2 != null) {
                i18 += b36.f.i(2, gi5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList) + b36.f.a(4, this.f470748f);
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
        r45.wj wjVar = (r45.wj) objArr[1];
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
                wjVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.gi5 gi5Var3 = new r45.gi5();
                if (bArr3 != null && bArr3.length > 0) {
                    gi5Var3.mo11468x92b714fd(bArr3);
                }
                wjVar.f470746d = gi5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            wjVar.f470748f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.uj ujVar = new r45.uj();
            if (bArr4 != null && bArr4.length > 0) {
                ujVar.mo11468x92b714fd(bArr4);
            }
            wjVar.f470747e.add(ujVar);
        }
        return 0;
    }
}
