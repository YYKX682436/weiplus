package ei4;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f334744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.h f334745e;

    public f(wn.j jVar, ei4.h hVar) {
        this.f334744d = jVar;
        this.f334745e = hVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        wn.j jVar = this.f334744d;
        hi4.a aVar = (hi4.a) jVar.f374658i;
        yz5.q qVar = this.f334745e.f334751h;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.m8183xf806b362());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            qVar.mo147xb9724478(view, valueOf, aVar);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
