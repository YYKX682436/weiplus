package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class q8 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f164399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r8 f164401c;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r8 r8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f164401c = r8Var;
        this.f164399a = d0Var;
        this.f164400b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.util.Map a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r8 r8Var = this.f164401c;
        if (i17 != (r8Var.hashCode() & 65535)) {
            return false;
        }
        int i19 = this.f164400b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f164399a;
        if (i18 == -1 && intent != null && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e.a(intent)) != null) {
            d0Var.a(i19, r8Var.p("ok", a17));
            return true;
        }
        if (i18 == 0) {
            d0Var.a(i19, r8Var.o("cancel"));
            return true;
        }
        d0Var.a(i19, r8Var.o("fail"));
        return true;
    }
}
