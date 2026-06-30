package kq2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kq2.c f392794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f392795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dd2 f392796f;

    public b(kq2.c cVar, int i17, r45.dd2 dd2Var) {
        this.f392794d = cVar;
        this.f392795e = i17;
        this.f392796f = dd2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/subtab/SubTabAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kq2.c cVar = this.f392794d;
        cVar.f392797d.l();
        int i17 = cVar.f392798e;
        cVar.f392798e = this.f392795e;
        cVar.m8147xed6e4d18(i17);
        cVar.m8147xed6e4d18(cVar.f392798e);
        iq2.d0 d0Var = cVar.f392797d;
        d0Var.getClass();
        r45.dd2 data = this.f392796f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        d0Var.k("fetchSubTabFeeds", true);
        d0Var.f375265p.clear();
        up2.h hVar = d0Var.f375267r;
        if (hVar != null) {
            hVar.m8146xced61ae5();
        }
        if (d0Var.g(data.m75939xb282bd08(0))) {
            d0Var.i();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = d0Var.f375271v;
            if (c22627xa933f8e4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            c22627xa933f8e4.setVisibility(0);
            d0Var.c(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/subtab/SubTabAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
