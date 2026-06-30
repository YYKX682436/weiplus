package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/FinderFixedRefreshLayout;", "Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.FinderFixedRefreshLayout */
/* loaded from: classes15.dex */
public class C14549x1a889b7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f {
    public static final /* synthetic */ int K = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f203616J;

    public C14549x1a889b7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f203616J = "FinderFixedRefreshLayout";
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864, android.view.View
    public void computeScroll() {
        if (m82931x63e1b1b0().isFinished() || m82931x63e1b1b0().timePassed() >= 0) {
            super.computeScroll();
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f203616J, "computeScroll error,  timePassed: " + m82931x63e1b1b0().timePassed() + " animTime: " + currentAnimationTimeMillis + " duration: " + m82931x63e1b1b0().getDuration());
        pm0.z.b(xy2.b.f539688b, "computeScrollError", false, null, null, false, false, new dq2.a(this, currentAnimationTimeMillis), 60, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14549x1a889b7(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f203616J = "FinderFixedRefreshLayout";
    }
}
