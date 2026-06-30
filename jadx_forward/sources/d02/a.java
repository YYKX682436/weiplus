package d02;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f306802d;

    /* renamed from: e, reason: collision with root package name */
    public long f306803e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f306804f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.a)) {
            return false;
        }
        d02.a aVar = (d02.a) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f306802d), java.lang.Long.valueOf(aVar.f306802d)) && n51.f.a(java.lang.Long.valueOf(this.f306803e), java.lang.Long.valueOf(aVar.f306803e)) && n51.f.a(this.f306804f, aVar.f306804f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f306802d);
            fVar.h(2, this.f306803e);
            java.lang.String str = this.f306804f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f306802d) + 0 + b36.f.h(2, this.f306803e);
            java.lang.String str2 = this.f306804f;
            return str2 != null ? h17 + b36.f.j(3, str2) : h17;
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
        d02.a aVar3 = (d02.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f306802d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f306803e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        aVar3.f306804f = aVar2.k(intValue);
        return 0;
    }
}
