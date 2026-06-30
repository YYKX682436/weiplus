package a32;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1009e;

    public d(android.content.Context context, com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1008d = context;
        this.f1009e = captureContainer;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = this.f1008d;
        y9.i iVar = new y9.i(context, 0);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView xLabEffectSettingView = new com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView(context);
        xLabEffectSettingView.setCameraView(this.f1009e.f98643f);
        iVar.setContentView(xLabEffectSettingView);
        iVar.show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
