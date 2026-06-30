package zl2;

/* loaded from: classes3.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f555404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f555407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f555408h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555409i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f555410m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555411n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555412o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p3325xe03a0797.p3326xc267989b.r2 r2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, r45.y23 y23Var, int i17, gk2.e eVar, long j17, java.lang.String str2, android.content.Context context) {
        super(2);
        this.f555404d = r2Var;
        this.f555405e = h0Var;
        this.f555406f = str;
        this.f555407g = y23Var;
        this.f555408h = i17;
        this.f555409i = eVar;
        this.f555410m = j17;
        this.f555411n = str2;
        this.f555412o = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.ru1 ru1Var = (r45.ru1) obj2;
        p3325xe03a0797.p3326xc267989b.p2.a(this.f555404d, null, 1, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f555405e.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (booleanValue) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r45.y23 y23Var = this.f555407g;
            long m75942xfb822ef2 = y23Var.m75942xfb822ef2(0);
            boolean v17 = st2.g3.f493859a.v(y23Var);
            r0Var.getClass();
            java.lang.String sessionId = this.f555406f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.f4 f4Var = ml2.f4.f408964e;
            jSONObject.put("type", 1007);
            jSONObject.put("session", sessionId);
            jSONObject.put("productid", m75942xfb822ef2);
            jSONObject.put("seckill", v17 ? 1 : 0);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            int i17 = this.f555408h;
            jSONObject2.put("entrance", i17);
            ml2.r0.hj(r0Var, ml2.b4.f408797s, jSONObject.toString(), 0L, jSONObject2.toString(), null, null, null, null, 244, null);
            r45.bw2 bw2Var = new r45.bw2();
            gk2.e eVar = this.f555409i;
            bw2Var.set(0, ((mm2.c1) eVar.a(mm2.c1.class)).f410379n);
            bw2Var.set(4, y23Var);
            bw2Var.set(1, 1);
            bw2Var.set(2, ru1Var != null ? ru1Var.m75945x2fec8307(2) : null);
            bw2Var.set(3, java.lang.Long.valueOf(this.f555410m));
            bw2Var.set(7, sessionId);
            bw2Var.set(6, java.lang.String.valueOf(i17));
            bw2Var.set(8, this.f555411n.toString());
            android.content.Intent intent = new android.content.Intent();
            ((mm2.c1) eVar.a(mm2.c1.class)).O1 = false;
            dk2.ef efVar = dk2.ef.f314905a;
            tn0.w0 w0Var = dk2.ef.f314911d;
            if (w0Var != null) {
                w0Var.a0();
            }
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context = this.f555412o;
            q4Var.c(context, eVar, 2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3.f517454a.b(intent, "shop", 0);
            intent.putExtra("KEY_PARAMS_KEY_VALUE", bw2Var.mo14344x5f01b1f6());
            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", 3);
            intent.putExtra("KEY_PARAMS_NEED_CLOSE_LIVE", false);
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).hj(context, intent, true);
            co0.s u07 = efVar.u0();
            if (u07 != null) {
                u07.f1(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "shop report requestId goReplay, " + y23Var.m75945x2fec8307(17));
        }
        return jz5.f0.f384359a;
    }
}
