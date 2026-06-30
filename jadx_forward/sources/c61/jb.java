package c61;

/* loaded from: classes8.dex */
public final class jb implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f120607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f120608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c61.ob f120609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xc f120610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f120611e;

    public jb(android.app.Activity activity, android.content.Intent intent, c61.ob obVar, com.p314xaae8f345.mm.ui.xc xcVar, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f120607a = activity;
        this.f120608b = intent;
        this.f120609c = obVar;
        this.f120610d = xcVar;
        this.f120611e = result;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        c61.ob obVar = this.f120609c;
        if (!booleanValue) {
            c61.ob.b(obVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker permission denied");
            this.f120611e.mo65718x5c4d208("selectFiles", "Storage permission denied", null);
        } else {
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) this.f120607a;
            obVar.getClass();
            j45.l.x(activityC21401x6ce6f73f, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", this.f120608b, 8193, this.f120610d);
        }
    }
}
