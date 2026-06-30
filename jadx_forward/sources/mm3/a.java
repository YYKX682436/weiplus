package mm3;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.n f411140d;

    public a(mm3.n nVar) {
        this.f411140d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.n nVar = this.f411140d;
        java.util.Set keySet = nVar.f411196q.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        java.lang.String arrays = java.util.Arrays.toString(keySet.toArray(new java.lang.Integer[0]));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "user clicked cancel button，revert: ".concat(arrays));
        nVar.f411194o = -1;
        if (!nVar.f411196q.isEmpty()) {
            java.util.Set<java.util.Map.Entry> entrySet = nVar.f411196q.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            for (java.util.Map.Entry entry : entrySet) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = nVar.f411186d;
                if (c16708x2eab1ea0 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
                    throw null;
                }
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                int intValue = ((java.lang.Number) key).intValue();
                java.lang.Object lower = ((android.util.Range) entry.getValue()).getLower();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
                long longValue = ((java.lang.Number) lower).longValue();
                java.lang.Object upper = ((android.util.Range) entry.getValue()).getUpper();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper, "getUpper(...)");
                long longValue2 = ((java.lang.Number) upper).longValue();
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0.F;
                c16708x2eab1ea0.d(intValue, longValue, longValue2, true);
            }
        }
        mm3.n.O6(nVar);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
