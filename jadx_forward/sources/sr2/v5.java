package sr2;

/* loaded from: classes10.dex */
public final class v5 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f493276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f493277e;

    /* renamed from: f, reason: collision with root package name */
    public int f493278f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f493279g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f493280h;

    /* renamed from: i, reason: collision with root package name */
    public sr2.p5 f493281i;

    /* renamed from: m, reason: collision with root package name */
    public int f493282m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f493283n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493282m = -1;
        this.f493283n = "";
    }

    public final void O6(int i17, java.lang.String str, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (i17 == 0) {
                jSONObject.put("topic_num", this.f493278f);
            } else {
                jSONObject.put("topic", str);
                jSONObject.put("num", i18);
            }
        } catch (org.json.JSONException unused) {
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, nyVar != null ? nyVar.V6() : null, "post_comm_topic_page", i17, jSONObject, false, null, 48, null);
    }

    public final void P6() {
        pq5.g l17 = new db2.s2(1, xy2.c.e(m158354x19263085())).l();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
        l17.K(new sr2.u5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        P6();
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        this.f493277e = false;
        P6();
    }
}
