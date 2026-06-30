package qy2;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b f449315d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b c15504xec43012b) {
        this.f449315d = c15504xec43012b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b c15504xec43012b = this.f449315d;
        int i17 = c15504xec43012b.f218477m;
        if (i17 == 102) {
            c15504xec43012b.f218477m = 101;
            android.widget.ImageButton imageButton = c15504xec43012b.f218475h;
            if (imageButton == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("alignBtn");
                throw null;
            }
            imageButton.setImageResource(com.p314xaae8f345.mm.R.raw.f80004xaba1f43b);
        } else if (i17 == 101) {
            c15504xec43012b.f218477m = 102;
            android.widget.ImageButton imageButton2 = c15504xec43012b.f218475h;
            if (imageButton2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("alignBtn");
                throw null;
            }
            imageButton2.setImageResource(com.p314xaae8f345.mm.R.raw.f80003x3b9de389);
        }
        qy2.a aVar = c15504xec43012b.f218478n;
        if (aVar != null) {
            int i18 = c15504xec43012b.f218477m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 activityC15027x39e0411 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.h5) aVar).f210849a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15027x39e0411.f210098v, "alignMode changed to " + i18);
            activityC15027x39e0411.d7(i18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
