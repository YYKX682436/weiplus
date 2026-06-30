package qw2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw2.c f448647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qw2.f f448648e;

    public b(qw2.c cVar, qw2.f fVar) {
        this.f448647d = cVar;
        this.f448648e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f448647d.m8183xf806b362();
        qw2.f fVar = this.f448648e;
        t85.d dVar = (t85.d) kz5.n0.a0(fVar.f448654d, m8183xf806b362);
        if (dVar != null && (pVar = fVar.f448658h) != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), dVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
