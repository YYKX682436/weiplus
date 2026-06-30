package r45;

/* loaded from: classes2.dex */
public class yf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472564d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472565e;

    /* renamed from: f, reason: collision with root package name */
    public a36.c f472566f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yf0)) {
            return false;
        }
        r45.yf0 yf0Var = (r45.yf0) fVar;
        return n51.f.a(this.f76492x92037252, yf0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f472564d), java.lang.Integer.valueOf(yf0Var.f472564d)) && n51.f.a(this.f472565e, yf0Var.f472565e) && n51.f.a(this.f472566f, yf0Var.f472566f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472564d);
            java.lang.String str = this.f472565e;
            if (str != null) {
                fVar.j(3, str);
            }
            a36.c cVar = this.f472566f;
            if (cVar != null) {
                fVar.i(4, cVar.mo75928xcd1e8d8());
                this.f472566f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472564d);
            java.lang.String str2 = this.f472565e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            a36.c cVar2 = this.f472566f;
            return cVar2 != null ? i18 + b36.f.i(4, cVar2.mo75928xcd1e8d8()) : i18;
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
        r45.yf0 yf0Var = (r45.yf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                yf0Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yf0Var.f472564d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yf0Var.f472565e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            a36.c cVar3 = new a36.c();
            if (bArr2 != null && bArr2.length > 0) {
                cVar3.mo11468x92b714fd(bArr2);
            }
            yf0Var.f472566f = cVar3;
        }
        return 0;
    }
}
