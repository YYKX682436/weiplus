package o14;

/* loaded from: classes5.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 f423831d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 activityC17363xb7882d32) {
        this.f423831d = activityC17363xb7882d32;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32 activityC17363xb7882d32 = this.f423831d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC17363xb7882d32);
        u1Var.g(activityC17363xb7882d32.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fa_));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu);
        u1Var.l(new o14.q(this));
        u1Var.j(activityC17363xb7882d32.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx));
        u1Var.i(new o14.p(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
