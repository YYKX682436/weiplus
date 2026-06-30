package j93;

/* loaded from: classes.dex */
public final class v2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f380050d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f380051e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f380052f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380053g;

    /* renamed from: h, reason: collision with root package name */
    public int f380054h;

    /* renamed from: i, reason: collision with root package name */
    public int f380055i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f380056m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f380057n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f380050d = jz5.h.b(new j93.u2(this));
        this.f380051e = new java.util.ArrayList();
        this.f380052f = en1.a.a() + '_' + c01.id.c();
    }

    public final java.lang.String T6() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bottom_panel_omit_cnt", this.f380054h);
        jSONObject.put("if_extend_panel", this.f380053g ? 1 : 0);
        jSONObject.put("half_panel_omit_cnt", this.f380055i);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new j93.r2(this));
    }
}
