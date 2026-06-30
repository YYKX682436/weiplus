package r45;

/* loaded from: classes4.dex */
public class ef6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f454941d;

    /* renamed from: e, reason: collision with root package name */
    public int f454942e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f454943f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef6)) {
            return false;
        }
        r45.ef6 ef6Var = (r45.ef6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f454941d), java.lang.Long.valueOf(ef6Var.f454941d)) && n51.f.a(java.lang.Integer.valueOf(this.f454942e), java.lang.Integer.valueOf(ef6Var.f454942e)) && n51.f.a(this.f454943f, ef6Var.f454943f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f454941d);
            fVar.e(2, this.f454942e);
            r45.cu5 cu5Var = this.f454943f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f454943f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f454941d) + 0 + b36.f.e(2, this.f454942e);
            r45.cu5 cu5Var2 = this.f454943f;
            return cu5Var2 != null ? h17 + b36.f.i(3, cu5Var2.mo75928xcd1e8d8()) : h17;
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
        r45.ef6 ef6Var = (r45.ef6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ef6Var.f454941d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ef6Var.f454942e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            ef6Var.f454943f = cu5Var3;
        }
        return 0;
    }
}
