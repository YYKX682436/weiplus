package as3;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView f13512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xl3 f13514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f13515g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView, boolean z17, r45.xl3 xl3Var, java.lang.Integer num) {
        super(0);
        this.f13512d = bizProfileFollowMoreView;
        this.f13513e = z17;
        this.f13514f = xl3Var;
        this.f13515g = num;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView = this.f13512d;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = bizProfileFollowMoreView.f154634h;
        if (mMProcessBar == null) {
            kotlin.jvm.internal.o.o("loading");
            throw null;
        }
        mMProcessBar.setVisibility(8);
        android.widget.TextView textView = bizProfileFollowMoreView.f154631e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("othersLikeTv");
            throw null;
        }
        boolean z17 = this.f13513e;
        textView.setVisibility(z17 ? 0 : 8);
        android.widget.TextView textView2 = bizProfileFollowMoreView.f154632f;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("moreTv");
            throw null;
        }
        textView2.setVisibility(z17 ? 0 : 8);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = bizProfileFollowMoreView.f154630d;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView.setVisibility(z17 ? 0 : 8);
        android.widget.TextView textView3 = bizProfileFollowMoreView.f154635i;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("noDataTips");
            throw null;
        }
        textView3.setVisibility(z17 ? 8 : 0);
        r45.xl3 xl3Var = this.f13514f;
        bizProfileFollowMoreView.setMoreUrl(xl3Var != null ? xl3Var.f390212e : null);
        bizProfileFollowMoreView.setFocusBtnWidth(this.f13515g);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = bizProfileFollowMoreView.f154636m;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }
}
