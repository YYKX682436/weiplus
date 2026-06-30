package t53;

/* loaded from: classes8.dex */
public final class u implements u53.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f497358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f497359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f497360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f497361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t53.j f497362h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f497363i;

    public u(ik1.b0 b0Var, ik1.b0 b0Var2, java.lang.String str, android.app.ProgressDialog progressDialog, t53.m0 m0Var, android.content.Context context, int i17, t53.j jVar, u53.c0 c0Var) {
        this.f497355a = b0Var;
        this.f497356b = b0Var2;
        this.f497357c = str;
        this.f497358d = progressDialog;
        this.f497359e = m0Var;
        this.f497360f = context;
        this.f497361g = i17;
        this.f497362h = jVar;
        this.f497363i = c0Var;
    }

    @Override // u53.v
    public void a(boolean z17, boolean z18) {
        this.f497355a.f373357a = java.lang.Boolean.valueOf(z18);
        this.f497356b.f373357a = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "isBlackListAssociateWithWAGame userName:%s,isAssociate:%b,isOwnBlack:%b", this.f497357c, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        android.app.ProgressDialog progressDialog = this.f497358d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f497358d.dismiss();
        t53.m0 m0Var = this.f497359e;
        android.content.Context context = this.f497360f;
        java.lang.String userName = this.f497357c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "$userName");
        int i17 = this.f497361g;
        ik1.b0 b0Var = this.f497355a;
        ik1.b0 b0Var2 = this.f497356b;
        t53.j jVar = this.f497362h;
        u53.c0 sessionInfo = this.f497363i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionInfo, "$sessionInfo");
        m0Var.ij(context, userName, i17, b0Var, b0Var2, jVar, sessionInfo);
    }
}
