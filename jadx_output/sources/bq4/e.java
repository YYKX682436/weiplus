package bq4;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout f23591d;

    public e(com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout recordTextStatusEditVideoPluginLayout) {
        this.f23591d = recordTextStatusEditVideoPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/video/textstatus/RecordTextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout.f176109p1;
        this.f23591d.getBackToRecordPlugin().onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/video/textstatus/RecordTextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
