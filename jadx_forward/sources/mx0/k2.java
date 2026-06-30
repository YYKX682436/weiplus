package mx0;

/* loaded from: classes5.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f413627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(mx0.q2 q2Var) {
        super(0);
        this.f413627d = q2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mx0.q2 q2Var = this.f413627d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = q2Var.f413780u;
        if (c16993xacc19624 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("configProvider");
            throw null;
        }
        android.content.Context context = q2Var.f413766d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        mx0.k3 k3Var = new mx0.k3(c16993xacc19624, context, new mx0.a2(q2Var));
        st3.k kVar = new st3.k();
        kVar.f494084f = st3.v.f494142h;
        kVar.f494082d = false;
        mx0.n3 o17 = k3Var.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingMusicPickerDrawerImpl", "setup: ");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10976xccdd83a4) o17.e()).u(new yu3.b(new yu3.a(kVar.f494084f.ordinal(), true, null, null, 0L, 0L, false, 1, null, null, uc1.a2.f76842x366c91de, null), false, kVar, false), false);
        k3Var.f303894k = new mx0.b2(q2Var);
        k3Var.f303895l = new mx0.c2(q2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i95.n0.c(m40.k0.class), "getService(...)");
        k3Var.f303896m = new mx0.d2(q2Var, !((c61.p7) ((m40.k0) r3)).hj(m40.j0.f404946i), null);
        k3Var.f303897n = new mx0.e2(q2Var);
        k3Var.b(new mx0.f2(k3Var, q2Var), new mx0.g2(k3Var, q2Var), null, 200);
        return k3Var;
    }
}
