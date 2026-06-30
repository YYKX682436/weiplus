package cs1;

/* loaded from: classes3.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(android.content.Context context, int i17, java.lang.String userName, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizTimeLineMultiTaskCoverCreator", "createPageTitle, type = " + i17);
        if (i17 != 8) {
            if (i17 != 10) {
                return title;
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.e(title);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            return e17;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e18 = c01.a2.e(userName);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.amn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{e18}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
