package ac2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f3052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCountDownTextView f3053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ac2.t tVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView) {
        super(1);
        this.f3051d = tVar;
        this.f3052e = baseFinderFeed;
        this.f3053f = finderCountDownTextView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.w2 w2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ac2.t tVar = this.f3051d;
        java.lang.String str = tVar.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wait countDownFinish ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f3052e;
        sb6.append(baseFinderFeed.getItemId());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        baseFinderFeed.y1(true);
        this.f3053f.setCountDownFinishCallback(null);
        tVar.D = null;
        tVar.E0();
        boolean booleanValue2 = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127718gd).getValue()).r()).booleanValue();
        com.tencent.mm.ui.MMActivity mMActivity = tVar.f106421d;
        if (booleanValue2) {
            com.tencent.mm.plugin.finder.view.w2 w2Var2 = tVar.S;
            if ((w2Var2 != null && w2Var2.isShowing()) && !mMActivity.isDestroyed() && !mMActivity.isFinishing() && (w2Var = tVar.S) != null) {
                w2Var.dismiss();
            }
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.f484895ts4);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.f484895ts4);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (booleanValue) {
            tVar.w0(3, 2, baseFinderFeed);
        } else {
            tVar.w0(1, 2, baseFinderFeed);
        }
        tVar.T = 0L;
        return jz5.f0.f302826a;
    }
}
