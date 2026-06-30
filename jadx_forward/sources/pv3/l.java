package pv3;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f440143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pv3.m f440144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f440145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f440146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(in5.s0 s0Var, long j17, pv3.m mVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440142d = s0Var;
        this.f440143e = j17;
        this.f440144f = mVar;
        this.f440145g = c19792x256d2725;
        this.f440146h = c16997xb0aa383a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pv3.l(this.f440142d, this.f440143e, this.f440144f, this.f440145g, this.f440146h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pv3.l lVar = (pv3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        in5.s0 s0Var = this.f440142d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.uiv);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.rp8);
        android.view.KeyEvent.Callback findViewWithTag = frameLayout != null ? frameLayout.findViewWithTag("music_picker_video_view_tag") : null;
        zy2.g5 g5Var = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : null;
        android.view.View view = g5Var instanceof android.view.View ? (android.view.View) g5Var : null;
        java.lang.Object tag = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.uiw) : null;
        java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        long j17 = this.f440143e;
        boolean z17 = l17 == null || j17 != l17.longValue();
        pv3.m mVar = this.f440144f;
        java.lang.String str = mVar.f440148b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPlay] isPlayViewNull:");
        sb6.append(g5Var == null);
        sb6.append(" isDiffFeed:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (g5Var == null || z17) {
            i95.m c17 = i95.n0.c(c50.b1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.g5 Ri = ((c61.s9) ((c50.b1) c17)).Ri(this.f440145g, "", 0L, null, new pv3.i(this.f440144f, frameLayout, p17, this.f440143e, this.f440142d), new pv3.j(mVar, j17, this.f440146h));
            ((zy2.p7) Ri).mo61224x6e59aab0(new pv3.k(mVar, p17, s0Var));
            mVar.a(p17);
            mVar.b(s0Var, false);
            android.view.View view2 = (android.view.View) Ri;
            view2.setTag("music_picker_video_view_tag");
            view2.setTag(com.p314xaae8f345.mm.R.id.uiw, new java.lang.Long(j17));
            if (frameLayout != null) {
                frameLayout.addView(view2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            Ri.mo56709x764d819b(false);
            zy2.g5.u(Ri, null, 1, null);
        } else {
            g5Var.mo56709x764d819b(false);
            g5Var.mo58789x348b34();
        }
        return jz5.f0.f384359a;
    }
}
