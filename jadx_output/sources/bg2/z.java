package bg2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f20678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f20679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bg2.d0 d0Var, in5.s0 s0Var) {
        super(0);
        this.f20678d = d0Var;
        this.f20679e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        zy2.ra Sj;
        uc2.i iVar = (uc2.i) this.f20678d.O6(uc2.i.class);
        in5.s0 s0Var = this.f20679e;
        if (iVar != null) {
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", 5);
            ((sb2.o) iVar).Y6(itemView, intent);
        }
        android.content.Context context = s0Var.f293121e;
        r45.qt2 V6 = (context == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.t1 t1Var = ml2.t1.f327960k3;
        jz5.l[] lVarArr = new jz5.l[1];
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        v3Var.d(V6, t1Var, kz5.c1.i(lVarArr));
        return jz5.f0.f302826a;
    }
}
