package bg2;

/* loaded from: classes2.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc2.g f20707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(tc2.g gVar, bg2.q6 q6Var) {
        super(0);
        this.f20707d = gVar;
        this.f20708e = q6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final tc2.g gVar = this.f20707d;
        in5.s0 s0Var = gVar.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        final com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI == null) {
            return null;
        }
        final bg2.q6 q6Var = this.f20708e;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiveNotInterestedClickEvent>(mMFinderUI) { // from class: com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedClickListener$2$1$1
            {
                this.__eventId = 687202514;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiveNotInterestedClickEvent liveNotInterestedClickEvent) {
                kotlinx.coroutines.y0 y0Var;
                com.tencent.mm.autogen.events.LiveNotInterestedClickEvent event = liveNotInterestedClickEvent;
                kotlin.jvm.internal.o.g(event, "event");
                bg2.q6 q6Var2 = q6Var;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = q6Var2.f417141d.f417148h;
                am.xi xiVar = event.f54474g;
                if (!(baseFinderFeed != null && xiVar.f8381a == baseFinderFeed.getItemId())) {
                    return false;
                }
                in5.s0 s0Var2 = q6Var2.f417141d.f417149i;
                android.content.Context context2 = s0Var2 != null ? s0Var2.f293121e : null;
                com.tencent.mars.xlog.Log.i(q6Var2.f20413e, "noInterested click, id:" + xiVar.f8381a + ", clickFeedBackResp:" + q6Var2.f20414f + ", context:" + context2);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.f327934a2, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var2)), new jz5.l("feedId", bg2.q6.Y6(q6Var2)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
                if (context2 == null || (y0Var = gVar.f417147g) == null) {
                    return true;
                }
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new bg2.y5(q6Var2, context2, null), 2, null);
                return true;
            }
        };
    }
}
