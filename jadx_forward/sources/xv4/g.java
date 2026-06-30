package xv4;

/* loaded from: classes8.dex */
public final class g extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 30;
    }

    @Override // pk3.b
    public boolean Mb(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return true;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        r45.ax5 ax5Var = new r45.ax5();
        try {
            ax5Var.mo11468x92b714fd(info.f66790x225a93cf);
            su4.j2 j2Var = new su4.j2();
            j2Var.f494476f = ax5Var.m75933x41a8a7f2(2);
            j2Var.f494472b = ax5Var.m75939xb282bd08(0);
            j2Var.f494473c = ax5Var.m75939xb282bd08(1);
            j2Var.f494475e = su4.r2.f(ax5Var.m75939xb282bd08(0));
            j2Var.f494471a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            j2Var.f494478h = true;
            j2Var.G = info;
            r45.w60 w60Var = new r45.w60();
            w60Var.set(0, animateData);
            j2Var.H = pm0.v.D(w60Var);
            java.lang.String m75945x2fec8307 = ax5Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null || (jSONObject = pv4.a.f(m75945x2fec8307)) == null) {
                jSONObject = new org.json.JSONObject();
            }
            java.lang.String m75945x2fec83072 = ax5Var.m75945x2fec8307(5);
            if (m75945x2fec83072 != null && (f17 = pv4.a.f(m75945x2fec83072)) != null) {
                j2Var.f494487q = f17.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                j2Var.f494480j = f17.optBoolean("hideNavBar");
                boolean optBoolean = f17.optBoolean("hideSearchBar");
                j2Var.f494479i = optBoolean;
                if (optBoolean) {
                    j2Var.f494483m = com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c;
                }
                jSONObject.put("hideNavBar", j2Var.f494480j);
                jSONObject.put("hideSearchInput", j2Var.f494479i);
            }
            j2Var.f494477g = d75.b.e(jSONObject, xv4.f.f538967d);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            m158354x19263085().overridePendingTransition(0, 0);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SearchMultiTaskRegisterUIC", "taskData parse failed");
        }
    }

    @Override // pk3.h
    public void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c obj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        zg0.p3 p3Var = (zg0.p3) i95.n0.c(zg0.p3.class);
        java.lang.String id6 = obj.f66791xc8a07680;
        ((yg0.q4) p3Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265743a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        kVar.c(id6);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }
}
