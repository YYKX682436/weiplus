package lx;

/* loaded from: classes11.dex */
public final class m2 implements com.p314xaae8f345.mm.p2621x8fb0427b.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.n2 f403398a;

    public m2(lx.n2 n2Var) {
        this.f403398a = n2Var;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.z1
    public final void a(java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 info;
        lx.n2 n2Var;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23304x40aed91d c23304x40aed91d;
        if (x1Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.y1 y1Var = x1Var.f277854a;
            if ((y1Var != com.p314xaae8f345.mm.p2621x8fb0427b.y1.INSERT && y1Var != com.p314xaae8f345.mm.p2621x8fb0427b.y1.MERGE_UPDATE) || (info = x1Var.f277855b) == null || (c23304x40aed91d = (n2Var = this.f403398a).f403411f) == null) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
            c23304x40aed91d.m85977x50707880(n2Var.a(info), n2Var.f403409d, lx.l2.f403379d);
        }
    }
}
