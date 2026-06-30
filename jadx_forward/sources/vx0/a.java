package vx0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final vx0.a f522754a = new vx0.a();

    public final void a(boolean z17, java.lang.String templateID, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
        if (z17) {
            if (z18) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m0Var);
            pp0.m0.V8(m0Var, kz5.b1.e(new jz5.l("is_template_downloaded", "1")), "mjpublisher_sc_switch_template", null, 4, null);
            pp0.m0.V8(m0Var, kz5.b1.e(new jz5.l("is_template_downloaded", "1")), "mjpublisher_first_load_template", null, 4, null);
            return;
        }
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.o7 o7Var = (yy0.o7) m0Var;
        o7Var.Bi("mjpublisher_sc_download_template", templateID);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("mj_publisher_session_id", ((yy0.m7) l0Var).Ri());
        lVarArr[1] = new jz5.l("template_id", templateID);
        lVarArr[2] = new jz5.l("is_preload", z18 ? "1" : "0");
        o7Var.wi(kz5.c1.k(lVarArr), "mjpublisher_sc_download_template", templateID);
        pp0.m0.V8(o7Var, kz5.b1.e(new jz5.l("is_template_downloaded", "0")), "mjpublisher_sc_switch_template", null, 4, null);
        pp0.m0.V8(o7Var, kz5.b1.e(new jz5.l("is_template_downloaded", "0")), "mjpublisher_first_load_template", null, 4, null);
    }
}
