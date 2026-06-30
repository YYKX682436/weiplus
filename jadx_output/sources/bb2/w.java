package bb2;

/* loaded from: classes10.dex */
public final class w implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f19025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f19026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.oo f19028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f19029h;

    public w(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, r45.qt2 qt2Var, boolean z17, r45.oo ooVar, so2.u1 u1Var) {
        this.f19025d = mMFragmentActivity;
        this.f19026e = qt2Var;
        this.f19027f = z17;
        this.f19028g = ooVar;
        this.f19029h = u1Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (ret.getInteger(1) != 0) {
            com.tencent.mars.xlog.Log.i("FinderBulletPopupHelper", "comment black list failed:" + ret.getInteger(1));
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.e7h), 0).show();
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderBulletPopupHelper", "bullet black list succ");
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.e7g), 0).show();
        bb2.m0 m0Var = bb2.m0.f18918a;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f19025d;
        r45.qt2 qt2Var = this.f19026e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.oo ooVar = this.f19028g;
        jSONObject.put("bs_id", pm0.v.u(ooVar.getLong(0)));
        jSONObject.put("feedid", pm0.v.u(this.f19029h.getItemId()));
        m0Var.a(mMFragmentActivity, qt2Var, "already_into_blacklist", false, jSONObject, this.f19027f, ooVar.getInteger(6));
    }
}
