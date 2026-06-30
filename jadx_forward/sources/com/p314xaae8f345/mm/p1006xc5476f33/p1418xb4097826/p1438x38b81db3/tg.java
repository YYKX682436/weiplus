package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class tg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(in5.s0 s0Var) {
        super(2);
        this.f186145d = s0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        in5.s0 s0Var = this.f186145d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.ee6);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd)).m61289x1980547e(!booleanValue);
        return jz5.f0.f384359a;
    }
}
