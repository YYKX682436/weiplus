package bg2;

/* loaded from: classes2.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f102211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bg2.d0 d0Var, in5.s0 s0Var) {
        super(0);
        this.f102211d = d0Var;
        this.f102212e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        zy2.ra Sj;
        uc2.i iVar = (uc2.i) this.f102211d.O6(uc2.i.class);
        in5.s0 s0Var = this.f102212e;
        if (iVar != null) {
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", 5);
            ((sb2.o) iVar).Y6(itemView, intent);
        }
        android.content.Context context = s0Var.f374654e;
        r45.qt2 V6 = (context == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.t1 t1Var = ml2.t1.f409493k3;
        jz5.l[] lVarArr = new jz5.l[1];
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        v3Var.d(V6, t1Var, kz5.c1.i(lVarArr));
        return jz5.f0.f384359a;
    }
}
