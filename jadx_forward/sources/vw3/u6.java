package vw3;

/* loaded from: classes.dex */
public final class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522684h;

    public u6(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f522680d = c22621x7603e017;
        this.f522681e = c22621x7603e0172;
        this.f522682f = c22621x7603e0173;
        this.f522683g = c22621x7603e0174;
        this.f522684h = repairerUploadTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String obj;
        java.lang.String obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj3 = this.f522680d.getText().toString();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f522681e;
        android.text.Editable text = c22621x7603e017.getText();
        long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(c22621x7603e017.getText().toString()) : 0L;
        android.text.Editable text2 = this.f522682f.getText();
        java.lang.String str = (text2 == null || (obj2 = text2.toString()) == null) ? "" : obj2;
        android.text.Editable text3 = this.f522683g.getText();
        java.lang.String str2 = (text3 == null || (obj = text3.toString()) == null) ? "" : obj;
        if (!r26.n0.N(obj3)) {
            com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522684h;
            v65.i.b(repairerUploadTestUI.e, null, new vw3.t6(str2, parseLong, str, obj3, repairerUploadTestUI, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
