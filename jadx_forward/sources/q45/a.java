package q45;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f441653d;

    /* renamed from: e, reason: collision with root package name */
    public int f441654e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f441655f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f441656g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof q45.a)) {
            return false;
        }
        q45.a aVar = (q45.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f441653d), java.lang.Integer.valueOf(aVar.f441653d)) && n51.f.a(java.lang.Integer.valueOf(this.f441654e), java.lang.Integer.valueOf(aVar.f441654e)) && n51.f.a(this.f441655f, aVar.f441655f) && n51.f.a(this.f441656g, aVar.f441656g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f441653d);
            fVar.e(2, this.f441654e);
            java.lang.String str = this.f441655f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f441656g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f441653d) + 0 + b36.f.e(2, this.f441654e);
            java.lang.String str3 = this.f441655f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f441656g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        q45.a aVar3 = (q45.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f441653d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f441654e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f441655f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        aVar3.f441656g = aVar2.k(intValue);
        return 0;
    }
}
