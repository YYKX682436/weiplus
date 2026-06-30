package wj5;

/* loaded from: classes8.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj5.f f528358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj5.p f528360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oo0.a f528361g;

    public n(xj5.f fVar, java.lang.String str, wj5.p pVar, oo0.a aVar) {
        this.f528358d = fVar;
        this.f528359e = str;
        this.f528360f = pVar;
        this.f528361g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f528358d.f536430e = 3;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.m0 m0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291231a;
        java.lang.String hostRoomId = this.f528359e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hostRoomId, "$hostRoomId");
        wj5.p pVar = this.f528360f;
        java.util.List list = pVar.f528365g.f544257f;
        long size = list != null ? ((java.util.LinkedList) list).size() : 0;
        oo0.d dVar = (oo0.d) this.f528361g;
        m0Var.b(hostRoomId, size, java.lang.String.valueOf(dVar.f67834x41d5e0c), 3L, java.lang.System.currentTimeMillis());
        ((oo0.e) ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi()).z0(dVar.f67834x41d5e0c);
        pVar.f528365g.o0();
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
