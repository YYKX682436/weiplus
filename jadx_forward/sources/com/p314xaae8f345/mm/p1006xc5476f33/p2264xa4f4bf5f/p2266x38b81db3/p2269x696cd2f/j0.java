package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class j0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f254827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f254828e;

    public j0(mj4.h hVar, android.view.ViewGroup viewGroup) {
        this.f254827d = hVar;
        this.f254828e = viewGroup;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n                        userName: ");
        mj4.h hVar = this.f254827d;
        sb6.append(((mj4.k) hVar).o());
        sb6.append(",\n                        statusId: ");
        sb6.append(((mj4.k) hVar).l());
        sb6.append(",\n                        iconId: ");
        sb6.append(((mj4.k) hVar).h());
        sb6.append(",    iconDesc: ");
        sb6.append(bk4.f0.f102998a.l(((mj4.k) hVar).h()));
        sb6.append(",  \n                        clusterId: ");
        sb6.append(((mj4.k) hVar).m());
        sb6.append(",\n                        topicId: ");
        sb6.append(((mj4.k) hVar).m());
        sb6.append(",\n                    ");
        java.lang.String b17 = r26.b0.b(sb6.toString());
        android.content.Context context = this.f254828e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y3.a((android.app.Activity) context, 0, 0, 0, b17, com.p314xaae8f345.mm.R.C30861xcebc809e.b76, null, null, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
