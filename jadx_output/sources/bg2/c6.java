package bg2;

/* loaded from: classes2.dex */
public final class c6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc2.g f19984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f19985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(tc2.g gVar, bg2.q6 q6Var) {
        super(0);
        this.f19984d = gVar;
        this.f19985e = q6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final tc2.g gVar = this.f19984d;
        in5.s0 s0Var = gVar.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        final com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI == null) {
            return null;
        }
        final bg2.q6 q6Var = this.f19985e;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiveNotInterestedExposeEvent>(mMFinderUI) { // from class: com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedExposedListener$2$1$1
            {
                this.__eventId = 1519392342;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiveNotInterestedExposeEvent liveNotInterestedExposeEvent) {
                com.tencent.mm.autogen.events.LiveNotInterestedExposeEvent event = liveNotInterestedExposeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                bg2.q6 q6Var2 = q6Var;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = q6Var2.f417141d.f417148h;
                am.yi yiVar = event.f54475g;
                if (!(baseFinderFeed != null && yiVar.f8464a == baseFinderFeed.getItemId())) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(q6Var2.f20413e, "noInterested exposed, id:" + yiVar.f8464a);
                kotlinx.coroutines.y0 y0Var = gVar.f417147g;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new bg2.b6(q6Var2, null), 3, null);
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.S1, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var2)), new jz5.l("feedId", bg2.q6.Y6(q6Var2)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
                return true;
            }
        };
    }
}
