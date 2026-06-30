package a13;

/* loaded from: classes11.dex */
public final class e implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a13.t f543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f546d;

    public e(a13.t tVar, boolean z17, boolean z18, yz5.l lVar) {
        this.f543a = tVar;
        this.f544b = z17;
        this.f545c = z18;
        this.f546d = lVar;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipPlugin", "minimize, onResultAllow");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        a13.t tVar = this.f543a;
        kotlinx.coroutines.l.d(tVar.f576i, null, null, new a13.d(tVar, this.f544b, this.f545c, this.f546d, null), 3, null);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipPlugin", "minimize, onResultCancel");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f546d.invoke(java.lang.Boolean.FALSE);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipPlugin", "minimize, onResultRefuse");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f546d.invoke(java.lang.Boolean.FALSE);
    }
}
