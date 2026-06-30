package dy0;

/* loaded from: classes5.dex */
public abstract class o {
    public static final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        if ((c1163xf1deaba4.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && i17 >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (i17 < (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0)) {
                try {
                    android.content.Context context = c1163xf1deaba4.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    dy0.m mVar = new dy0.m(context, z17 ? 200 : 0);
                    mVar.f93582a = i17;
                    c1163xf1deaba4.post(new dy0.n(c1163xf1deaba4, mVar));
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public static /* synthetic */ void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        a(c1163xf1deaba4, i17, z17);
    }
}
