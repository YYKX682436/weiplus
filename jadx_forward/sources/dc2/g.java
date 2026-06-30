package dc2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d f310233d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d c13725xb7848c6d) {
        this.f310233d = c13725xb7848c6d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d.f186837x;
        this.f310233d.getPhotoControlUI().f547208h.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
