package bb2;

/* loaded from: classes10.dex */
public final class w implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f100560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100562h;

    public w(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, r45.qt2 qt2Var, boolean z17, r45.oo ooVar, so2.u1 u1Var) {
        this.f100558d = activityC21401x6ce6f73f;
        this.f100559e = qt2Var;
        this.f100560f = z17;
        this.f100561g = ooVar;
        this.f100562h = u1Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (ret.m75939xb282bd08(1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletPopupHelper", "comment black list failed:" + ret.m75939xb282bd08(1));
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7h), 0).show();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletPopupHelper", "bullet black list succ");
        db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7g), 0).show();
        bb2.m0 m0Var = bb2.m0.f100451a;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f100558d;
        r45.qt2 qt2Var = this.f100559e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.oo ooVar = this.f100561g;
        jSONObject.put("bs_id", pm0.v.u(ooVar.m75942xfb822ef2(0)));
        jSONObject.put("feedid", pm0.v.u(this.f100562h.mo2128x1ed62e84()));
        m0Var.a(activityC21401x6ce6f73f, qt2Var, "already_into_blacklist", false, jSONObject, this.f100560f, ooVar.m75939xb282bd08(6));
    }
}
