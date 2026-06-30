package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d f254897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.u f254898e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.u uVar) {
        this.f254897d = dVar;
        this.f254898e = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar = this.f254897d;
        mj4.k kVar = (mj4.k) ((mj4.h) dVar.f254797d.f419469d.f86668b.get(0));
        java.lang.String c17 = kVar.c();
        if (kVar.y()) {
            c17 = kVar.h();
        }
        yz5.l lVar = this.f254898e.f254907e;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickArrowListener");
            throw null;
        }
        lVar.mo146xb9724478(c17);
        mj4.k kVar2 = (mj4.k) ((mj4.h) dVar.f254797d.f419469d.f86668b.get(0));
        qj4.s.n(qj4.s.f445491a, 8L, kVar2.h(), dVar.f254797d.f419469d.f86668b.size(), null, null, null, 0, 0L, 0L, xe0.j0.a(kVar2, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(kVar2, false, 1, null).f436758s), null, null, null, 14840, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
