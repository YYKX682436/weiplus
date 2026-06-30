package aj4;

/* loaded from: classes10.dex */
public final class o implements xj4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity f5343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f5344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f5346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f5347f;

    public o(int i17, com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity, kotlin.jvm.internal.h0 h0Var, java.lang.String str, yz5.a aVar, yz5.a aVar2) {
        this.f5342a = i17;
        this.f5343b = statusFlutterPublishActivity;
        this.f5344c = h0Var;
        this.f5345d = str;
        this.f5346e = aVar;
        this.f5347f = aVar2;
    }

    @Override // xj4.b
    public final void a(int i17, java.lang.String[] strArr, int[] grantResults) {
        kotlin.jvm.internal.o.g(strArr, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 != this.f5342a) {
            return;
        }
        java.lang.Object obj = this.f5344c.f310123d;
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity = this.f5343b;
        statusFlutterPublishActivity.getClass();
        statusFlutterPublishActivity.C.remove((xj4.b) obj);
        boolean z17 = ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "checkPermissionThenRun: permission=" + this.f5345d + ", granted=" + z17);
        (z17 ? this.f5346e : this.f5347f).invoke();
    }
}
