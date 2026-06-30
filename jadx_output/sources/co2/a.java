package co2;

/* loaded from: classes2.dex */
public final class a implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co2.k f43781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f43782e;

    public a(co2.k kVar, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.f43781d = kVar;
        this.f43782e = wxRecyclerView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        boolean z17 = j5Var instanceof bo2.c;
        co2.k kVar = this.f43781d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(kVar.f43792d, "click position=" + i17 + " feed:" + j5Var);
            return;
        }
        bo2.c cVar = (bo2.c) j5Var;
        long j17 = vn2.u0.f438387a.j(cVar.getFeedObject());
        if (j17 <= 0) {
            r45.no2 playhistory_info = cVar.getFeedObject().getFeedObject().getPlayhistory_info();
            j17 = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
        }
        long j18 = j17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        com.tencent.mars.xlog.Log.i(kVar.f43792d, "click position=" + i17 + ",finderContextId=" + b17 + ",SeeLaterDetailFeed:" + j5Var + ", playProgress=" + j18);
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((w03.n) pf5.z.f353948a.a(activity).a(w03.n.class)).f441889d = true;
        wn2.f fVar = (wn2.f) i95.n0.c(wn2.f.class);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f43782e;
        android.content.Context context = wxRecyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fVar.Ai(context, new android.content.Intent());
        android.content.Context context2 = wxRecyclerView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(b17);
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = cVar.getFeedObject();
        int i18 = qg3.g1.f362820d;
        c03.k.b(context2, b17, feedObject, j18, false, urgen.ur_54A4.UR_6075.UR_BC6E());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, kz5.c1.k(new jz5.l("view_id", "watch_later_card"), new jz5.l("finder_context_id", b17), new jz5.l("comment_scene", java.lang.Integer.valueOf(((r45.qt2) ((jz5.n) kVar.f43793e).getValue()).getInteger(5))), new jz5.l("feed_id", pm0.v.u(j5Var.getItemId())), new jz5.l("session_buffer", ((bo2.c) j5Var).getFeedObject().getFeedObject().getSessionBuffer())), 1, true);
        kVar.f43798m = true;
    }
}
