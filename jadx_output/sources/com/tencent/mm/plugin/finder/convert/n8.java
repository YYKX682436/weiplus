package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class n8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.md1 f104081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q8 f104082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104083f;

    public n8(r45.md1 md1Var, com.tencent.mm.plugin.finder.convert.q8 q8Var, in5.s0 s0Var) {
        this.f104081d = md1Var;
        this.f104082e = q8Var;
        this.f104083f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.md1 md1Var = this.f104081d;
        intent.putExtra("Username", md1Var.getString(5));
        intent.putExtra("WxUserName", md1Var.getString(5));
        intent.putExtra("FromWxMsg", true);
        intent.putExtra("Action", 1);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f104082e.f104345e;
        intent.putExtra("FeedId", (finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? 0L : feedObject.getId());
        intent.putExtra("showLikePrivacy", true);
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        in5.s0 s0Var = this.f104083f;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        koVar.f(context, intent, 2, new com.tencent.mm.plugin.finder.convert.m8(s0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
