package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g {

    /* renamed from: CTRL_INDEX */
    public static final int f34664x366c91de = 57;

    /* renamed from: NAME */
    public static final java.lang.String f34665x24728b = "requestPayment";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, org.json.JSONObject jSONObject, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar, int i17) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) ffVar.f162546b;
        int i18 = ffVar.f162549e;
        org.json.JSONObject jSONObject = ffVar.f162548d;
        org.json.JSONObject jSONObject2 = ffVar.f162547c;
        if (jSONObject2 == null) {
            E(i17, 4);
            d0Var.a(i18, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) d0Var.t3();
        android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            E(i17, 4);
            d0Var.a(i18, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String t17 = u46.l.t(o6Var.x0().m52170xad58292c(), 0, 1024);
        java.lang.String str = o6Var.u0().f128811x;
        java.lang.String str2 = o6Var.u0().f158811d;
        try {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.d(d0Var, jSONObject2, jSONObject, f34665x24728b, true)) {
                E(i17, 4);
                d0Var.a(i18, o("fail illegal appId"));
                return;
            }
            jSONObject2.put("key_appbrand_from_path", t17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3 c19156xb6112c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(java.lang.String.format("%s,%s", str, d0Var.mo48798x74292566())), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.w1.class);
            if (c19156xb6112c3 != null) {
                jSONObject2.put("key_chat_type", c19156xb6112c3.f262371d.f262482d);
                jSONObject2.put("key_send_type", c19156xb6112c3.f262372e.f262518d);
                jSONObject2.put("key_qrcode_session_type", c19156xb6112c3.f262373f.f262502d);
                jSONObject2.put("key_qrcode_session_name", c19156xb6112c3.f262374g);
                jSONObject2.put("key_qrcode_timeline_objid", c19156xb6112c3.f262375h);
                jSONObject2.put("key_qrcode_msg_svrid", c19156xb6112c3.f262376i);
                jSONObject2.put("key_qrcode_msg_send_user", c19156xb6112c3.f262377m);
                jSONObject2.put("key_init_raw_url", c19156xb6112c3.f262378n);
                jSONObject2.put("key_init_timestamp", c19156xb6112c3.f262379o);
            }
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            android.util.SparseArray sparseArray = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) d0Var.t3()).f167709k2.f517095a;
            synchronized (sparseArray) {
                obj = sparseArray.get(i18, null);
            }
            vd1.g gVar = (vd1.g) obj;
            java.lang.String optString = jSONObject2.optString("requestId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayment", "requestId:%s", optString);
            E(i17, 5);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.INSTANCE.m51168x4e7c80e6(r07, d0Var, o6Var.l2(), jSONObject2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v1(this, d0Var, i18, gVar, optString), c19772x1c2cd081)) {
                d0Var.a(i18, o("fail"));
                return;
            }
            if (jSONObject2.optBoolean("grantMessageQuota", true)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = d0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) d0Var : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) d0Var).V0();
                java.lang.String str3 = c19772x1c2cd081.f38869x6ac9171;
                if (V0 == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15 c12015x8f4deb15 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15(V0.t3().E0());
                c12015x8f4deb15.f161382f = 0;
                c12015x8f4deb15.f161384h = str3.replace("prepay_id=", "");
                c12015x8f4deb15.f161385i = V0.X1();
                c12015x8f4deb15.d();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestPayment", e17.getMessage());
            E(i17, 4);
            d0Var.a(i18, o("fail"));
        }
    }

    public final void E(int i17, int i18) {
        if (i17 == 84) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29733, java.lang.Integer.valueOf(i18), 2);
        }
    }

    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar) {
        D(ffVar, 0);
    }
}
