package f93;

/* loaded from: classes9.dex */
public class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341844d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384) {
        this.f341844d = viewOnCreateContextMenuListenerC16171x51fc9384;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341844d.E.B();
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
