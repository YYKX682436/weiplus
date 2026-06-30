package bg2;

/* loaded from: classes2.dex */
public final class k4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f101780a;

    public k4(bg2.o4 o4Var) {
        this.f101780a = o4Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        bg2.o4 o4Var = this.f101780a;
        uc2.g gVar = (uc2.g) o4Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        if (z17) {
            o4Var.f101894r = c01.id.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f101884e, "lottery anim exposed " + o4Var.f101894r);
            return;
        }
        long c17 = c01.id.c() - o4Var.f101894r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f101884e, "lottery anim expose duration " + c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.u1 u1Var = ml2.u1.K2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = o4Var.f498674d.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        lVarArr[2] = new jz5.l("lottery_id", java.lang.String.valueOf(o4Var.f101890n));
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        o4Var.f101890n = null;
    }
}
