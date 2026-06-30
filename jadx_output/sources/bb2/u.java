package bb2;

/* loaded from: classes10.dex */
public final class u implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f19003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f19004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19005f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.oo f19006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f19007h;

    public u(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, r45.qt2 qt2Var, boolean z17, r45.oo ooVar, so2.u1 u1Var) {
        this.f19003d = mMFragmentActivity;
        this.f19004e = qt2Var;
        this.f19005f = z17;
        this.f19006g = ooVar;
        this.f19007h = u1Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (ret.getInteger(1) != 0) {
            com.tencent.mars.xlog.Log.i("FinderBulletPopupHelper", "remove comment black list failed:" + ret.getInteger(1));
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f1t), 0).show();
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderBulletPopupHelper", "remove bullet black list succ");
        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f1s), 0).show();
        bb2.m0 m0Var = bb2.m0.f18918a;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f19003d;
        r45.qt2 qt2Var = this.f19004e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.oo ooVar = this.f19006g;
        jSONObject.put("bs_id", pm0.v.u(ooVar.getLong(0)));
        jSONObject.put("feedid", pm0.v.u(this.f19007h.getItemId()));
        m0Var.a(mMFragmentActivity, qt2Var, "already_out_blacklist", false, jSONObject, this.f19005f, ooVar.getInteger(6));
    }
}
