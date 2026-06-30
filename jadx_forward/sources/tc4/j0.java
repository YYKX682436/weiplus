package tc4;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f498908d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f498909e;

    /* renamed from: f, reason: collision with root package name */
    public int f498910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f498911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f498912h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tc4.n0 n0Var, r45.kv2 kv2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f498911g = n0Var;
        this.f498912h = kv2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        tc4.j0 j0Var = new tc4.j0(this.f498911g, this.f498912h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        return j0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        java.lang.Object mo150x989b7ca4 = ((tc4.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [zy2.p7] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [zy2.g5] */
    /* JADX WARN: Type inference failed for: r9v13, types: [zy2.g5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Integer num;
        r45.kv2 kv2Var;
        java.lang.String str;
        java.lang.Object obj2;
        tc4.n0 n0Var;
        java.lang.String str2;
        java.lang.Object Ni;
        java.lang.String str3;
        ?? r96;
        tc4.n0 n0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f498910f;
        r45.kv2 kv2Var2 = this.f498912h;
        tc4.n0 n0Var3 = this.f498911g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n0Var3.x("MicroMsg.Improve.FinderMediaTimelineItem", "play 2");
            android.widget.FrameLayout Y = tc4.n0.Y(n0Var3);
            java.lang.Object findViewWithTag = Y != null ? Y.findViewWithTag("sns_video_preview_view_tag") : null;
            zy2.g5 g5Var = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var3.L1 = g5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var3.x("MicroMsg.Improve.FinderMediaTimelineItem", "play 3");
            java.lang.Object V = tc4.n0.V(n0Var3);
            android.view.View view = V instanceof android.view.View ? (android.view.View) V : null;
            java.lang.Object tag = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.s6u) : null;
            java.lang.String str4 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (tc4.n0.V(n0Var3) != null && android.text.TextUtils.equals(kv2Var2.m75945x2fec8307(0), str4)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play ");
                sb6.append(tc4.n0.V(n0Var3));
                sb6.append(' ');
                zy2.g5 V2 = tc4.n0.V(n0Var3);
                sb6.append(V2 != null ? java.lang.Boolean.valueOf(V2.mo58787xc00617a4()) : null);
                sb6.append(" reuse.");
                n0Var3.x("MicroMsg.Improve.FinderMediaTimelineItem", sb6.toString());
                zy2.g5 V3 = tc4.n0.V(n0Var3);
                if (V3 != null) {
                    V3.mo58789x348b34();
                }
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                return f0Var;
            }
            if (!android.text.TextUtils.isEmpty(str4)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var3.d0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            }
            c50.b1 b1Var = (c50.b1) i95.n0.c(c50.b1.class);
            if (b1Var == null) {
                num = null;
                r96 = num;
                int i18 = tc4.n0.N1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var3.L1 = r96;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                return f0Var2;
            }
            long Z = pm0.v.Z(kv2Var2.m75945x2fec8307(0));
            java.lang.String m75945x2fec8307 = kv2Var2.m75945x2fec8307(8);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            tc4.h0 h0Var = new tc4.h0(n0Var3);
            this.f498908d = str4;
            this.f498909e = n0Var3;
            this.f498910f = 1;
            kv2Var = kv2Var2;
            str = "MicroMsg.Improve.FinderMediaTimelineItem";
            obj2 = "sns_video_preview_view_tag";
            n0Var = n0Var3;
            str2 = "play ";
            java.lang.String str5 = str4;
            num = null;
            Ni = ((c61.s9) b1Var).Ni(Z, m75945x2fec8307, 38, 0L, null, h0Var, this);
            if (Ni == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                return aVar;
            }
            str3 = str5;
            n0Var3 = n0Var;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                throw illegalStateException;
            }
            tc4.n0 n0Var4 = (tc4.n0) this.f498909e;
            str3 = (java.lang.String) this.f498908d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kv2Var = kv2Var2;
            str = "MicroMsg.Improve.FinderMediaTimelineItem";
            obj2 = "sns_video_preview_view_tag";
            n0Var = n0Var3;
            str2 = "play ";
            num = null;
            n0Var3 = n0Var4;
            Ni = obj;
        }
        ?? r97 = (zy2.g5) Ni;
        if (r97 != 0) {
            ?? r07 = r97 instanceof zy2.p7 ? (zy2.p7) r97 : num;
            if (r07 != 0) {
                n0Var2 = n0Var;
                r07.mo61224x6e59aab0(new tc4.i0(n0Var2));
            } else {
                n0Var2 = n0Var;
            }
            int i19 = tc4.n0.N1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var2.c0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            android.widget.FrameLayout Y2 = tc4.n0.Y(n0Var2);
            if (Y2 != null) {
                Y2.setAlpha(0.0f);
            }
            android.view.View view2 = (android.view.View) r97;
            view2.setTag(obj2);
            view2.setTag(com.p314xaae8f345.mm.R.id.s6u, kv2Var.m75945x2fec8307(0));
            android.widget.FrameLayout Y3 = tc4.n0.Y(n0Var2);
            if (Y3 != null) {
                Y3.addView(view2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            zy2.g5.u(r97, num, 1, num);
            n0Var2.x(str, str2 + r97 + ' ' + str3 + ' ' + tc4.n0.V(n0Var2));
            r96 = r97;
            int i182 = tc4.n0.N1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var3.L1 = r96;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            jz5.f0 f0Var22 = jz5.f0.f384359a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
            return f0Var22;
        }
        r96 = num;
        int i1822 = tc4.n0.N1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var3.L1 = r96;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        jz5.f0 f0Var222 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        return f0Var222;
    }
}
