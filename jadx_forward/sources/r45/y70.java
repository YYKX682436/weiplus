package r45;

/* loaded from: classes8.dex */
public class y70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f472366d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472367e;

    /* renamed from: f, reason: collision with root package name */
    public int f472368f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f472369g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f472370h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y70)) {
            return false;
        }
        r45.y70 y70Var = (r45.y70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f472366d), java.lang.Long.valueOf(y70Var.f472366d)) && n51.f.a(this.f472367e, y70Var.f472367e) && n51.f.a(java.lang.Integer.valueOf(this.f472368f), java.lang.Integer.valueOf(y70Var.f472368f)) && n51.f.a(this.f472369g, y70Var.f472369g) && n51.f.a(java.lang.Boolean.valueOf(this.f472370h), java.lang.Boolean.valueOf(y70Var.f472370h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472369g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f472366d);
            java.lang.String str = this.f472367e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f472368f);
            fVar.g(4, 8, linkedList);
            fVar.a(5, this.f472370h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f472366d) + 0;
            java.lang.String str2 = this.f472367e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.e(3, this.f472368f) + b36.f.g(4, 8, linkedList) + b36.f.a(5, this.f472370h);
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
        r45.y70 y70Var = (r45.y70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y70Var.f472366d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            y70Var.f472367e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y70Var.f472368f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            y70Var.f472370h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.x70 x70Var = new r45.x70();
            if (bArr2 != null && bArr2.length > 0) {
                x70Var.mo11468x92b714fd(bArr2);
            }
            y70Var.f472369g.add(x70Var);
        }
        return 0;
    }
}
