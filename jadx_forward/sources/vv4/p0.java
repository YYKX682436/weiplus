package vv4;

/* loaded from: classes12.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 f522022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522023e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1, java.lang.String str) {
        this.f522022d = activityC19218x71796ad1;
        this.f522023e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$startImageSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522022d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.im6)).setVisibility(0);
        ((android.widget.TextView) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.iml)).setVisibility(0);
        ((android.widget.TextView) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dhe)).setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad12 = this.f522022d;
        java.lang.String str = activityC19218x71796ad12.f263189f;
        long j17 = activityC19218x71796ad12.f263188e;
        int i17 = activityC19218x71796ad12.f263192i;
        java.lang.String imagePath = this.f522023e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "$imagePath");
        activityC19218x71796ad12.V6(str, j17, i17, imagePath);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$startImageSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
