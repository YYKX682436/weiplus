package km4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f390828f;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f390826d = h0Var;
        this.f390827e = lVar;
        this.f390828f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f390826d;
        android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) h0Var.f391656d;
        boolean z17 = false;
        if (progressDialog != null && progressDialog.isShowing()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingAdHelper", "openAD time expire cancel");
            km4.l.d(h0Var);
            km4.l.c(this.f390827e, this.f390828f, h0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3);
            km4.l.f390829a.a(13, null);
        }
    }
}
