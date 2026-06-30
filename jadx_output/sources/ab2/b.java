package ab2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab2.g f2747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f2748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ab2.g gVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, android.view.View view, long j17) {
        super(2);
        this.f2747d = gVar;
        this.f2748e = baseFinderFeed;
        this.f2749f = i17;
        this.f2750g = view;
        this.f2751h = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num;
        int i17;
        r45.rp1 rp1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        ab2.h hVar = ab2.h.f2776a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f2748e;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ab2.g gVar = this.f2747d;
        java.lang.String a17 = hVar.a(gVar);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        long j17 = this.f2749f;
        ml2.x1 x1Var = ml2.x1.f328207n;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.s3((zy2.zb) c17, baseFinderFeed, j17, x1Var, "temp_5", a17, null, 32, null);
        com.tencent.mm.ui.MMActivity mMActivity = gVar.f106174d;
        long longExtra = mMActivity.getIntent().getLongExtra("finder_from_feed_id", 0L);
        if (longExtra != 0) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", longExtra);
            com.tencent.mars.xlog.Log.i("Finder.ProfileFeedUIC", "jumpToLive refObjectId/fromObjectId:".concat(pm0.v.u(longExtra)));
        }
        int intExtra = mMActivity.getIntent().getIntExtra("finder_from_feed_type", 0);
        if (intExtra != 0) {
            intent.putExtra("KEY_FINDER_FROM_FEED_TYPE", intExtra);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderBizProfileContract", "enableDragToClose=true");
        if (((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Di()) {
            ((wa2.u) ((xa2.e) i95.n0.c(xa2.e.class))).fj(intent, this.f2750g, 280L);
        }
        intent.putExtra("CURRENT_FEED_ID", baseFinderFeed.getFeedObject().getFeedObject().getId());
        intent.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getFeedObject().getLiveInfo();
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", liveInfo != null ? liveInfo.getInteger(42) : 0);
        intent.putExtra("key_chnl_extra", a17);
        r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getFeedObject().getLiveInfo();
        if (liveInfo2 != null && (rp1Var = (r45.rp1) liveInfo2.getCustom(45)) != null) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.toByteArray());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(baseFinderFeed.getFeedObject().getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n));
        y74Var.set(5, baseFinderFeed.getFeedObject().getFeedObject());
        wk0Var.set(6, y74Var);
        if (longExtra != 0) {
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(13, new r45.k30());
            r45.k30 k30Var = (r45.k30) ta4Var.getCustom(13);
            if (k30Var == null) {
                i17 = 0;
            } else {
                i17 = 0;
                k30Var.set(0, java.lang.Long.valueOf(longExtra));
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mMActivity.getIntent().getIntExtra("key_from_comment_scene", i17));
            num = valueOf.intValue() != 0 ? valueOf : null;
            if (num != null) {
                int intValue = num.intValue();
                r45.k30 k30Var2 = (r45.k30) ta4Var.getCustom(13);
                if (k30Var2 != null) {
                    k30Var2.set(2, java.lang.String.valueOf(intValue));
                }
            }
            r45.k30 k30Var3 = (r45.k30) ta4Var.getCustom(13);
            if (k30Var3 != null) {
                k30Var3.set(1, java.lang.Integer.valueOf(intExtra == 1 ? 1 : 2));
            }
            java.util.LinkedList list = ta4Var.getList(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(this.f2751h));
            list.add(qa4Var);
            wk0Var.set(7, ta4Var);
        } else {
            r45.ta4 ta4Var2 = new r45.ta4();
            ta4Var2.set(13, new r45.k30());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(mMActivity.getIntent().getIntExtra("key_from_comment_scene", 0));
            num = valueOf2.intValue() != 0 ? valueOf2 : null;
            if (num != null) {
                int intValue2 = num.intValue();
                r45.k30 k30Var4 = (r45.k30) ta4Var2.getCustom(13);
                if (k30Var4 != null) {
                    k30Var4.set(2, java.lang.String.valueOf(intValue2));
                }
            }
            wk0Var.set(7, ta4Var2);
        }
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(gVar.f106174d, intent, arrayList, 0, wk0Var, null);
        return jz5.f0.f302826a;
    }
}
