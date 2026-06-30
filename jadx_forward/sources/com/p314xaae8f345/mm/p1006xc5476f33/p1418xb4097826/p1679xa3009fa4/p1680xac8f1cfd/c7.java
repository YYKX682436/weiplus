package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class c7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.x3 f215504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7 f215505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx2.q f215506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(dm.x3 x3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7 d7Var, gx2.q qVar) {
        super(0);
        this.f215504d = x3Var;
        this.f215505e = d7Var;
        this.f215506f = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cq.k1.a();
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209263h6).mo141623x754a37bb()).r()).booleanValue();
        dm.x3 item = this.f215504d;
        if (!booleanValue) {
            i95.m c17 = i95.n0.c(c61.l7.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.r) ((jz5.n) ((c61.l7) c17).H).mo141623x754a37bb();
            rVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommEducationInfoStorage", "remove bizType:" + item.f69116x6a05088b + ", result: " + rVar.f208988d.mo70514xb06685ab("FinderCommEducationInfoItem", "biz_type=?", new java.lang.String[]{java.lang.String.valueOf(item.f69116x6a05088b)}));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7 d7Var = this.f215505e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(d2Var, d7Var.m158354x19263085(), "privacy_protect", "trigger_privacy_protect_toast", false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7.O6(d7Var, item), 8, null);
        if (item.f69120x5d0afc12) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = d7Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea.class)).f215774e = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(this.f215506f, false, 1, null);
            d7Var.f215620d = true;
        }
        return jz5.f0.f384359a;
    }
}
