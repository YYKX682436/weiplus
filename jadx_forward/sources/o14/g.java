package o14;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 f423810d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 activityC17361x5f3fcbd4) {
        this.f423810d = activityC17361x5f3fcbd4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 activityC17361x5f3fcbd4 = this.f423810d;
        android.content.Intent intent = new android.content.Intent(activityC17361x5f3fcbd4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.class);
        intent.putExtra("entry_fix_tools_uplog", 9);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC17361x5f3fcbd4, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
