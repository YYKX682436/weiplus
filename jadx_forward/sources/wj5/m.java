package wj5;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj5.p f528355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oo0.a f528356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f528357g;

    public m(java.lang.String str, wj5.p pVar, oo0.a aVar, in5.s0 s0Var) {
        this.f528354d = str;
        this.f528355e = pVar;
        this.f528356f = aVar;
        this.f528357g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.m0 m0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291231a;
        java.lang.String hostRoomId = this.f528354d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hostRoomId, "$hostRoomId");
        java.util.List list = this.f528355e.f528365g.f544257f;
        long size = list != null ? ((java.util.LinkedList) list).size() : 0;
        oo0.a aVar = this.f528356f;
        m0Var.b(hostRoomId, size, java.lang.String.valueOf(((oo0.d) aVar).f67834x41d5e0c), 4L, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.ui.C21393xf9902968.b(aVar, this.f528357g.f374654e);
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
