package cz4;

/* loaded from: classes12.dex */
public class g extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        o72.r2 F;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.G == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked, openNote ballInfo:%s", c12886x91aa2b6d);
        java.lang.String string = c12886x91aa2b6d.G.getString("eventData");
        int i17 = c12886x91aa2b6d.G.getInt("eventType");
        am.zl zlVar = null;
        iz4.r rVar = null;
        am.sn snVar = null;
        if (i17 != 1) {
            if (i17 == 2) {
                try {
                    cl0.g gVar = new cl0.g(string);
                    am.sn snVar2 = new am.sn();
                    snVar2.f89437a = gVar.mo15073xfb822ef2("msgId");
                    snVar2.f89442f = gVar.mo15074x2fec8307("talker");
                    snVar2.f89438b = gVar.mo15074x2fec8307("noteXmlStr");
                    snVar2.f89440d = gVar.mo15070x41a8a7f2("showShare");
                    snVar2.f89443g = gVar.mo15072xb58848b9(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                    snVar2.f89439c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    snVar = snVar2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e17, "parseOpenNoteFromSessionEventData", new java.lang.Object[0]);
                }
                if (snVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "OpenNoteFromSessionEvent data is null");
                    return;
                }
                if (qz4.d.a(snVar)) {
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(c12886x91aa2b6d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked deleted msginfo");
                    return;
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
                    c5824x69fbb00a.f136132g = snVar;
                    c5824x69fbb00a.e();
                    return;
                }
            }
            if (i17 != 3) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "click WNNoteBanner");
            try {
                iz4.r rVar2 = new iz4.r();
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                rVar2.f377672d = jSONObject.getBoolean("topIsOpenFromSession");
                rVar2.f377673e = jSONObject.getLong("topLocalId");
                rVar2.f377674f = jSONObject.getLong("topMsgId");
                rVar2.f377675g = jSONObject.getString("topMsgTalker");
                rVar2.f377676h = jSONObject.getBoolean("isChatRoom");
                rVar2.f377677i = jSONObject.getString("topTitle");
                rVar2.f377678m = jSONObject.getString("topNoteXml");
                rVar2.f377679n = jSONObject.getInt("topLastPosition");
                rVar2.f377680o = jSONObject.getInt("topLastOffset");
                rVar2.f377675g = jSONObject.getString("topMsgTalker");
                rVar = rVar2;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e18, "parseWNNoteKeepTopItem", new java.lang.Object[0]);
            }
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "WNNoteKeepTopItem data is null");
                return;
            } else {
                cz4.f.w0(rVar, true);
                return;
            }
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string);
            am.zl zlVar2 = new am.zl();
            zlVar2.f90111a = jSONObject2.getInt("type");
            zlVar2.f90112b = jSONObject2.getString("editorId");
            zlVar2.f56x88be67a1 = jSONObject2.getLong("field_localId");
            zlVar2.f90115e = jSONObject2.getString("insertJsonData");
            zlVar2.f90116f = jSONObject2.getString("exportJsonData");
            zlVar2.f90117g = jSONObject2.getBoolean("isInsert");
            java.lang.String string2 = jSONObject2.getString("bundleData");
            if (string2.equals("")) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("openFormFloatBall", true);
                zlVar2.f90118h = bundle;
            } else {
                zlVar2.f90118h = cz4.f.v0(string2);
            }
            zlVar2.f90119i = jSONObject2.getInt("itemType");
            zlVar2.f90120j = jSONObject2.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            zlVar2.f90121k = jSONObject2.getInt("intdata");
            zlVar2.f90122l = jSONObject2.getBoolean("showShare");
            zlVar2.f55x5ab01132 = new r45.bq0();
            java.lang.String string3 = jSONObject2.getString("field_favProto");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                zlVar2.f55x5ab01132.mo11468x92b714fd(android.util.Base64.decode(string3, 0));
            }
            zlVar2.f90123m = new r45.dq0();
            java.lang.String string4 = jSONObject2.getString("reportInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                zlVar2.f90123m.mo11468x92b714fd(android.util.Base64.decode(string4, 0));
            }
            zlVar2.f90114d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            zlVar = zlVar2;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e19, "parse NotifyWNNoteOperationEvent", new java.lang.Object[0]);
        }
        if (zlVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "NotifyWNNoteOperationEvent data is null");
            return;
        }
        if (zlVar.f90111a == 9 && (F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(zlVar.f56x88be67a1)) != null) {
            zlVar.f90112b = F.f67660x4b6e9352;
            android.os.Bundle bundle2 = new android.os.Bundle();
            r45.sp0 sp0Var = F.f67640x5ab01132.G;
            if (sp0Var != null) {
                bundle2.putString("noteauthor", sp0Var.f467424d);
                bundle2.putString("noteeditor", sp0Var.f467425e);
            }
            bundle2.putLong("edittime", F.f67659xa783a79b);
            zlVar.f90118h = bundle2;
            zlVar.f55x5ab01132 = F.f67640x5ab01132;
            zlVar.f90111a = 2;
        }
        if (qz4.d.b(zlVar)) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(c12886x91aa2b6d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked deleted snsInfo");
            return;
        }
        o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(zlVar.f56x88be67a1);
        long j17 = zlVar.f56x88be67a1;
        if (j17 != -1 && F2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked deleted favItemInfo %s", java.lang.Long.valueOf(j17));
            db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h_s, 0).show();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(c12886x91aa2b6d);
        } else {
            if (j17 == -1) {
                zlVar.f90121k = 4;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
            c5773x64e6b625.f136087g = zlVar;
            c5773x64e6b625.e();
        }
    }
}
