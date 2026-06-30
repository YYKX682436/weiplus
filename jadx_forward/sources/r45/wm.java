package r45;

/* loaded from: classes2.dex */
public class wm extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470798d;

    /* renamed from: e, reason: collision with root package name */
    public int f470799e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470800f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm)) {
            return false;
        }
        r45.wm wmVar = (r45.wm) fVar;
        return n51.f.a(this.f76494x2de60e5e, wmVar.f76494x2de60e5e) && n51.f.a(this.f470798d, wmVar.f470798d) && n51.f.a(java.lang.Integer.valueOf(this.f470799e), java.lang.Integer.valueOf(wmVar.f470799e)) && n51.f.a(this.f470800f, wmVar.f470800f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470798d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f470799e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470800f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f470798d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f470799e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470800f;
            return gVar2 != null ? e17 + b36.f.b(4, gVar2) : e17;
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
        r45.wm wmVar = (r45.wm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wmVar.f470798d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                wmVar.f470799e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wmVar.f470800f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.mo11468x92b714fd(bArr);
            }
            wmVar.f76494x2de60e5e = heVar3;
        }
        return 0;
    }
}
