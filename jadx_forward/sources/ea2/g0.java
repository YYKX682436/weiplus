package ea2;

/* loaded from: classes2.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332087d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72) {
        this.f332087d = c13650x1bf60d72;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y9.i iVar = this.f332087d.f183292g;
        if (iVar != null) {
            iVar.hide();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
