package si1;

/* loaded from: classes7.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f489812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 f489813e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 d9Var) {
        this.f489812d = d0Var;
        this.f489813e = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f489812d;
        android.content.Context mo50352x76847179 = d0Var.mo50352x76847179();
        if (mo50352x76847179 == null || d0Var.mo50353x784fb1e3() == null) {
            return;
        }
        fl1.b bVar = new fl1.b(mo50352x76847179);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 d9Var = this.f489813e;
        bVar.setTitle(d9Var.f274070a);
        bVar.t(d9Var.f274071b);
        java.lang.String str = d9Var.f274073d;
        if (!(str == null || str.length() == 0)) {
            bVar.w(d9Var.f274073d, true, d9Var.f274075f);
        }
        bVar.A(d9Var.f274072c, true, d9Var.f274074e);
        bVar.setOnDismissListener(new si1.n1(d9Var));
        fl1.g2 mo50353x784fb1e3 = d0Var.mo50353x784fb1e3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50353x784fb1e3);
        mo50353x784fb1e3.c(bVar);
    }
}
