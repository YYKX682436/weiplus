package w82;

/* loaded from: classes11.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 f525437d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5) {
        this.f525437d = c13623x735f56a5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "fav tag panel, on click call");
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = this.f525437d;
        if (intValue == 0) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
            c13623x735f56a5.u((android.widget.TextView) view, true, false);
            if (c13623x735f56a5.N != null) {
                view.post(new w82.i0(this, view));
            }
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
            c13623x735f56a5.u((android.widget.TextView) view, false, false);
            if (c13623x735f56a5.N != null) {
                view.post(new w82.j0(this, view));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
