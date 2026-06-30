package wv1;

/* loaded from: classes12.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv1.r f531504d;

    public q(wv1.r rVar) {
        this.f531504d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wv1.a aVar = (wv1.a) view.getTag();
        if (aVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wv1.r rVar = this.f531504d;
        boolean z17 = !rVar.f531510h.isChecked();
        if (aVar.i()) {
            rVar.f531510h.setChecked(z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) aVar.f531462a).f177059g;
            if (vVar != null) {
                vVar.a(z17, aVar, rVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
