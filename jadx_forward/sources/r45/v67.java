package r45;

/* loaded from: classes9.dex */
public class v67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469486d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ws f469487e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f469488f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469489g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v67)) {
            return false;
        }
        r45.v67 v67Var = (r45.v67) fVar;
        return n51.f.a(this.f469486d, v67Var.f469486d) && n51.f.a(this.f469487e, v67Var.f469487e) && n51.f.a(java.lang.Boolean.valueOf(this.f469488f), java.lang.Boolean.valueOf(v67Var.f469488f)) && n51.f.a(this.f469489g, v67Var.f469489g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469486d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ws wsVar = this.f469487e;
            if (wsVar != null) {
                fVar.i(2, wsVar.mo75928xcd1e8d8());
                this.f469487e.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f469488f);
            java.lang.String str2 = this.f469489g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469486d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.ws wsVar2 = this.f469487e;
            if (wsVar2 != null) {
                j17 += b36.f.i(2, wsVar2.mo75928xcd1e8d8());
            }
            int a17 = j17 + b36.f.a(3, this.f469488f);
            java.lang.String str4 = this.f469489g;
            return str4 != null ? a17 + b36.f.j(4, str4) : a17;
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
        r45.v67 v67Var = (r45.v67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v67Var.f469486d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                v67Var.f469488f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            v67Var.f469489g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ws wsVar3 = new r45.ws();
            if (bArr != null && bArr.length > 0) {
                wsVar3.mo11468x92b714fd(bArr);
            }
            v67Var.f469487e = wsVar3;
        }
        return 0;
    }
}
