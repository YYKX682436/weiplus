package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.m60 f186369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f186372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186373h;

    public w3(r45.m60 m60Var, java.lang.String str, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var, so2.y0 y0Var) {
        this.f186369d = m60Var;
        this.f186370e = str;
        this.f186371f = s0Var;
        this.f186372g = u4Var;
        this.f186373h = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$25$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f186369d.m75936x14adae67(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19786x6a1e2862);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedCommentConvert", "onItemClick click, " + this.f186370e + " jumpInfo=" + hc2.g0.d(c19786x6a1e2862));
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = this.f186371f.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534777f = this.f186372g.f186205g;
        p0Var.f534778g = this.f186373h.f492236d.t0();
        p0Var.f534788q = com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd;
        xc2.y2.i(y2Var, context, p0Var, 0, this.f186371f, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$25$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
