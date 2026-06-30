package f93;

/* loaded from: classes.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f341875d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        this.f341875d = viewOnCreateContextMenuListenerC16169x37a19e8d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.X;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341875d;
        viewOnCreateContextMenuListenerC16169x37a19e8d.getClass();
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20299xbba5c9b4()) == 1) {
            ((j93.w) pf5.z.f435481a.a(viewOnCreateContextMenuListenerC16169x37a19e8d).a(j93.w.class)).O6();
        } else {
            b93.n.a(viewOnCreateContextMenuListenerC16169x37a19e8d.getIntent().getIntExtra("key_label_click_source", 0), 4L, 0L, 0L, 0L);
            java.util.ArrayList arrayList2 = viewOnCreateContextMenuListenerC16169x37a19e8d.B;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 1, 0);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 1, 1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[dealAddLabel]");
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b, 1024));
            intent.putExtra("last_page_source_type", 1);
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", viewOnCreateContextMenuListenerC16169x37a19e8d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8s));
            intent.putExtra("show_too_many_member", false);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 5);
            intent.putExtra("label_source", "label_source_Address");
            intent.putExtra("without_openim", true);
            j45.l.v(viewOnCreateContextMenuListenerC16169x37a19e8d, ".ui.contact.SelectContactUI", intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
