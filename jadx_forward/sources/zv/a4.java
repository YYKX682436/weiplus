package zv;

/* loaded from: classes11.dex */
public final class a4 implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f557439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23530x2996bff1 f557440c;

    public a4(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, boolean z17, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23530x2996bff1 c23530x2996bff1) {
        this.f557438a = c10465x1b7ee7d;
        this.f557439b = z17;
        this.f557440c = c23530x2996bff1;
    }

    @Override // rv.e3
    public final void a(com.p314xaae8f345.p2845xc516c4b6.biz.C23225x7fed2801 c23225x7fed2801, org.json.JSONObject jSONObject) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557438a.f146722d, "openPersonalCenterMiniAppPage receive publishCallback");
        if (this.f557439b) {
            ur1.e eVar = ur1.e.f511879d;
            ur1.e eVar2 = ur1.e.f511879d;
            java.lang.Long m87069x66e5ae59 = this.f557440c.m87069x66e5ae59();
            if (m87069x66e5ae59 != null) {
                i17 = (int) m87069x66e5ae59.longValue();
            } else {
                tk.s[] sVarArr = tk.s.f501403d;
                i17 = 2;
            }
            eVar2.a(true, i17);
        }
    }
}
