package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fm2 f103728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103731h;

    public j6(in5.s0 s0Var, r45.fm2 fm2Var, com.tencent.mm.plugin.finder.convert.q6 q6Var, android.view.View view, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f103727d = s0Var;
        this.f103728e = fm2Var;
        this.f103729f = q6Var;
        this.f103730g = view;
        this.f103731h = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f103729f;
        android.view.View view2 = this.f103730g;
        in5.s0 s0Var = this.f103727d;
        sVar.f144167d = new com.tencent.mm.plugin.finder.convert.i6(sVar, q6Var, view2, s0Var, this.f103731h);
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f103728e.getCustom(2);
        kotlin.jvm.internal.o.d(finderJumpInfo);
        xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, sVar, null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
