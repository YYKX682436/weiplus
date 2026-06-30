package vw3;

/* loaded from: classes.dex */
public final class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522605f;

    public p6(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f522603d = c22621x7603e017;
        this.f522604e = c22621x7603e0172;
        this.f522605f = repairerUploadTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = this.f522603d.getText().toString();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f522604e;
        android.text.Editable text = c22621x7603e017.getText();
        long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(c22621x7603e017.getText().toString()) : 0L;
        if (!r26.n0.N(obj)) {
            com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522605f;
            v65.i.b(repairerUploadTestUI.e, null, new vw3.o6(parseLong, obj, repairerUploadTestUI, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
