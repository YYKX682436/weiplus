package yr3;

/* loaded from: classes11.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f546263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f546264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yr3.c1 f546265f;

    public b1(boolean z17, boolean z18, yr3.c1 c1Var) {
        this.f546263d = z17;
        this.f546264e = z18;
        this.f546265f = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f546264e;
        boolean z18 = this.f546263d;
        int i17 = (z18 && z17) ? com.p314xaae8f345.mm.R.C30867xcad56011.pgy : (!z18 || z17) ? com.p314xaae8f345.mm.R.C30867xcad56011.pgx : com.p314xaae8f345.mm.R.C30867xcad56011.pgp;
        int i18 = com.p314xaae8f345.mm.R.raw.f80147x279b9ba8;
        if ((!z18 || !z17) && ((z18 && !z17) || z17)) {
            i18 = com.p314xaae8f345.mm.R.raw.f78375x49952d6a;
        }
        yr3.c1 c1Var = this.f546265f;
        c1Var.f546283o.setImageResource(i18);
        if (z18) {
            c1Var.f546290v = java.lang.Boolean.valueOf(!z17);
        }
        android.content.Context context = c1Var.f546278g;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(i17), null, activity, null, null);
        }
    }
}
