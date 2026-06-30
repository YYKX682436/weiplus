package bb2;

/* loaded from: classes10.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f18963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oo f18964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f18965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f18966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f18967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f18968g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18969h;

    public r(android.view.View view, so2.u1 u1Var, r45.oo ooVar, yz5.a aVar, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, r45.qt2 qt2Var, boolean z17, int i17) {
        this.f18962a = view;
        this.f18963b = u1Var;
        this.f18964c = ooVar;
        this.f18965d = aVar;
        this.f18966e = mMFragmentActivity;
        this.f18967f = qt2Var;
        this.f18968g = z17;
        this.f18969h = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        android.view.View view = this.f18962a;
        if (i17 == 0 && fVar.f70616b == 0) {
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.gu8, 0).show();
            r45.oo ooVar = this.f18964c;
            long j17 = ooVar.getLong(0);
            so2.u1 u1Var = this.f18963b;
            u1Var.l2(j17);
            this.f18965d.invoke();
            bb2.m0 m0Var = bb2.m0.f18918a;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f18966e;
            r45.qt2 qt2Var = this.f18967f;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bs_id", pm0.v.u(ooVar.getLong(0)));
            jSONObject.put("feedid", pm0.v.u(u1Var.getItemId()));
            m0Var.a(mMFragmentActivity, qt2Var, "already_delete_bullet_screen", false, jSONObject, this.f18968g, ooVar.getInteger(6));
            m0Var.c(this.f18966e, this.f18964c, this.f18963b, this.f18969h, false);
            m0Var.d(this.f18962a, this.f18966e, this.f18964c, u1Var.getItemId(), this.f18969h, false);
        } else {
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.gu7, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
