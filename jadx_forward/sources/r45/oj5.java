package r45;

/* loaded from: classes2.dex */
public class oj5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463835d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463836e;

    /* renamed from: f, reason: collision with root package name */
    public int f463837f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yt5 f463838g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oj5)) {
            return false;
        }
        r45.oj5 oj5Var = (r45.oj5) fVar;
        return n51.f.a(this.f76492x92037252, oj5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463835d), java.lang.Integer.valueOf(oj5Var.f463835d)) && n51.f.a(this.f463836e, oj5Var.f463836e) && n51.f.a(java.lang.Integer.valueOf(this.f463837f), java.lang.Integer.valueOf(oj5Var.f463837f)) && n51.f.a(this.f463838g, oj5Var.f463838g);
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
            fVar.e(2, this.f463835d);
            java.lang.String str = this.f463836e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f463837f);
            r45.yt5 yt5Var = this.f463838g;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.mo75928xcd1e8d8());
                this.f463838g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463835d);
            java.lang.String str2 = this.f463836e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f463837f);
            r45.yt5 yt5Var2 = this.f463838g;
            return yt5Var2 != null ? e17 + b36.f.i(5, yt5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.oj5 oj5Var = (r45.oj5) objArr[1];
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
                oj5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oj5Var.f463835d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            oj5Var.f463836e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            oj5Var.f463837f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.yt5 yt5Var3 = new r45.yt5();
            if (bArr2 != null && bArr2.length > 0) {
                yt5Var3.mo11468x92b714fd(bArr2);
            }
            oj5Var.f463838g = yt5Var3;
        }
        return 0;
    }
}
