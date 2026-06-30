package ls1;

/* loaded from: classes8.dex */
public final class l0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13019x3cd2df50 f402533d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13019x3cd2df50 activityC13019x3cd2df50) {
        this.f402533d = activityC13019x3cd2df50;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.lang.String str;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$onResetAfterCreate$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13019x3cd2df50.G3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13019x3cd2df50 activityC13019x3cd2df50 = this.f402533d;
        activityC13019x3cd2df50.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC13019x3cd2df50);
        j0Var.setTitle("Debug Info");
        ls1.e0 e0Var = activityC13019x3cd2df50.E3;
        if (e0Var != null) {
            if (e0Var.P1.f175824l0 || activityC13019x3cd2df50.m9()) {
                str = "isFastLoad = false\n";
            } else {
                str = "isFastLoad = true\nisUseCachedData = " + e0Var.U1 + '\n';
            }
            f0Var = jz5.f0.f384359a;
        } else {
            str = "";
            f0Var = null;
        }
        if (f0Var == null) {
            str = str + "isFastLoad = false\n";
        }
        j0Var.t((str + "Pkg Info：\n") + is1.l.f375956a.g());
        android.widget.TextView textView = j0Var.f293366n;
        if (textView != null) {
            textView.setGravity(3);
        }
        j0Var.C(3);
        j0Var.A(activityC13019x3cd2df50.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), true, null);
        j0Var.show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$onResetAfterCreate$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
