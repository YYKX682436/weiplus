package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class y0 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.d1 f71165b;

    public y0(int i17, com.tencent.mm.modelcdntran.d1 d1Var) {
        this.f71164a = i17;
        this.f71165b = d1Var;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        bz4.n0 n0Var = (bz4.n0) ((com.tencent.mm.modelcdntran.o3) nVar);
        n0Var.getClass();
        hz4.k a17 = hz4.k.a(bt3.g2.z(this.f71165b));
        if (this.f71164a == 4) {
            return false;
        }
        a17.field_status = 2;
        n0Var.b(a17);
        return false;
    }
}
