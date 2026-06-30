package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f103477f;

    public gd(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f103475d = baseFinderFeed;
        this.f103476e = s0Var;
        this.f103477f = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPromotionUnlockCountDownCapsule$jumpClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[NewPromotionUnlockStyle] convert onCapsuleClick feedId=" + this.f103475d.getItemId());
        xc2.y2 y2Var = xc2.y2.f453343a;
        in5.s0 s0Var = this.f103476e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y2Var.h(context, new xc2.p0(this.f103477f), 1, s0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPromotionUnlockCountDownCapsule$jumpClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
