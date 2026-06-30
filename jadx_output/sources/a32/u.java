package a32;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z17, com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        super(0);
        this.f1043d = z17;
        this.f1044e = captureContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f1043d;
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1044e;
        if (z17) {
            android.view.View view = captureContainer.f98647m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = captureContainer.f98647m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
