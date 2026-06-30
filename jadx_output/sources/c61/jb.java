package c61;

/* loaded from: classes8.dex */
public final class jb implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f39074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c61.ob f39076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xc f39077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f39078e;

    public jb(android.app.Activity activity, android.content.Intent intent, c61.ob obVar, com.tencent.mm.ui.xc xcVar, io.flutter.plugin.common.MethodChannel.Result result) {
        this.f39074a = activity;
        this.f39075b = intent;
        this.f39076c = obVar;
        this.f39077d = xcVar;
        this.f39078e = result;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        c61.ob obVar = this.f39076c;
        if (!booleanValue) {
            c61.ob.b(obVar);
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker permission denied");
            this.f39078e.error("selectFiles", "Storage permission denied", null);
        } else {
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) this.f39074a;
            obVar.getClass();
            j45.l.x(mMFragmentActivity, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", this.f39075b, 8193, this.f39077d);
        }
    }
}
