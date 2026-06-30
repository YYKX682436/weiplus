package we5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f526843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f526844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a9 f526845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f526846g;

    public c(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var, yb5.d dVar) {
        this.f526843d = activity;
        this.f526844e = f9Var;
        this.f526845f = a9Var;
        this.f526846g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextFrom$Companion$initAutoTranslationTail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) this.f526845f).f287249e = go.d.f355229a.a(this.f526843d, this.f526844e);
        this.f526846g.J();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextFrom$Companion$initAutoTranslationTail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
