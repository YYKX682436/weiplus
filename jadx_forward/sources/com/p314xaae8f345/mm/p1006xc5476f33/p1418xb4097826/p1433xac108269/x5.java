package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class x5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f184214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f184216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f184218h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184219i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f184220m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f184221n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184222o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, in5.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str, boolean z17, java.lang.String str2, int i17, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(2);
        this.f184214d = activityC0065xcd7aa112;
        this.f184215e = s0Var;
        this.f184216f = c19792x256d2725;
        this.f184217g = str;
        this.f184218h = z17;
        this.f184219i = str2;
        this.f184220m = i17;
        this.f184221n = lVar;
        this.f184222o = abstractC14490x69736cb5;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        in5.s0 s0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        if (booleanValue) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f184214d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je jeVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je.class);
            jeVar.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ee.f215798m && intValue == 1 && (s0Var = this.f184215e) != null) {
                android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.mnj);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.f568219m51);
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(0);
                }
                if (textView != null) {
                    textView.setText(jeVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2c));
                }
                if (textView != null) {
                    textView.setTextColor(jeVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                }
            }
            long m76784x5db1b11 = this.f184216f.m76784x5db1b11();
            int i17 = this.f184220m;
            java.lang.String reportJson = this.f184219i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportJson, "reportJson");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("feedid", pm0.v.u(m76784x5db1b11));
                if (this.f184218h) {
                    jSONObject.put("entrance", 1);
                } else {
                    jSONObject.put("entrance", 2);
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ee.f215798m) {
                    jSONObject.put("feed_source", 1);
                } else {
                    jSONObject.put("feed_source", 0);
                }
                jSONObject.put("set_type", intValue);
                java.lang.String str = this.f184217g;
                if (str != null) {
                    if (str.length() > 0) {
                        jSONObject.put("songid", str);
                    }
                }
                if (reportJson.length() > 0) {
                    jSONObject.put("bell_info", reportJson);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("intab", i17);
                    jSONObject.put("video_pos_info", jSONObject2.toString());
                }
            } catch (org.json.JSONException unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            boolean z17 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "set_song_success", 1, jSONObject, false, null, 48, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(nyVar2.V6(), this.f184222o, 45);
            }
        }
        this.f184221n.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
