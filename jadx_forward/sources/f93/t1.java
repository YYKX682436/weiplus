package f93;

/* loaded from: classes9.dex */
public class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f342000d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        this.f342000d = viewOnCreateContextMenuListenerC16169x37a19e8d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k93.j jVar = this.f342000d.A;
        if (jVar != null) {
            jVar.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
