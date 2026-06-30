package ab2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab2.g f84280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f84281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f84282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f84284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ab2.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, android.view.View view, long j17) {
        super(2);
        this.f84280d = gVar;
        this.f84281e = abstractC14490x69736cb5;
        this.f84282f = i17;
        this.f84283g = view;
        this.f84284h = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num;
        int i17;
        r45.rp1 rp1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        ab2.h hVar = ab2.h.f84309a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f84281e;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ab2.g gVar = this.f84280d;
        java.lang.String a17 = hVar.a(gVar);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        long j17 = this.f84282f;
        ml2.x1 x1Var = ml2.x1.f409740n;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.s3((zy2.zb) c17, abstractC14490x69736cb5, j17, x1Var, "temp_5", a17, null, 32, null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = gVar.f187707d;
        long longExtra = abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("finder_from_feed_id", 0L);
        if (longExtra != 0) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", longExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileFeedUIC", "jumpToLive refObjectId/fromObjectId:".concat(pm0.v.u(longExtra)));
        }
        int intExtra = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("finder_from_feed_type", 0);
        if (intExtra != 0) {
            intent.putExtra("KEY_FINDER_FROM_FEED_TYPE", intExtra);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBizProfileContract", "enableDragToClose=true");
        if (((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Di()) {
            ((wa2.u) ((xa2.e) i95.n0.c(xa2.e.class))).fj(intent, this.f84283g, 280L);
        }
        intent.putExtra("CURRENT_FEED_ID", abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11());
        intent.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        r45.nw1 m76794xd0557130 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76794xd0557130();
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", m76794xd0557130 != null ? m76794xd0557130.m75939xb282bd08(42) : 0);
        intent.putExtra("key_chnl_extra", a17);
        r45.nw1 m76794xd05571302 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76794xd0557130();
        if (m76794xd05571302 != null && (rp1Var = (r45.rp1) m76794xd05571302.m75936x14adae67(45)) != null) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.mo14344x5f01b1f6());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n));
        y74Var.set(5, abstractC14490x69736cb5.getFeedObject().getFeedObject());
        wk0Var.set(6, y74Var);
        if (longExtra != 0) {
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(13, new r45.k30());
            r45.k30 k30Var = (r45.k30) ta4Var.m75936x14adae67(13);
            if (k30Var == null) {
                i17 = 0;
            } else {
                i17 = 0;
                k30Var.set(0, java.lang.Long.valueOf(longExtra));
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("key_from_comment_scene", i17));
            num = valueOf.intValue() != 0 ? valueOf : null;
            if (num != null) {
                int intValue = num.intValue();
                r45.k30 k30Var2 = (r45.k30) ta4Var.m75936x14adae67(13);
                if (k30Var2 != null) {
                    k30Var2.set(2, java.lang.String.valueOf(intValue));
                }
            }
            r45.k30 k30Var3 = (r45.k30) ta4Var.m75936x14adae67(13);
            if (k30Var3 != null) {
                k30Var3.set(1, java.lang.Integer.valueOf(intExtra == 1 ? 1 : 2));
            }
            java.util.LinkedList m75941xfb821914 = ta4Var.m75941xfb821914(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(this.f84284h));
            m75941xfb821914.add(qa4Var);
            wk0Var.set(7, ta4Var);
        } else {
            r45.ta4 ta4Var2 = new r45.ta4();
            ta4Var2.set(13, new r45.k30());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("key_from_comment_scene", 0));
            num = valueOf2.intValue() != 0 ? valueOf2 : null;
            if (num != null) {
                int intValue2 = num.intValue();
                r45.k30 k30Var4 = (r45.k30) ta4Var2.m75936x14adae67(13);
                if (k30Var4 != null) {
                    k30Var4.set(2, java.lang.String.valueOf(intValue2));
                }
            }
            wk0Var.set(7, ta4Var2);
        }
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(gVar.f187707d, intent, arrayList, 0, wk0Var, null);
        return jz5.f0.f384359a;
    }
}
