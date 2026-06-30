package z22;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z22.d f551245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z22.f f551246e;

    public c(z22.d dVar, z22.f fVar) {
        this.f551245d = dVar;
        this.f551246e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/adapter/MoreStickerAdapter$StickerViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f551245d.m8183xf806b362();
        z22.f fVar = this.f551246e;
        t85.d dVar = (t85.d) kz5.n0.a0(fVar.f551250d, m8183xf806b362);
        if (dVar != null && (pVar = fVar.f551252f) != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), dVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/adapter/MoreStickerAdapter$StickerViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
