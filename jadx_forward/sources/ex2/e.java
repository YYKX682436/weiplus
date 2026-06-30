package ex2;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ex2.e f338737a = new ex2.e();

    public final java.lang.String a(ex2.a aVar, android.content.Context context) {
        java.lang.String str = aVar.f338727a;
        if (!(str == null || str.length() == 0)) {
            return aVar.f338727a;
        }
        if (aVar.f338729c) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    public final int b(android.content.Context context, int i17) {
        return i17 != 1 ? i17 != 6 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560296gj) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560286g9) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax);
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 c(android.content.Context context, android.view.View contentView, ex2.a leftBtnConfig, ex2.a rightBtnConfig, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leftBtnConfig, "leftBtnConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rightBtnConfig, "rightBtnConfig");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0);
        z2Var.m(a(leftBtnConfig, context), a(rightBtnConfig, context));
        int i17 = leftBtnConfig.f338728b;
        z2Var.v(b(context, i17));
        int i18 = rightBtnConfig.f338728b;
        int b17 = b(context, i18);
        android.widget.Button button = z2Var.f293602u;
        if (button != null) {
            button.setTextColor(b17);
        }
        z2Var.n(i17);
        z2Var.o(i18);
        ex2.b bVar = new ex2.b(leftBtnConfig, z2Var);
        ex2.c cVar = new ex2.c(rightBtnConfig, z2Var);
        z2Var.D = bVar;
        z2Var.E = cVar;
        z2Var.j(contentView);
        if (view != null) {
            z2Var.p(view);
        }
        z2Var.C();
        return z2Var;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 d(android.content.Context context, android.view.View contentView, ex2.a btnConfig, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnConfig, "btnConfig");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0);
        java.lang.String str = btnConfig.f338727a;
        if (str == null || str.length() == 0) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        z2Var.y(str);
        z2Var.x(btnConfig.f338728b);
        z2Var.F = new ex2.d(btnConfig, z2Var);
        z2Var.j(contentView);
        if (view != null) {
            z2Var.p(view);
        }
        z2Var.C();
        return z2Var;
    }
}
