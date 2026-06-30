package vw3;

/* loaded from: classes.dex */
public final class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522731f;

    public y6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172) {
        this.f522729d = repairerUploadTestUI;
        this.f522730e = c22621x7603e017;
        this.f522731f = c22621x7603e0172;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522729d;
        repairerUploadTestUI.g = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(repairerUploadTestUI, "正在发送...", true, 0, null);
        v65.i.b(repairerUploadTestUI.e, null, new vw3.x6(this.f522730e, this.f522731f, repairerUploadTestUI, null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
