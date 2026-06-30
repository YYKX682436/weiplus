package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d f254811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f254812f;

    public g(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar, android.widget.ImageView imageView) {
        this.f254810d = s0Var;
        this.f254811e = dVar;
        this.f254812f = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
        android.content.Context context = this.f254810d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d dVar = this.f254811e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4.b(h4Var, context, dVar.f254798e, 1002, null, null, this.f254812f, null, null, 216, null);
        qj4.s sVar = qj4.s.f445491a;
        mj4.h hVar = dVar.f254800g;
        java.lang.String h17 = hVar != null ? ((mj4.k) hVar).h() : "";
        java.lang.String str = dVar.f254798e;
        int size = dVar.f254797d.f419469d.f86668b.size();
        mj4.h hVar2 = dVar.f254800g;
        java.lang.String str2 = hVar2 != null ? xe0.j0.a(hVar2, false, 1, null).f436751i : null;
        mj4.h hVar3 = dVar.f254800g;
        qj4.s.n(sVar, 7L, h17, size, str, null, null, 0, 0L, 0L, str2, hVar3 != null ? java.lang.Integer.valueOf(xe0.j0.a(hVar3, false, 1, null).f436758s) : null, null, null, null, 14832, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
