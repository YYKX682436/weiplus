package wo2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f529662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wo2.m0 m0Var) {
        super(5);
        this.f529662d = m0Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String title = (java.lang.String) obj;
        java.lang.String videoTabName = (java.lang.String) obj2;
        java.lang.String liveTabName = (java.lang.String) obj3;
        java.util.LinkedList tabList = (java.util.LinkedList) obj4;
        boolean booleanValue = ((java.lang.Boolean) obj5).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoTabName, "videoTabName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveTabName, "liveTabName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabList, "tabList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyActionBarUIC", "fetchTabsInfo videoTabName:" + videoTabName + " liveTabName:" + liveTabName + " tabList:" + tabList + " isHideTabs:" + booleanValue);
        pm0.v.X(new wo2.t(this.f529662d, videoTabName, liveTabName));
        return jz5.f0.f384359a;
    }
}
