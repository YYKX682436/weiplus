package oi4;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kj4.c f427169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oi4.j f427170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f427171g;

    public h(java.lang.String str, kj4.c cVar, oi4.j jVar, in5.s0 s0Var) {
        this.f427168d = str;
        this.f427169e = cVar;
        this.f427170f = jVar;
        this.f427171g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        si4.a G = ai4.m0.f86706a.G();
        java.lang.String statusId = this.f427168d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(statusId, "$statusId");
        mj4.h t17 = G.t(statusId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item onClick ");
        sb6.append(statusId);
        sb6.append(", ");
        sb6.append(this.f427169e.f389987d.f76607xcd7d4a17);
        sb6.append(", exist=");
        sb6.append(t17 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.LikeItemConvert", sb6.toString());
        oi4.j jVar = this.f427170f;
        if (t17 != null) {
            java.lang.String a17 = en1.a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
            jVar.n(a17, t17, null);
        } else {
            android.content.Context context = this.f427171g.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jVar.p(context, statusId, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
