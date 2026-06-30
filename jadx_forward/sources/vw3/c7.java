package vw3;

/* loaded from: classes.dex */
public final class c7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522451h;

    public c7(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f522447d = repairerUploadTestUI;
        this.f522448e = c22621x7603e017;
        this.f522449f = str;
        this.f522450g = str2;
        this.f522451h = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522447d;
        repairerUploadTestUI.g = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(repairerUploadTestUI, "正在发送...", true, 0, null);
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI2 = this.f522447d;
        v65.i.b(repairerUploadTestUI2.e, null, new vw3.b7(this.f522448e, this.f522449f, this.f522450g, this.f522451h, repairerUploadTestUI2, null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
