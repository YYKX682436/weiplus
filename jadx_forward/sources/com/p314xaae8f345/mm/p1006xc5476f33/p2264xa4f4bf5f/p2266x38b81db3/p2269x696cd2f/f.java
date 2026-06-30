package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.i f254808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d f254809e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar) {
        this.f254808d = iVar;
        this.f254809e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f254808d.f254819e;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickArrowListener");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar = this.f254809e;
        lVar.mo146xb9724478(((mj4.k) ((mj4.h) dVar.f254797d.f419469d.f86668b.get(0))).c());
        mj4.k kVar = (mj4.k) ((mj4.h) dVar.f254797d.f419469d.f86668b.get(0));
        qj4.s.n(qj4.s.f445491a, 8L, kVar.h(), dVar.f254797d.f419469d.f86668b.size(), null, null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f436758s), null, null, null, 14840, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
