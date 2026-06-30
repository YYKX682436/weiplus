package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj4.c f254815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l0 f254816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f254818g;

    public h0(nj4.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l0 l0Var, android.view.View view, mj4.h hVar) {
        this.f254815d = cVar;
        this.f254816e = l0Var;
        this.f254817f = view;
        this.f254818g = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int size = this.f254815d.f419464f.f419469d.f86668b.size();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f254817f.getContext(), "getContext(...)");
        mj4.h hVar = this.f254818g;
        java.lang.String topicId = ((mj4.k) hVar).c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l0 l0Var = this.f254816e;
        l0Var.getClass();
        if (!(topicId == null || r26.n0.N(topicId))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 activityC18656x65fa26e6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6) l0Var.f254846e;
            activityC18656x65fa26e6.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicId, "topicId");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18656x65fa26e6.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.class)).f255640d).put(topicId, java.lang.Boolean.FALSE);
            pm0.v.O("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.oe(activityC18656x65fa26e6));
        }
        qj4.s.n(qj4.s.f445491a, 8L, ((mj4.k) hVar).h(), size, null, null, null, 0, 0L, 0L, xe0.j0.a(hVar, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(hVar, false, 1, null).f436758s), null, null, null, 14840, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
