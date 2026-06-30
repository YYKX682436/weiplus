package a32;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1024e;

    public k(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer, android.content.Context context) {
        this.f1023d = captureContainer;
        this.f1024e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.v75 v75Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1023d;
        r45.p64 p64Var = captureContainer.f98656v;
        if (p64Var != null && (v75Var = p64Var.f382795g) != null) {
            qk.w wVar = new qk.w(v75Var);
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e(captureContainer.f98641d, "unable to get emoticon liteapp feature service");
            } else {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(this.f1024e, wVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
