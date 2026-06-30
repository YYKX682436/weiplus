package pk2;

/* loaded from: classes3.dex */
public final class e0 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437230h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437231i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437230h = helper.M;
        this.f437231i = "anchorlive.more.creatorcenter";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f445960a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) o9Var2.c(mm2.c1.class)).f410311a5 ? ((mm2.o2) o9Var2.c(mm2.o2.class)).f410840p : ((mm2.c1) o9Var2.c(mm2.c1.class)).f410442x0;
        java.lang.String str2 = o9Var.f437605a;
        if (c19786x6a1e2862 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "onItemClicked: creatorCenterEntrance is null, skip jump (后台未下发 creator_center_entrance_v2)");
        }
        if (c19786x6a1e2862 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var2.f437611d;
            r45.k74 m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7();
            if (m76504xa819f0c7 == null || (str = m76504xa819f0c7.m75945x2fec8307(2)) == null) {
                str = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Throwable unused) {
            }
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            jSONObject.put("rpt_finder_username", xy2.c.e(context2));
            jSONObject.put("rpt_liveid", n() ? pm0.v.u(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0)) : "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AnchorCreatorCenterOption onClick, query:");
            sb6.append(jSONObject);
            sb6.append(", origin:");
            r45.k74 m76504xa819f0c72 = c19786x6a1e2862.m76504xa819f0c7();
            sb6.append(m76504xa819f0c72 != null ? m76504xa819f0c72.m75945x2fec8307(2) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            r45.k74 m76504xa819f0c73 = c19786x6a1e2862.m76504xa819f0c7();
            if (m76504xa819f0c73 != null) {
                m76504xa819f0c73.set(2, jSONObject.toString());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 10, 2, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("element", 9);
        jSONObject2.put("type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437231i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f410311a5) {
            if (((mm2.o2) o9Var.c(mm2.o2.class)).f410840p != null) {
                return true;
            }
        } else if (((mm2.c1) o9Var.c(mm2.c1.class)).f410442x0 != null) {
            return true;
        }
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437230h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80071x5cd38720, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 10, 1, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 9);
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437230h;
    }
}
