package fr2;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347266d;

    public m(fr2.p pVar) {
        this.f347266d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fr2.p pVar = this.f347266d;
        p3325xe03a0797.p3326xc267989b.l.d(pVar.mo144225x95f74600(), null, null, new fr2.l(pVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
