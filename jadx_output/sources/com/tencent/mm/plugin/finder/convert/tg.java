package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class tg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(in5.s0 s0Var) {
        super(2);
        this.f104612d = s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        in5.s0 s0Var = this.f104612d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ee6);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$convertMedia$1$2", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd)).setPlayingStatus(!booleanValue);
        return jz5.f0.f302826a;
    }
}
