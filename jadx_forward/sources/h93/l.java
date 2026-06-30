package h93;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.o f361251d;

    public l(h93.o oVar) {
        this.f361251d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/label/MyLabelPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h93.o oVar = this.f361251d;
        android.content.Intent intent = new android.content.Intent(oVar.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.class);
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("key_label_click_source", 1);
        intent.putExtra("label_edit_mode", true);
        oVar.m158354x19263085().startActivityForResult(intent, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
