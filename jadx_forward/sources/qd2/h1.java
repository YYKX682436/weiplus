package qd2;

/* loaded from: classes8.dex */
public final class h1 extends qd2.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f443307a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f443308b;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f443307a = m8Var;
        this.f443308b = gVar;
    }

    @Override // qd2.q
    public void f(int i17, boolean z17, boolean z18) {
        super.f(i17, z17, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 h9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9(z17, z18, this.f443308b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var = this.f443307a;
        if (m8Var != null) {
            m8Var.c(h9Var);
        }
    }

    @Override // qd2.q
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var = this.f443307a;
        if (m8Var != null) {
            m8Var.b();
        }
    }
}
