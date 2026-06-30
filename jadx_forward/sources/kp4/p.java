package kp4;

/* loaded from: classes4.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.r f392662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.q f392663e;

    public p(kp4.r rVar, kp4.q qVar) {
        this.f392662d = rVar;
        this.f392663e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kp4.r rVar = this.f392662d;
        yz5.p pVar = rVar.f392672h;
        if (pVar != null) {
            kp4.q qVar = this.f392663e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(qVar.m8183xf806b362());
            java.lang.Object obj = rVar.f392668d.get(qVar.m8183xf806b362());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            pVar.mo149xb9724478(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
