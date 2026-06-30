package aw2;

/* loaded from: classes10.dex */
public final class y implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f14819a;

    public y(aw2.c0 c0Var) {
        this.f14819a = c0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        aw2.c0 c0Var = this.f14819a;
        boolean z17 = c0Var.f14733p;
        lVarArr[0] = new jz5.l("highlight_topic_name", z17 ? c0Var.f14732o : null);
        java.lang.String str2 = z17 ? c0Var.f14732o : null;
        lVarArr[1] = new jz5.l("shoot_together_state", java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 1 : 2));
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        lVarArr[2] = new jz5.l("finder_post_sessionid", finderFeedReportObject != null ? finderFeedReportObject.getSessionId() : null);
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        lVarArr[3] = new jz5.l("enter_scene", finderFeedReportObject2 != null ? java.lang.Integer.valueOf(finderFeedReportObject2.getEnterScene()) : null);
        return kz5.c1.k(lVarArr);
    }
}
