package tj5;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501378d;

    public j(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501378d = c22479x68a26381;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = view.getId() == com.p314xaae8f345.mm.R.id.nvv ? 0 : view.getId() == com.p314xaae8f345.mm.R.id.nvz ? 1 : view.getId() == com.p314xaae8f345.mm.R.id.f568744nw3 ? 2 : -1;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501378d;
        tj5.n nVar = c22479x68a26381.E;
        if (nVar != null && i17 >= 0) {
            nVar.o3(i17, (tj5.x) ((java.util.ArrayList) c22479x68a26381.f291350h).get(i17));
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSEditTextView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
