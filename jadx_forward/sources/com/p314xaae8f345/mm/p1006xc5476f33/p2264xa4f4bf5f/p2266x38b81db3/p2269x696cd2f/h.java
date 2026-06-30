package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d f254813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254814e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar, in5.s0 s0Var) {
        this.f254813d = dVar;
        this.f254814e = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n                        userName: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar = this.f254813d;
        mj4.h hVar = dVar.f254800g;
        sb6.append(hVar != null ? ((mj4.k) hVar).o() : null);
        sb6.append(",\n                        statusId: ");
        mj4.h hVar2 = dVar.f254800g;
        sb6.append(hVar2 != null ? ((mj4.k) hVar2).l() : null);
        sb6.append(",\n                        iconId: ");
        mj4.h hVar3 = dVar.f254800g;
        sb6.append(hVar3 != null ? ((mj4.k) hVar3).h() : null);
        sb6.append(",    iconDesc: ");
        bk4.f0 f0Var = bk4.f0.f102998a;
        mj4.h hVar4 = dVar.f254800g;
        sb6.append(f0Var.l(hVar4 != null ? ((mj4.k) hVar4).h() : null));
        sb6.append(",  \n                        clusterId: ");
        mj4.h hVar5 = dVar.f254800g;
        sb6.append(hVar5 != null ? ((mj4.k) hVar5).m() : null);
        sb6.append(",\n                        topicId: ");
        mj4.h hVar6 = dVar.f254800g;
        sb6.append(hVar6 != null ? ((mj4.k) hVar6).m() : null);
        sb6.append(",\n                    ");
        java.lang.String b17 = r26.b0.b(sb6.toString());
        android.content.Context context = this.f254814e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y3.a((android.app.Activity) context, 0, 0, 0, b17, com.p314xaae8f345.mm.R.C30861xcebc809e.b76, null, null, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
