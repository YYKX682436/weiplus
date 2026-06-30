package hx4;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f367197d;

    public c(hx4.p pVar) {
        this.f367197d = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        hx4.p pVar = this.f367197d;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "showSettingDialog");
        lx4.j jVar = new lx4.j(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613) pVar.f367215a).mo55332x76847179());
        jVar.setOnKeyListener(new hx4.l(jVar, pVar));
        jVar.setOnCancelListener(new hx4.m(pVar));
        hx4.g gVar = pVar.f367222h;
        hx4.x xVar = (hx4.x) kz5.n0.a0(pVar.f367217c, pVar.f367219e);
        if (xVar == null) {
            xVar = new hx4.x(2);
        }
        gVar.f367202a = xVar;
        hx4.g gVar2 = pVar.f367222h;
        jVar.f403671g = gVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55 = jVar.f403670f;
        if (c19355x505bfc55 != null) {
            c19355x505bfc55.m74431xb9f3e28a(gVar2);
        }
        jVar.f403673i = pVar.f367219e;
        java.util.List list = pVar.f367217c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        jVar.f403672h = list;
        pVar.f367220f = jVar;
        ku5.u0 u0Var = ku5.t0.f394148d;
        hx4.n nVar = new hx4.n(pVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(nVar, 100L, false);
    }
}
