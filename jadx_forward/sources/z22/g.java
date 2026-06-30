package z22;

/* loaded from: classes10.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z22.h f551254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z22.l f551255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f551256f;

    public g(z22.h hVar, z22.l lVar, android.view.View view) {
        this.f551254d = hVar;
        this.f551255e = lVar;
        this.f551256f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f551254d.m8183xf806b362();
        z22.l lVar = this.f551255e;
        t85.d x17 = lVar.x(m8183xf806b362);
        if (x17 != null && (pVar = lVar.f551260e) != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), x17);
        }
        this.f551256f.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
