package hc2;

/* loaded from: classes10.dex */
public abstract class t {
    public static final int a(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        return i65.a.b(context, (i17 * 15) + 1);
    }

    public static final java.lang.String b(android.content.Context context, int i17) {
        if (i17 == 2) {
            return c01.z1.l();
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        ya2.g gVar = ya2.h.f542017a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        return b17 != null ? b17.w0() : "";
    }

    public static final java.lang.String c(android.content.Context context, int i17) {
        if (i17 == 2) {
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            return r17;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return xy2.c.e(context);
    }

    public static final boolean d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null) {
            return false;
        }
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("finder_username");
        boolean booleanExtra = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC21394xb3d2c0cf.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, xy2.c.e(mo55332x76847179)) && booleanExtra;
    }
}
