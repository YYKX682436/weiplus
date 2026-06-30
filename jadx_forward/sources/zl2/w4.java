package zl2;

/* loaded from: classes10.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.w4 f555550a = new zl2.w4();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f555551b;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLayoutInflater", "initMemoryTrim");
        ki.i.f389634c.c(new zl2.t4());
        f555551b = jz5.h.b(zl2.v4.f555538d);
    }

    public static final void a(zl2.w4 w4Var, java.lang.String str) {
        w4Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLayoutInflater", str + " lruDarkInflaterInfo cache Size:0,lruLightInflaterInfo cache Size:0!");
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveLayoutInflater-memoryTrim");
        }
    }

    public final android.view.View b(int i17, android.view.ViewGroup viewGroup, boolean z17, zl2.u4 mode, android.content.Context context, android.view.LayoutInflater layoutInflater) {
        android.view.View inflate;
        android.content.Context context2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutInflater, "layoutInflater");
        try {
            jz5.g gVar = f555551b;
            if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
                int ordinal = mode.ordinal();
                if (ordinal == 0) {
                    context2 = context;
                } else if (ordinal == 1) {
                    android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
                    j65.m.c(configuration, true);
                    context2 = context.createConfigurationContext(configuration);
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    android.content.res.Configuration configuration2 = new android.content.res.Configuration(context.getResources().getConfiguration());
                    j65.m.c(configuration2, false);
                    context2 = context.createConfigurationContext(configuration2);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                c("inflate", context, context2);
                inflate = com.p314xaae8f345.mm.ui.id.a(layoutInflater, context2).inflate(i17, viewGroup, z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLayoutInflater", "inflate but enableChangeSkin:" + ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() + '!');
                inflate = layoutInflater.inflate(i17, viewGroup, z17);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return inflate;
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveLayoutInflater-inflate-" + mode);
            android.view.View inflate2 = layoutInflater.inflate(i17, viewGroup, z17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return inflate2;
        }
    }

    public final void c(java.lang.String str, android.content.Context context, android.content.Context context2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLayoutInflater", str + " context:" + context + ",context resources:" + context.getResources() + ",context resources config:" + context.getResources().getConfiguration() + "\napplication context:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a + ",app resources:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources() + ",app resources config:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration() + "\ncopyContext:" + context2 + ",copy resources:" + context2.getResources() + ",copy resources config:" + context2.getResources().getConfiguration() + '!');
    }
}
