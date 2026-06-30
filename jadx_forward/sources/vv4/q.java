package vv4;

/* loaded from: classes11.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522024d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        this.f522024d = activityC19216xc2476b75;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522024d;
        if (activityC19216xc2476b75.f263166e) {
            activityC19216xc2476b75.W6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
