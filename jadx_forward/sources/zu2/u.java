package zu2;

/* loaded from: classes8.dex */
public final class u extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f557283g;

    public u(zu2.a0 a0Var) {
        this.f557283g = a0Var;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f332492d == 3) {
                zu2.a0 a0Var = this.f557283g;
                java.lang.String str = a0Var.f557225d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PlayEvent ev.video:");
                mn2.j4 j4Var = fVar.f332495g;
                sb6.append(j4Var != null ? j4Var.hashCode() : 0);
                sb6.append(", offset:");
                sb6.append(fVar.f332496h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.f557236r, fVar.f332495g) && java.lang.Math.abs(fVar.f332496h - a0Var.f557237s) <= 2 && a0Var.f557237s != fVar.f332496h) {
                    a0Var.f557234p++;
                }
                a0Var.f557236r = fVar.f332495g;
                a0Var.f557237s = fVar.f332496h;
                if (java.lang.Math.max(a0Var.f557232n - a0Var.f557234p, 0) > 0 && !a0Var.f557235q) {
                    zu2.q qVar = a0Var.f557227f;
                    if (qVar != null) {
                        r45.i33 i33Var = qVar.f557264a;
                        qVar.a();
                        try {
                            java.lang.String m75945x2fec8307 = i33Var.m75945x2fec8307(5);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject(m75945x2fec8307);
                            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                            if (optJSONObject == null) {
                                optJSONObject = new org.json.JSONObject();
                            }
                            jSONObject.put("report_type", 1);
                            jSONObject.put("report_link", i33Var.m75945x2fec8307(3));
                            jSONObject.put("viewable", true);
                            jSONObject.put("exposure_type", 1);
                            optJSONObject.put("exp_time", qVar.f557268e);
                            optJSONObject.put("clk_time", 0);
                            jSONObject.put("weapp_extra_data", optJSONObject.toString());
                            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue()) {
                                java.lang.String jSONObject2 = jSONObject.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                new db2.m2(1, jSONObject2, null).l();
                            } else {
                                java.lang.String jSONObject3 = jSONObject.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                                gm0.j1.d().g(new db2.w5(1, jSONObject3));
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(qVar.f557265b, th6, "reportFirstPlay", new java.lang.Object[0]);
                        }
                    }
                    a0Var.f557235q = true;
                }
                pm0.v.X(new zu2.v(a0Var));
            }
        }
    }
}
