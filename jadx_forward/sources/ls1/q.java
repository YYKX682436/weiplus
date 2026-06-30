package ls1;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402540a;

    public q(ls1.e0 e0Var) {
        this.f402540a = e0Var;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: __getString */
    public final java.lang.String m146264x180bd327() {
        java.lang.String str = this.f402540a.Y1;
        if (str != null) {
            com.p314xaae8f345.mm.vfs.r6 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.c(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175972e, str);
            return c17 != null ? com.p314xaae8f345.mm.vfs.s6.b(c17, null, 1, null) : "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentId");
        throw null;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: __log */
    public final void m146265x5678b64(java.lang.String str) {
        org.json.JSONObject jSONObject;
        ls1.e0 e0Var = this.f402540a;
        e0Var.getClass();
        if (str == null || (jSONObject = new org.json.JSONObject(str).getJSONObject("err")) == null) {
            return;
        }
        int i17 = jSONObject.getInt("errCode");
        java.lang.String string = jSONObject.getString("msg");
        java.lang.String B1 = e0Var.B1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onWebLog:");
        java.lang.String str2 = e0Var.Y1;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentId");
            throw null;
        }
        sb6.append(str2);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(',');
        sb6.append(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(B1, sb6.toString());
        ax4.a.c(114);
    }
}
