package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class n8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.md1 f185614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q8 f185615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185616f;

    public n8(r45.md1 md1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q8 q8Var, in5.s0 s0Var) {
        this.f185614d = md1Var;
        this.f185615e = q8Var;
        this.f185616f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.md1 md1Var = this.f185614d;
        intent.putExtra("Username", md1Var.m75945x2fec8307(5));
        intent.putExtra("WxUserName", md1Var.m75945x2fec8307(5));
        intent.putExtra("FromWxMsg", true);
        intent.putExtra("Action", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f185615e.f185878e;
        intent.putExtra("FeedId", (c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) ? 0L : feedObject.m76784x5db1b11());
        intent.putExtra("showLikePrivacy", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko koVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a;
        in5.s0 s0Var = this.f185616f;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        koVar.f(context, intent, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m8(s0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
