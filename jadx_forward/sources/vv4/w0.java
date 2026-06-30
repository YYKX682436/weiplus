package vv4;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 f522050d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab1) {
        this.f522050d = activityC19219x16fdfab1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab1 = this.f522050d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) activityC19219x16fdfab1.findViewById(com.p314xaae8f345.mm.R.id.im6)).setVisibility(0);
        ((android.widget.TextView) activityC19219x16fdfab1.findViewById(com.p314xaae8f345.mm.R.id.iml)).setVisibility(0);
        ((android.widget.TextView) activityC19219x16fdfab1.findViewById(com.p314xaae8f345.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) activityC19219x16fdfab1.findViewById(com.p314xaae8f345.mm.R.id.dhe)).setVisibility(8);
        activityC19219x16fdfab1.U6(activityC19219x16fdfab1.f263209p);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
