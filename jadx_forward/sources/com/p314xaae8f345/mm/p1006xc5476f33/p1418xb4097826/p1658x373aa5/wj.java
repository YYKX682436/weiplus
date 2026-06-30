package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/wj;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class wj implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareProductWxaCoverWidget", "createWidget data:" + c10756x2a5d7b2d.f149939d);
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            java.lang.String string = jSONObject.getString("feedId");
            java.lang.String string2 = jSONObject.getString("nonceId");
            long Z = pm0.v.Z(string);
            java.lang.String optString = jSONObject.optString("lastGMsgId");
            java.lang.String str = "";
            if (optString == null) {
                optString = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareProductWxaCoverWidget", "feedId:" + pm0.v.u(Z) + ", nonceId:" + string2 + ", lastGMsgId:" + optString);
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(2, 3, 65);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            zl2.b0 b0Var = zl2.b0.f555196a;
            r45.br2 br2Var = zl2.b0.f555198c;
            if (br2Var != null && (m75945x2fec8307 = br2Var.m75945x2fec8307(17)) != null) {
                intent.putExtra("key_enter_live_param_ecsource", m75945x2fec8307);
            }
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(Z));
            m84Var.set(1, 0L);
            m84Var.set(2, string2);
            m84Var.set(3, "");
            m84Var.set(4, "");
            m84Var.set(5, "");
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((vd2.f1) e0Var).Ri(context, intent, m84Var, true, wk0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vj(intent, optString));
            r45.br2 br2Var2 = zl2.b0.f555198c;
            if (br2Var2 != null) {
                java.lang.String m75945x2fec83072 = br2Var2.m75945x2fec8307(0);
                if (m75945x2fec83072 != null) {
                    str = m75945x2fec83072;
                }
                b0Var.g(br2Var2, "enter_live", b0Var.b(br2Var2, str, 1));
            }
        } catch (java.lang.Throwable unused) {
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
    }
}
