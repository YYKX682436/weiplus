package yt2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 f546839d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4) {
        this.f546839d = c14986x9295a1e4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4 = this.f546839d;
        if (c14986x9295a1e4.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SubsidyOverlay", "subsidy overlay clicked at hold stage");
            yz5.a aVar = c14986x9295a1e4.E;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
