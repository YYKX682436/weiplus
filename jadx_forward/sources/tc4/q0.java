package tc4;

/* loaded from: classes4.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f498970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f498971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc4.p f498973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tc4.r0 f498974h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.widget.TextView textView, android.text.SpannableString spannableString, java.lang.String str, xc4.p pVar, tc4.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f498970d = textView;
        this.f498971e = spannableString;
        this.f498972f = str;
        this.f498973g = pVar;
        this.f498974h = r0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        tc4.q0 q0Var = new tc4.q0(this.f498970d, this.f498971e, this.f498972f, this.f498973g, this.f498974h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        return q0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        tc4.q0 q0Var = (tc4.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q0Var.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = ((java.lang.Object) this.f498971e) + this.f498972f;
        android.widget.TextView textView = this.f498970d;
        textView.setText(str);
        tc4.r0 r0Var = this.f498974h;
        textView.setOnClickListener(new tc4.p0(r0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.W(this.f498973g.y0(), true, r0Var.y());
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        return f0Var;
    }
}
