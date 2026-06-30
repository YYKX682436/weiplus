package at2;

/* loaded from: classes3.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f95195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ at2.h0 f95197f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f95198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, at2.h0 h0Var, boolean z18) {
        super(1);
        this.f95195d = u3Var;
        this.f95196e = z17;
        this.f95197f = h0Var;
        this.f95198g = z18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f95195d.dismiss();
        if ((fVar != null && fVar.f152148a == 0) && fVar.f152149b == 0) {
            boolean z17 = this.f95198g;
            boolean z18 = this.f95196e;
            at2.h0 h0Var = this.f95197f;
            if (z18) {
                at2.u1 u1Var = (at2.u1) h0Var.f95211g.mo57682x2a5e9229(at2.u1.class);
                if (u1Var != null) {
                    u1Var.x1();
                    dt2.a0 a0Var = u1Var.f95295q;
                    if (a0Var != null) {
                        a0Var.f();
                    }
                }
                android.content.Context context = h0Var.f95209e;
                db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eak));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                long O6 = ((ct2.j) h0Var.f95210f.a(ct2.j.class)).O6();
                am.ia iaVar = c5445x963cab3.f135785g;
                iaVar.f88451a = O6;
                iaVar.f88452b = 24;
                c5445x963cab3.e();
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                long O62 = ((ct2.j) h0Var.f95210f.a(ct2.j.class)).O6();
                am.ia iaVar2 = c5445x963cab32.f135785g;
                iaVar2.f88451a = O62;
                iaVar2.f88452b = 27;
                c5445x963cab32.e();
                android.content.Context context2 = h0Var.f95209e;
                db5.t7.h(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eay));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayMoreActionPlugin", "setReplay " + ((ct2.j) h0Var.f95210f.a(ct2.j.class)).Q6() + " enable:" + z17 + '!');
            }
            ct2.j jVar = (ct2.j) h0Var.f95210f.a(ct2.j.class);
            if (jVar.f303810u == -1) {
                jVar.W6(jVar.P6().m75939xb282bd08(31));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "setAnchorStatus enableForAny:" + z17 + " replay_status " + jVar.P6().m75939xb282bd08(31));
            jVar.W6(z17 ? 1 : z18 ? 2 : 5);
        }
        return jz5.f0.f384359a;
    }
}
