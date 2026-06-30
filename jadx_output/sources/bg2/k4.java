package bg2;

/* loaded from: classes2.dex */
public final class k4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f20247a;

    public k4(bg2.o4 o4Var) {
        this.f20247a = o4Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(view, "view");
        bg2.o4 o4Var = this.f20247a;
        uc2.g gVar = (uc2.g) o4Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        if (z17) {
            o4Var.f20361r = c01.id.c();
            com.tencent.mars.xlog.Log.i(o4Var.f20351e, "lottery anim exposed " + o4Var.f20361r);
            return;
        }
        long c17 = c01.id.c() - o4Var.f20361r;
        com.tencent.mars.xlog.Log.i(o4Var.f20351e, "lottery anim expose duration " + c17);
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.u1 u1Var = ml2.u1.K2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = o4Var.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        lVarArr[2] = new jz5.l("lottery_id", java.lang.String.valueOf(o4Var.f20357n));
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        o4Var.f20357n = null;
    }
}
