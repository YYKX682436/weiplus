package ws3;

/* loaded from: classes9.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws3.y f530723d;

    public s(ws3.y yVar) {
        this.f530723d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        us3.e.Ai().Ni(null);
        ws3.y yVar = this.f530723d;
        android.widget.EditText editText = yVar.f530737n.f236697f;
        if (editText != null) {
            editText.setText("");
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (yVar) {
            yVar.f530732f = linkedList;
            yVar.notifyDataSetChanged();
        }
        if (yVar.f530739p != null) {
            gm0.j1.d().g(new vs3.g("", 1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
