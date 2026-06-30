package ei4;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f334767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f334768e;

    public p(wn.j jVar, ei4.s sVar) {
        this.f334767d = jVar;
        this.f334768e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wn.j jVar = this.f334767d;
        hi4.e eVar = (hi4.e) jVar.f374658i;
        yz5.q qVar = this.f334768e.f334773f;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.m8183xf806b362());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            qVar.mo147xb9724478(view, valueOf, eVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
