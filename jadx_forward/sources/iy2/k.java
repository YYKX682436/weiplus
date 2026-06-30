package iy2;

/* loaded from: classes13.dex */
public final class k implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377431d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4) {
        this.f377431d = c15488x2a0085b4;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4 = this.f377431d;
        c15488x2a0085b4.getTAG();
        c15488x2a0085b4.getCurrentState();
        c15488x2a0085b4.D = true;
        iy2.b bVar = c15488x2a0085b4.C;
        if (bVar != null) {
            bVar.f377413s = 7;
            bVar.f377414t.cancel();
            bVar.invalidateSelf();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
