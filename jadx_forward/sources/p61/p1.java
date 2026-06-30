package p61;

/* loaded from: classes5.dex */
public class p1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 f433878d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 activityC11362x5f9e5504) {
        this.f433878d = activityC11362x5f9e5504;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 activityC11362x5f9e5504 = this.f433878d;
        sb6.append(activityC11362x5f9e5504.f154522i.getText().toString().trim());
        d71.d dVar = activityC11362x5f9e5504.f154530t;
        java.lang.String phoneNum = activityC11362x5f9e5504.f154518e.getText().toString();
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneNum, "phoneNum");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\D");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(phoneNum).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        sb6.append(replaceAll);
        java.lang.String sb7 = sb6.toString();
        activityC11362x5f9e5504.f154523m = sb7;
        if (sb7.length() > 0) {
            java.lang.String obj = activityC11362x5f9e5504.f154518e.getText().toString();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (obj.replaceAll("[\\.\\-]", "").trim().length() > 0) {
                activityC11362x5f9e5504.a7(activityC11362x5f9e5504.f154523m);
                return true;
            }
        }
        db5.e1.i(activityC11362x5f9e5504, com.p314xaae8f345.mm.R.C30867xcad56011.agr, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        return true;
    }
}
