package r45;

/* loaded from: classes4.dex */
public class cm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453193d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453194e;

    /* renamed from: f, reason: collision with root package name */
    public long f453195f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cm)) {
            return false;
        }
        r45.cm cmVar = (r45.cm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453193d), java.lang.Integer.valueOf(cmVar.f453193d)) && n51.f.a(this.f453194e, cmVar.f453194e) && n51.f.a(java.lang.Long.valueOf(this.f453195f), java.lang.Long.valueOf(cmVar.f453195f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453193d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f453194e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f453195f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453193d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f453194e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.h(3, this.f453195f);
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
        r45.cm cmVar = (r45.cm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cmVar.f453193d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cmVar.f453194e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        cmVar.f453195f = aVar2.i(intValue);
        return 0;
    }
}
