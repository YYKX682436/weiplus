package r45;

/* loaded from: classes2.dex */
public class v96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.l95 f469542d;

    /* renamed from: e, reason: collision with root package name */
    public int f469543e;

    /* renamed from: f, reason: collision with root package name */
    public int f469544f;

    /* renamed from: g, reason: collision with root package name */
    public int f469545g;

    /* renamed from: h, reason: collision with root package name */
    public int f469546h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v96)) {
            return false;
        }
        r45.v96 v96Var = (r45.v96) fVar;
        return n51.f.a(this.f469542d, v96Var.f469542d) && n51.f.a(java.lang.Integer.valueOf(this.f469543e), java.lang.Integer.valueOf(v96Var.f469543e)) && n51.f.a(java.lang.Integer.valueOf(this.f469544f), java.lang.Integer.valueOf(v96Var.f469544f)) && n51.f.a(java.lang.Integer.valueOf(this.f469545g), java.lang.Integer.valueOf(v96Var.f469545g)) && n51.f.a(java.lang.Integer.valueOf(this.f469546h), java.lang.Integer.valueOf(v96Var.f469546h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.l95 l95Var = this.f469542d;
            if (l95Var != null) {
                fVar.i(1, l95Var.mo75928xcd1e8d8());
                this.f469542d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f469543e);
            fVar.e(3, this.f469544f);
            fVar.e(4, this.f469545g);
            fVar.e(5, this.f469546h);
            return 0;
        }
        if (i17 == 1) {
            r45.l95 l95Var2 = this.f469542d;
            return (l95Var2 != null ? 0 + b36.f.i(1, l95Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469543e) + b36.f.e(3, this.f469544f) + b36.f.e(4, this.f469545g) + b36.f.e(5, this.f469546h);
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
        r45.v96 v96Var = (r45.v96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.l95 l95Var3 = new r45.l95();
                if (bArr != null && bArr.length > 0) {
                    l95Var3.mo11468x92b714fd(bArr);
                }
                v96Var.f469542d = l95Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            v96Var.f469543e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            v96Var.f469544f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            v96Var.f469545g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        v96Var.f469546h = aVar2.g(intValue);
        return 0;
    }
}
