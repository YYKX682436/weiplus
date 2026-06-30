package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.n0 f254852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.d f254854f;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.n0 n0Var, in5.s0 s0Var, nj4.d dVar) {
        this.f254852d = n0Var;
        this.f254853e = s0Var;
        this.f254854f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupHeaderConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f254852d.getClass();
        nj4.d dVar = this.f254854f;
        if (dVar.f419469d.f86668b.size() > 0) {
            ai4.e eVar = dVar.f419469d;
            mj4.k kVar = (mj4.k) ((mj4.h) eVar.f86668b.get(0));
            java.lang.String o17 = kVar.o();
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
            android.content.Context context = this.f254853e.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4.b(h4Var, context, o17, 1002, null, null, null, null, null, 248, null);
            qj4.s.n(qj4.s.f445491a, 6L, kVar.h(), eVar.f86668b.size(), kVar.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f436758s), null, null, null, 14832, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupHeaderConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
