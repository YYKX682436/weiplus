package r45;

/* loaded from: classes8.dex */
public class wf5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470668d;

    /* renamed from: e, reason: collision with root package name */
    public int f470669e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470670f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sm4 f470671g;

    /* renamed from: h, reason: collision with root package name */
    public r45.o90 f470672h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wf5)) {
            return false;
        }
        r45.wf5 wf5Var = (r45.wf5) fVar;
        return n51.f.a(this.f470668d, wf5Var.f470668d) && n51.f.a(java.lang.Integer.valueOf(this.f470669e), java.lang.Integer.valueOf(wf5Var.f470669e)) && n51.f.a(this.f470670f, wf5Var.f470670f) && n51.f.a(this.f470671g, wf5Var.f470671g) && n51.f.a(this.f470672h, wf5Var.f470672h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470668d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f470669e);
            java.lang.String str2 = this.f470670f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.sm4 sm4Var = this.f470671g;
            if (sm4Var != null) {
                fVar.i(4, sm4Var.mo75928xcd1e8d8());
                this.f470671g.mo75956x3d5d1f78(fVar);
            }
            r45.o90 o90Var = this.f470672h;
            if (o90Var != null) {
                fVar.i(5, o90Var.mo75928xcd1e8d8());
                this.f470672h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f470668d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f470669e);
            java.lang.String str4 = this.f470670f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.sm4 sm4Var2 = this.f470671g;
            if (sm4Var2 != null) {
                j17 += b36.f.i(4, sm4Var2.mo75928xcd1e8d8());
            }
            r45.o90 o90Var2 = this.f470672h;
            return o90Var2 != null ? j17 + b36.f.i(5, o90Var2.mo75928xcd1e8d8()) : j17;
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
        r45.wf5 wf5Var = (r45.wf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wf5Var.f470668d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wf5Var.f470669e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wf5Var.f470670f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.sm4 sm4Var3 = new r45.sm4();
                if (bArr != null && bArr.length > 0) {
                    sm4Var3.mo11468x92b714fd(bArr);
                }
                wf5Var.f470671g = sm4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.o90 o90Var3 = new r45.o90();
            if (bArr2 != null && bArr2.length > 0) {
                o90Var3.mo11468x92b714fd(bArr2);
            }
            wf5Var.f470672h = o90Var3;
        }
        return 0;
    }
}
