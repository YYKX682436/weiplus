package t45;

/* loaded from: classes2.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f497161d;

    /* renamed from: e, reason: collision with root package name */
    public t45.q0 f497162e;

    /* renamed from: f, reason: collision with root package name */
    public long f497163f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f497164g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.p0)) {
            return false;
        }
        t45.p0 p0Var = (t45.p0) fVar;
        return n51.f.a(this.f497161d, p0Var.f497161d) && n51.f.a(this.f497162e, p0Var.f497162e) && n51.f.a(java.lang.Long.valueOf(this.f497163f), java.lang.Long.valueOf(p0Var.f497163f)) && n51.f.a(this.f497164g, p0Var.f497164g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f497161d;
            if (str != null) {
                fVar.j(1, str);
            }
            t45.q0 q0Var = this.f497162e;
            if (q0Var != null) {
                fVar.i(2, q0Var.mo75928xcd1e8d8());
                this.f497162e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f497163f);
            java.lang.String str2 = this.f497164g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f497161d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            t45.q0 q0Var2 = this.f497162e;
            if (q0Var2 != null) {
                j17 += b36.f.i(2, q0Var2.mo75928xcd1e8d8());
            }
            int h17 = j17 + b36.f.h(3, this.f497163f);
            java.lang.String str4 = this.f497164g;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        t45.p0 p0Var = (t45.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p0Var.f497161d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                p0Var.f497163f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            p0Var.f497164g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            t45.q0 q0Var3 = new t45.q0();
            if (bArr != null && bArr.length > 0) {
                q0Var3.mo11468x92b714fd(bArr);
            }
            p0Var.f497162e = q0Var3;
        }
        return 0;
    }
}
