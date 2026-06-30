package ei4;

/* loaded from: classes9.dex */
public final class q implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f334769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f334770e;

    public q(wn.j jVar, ei4.s sVar) {
        this.f334769d = jVar;
        this.f334770e = sVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        wn.j jVar = this.f334769d;
        hi4.e eVar = (hi4.e) jVar.f374658i;
        yz5.q qVar = this.f334770e.f334774g;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.m8183xf806b362());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
