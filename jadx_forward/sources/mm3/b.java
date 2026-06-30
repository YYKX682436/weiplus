package mm3;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.n f411141d;

    public b(mm3.n nVar) {
        this.f411141d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.n nVar = this.f411141d;
        java.util.Set keySet = nVar.f411196q.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        java.lang.String arrays = java.util.Arrays.toString(keySet.toArray(new java.lang.Integer[0]));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "user clicked complete button, indexes=".concat(arrays));
        if (nVar.f411194o != -1) {
            nVar.f411195p = true;
        }
        nVar.f411194o = -1;
        mm3.n.O6(nVar);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
