package o14;

/* loaded from: classes5.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 f423830d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 activityC17363xb7882d32) {
        this.f423830d = activityC17363xb7882d32;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 activityC17363xb7882d32 = this.f423830d;
        if (activityC17363xb7882d32.f241600e) {
            activityC17363xb7882d32.setResult(-1);
        }
        activityC17363xb7882d32.W6(1);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
