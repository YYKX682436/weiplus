package wv1;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv1.o f531490d;

    public n(wv1.o oVar) {
        this.f531490d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wv1.a aVar = (wv1.a) view.getTag();
        if (aVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wv1.o oVar = this.f531490d;
        boolean z17 = !oVar.f531500o.isChecked();
        if (aVar.i()) {
            oVar.f531500o.setChecked(z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) aVar.f531462a).f177059g;
            if (vVar != null) {
                vVar.a(z17, aVar, oVar);
            }
            android.widget.ImageView imageView = oVar.f531499n;
            if (z17) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
