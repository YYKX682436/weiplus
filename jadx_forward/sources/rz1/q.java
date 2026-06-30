package rz1;

/* loaded from: classes.dex */
public class q implements android.view.View.OnClickListener {
    public q(com.tencent.mm.plugin.datareport.sample.ScrollSampleUI scrollSampleUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
