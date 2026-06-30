package aj4;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f86855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj4.i f86856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f86857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f86858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.kb f86859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f86860i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity, aj4.i iVar, zi4.r1 r1Var, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, bw5.kb kbVar, long j17) {
        super(0);
        this.f86855d = activity;
        this.f86856e = iVar;
        this.f86857f = r1Var;
        this.f86858g = activityC0053x3d3f670c;
        this.f86859h = kbVar;
        this.f86860i = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aj4.i iVar = this.f86856e;
        zi4.r1 r1Var = this.f86857f;
        aj4.e eVar = new aj4.e(iVar, r1Var);
        aj4.g gVar = new aj4.g(this.f86858g, this.f86859h, this.f86860i, iVar, r1Var);
        android.app.Activity activity = this.f86855d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(activity, "android.permission.CAMERA", true)) {
            gVar.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834) activity : null;
            if (activityC18678x2dd96834 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatusFlutterMediaProvider", "checkPermissionThenRun: activity is not StatusFlutterPublishActivity, fallback to checkPermission");
                if (j35.u.a(activity, "android.permission.CAMERA", 18, "", "")) {
                    gVar.mo152xb9724478();
                } else {
                    eVar.mo152xb9724478();
                }
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                aj4.o oVar = new aj4.o(18, activityC18678x2dd96834, h0Var, "android.permission.CAMERA", gVar, eVar);
                h0Var.f391656d = oVar;
                activityC18678x2dd96834.C.addIfAbsent(oVar);
                j35.u.l(activity, new java.lang.String[]{"android.permission.CAMERA"}, 18);
            }
        }
        return jz5.f0.f384359a;
    }
}
