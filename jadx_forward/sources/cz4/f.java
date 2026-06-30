package cz4;

/* loaded from: classes12.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {
    public f(dp1.a aVar) {
        super(aVar);
    }

    public static java.lang.String t0(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : bundle.keySet()) {
                jSONObject.put(str, org.json.JSONObject.wrap(bundle.get(str)));
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e17, "bundleToJson", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String u0(am.zl zlVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", zlVar.f90111a);
            java.lang.String str = zlVar.f90112b;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("editorId", str);
            jSONObject.put("field_localId", zlVar.f56x88be67a1);
            java.lang.String str3 = zlVar.f90115e;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("insertJsonData", str3);
            java.lang.String str4 = zlVar.f90116f;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("exportJsonData", str4);
            jSONObject.put("isInsert", zlVar.f90117g);
            android.os.Bundle bundle = zlVar.f90118h;
            jSONObject.put("bundleData", bundle == null ? "" : t0(bundle));
            jSONObject.put("itemType", zlVar.f90119i);
            java.lang.String str5 = zlVar.f90120j;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str5);
            jSONObject.put("intdata", zlVar.f90121k);
            jSONObject.put("showShare", zlVar.f90122l);
            r45.bq0 bq0Var = zlVar.f55x5ab01132;
            jSONObject.put("field_favProto", bq0Var == null ? "" : android.util.Base64.encodeToString(bq0Var.mo14344x5f01b1f6(), 0));
            r45.dq0 dq0Var = zlVar.f90123m;
            if (dq0Var != null) {
                str2 = android.util.Base64.encodeToString(dq0Var.mo14344x5f01b1f6(), 0);
            }
            jSONObject.put("reportInfo", str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e17, "eventToJson NotifyWNNoteOperationEvent", new java.lang.Object[0]);
        }
        return jSONObject.toString();
    }

    public static android.os.Bundle v0(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            bundle.putBoolean("openFormFloatBall", true);
            return bundle;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e17, "jsonToBundle", new java.lang.Object[0]);
            return null;
        }
    }

    public static void w0(iz4.r rVar, boolean z17) {
        if (rVar.f377672d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "isOpenFromSession: true");
            hz4.w wVar = new hz4.w();
            wVar.f367955p = x0(rVar);
            wVar.f367956q = 3;
            ((hz4.f) hz4.f.wi()).f367940d = wVar;
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f454186d = 8;
            wVar.t(rVar.f377678m, java.lang.Long.valueOf(rVar.f377674f), rVar.f377675g, true, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, rVar.f377679n, rVar.f377680o, dq0Var, null);
            wVar.f367951i.f367959b = rVar.f377676h ? 3 : 2;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "isOpenFromSession: false");
        hz4.p pVar = new hz4.p();
        pVar.f367955p = x0(rVar);
        pVar.f367956q = 3;
        ((hz4.f) hz4.f.wi()).f367940d = pVar;
        r45.dq0 dq0Var2 = new r45.dq0();
        dq0Var2.f454186d = 8;
        pVar.w(rVar.f377673e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, rVar.f377678m, java.lang.Boolean.TRUE, rVar.f377679n, rVar.f377680o, dq0Var2, null, null, z17);
        pVar.f367951i.f367959b = 1;
    }

    public static java.lang.String x0(iz4.r rVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("topIsOpenFromSession", rVar.f377672d);
            jSONObject.put("topLocalId", rVar.f377673e);
            jSONObject.put("topMsgId", rVar.f377674f);
            jSONObject.put("topMsgTalker", rVar.f377675g);
            jSONObject.put("isChatRoom", rVar.f377676h);
            java.lang.String str = rVar.f377677i;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("topTitle", str);
            java.lang.String str3 = rVar.f377678m;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("topNoteXml", str2);
            jSONObject.put("topLastPosition", rVar.f377679n);
            jSONObject.put("topLastOffset", rVar.f377680o);
            jSONObject.put("topMsgTalker", rVar.f377675g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e17, "topItemToJson", new java.lang.Object[0]);
        }
        return jSONObject.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        n0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        this.f174779u = false;
        this.f174772n.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        Q(1);
        t().f174619f = 5;
        t().f174618e = 6;
        t().f174622i = "";
        g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        super.o0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean s0() {
        return w() && u() && this.f174779u && !this.f174772n.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean v() {
        return this.f174772n.t();
    }
}
