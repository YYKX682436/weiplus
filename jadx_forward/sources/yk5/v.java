package yk5;

/* loaded from: classes11.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb f544450d;

    public v(com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb activityC22593x47ef56eb) {
        this.f544450d = activityC22593x47ef56eb;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb activityC22593x47ef56eb = this.f544450d;
        if (!activityC22593x47ef56eb.f292715o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(activityC22593x47ef56eb.f292714n);
            sb6.append(",");
            sb6.append(activityC22593x47ef56eb.f292712i);
            sb6.append(",");
            java.lang.String[] strArr = activityC22593x47ef56eb.f292709f;
            sb6.append(strArr == null ? 0 : strArr.length);
            sb6.append(",0");
            g0Var.mo68478xbd3cda5f(10452, sb6.toString());
        }
        if (activityC22593x47ef56eb.f292716p) {
            activityC22593x47ef56eb.moveTaskToBack(true);
        }
        activityC22593x47ef56eb.finish();
        return true;
    }
}
