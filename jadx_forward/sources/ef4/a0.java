package ef4;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef4.a0 f333968a = new ef4.a0();

    public final void a(java.lang.String username, long j17, int i17, java.lang.String str, java.lang.String str2, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        nf4.g g17 = ef4.w.f334001t.g();
        java.lang.String str3 = str == null ? "" : str;
        java.lang.String str4 = str2 == null ? "" : str2;
        nf4.f J0 = g17.J0(username);
        if (J0 == null) {
            J0 = g17.L0(username);
        }
        boolean t07 = J0.t0();
        boolean m149512x7b953cf2 = J0.m149512x7b953cf2();
        if (((java.lang.Boolean) ((nf4.e) nf4.f.X).mo149xb9724478(java.lang.Long.valueOf(J0.f66294x10ed17fb), java.lang.Long.valueOf(j17))).booleanValue()) {
            J0.f66295xa783a79b = i17 * 1000;
        }
        J0.f66294x10ed17fb = j17;
        if (J0.f66289x3194108c != j17) {
            J0.f66289x3194108c = 0L;
            J0.f66288xd9f687bb = "";
            J0.f66287x90029412 = 0L;
        }
        J0.f66293xb7d4dd1d = i17;
        J0.f66285x140d09b4 = str3;
        J0.f66286xfb4868ef = str4;
        J0.f66281xa7075739 = j18;
        boolean b17 = g17.b1(J0);
        boolean t08 = J0.t0();
        boolean m149512x7b953cf22 = J0.m149512x7b953cf2();
        if (b17 && m149512x7b953cf2 && !m149512x7b953cf22) {
            g17.mo142179xf35bbb4("notify_story_invalid", 4, J0);
            return;
        }
        if (b17 && !t07 && t08) {
            g17.mo142179xf35bbb4("notify_story_unread", 2, J0);
            return;
        }
        if (b17 && t07 && !t08) {
            g17.mo142179xf35bbb4("notify_story_read", 1, J0);
            return;
        }
        if (b17 && !m149512x7b953cf2 && m149512x7b953cf22) {
            g17.mo142179xf35bbb4("notify_story_valid", 5, J0);
        } else if (b17 && t07 && t08) {
            g17.mo142179xf35bbb4("notify_story_unread", 2, J0);
        }
    }

    public final void b(java.lang.String username, nf4.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (jVar != null) {
            r45.lf6 y07 = jVar.y0();
            if (y07.f460965h.f463738e.size() <= 0 || ((r45.xe6) y07.f460965h.f463738e.get(0)).f471558h == null || ((r45.xe6) y07.f460965h.f463738e.get(0)).f471556f == null) {
                return;
            }
            f333968a.a(username, jVar.f69410x443468b, jVar.f69403xac3be4e, ((r45.xe6) y07.f460965h.f463738e.get(0)).f471558h, ((r45.xe6) y07.f460965h.f463738e.get(0)).f471556f, ((r45.xe6) y07.f460965h.f463738e.get(0)).f471573z * 1000);
        }
    }
}
