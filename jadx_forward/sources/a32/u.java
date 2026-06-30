package a32;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f82576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb) {
        super(0);
        this.f82576d = z17;
        this.f82577e = c13392x8bacb7fb;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f82576d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82577e;
        if (z17) {
            android.view.View view = c13392x8bacb7fb.f180180m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = c13392x8bacb7fb.f180180m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
