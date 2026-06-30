package aj4;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f5322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj4.i f5323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f5324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f5325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.kb f5326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5327i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity, aj4.i iVar, zi4.r1 r1Var, androidx.activity.ComponentActivity componentActivity, bw5.kb kbVar, long j17) {
        super(0);
        this.f5322d = activity;
        this.f5323e = iVar;
        this.f5324f = r1Var;
        this.f5325g = componentActivity;
        this.f5326h = kbVar;
        this.f5327i = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aj4.i iVar = this.f5323e;
        zi4.r1 r1Var = this.f5324f;
        aj4.e eVar = new aj4.e(iVar, r1Var);
        aj4.g gVar = new aj4.g(this.f5325g, this.f5326h, this.f5327i, iVar, r1Var);
        android.app.Activity activity = this.f5322d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(activity, "android.permission.CAMERA", true)) {
            gVar.invoke();
        } else {
            com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity = activity instanceof com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity ? (com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity) activity : null;
            if (statusFlutterPublishActivity == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatusFlutterMediaProvider", "checkPermissionThenRun: activity is not StatusFlutterPublishActivity, fallback to checkPermission");
                if (j35.u.a(activity, "android.permission.CAMERA", 18, "", "")) {
                    gVar.invoke();
                } else {
                    eVar.invoke();
                }
            } else {
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                aj4.o oVar = new aj4.o(18, statusFlutterPublishActivity, h0Var, "android.permission.CAMERA", gVar, eVar);
                h0Var.f310123d = oVar;
                statusFlutterPublishActivity.C.addIfAbsent(oVar);
                j35.u.l(activity, new java.lang.String[]{"android.permission.CAMERA"}, 18);
            }
        }
        return jz5.f0.f302826a;
    }
}
