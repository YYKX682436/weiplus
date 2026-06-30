package a32;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1019d;

    public i(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1019d = captureContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r22.a presenter = this.f1019d.getPresenter();
        if (presenter != null) {
            y22.h.a(((w22.g) presenter).f442532c, false, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
