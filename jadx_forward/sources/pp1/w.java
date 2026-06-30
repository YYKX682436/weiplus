package pp1;

/* loaded from: classes14.dex */
public final class w implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438976d;

    public w(pp1.z zVar) {
        this.f438976d = zVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        pp1.a data = (pp1.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClickListener onClick position: ");
        sb6.append(i17);
        sb6.append(", size:");
        pp1.z zVar = this.f438976d;
        sb6.append(zVar.f438984i.size());
        sb6.append(", isExpanded:");
        sb6.append(pp1.z.B);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo = data.f438926d;
        if (c12917x19ac03e7 != null) {
            c12917x19ac03e7.D(ballInfo);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        android.view.View b17 = qp1.g0.f447255a.b(itemView);
        if (b17 != null) {
            int[] iArr = new int[2];
            b17.getLocationOnScreen(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            int width = b17.getWidth();
            int height = b17.getHeight();
            qp1.g0.f447256b = new qp1.c(ballInfo, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b(new android.graphics.Point(width, height), new android.graphics.Point(i18, i19)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewUtils", "updateBallViewPosition position: (" + i18 + ", " + i19 + "), size: (" + width + ", " + height + ')');
        }
        if (ballInfo.f174583h == null) {
            ((gp1.v) ((jz5.n) zVar.f438986n).mo141623x754a37bb()).h0(ballInfo);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ni(1);
    }
}
