package bg2;

/* loaded from: classes2.dex */
public final class g1 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101634f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f101635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101633e = "LiveConvertGuideStatusController";
        this.f101634f = 259200;
        this.f101635g = new java.util.LinkedList();
    }

    public final boolean Y6(bg2.e1 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int e17 = c01.id.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkCanShow] type=");
        sb6.append(type);
        sb6.append(", currentTs=");
        sb6.append(e17);
        sb6.append(", lastShowGuideTs=");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LAST_GUIDE_TS_INT_SYNC;
        sb6.append(c17.r(u3Var, 0));
        sb6.append(", INTERVAL_LIMIT=");
        int i17 = this.f101634f;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f101633e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (e17 - gm0.j1.u().c().r(u3Var, 0) < i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkCanShow] interval limit");
            return false;
        }
        java.util.LinkedList linkedList = this.f101635g;
        bg2.e1 e1Var = (bg2.e1) kz5.n0.Z(linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkCanShow] type:" + type + ", canShowType=" + e1Var + ",showTypeList=" + linkedList);
        boolean z17 = type == e1Var;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkCanShow] result=" + type + ", save-lastShowGuideTs=" + e17);
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(e17));
        }
        return z17;
    }

    public final void Z6(bg2.e1 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.util.LinkedList linkedList = this.f101635g;
        linkedList.add(type);
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new bg2.f1());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101633e, "[markShow] " + type + ", showTypeList=" + linkedList);
        ae2.in.f85221a.B();
    }
}
