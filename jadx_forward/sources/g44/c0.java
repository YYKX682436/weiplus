package g44;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 f350347d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 c17711x240984e1) {
        this.f350347d = c17711x240984e1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper$showBottomSheet$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button h17 = this.f350347d.h();
        if (h17 != null) {
            h17.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper$showBottomSheet$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$5");
    }
}
