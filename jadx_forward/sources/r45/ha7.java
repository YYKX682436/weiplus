package r45;

/* loaded from: classes8.dex */
public class ha7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457524d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ja7 f457525e;

    /* renamed from: f, reason: collision with root package name */
    public long f457526f;

    /* renamed from: g, reason: collision with root package name */
    public int f457527g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ha7)) {
            return false;
        }
        r45.ha7 ha7Var = (r45.ha7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457524d), java.lang.Integer.valueOf(ha7Var.f457524d)) && n51.f.a(this.f457525e, ha7Var.f457525e) && n51.f.a(java.lang.Long.valueOf(this.f457526f), java.lang.Long.valueOf(ha7Var.f457526f)) && n51.f.a(java.lang.Integer.valueOf(this.f457527g), java.lang.Integer.valueOf(ha7Var.f457527g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457524d);
            r45.ja7 ja7Var = this.f457525e;
            if (ja7Var != null) {
                fVar.i(2, ja7Var.mo75928xcd1e8d8());
                this.f457525e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f457526f);
            fVar.e(4, this.f457527g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457524d) + 0;
            r45.ja7 ja7Var2 = this.f457525e;
            if (ja7Var2 != null) {
                e17 += b36.f.i(2, ja7Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.h(3, this.f457526f) + b36.f.e(4, this.f457527g);
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
        r45.ha7 ha7Var = (r45.ha7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ha7Var.f457524d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ha7Var.f457526f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ha7Var.f457527g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ja7 ja7Var3 = new r45.ja7();
            if (bArr != null && bArr.length > 0) {
                ja7Var3.mo11468x92b714fd(bArr);
            }
            ha7Var.f457525e = ja7Var3;
        }
        return 0;
    }
}
