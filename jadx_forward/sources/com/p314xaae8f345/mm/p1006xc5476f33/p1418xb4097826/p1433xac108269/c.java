package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f183571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f183572g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183573h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183574i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f183575m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa, r45.qt2 qt2Var, java.lang.String str, org.json.JSONObject jSONObject) {
        super(2);
        this.f183569d = i0Var;
        this.f183570e = context;
        this.f183571f = abstractC14490x69736cb5;
        this.f183572g = c13920xa5f564aa;
        this.f183573h = qt2Var;
        this.f183574i = str;
        this.f183575m = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var;
        r45.dm2 m76806xdef680642;
        r45.cl2 cl2Var;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject6;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent2 = (android.content.Intent) obj2;
        android.content.Context context = this.f183570e;
        int m75939xb282bd08 = this.f183573h.m75939xb282bd08(5);
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        this.f183569d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f183571f;
        boolean z17 = abstractC14490x69736cb5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z17 ? abstractC14490x69736cb5 : null;
        intent2.putExtra("CURRENT_FEED_ID", (abstractC14490x69736cb52 == null || (feedObject6 = abstractC14490x69736cb52.getFeedObject()) == null) ? 0L : feedObject6.m59251x5db1b11());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = z17 ? abstractC14490x69736cb5 : null;
        intent2.putExtra("key_ad_flag", (abstractC14490x69736cb53 == null || (feedObject4 = abstractC14490x69736cb53.getFeedObject()) == null || (feedObject5 = feedObject4.getFeedObject()) == null) ? 0 : feedObject5.m76752x103fd925());
        intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
        intent2.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", false);
        org.json.JSONObject jSONObject = this.f183575m;
        java.lang.String str3 = "";
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        intent2.putExtra("key_chnl_extra", str);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("key_jsapi_bypass");
        if ((stringExtra == null || stringExtra.length() == 0) == false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterLive, byPass:" + stringExtra);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(stringExtra);
                intent2.putExtra("key_enter_live_param_by_pass_type", jSONObject2.optInt("by_pass_type"));
                intent2.putExtra("key_enter_live_param_by_pass_info", jSONObject2.optString("by_pass_info"));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.ActivityRouter", th6, "byPassJson error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = z17 ? abstractC14490x69736cb5 : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject7 = (abstractC14490x69736cb54 == null || (feedObject3 = abstractC14490x69736cb54.getFeedObject()) == null) ? null : feedObject3.getFeedObject();
        if (m75939xb282bd08 != 0 && feedObject7 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterLiveVisitorUI rewrite commentScene:" + m75939xb282bd08 + " sessionBuffer:" + feedObject7.m76829x97edf6c0());
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(feedObject7, m75939xb282bd08, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f183572g);
        jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, abstractC14490x69736cb5);
        java.util.List list = (java.util.List) Ai.f384366d;
        int intValue = ((java.lang.Number) Ai.f384367e).intValue();
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb55 = z17 ? abstractC14490x69736cb5 : null;
        if (abstractC14490x69736cb55 == null || (feedObject2 = abstractC14490x69736cb55.getFeedObject()) == null || (str2 = feedObject2.m59273x80025a04()) == null) {
            str2 = "";
        }
        y74Var.set(2, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb56 = z17 ? abstractC14490x69736cb5 : null;
        y74Var.set(5, (abstractC14490x69736cb56 == null || (feedObject = abstractC14490x69736cb56.getFeedObject()) == null) ? null : feedObject.getFeedObject());
        wk0Var.set(6, y74Var);
        r45.ta4 ta4Var = new r45.ta4();
        if (feedObject7 != null && (m76806xdef680642 = feedObject7.m76806xdef68064()) != null && (cl2Var = (r45.cl2) m76806xdef680642.m75936x14adae67(4)) != null && (m75945x2fec8307 = cl2Var.m75945x2fec8307(2)) != null) {
            str3 = m75945x2fec8307;
        }
        byte[] bytes = str3.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        ta4Var.set(1, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ta4Var.set(25, bool);
        if (feedObject7 != null && (m76806xdef68064 = feedObject7.m76806xdef68064()) != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && ((r45.wm2) pm2Var.m75936x14adae67(10)) != null) {
            r45.wm2 wm2Var = new r45.wm2();
            nv2.n1 n1Var = nv2.n1.f422084h;
            wm2Var.set(0, java.lang.Integer.valueOf(((java.lang.Boolean) n1Var.k(feedObject7).f384366d).booleanValue() ? 1 : 0));
            wm2Var.set(1, java.lang.Integer.valueOf(n1Var.l(feedObject7)));
            wm2Var.set(3, n1Var.h(feedObject7));
            ta4Var.set(30, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wm2Var.mo14344x5f01b1f6()));
        }
        ta4Var.set(32, this.f183574i);
        ta4Var.set(33, bool);
        wk0Var.set(7, ta4Var);
        r45.u74 u74Var = new r45.u74();
        r45.ta4 ta4Var2 = (r45.ta4) wk0Var.m75936x14adae67(7);
        u74Var.set(0, ta4Var2 != null ? ta4Var2.m75934xbce7f2f(1) : null);
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        u74Var.set(1, h1Var != null ? h1Var.f491912f : null);
        wk0Var.set(8, u74Var);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(context, intent2, list, intValue, wk0Var, null);
        return jz5.f0.f384359a;
    }
}
