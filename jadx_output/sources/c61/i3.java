package c61;

/* loaded from: classes10.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(java.lang.String str, int i17) {
        super(0);
        this.f39034d = str;
        this.f39035e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
        java.lang.String str = this.f39034d;
        java.lang.String h17 = m4Var.h(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[checkUpdatePersonalMsg] sessionId=" + str + " talker=" + h17);
        zy2.dc fj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(h17);
        if (fj6 != null) {
            if (java.lang.System.currentTimeMillis() - ((ya2.b2) fj6).field_personalMsgUpdateTime >= gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_ENTER_PERSONAL_MSG_REFRESH_INTERVAL_INT_SYNC, 3600) * 1000) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.lz0 lz0Var = new r45.lz0();
                lz0Var.set(0, h17);
                lz0Var.set(1, str);
                lz0Var.set(2, java.lang.Integer.valueOf(this.f39035e));
                linkedList.add(lz0Var);
                new db2.p4(linkedList).l();
            }
        }
        return jz5.f0.f302826a;
    }
}
