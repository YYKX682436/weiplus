package rz1;

/* loaded from: classes2.dex */
public class w implements android.view.View.OnLongClickListener {
    public w(rz1.y yVar) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$SampleRecyclerViewAdapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$SampleRecyclerViewAdapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
