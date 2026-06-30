package at2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f13662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ at2.h0 f13664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13665g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, at2.h0 h0Var, boolean z18) {
        super(1);
        this.f13662d = u3Var;
        this.f13663e = z17;
        this.f13664f = h0Var;
        this.f13665g = z18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f13662d.dismiss();
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            boolean z17 = this.f13665g;
            boolean z18 = this.f13663e;
            at2.h0 h0Var = this.f13664f;
            if (z18) {
                at2.u1 u1Var = (at2.u1) h0Var.f13678g.getPlugin(at2.u1.class);
                if (u1Var != null) {
                    u1Var.x1();
                    dt2.a0 a0Var = u1Var.f13762q;
                    if (a0Var != null) {
                        a0Var.f();
                    }
                }
                android.content.Context context = h0Var.f13676e;
                db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.eak));
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                long O6 = ((ct2.j) h0Var.f13677f.a(ct2.j.class)).O6();
                am.ia iaVar = feedUpdateEvent.f54252g;
                iaVar.f6918a = O6;
                iaVar.f6919b = 24;
                feedUpdateEvent.e();
            } else {
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent2 = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                long O62 = ((ct2.j) h0Var.f13677f.a(ct2.j.class)).O6();
                am.ia iaVar2 = feedUpdateEvent2.f54252g;
                iaVar2.f6918a = O62;
                iaVar2.f6919b = 27;
                feedUpdateEvent2.e();
                android.content.Context context2 = h0Var.f13676e;
                db5.t7.h(context2, context2.getResources().getString(com.tencent.mm.R.string.eay));
                com.tencent.mars.xlog.Log.i("ReplayMoreActionPlugin", "setReplay " + ((ct2.j) h0Var.f13677f.a(ct2.j.class)).Q6() + " enable:" + z17 + '!');
            }
            ct2.j jVar = (ct2.j) h0Var.f13677f.a(ct2.j.class);
            if (jVar.f222277u == -1) {
                jVar.W6(jVar.P6().getInteger(31));
            }
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "setAnchorStatus enableForAny:" + z17 + " replay_status " + jVar.P6().getInteger(31));
            jVar.W6(z17 ? 1 : z18 ? 2 : 5);
        }
        return jz5.f0.f302826a;
    }
}
