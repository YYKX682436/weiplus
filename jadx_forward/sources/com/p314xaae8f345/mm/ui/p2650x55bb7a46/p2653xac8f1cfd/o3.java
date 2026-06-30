package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes10.dex */
public final class o3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 f281152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 u3Var) {
        super(3);
        this.f281152d = u3Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String string;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        android.view.View playView = (android.view.View) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playView, "playView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAutoPlay: liveId=");
        r45.nw1 m76794xd0557130 = finderObject.m76794xd0557130();
        sb6.append(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(finderObject.m76784x5db1b11()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", sb6.toString());
        i95.m c17 = i95.n0.c(zy2.pa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long m76784x5db1b11 = finderObject.m76784x5db1b11();
        r45.nw1 m76794xd05571302 = finderObject.m76794xd0557130();
        long m75942xfb822ef2 = m76794xd05571302 != null ? m76794xd05571302.m75942xfb822ef2(0) : 0L;
        java.lang.String m76836x6c03c64c = finderObject.m76836x6c03c64c();
        java.lang.String m76801x8010e5e4 = finderObject.m76801x8010e5e4();
        java.lang.String str = "";
        java.lang.String str2 = m76801x8010e5e4 == null ? "" : m76801x8010e5e4;
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f409345e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 u3Var = this.f281152d;
        org.json.JSONObject jSONObject = u3Var.f281586m;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("auto_time", intValue);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        zy2.pa.Gc(paVar, m76784x5db1b11, m75942xfb822ef2, m76836x6c03c64c, str2, 15L, "temp_7", 0, r26.i0.t(jSONObject2, ",", ";", false), null, 256, null);
        java.lang.Object parent = playView.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            view.setTag(com.p314xaae8f345.mm.R.id.rus, bool);
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.rut);
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            int intValue2 = (num != null ? num.intValue() : 0) + intValue;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getTag(com.p314xaae8f345.mm.R.id.rur), bool)) {
                view.setTag(com.p314xaae8f345.mm.R.id.rut, 0);
                r45.jn0 jn0Var = new r45.jn0();
                jn0Var.set(0, java.lang.Long.valueOf(finderObject.m76784x5db1b11()));
                jn0Var.set(1, finderObject.m76836x6c03c64c());
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("feedActionType", 37);
                jSONObject3.put("strValue", u3Var.f281587n);
                jSONObject3.put("AutoPlayDuration", intValue2);
                jn0Var.set(3, jSONObject3.toString());
                org.json.JSONObject jSONObject4 = u3Var.f281586m;
                if (jSONObject4 != null && (string = jSONObject4.getString("reportcontent")) != null) {
                    str = string;
                }
                jn0Var.set(10, str);
                ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(null, 18054, jn0Var);
            } else {
                view.setTag(com.p314xaae8f345.mm.R.id.rut, java.lang.Integer.valueOf(intValue2));
            }
        }
        return jz5.f0.f384359a;
    }
}
