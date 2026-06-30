package r45;

/* loaded from: classes4.dex */
public class au6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451801d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f451802e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f451803f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.au6)) {
            return false;
        }
        r45.au6 au6Var = (r45.au6) fVar;
        return n51.f.a(this.f76492x92037252, au6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451801d), java.lang.Integer.valueOf(au6Var.f451801d)) && n51.f.a(this.f451802e, au6Var.f451802e) && n51.f.a(java.lang.Integer.valueOf(this.f451803f), java.lang.Integer.valueOf(au6Var.f451803f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451802e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451801d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f451803f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451801d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f451803f);
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
        r45.au6 au6Var = (r45.au6) objArr[1];
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
                au6Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            au6Var.f451801d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            au6Var.f451803f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.dj0 dj0Var = new r45.dj0();
            if (bArr3 != null && bArr3.length > 0) {
                dj0Var.mo11468x92b714fd(bArr3);
            }
            au6Var.f451802e.add(dj0Var);
        }
        return 0;
    }
}
