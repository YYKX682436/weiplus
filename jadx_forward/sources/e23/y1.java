package e23;

/* loaded from: classes12.dex */
public class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f328535d;

    public y1(e23.a2 a2Var, android.content.Context context) {
        this.f328535d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSWXPayRelatedFuncDataItem", "on click more result cell");
        android.content.Context context = this.f328535d;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r3 r3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f) context).f219538u;
            r3Var.n(r3Var.f219704v + 1);
            r3Var.f219704v = 0;
            r3Var.f219703u = false;
            r3Var.c();
            r3Var.notifyDataSetChanged();
            r3Var.l(r3Var.getCount(), true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
