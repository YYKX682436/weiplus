package as3;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f13496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f13497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView f13498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.Integer num, java.lang.Integer num2, com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView) {
        super(0);
        this.f13496d = num;
        this.f13497e = num2;
        this.f13498f = bizProfileFollowMoreView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer num = this.f13496d;
        if (num != null) {
            if (!(!kotlin.jvm.internal.o.b(this.f13497e, num) && num.intValue() > 0)) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView = this.f13498f;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bizProfileFollowMoreView.f154633g;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("arrowIv");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                android.content.Context context = bizProfileFollowMoreView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                layoutParams2.leftMargin = (intValue / 4) + com.tencent.mm.plugin.appbrand.ui.u5.a(context, 11);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = bizProfileFollowMoreView.f154633g;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("arrowIv");
                    throw null;
                }
                weImageView2.setLayoutParams(layoutParams2);
            }
        }
        return jz5.f0.f302826a;
    }
}
