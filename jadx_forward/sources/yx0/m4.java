package yx0;

/* loaded from: classes5.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(yx0.b8 b8Var) {
        super(1);
        this.f548987d = b8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String templateId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        yx0.b8 b8Var = this.f548987d;
        b8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "reportSwitchTemplateFinish: templateId=".concat(templateId));
        if (b8Var.I1) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCLoadFirstTemplate", "MJShootComposing", "", 0);
            b8Var.I1 = false;
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCSwitchTemplate", "MJShootComposing", templateId, 0);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("MCToSC", "MJShootComposing", "", 0);
        pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m0Var);
        pp0.m0.ee(m0Var, "mjpublisher_sc_switch_template", null, "Completed", null, 8, null);
        pp0.m0.ee(m0Var, "mjpublisher_sc_apply_template", null, "Completed", null, 8, null);
        pp0.m0.ee(m0Var, "mjpublisher_first_load_template", null, "Completed", null, 8, null);
        return jz5.f0.f384359a;
    }
}
