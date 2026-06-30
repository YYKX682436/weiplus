package ei4;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f334742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.h f334743e;

    public e(wn.j jVar, ei4.h hVar) {
        this.f334742d = jVar;
        this.f334743e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wn.j jVar = this.f334742d;
        hi4.a aVar = (hi4.a) jVar.f374658i;
        yz5.q qVar = this.f334743e.f334750g;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.m8183xf806b362());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            qVar.mo147xb9724478(view, valueOf, aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
