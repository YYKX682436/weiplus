package st2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493972d;

    public s(st2.h1 h1Var) {
        this.f493972d = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ut2.u3 n17;
        r45.xv2 xv2Var;
        st2.h1 h1Var = this.f493972d;
        if (h1Var.h().isShowing && (xv2Var = (n17 = h1Var.n()).f512650g) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.f4 f4Var = ml2.f4.U;
            jSONObject.put("commerceAction", f4Var);
            jSONObject.put("cate_id", xv2Var.m75942xfb822ef2(2));
            jSONObject.put("tab_lv2_name", xv2Var.m75945x2fec8307(0));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xv2Var.m75945x2fec8307(0), n17.f512645b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewi))) {
                jSONObject.put("tab_lv2_type", 3);
            } else {
                jSONObject.put("tab_lv2_type", xv2Var.m75942xfb822ef2(2) != 0 ? 1 : 2);
            }
            jSONObject.put("tab_lv2_duration", c01.id.c() - n17.f512652i);
            jSONObject.put("total_duration", c01.id.c() - n17.f512651h);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Dj((ml2.r0) c17, f4Var, null, "", null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n17.f512646c, "onPanelHide json = " + jSONObject);
        }
        h1Var.h().a(new st2.r(h1Var));
    }
}
