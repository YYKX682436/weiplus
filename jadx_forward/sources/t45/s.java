package t45;

/* loaded from: classes2.dex */
public class s extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.n0 f497171d;

    /* renamed from: e, reason: collision with root package name */
    public int f497172e;

    /* renamed from: f, reason: collision with root package name */
    public long f497173f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.s)) {
            return false;
        }
        t45.s sVar = (t45.s) fVar;
        return n51.f.a(this.f497171d, sVar.f497171d) && n51.f.a(java.lang.Integer.valueOf(this.f497172e), java.lang.Integer.valueOf(sVar.f497172e)) && n51.f.a(java.lang.Long.valueOf(this.f497173f), java.lang.Long.valueOf(sVar.f497173f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.n0 n0Var = this.f497171d;
            if (n0Var != null) {
                fVar.i(1, n0Var.mo75928xcd1e8d8());
                this.f497171d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f497172e);
            fVar.h(3, this.f497173f);
            return 0;
        }
        if (i17 == 1) {
            t45.n0 n0Var2 = this.f497171d;
            return (n0Var2 != null ? 0 + b36.f.i(1, n0Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f497172e) + b36.f.h(3, this.f497173f);
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
        t45.s sVar = (t45.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                sVar.f497172e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            sVar.f497173f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr != null && bArr.length > 0) {
                n0Var3.mo11468x92b714fd(bArr);
            }
            sVar.f497171d = n0Var3;
        }
        return 0;
    }
}
