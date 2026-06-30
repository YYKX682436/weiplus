package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f163904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f163905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(org.json.JSONObject jSONObject, android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(0);
        this.f163903d = jSONObject;
        this.f163904e = bundle;
        this.f163905f = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONArray optJSONArray;
        mj4.h M;
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = this.f163903d;
        if (jSONObject2 != null) {
            try {
                optJSONArray = jSONObject2.optJSONArray("arrStrangerContact");
            } catch (java.lang.Throwable unused) {
            }
        } else {
            optJSONArray = null;
        }
        if (optJSONArray != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.lang.String a17 = bk4.k1.a();
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(optString, 1);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("hashName", optString);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    if (Di != null) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        java.lang.String e17 = c01.a2.e(Di);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e17, Di)) {
                            e17 = "";
                        }
                        jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, e17);
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Di, true);
                        if (n17.r2() && !n17.o2() && !n17.y2()) {
                            if (!(p94.w0.f() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).P0(Di, 5L) : false) && (M = ai4.m0.f86706a.M(Di)) != null) {
                                jSONObject4.put("statusId", ((mj4.k) M).l());
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, Di)) {
                                    jSONObject4.put("isSelf", true);
                                }
                            }
                        }
                    }
                    jSONObject3.put("info", jSONObject4);
                } catch (java.lang.Throwable unused2) {
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("arrFriendContact", jSONArray);
        }
        java.lang.String jSONObject5 = jSONObject.toString();
        android.os.Bundle bundle = this.f163904e;
        bundle.putString("resJo", jSONObject5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCCheckStrangerRequest", "invoke: resultData:" + jSONObject);
        this.f163905f.a(bundle);
        return jz5.f0.f384359a;
    }
}
