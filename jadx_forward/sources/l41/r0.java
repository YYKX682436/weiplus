package l41;

/* loaded from: classes15.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397445a;

    public r0(l41.j1 j1Var) {
        this.f397445a = j1Var;
    }

    public void a(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        l41.j1 j1Var = this.f397445a;
        j1Var.getClass();
        boolean z17 = false;
        if (i18 == -3601) {
            boolean z18 = errMsg.length() > 0;
            android.app.Activity activity = j1Var.f397375a;
            if (!z18) {
                errMsg = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hex);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(errMsg);
            }
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y17 = db5.e1.y(activity, "", errMsg, string, new l41.b1(j1Var));
            if (y17 != null) {
                y17.setCancelable(false);
            }
            if (y17 != null) {
                y17.setCanceledOnTouchOutside(false);
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        l41.e2.c(j1Var.l(), j1Var.m(), false, 2, "get contact failed");
        j1Var.g(2, "get contact failed");
    }
}
