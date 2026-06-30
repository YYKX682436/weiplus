package xq2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.c f537576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vp2.c cVar, java.lang.String str) {
        super(0);
        this.f537576d = cVar;
        this.f537577e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        r45.xz2 xz2Var = new r45.xz2();
        r45.kv0 a17 = db2.t4.f309704a.a(10200);
        vp2.c cVar = this.f537576d;
        r45.le1 le1Var = cVar.f520443d;
        if (le1Var.B == 2) {
            i17 = 329;
        } else {
            r45.vz2 vz2Var = le1Var.f460891r;
            i17 = vz2Var != null && vz2Var.f470231p == 10 ? 260 : 261;
        }
        a17.set(1, java.lang.Integer.valueOf(i17));
        xz2Var.f472143d = a17;
        xz2Var.f472149m = 28;
        xz2Var.f472159w = cVar.f520444e.f455658d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
        xz2Var.f472144e = null;
        xz2Var.f472161y = new java.util.LinkedList();
        xz2Var.B = this.f537577e;
        r45.le1 le1Var2 = cVar.f520443d;
        int i18 = le1Var2.f460881e;
        if (i18 == 4) {
            java.util.LinkedList anchor_group = le1Var2.f460895v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(anchor_group, "anchor_group");
            r45.ne1 ne1Var = (r45.ne1) kz5.n0.a0(anchor_group, 0);
            if (ne1Var != null) {
                gVar = ne1Var.f462840e;
            }
        } else if (i18 == 5) {
            java.util.LinkedList product_group = le1Var2.f460896w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(product_group, "product_group");
            r45.ue1 ue1Var = (r45.ue1) kz5.n0.a0(product_group, 0);
            if (ue1Var != null) {
                gVar = ue1Var.f468827g;
            }
        }
        xz2Var.D = gVar;
        xz2Var.E = le1Var2.f460898y;
        return (az2.j) xz2Var.b();
    }
}
