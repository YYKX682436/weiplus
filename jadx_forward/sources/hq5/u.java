package hq5;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.w f364812d;

    public u(hq5.w wVar) {
        this.f364812d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewHintUIC$onStateChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jq5.o.f382816a.b(this.f364812d.m80379x76847179());
        cq5.i.f303076a.d(cq5.a.f303032q);
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewHintUIC$onStateChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
