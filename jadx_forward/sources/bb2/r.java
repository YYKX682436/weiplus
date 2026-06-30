package bb2;

/* loaded from: classes10.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100497c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f100498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f100501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f100502h;

    public r(android.view.View view, so2.u1 u1Var, r45.oo ooVar, yz5.a aVar, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, r45.qt2 qt2Var, boolean z17, int i17) {
        this.f100495a = view;
        this.f100496b = u1Var;
        this.f100497c = ooVar;
        this.f100498d = aVar;
        this.f100499e = activityC21401x6ce6f73f;
        this.f100500f = qt2Var;
        this.f100501g = z17;
        this.f100502h = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        android.view.View view = this.f100495a;
        if (i17 == 0 && fVar.f152149b == 0) {
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.gu8, 0).show();
            r45.oo ooVar = this.f100497c;
            long m75942xfb822ef2 = ooVar.m75942xfb822ef2(0);
            so2.u1 u1Var = this.f100496b;
            u1Var.l2(m75942xfb822ef2);
            this.f100498d.mo152xb9724478();
            bb2.m0 m0Var = bb2.m0.f100451a;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f100499e;
            r45.qt2 qt2Var = this.f100500f;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bs_id", pm0.v.u(ooVar.m75942xfb822ef2(0)));
            jSONObject.put("feedid", pm0.v.u(u1Var.mo2128x1ed62e84()));
            m0Var.a(activityC21401x6ce6f73f, qt2Var, "already_delete_bullet_screen", false, jSONObject, this.f100501g, ooVar.m75939xb282bd08(6));
            m0Var.c(this.f100499e, this.f100497c, this.f100496b, this.f100502h, false);
            m0Var.d(this.f100495a, this.f100499e, this.f100497c, u1Var.mo2128x1ed62e84(), this.f100502h, false);
        } else {
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.gu7, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
