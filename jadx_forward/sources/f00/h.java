package f00;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf00/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsProductWxaCoverWidget", "createWidget data:" + c10756x2a5d7b2d.f149939d);
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            java.lang.String optString = jSONObject.optString("feedId");
            java.lang.String optString2 = jSONObject.optString("nonceId");
            long Z = pm0.v.Z(optString);
            java.lang.String optString3 = jSONObject.optString("lastGMsgId");
            java.lang.String str = "";
            if (optString3 == null) {
                optString3 = "";
            }
            java.lang.String optString4 = jSONObject.optString("ecSource");
            java.lang.String optString5 = jSONObject.optString("finderLiveID");
            java.lang.String optString6 = jSONObject.optString("finderUsername");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsProductWxaCoverWidget", "feedId:" + pm0.v.u(Z) + ", nonceId:" + optString2 + ", lastGMsgId:" + optString3);
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(2, 3, 65);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
            if (optString4.length() > 0) {
                intent.putExtra("key_enter_live_param_ecsource", optString4);
            }
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
            ((vd2.f1) e0Var).Di(context, intent, optString6, null, wk0Var, new f00.g(intent, optString3));
            r45.br2 br2Var = new r45.br2();
            br2Var.set(0, optString5);
            br2Var.set(2, java.lang.String.valueOf(Z));
            br2Var.set(1, optString6);
            s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
            java.lang.String m75945x2fec8307 = br2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                str = m75945x2fec8307;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).Ui(br2Var, "enter_live", zl2.b0.f555196a.b(br2Var, str, 1));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsProductWxaCoverWidget", "click error:" + th6);
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
    }
}
