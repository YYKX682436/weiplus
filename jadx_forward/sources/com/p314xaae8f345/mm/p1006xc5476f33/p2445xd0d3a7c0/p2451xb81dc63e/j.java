package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e;

/* loaded from: classes12.dex */
public final class j implements hh4.j {
    @Override // hh4.j
    public void k0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        o72.r2 F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        r45.sw4 sw4Var = new r45.sw4();
        try {
            sw4Var.mo11468x92b714fd(multiTaskInfo.f66790x225a93cf);
            r45.w60 w60Var = new r45.w60();
            w60Var.set(2, java.lang.Boolean.TRUE);
            int m75939xb282bd08 = sw4Var.m75939xb282bd08(0);
            java.lang.String m75945x2fec8307 = sw4Var.m75945x2fec8307(1);
            am.zl zlVar = null;
            iz4.r rVar = null;
            am.sn snVar = null;
            if (m75939xb282bd08 == 1) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(m75945x2fec8307);
                    am.zl zlVar2 = new am.zl();
                    zlVar2.f90111a = jSONObject.getInt("type");
                    zlVar2.f90112b = jSONObject.getString("editorId");
                    zlVar2.f56x88be67a1 = jSONObject.getLong("field_localId");
                    zlVar2.f90115e = jSONObject.getString("insertJsonData");
                    zlVar2.f90116f = jSONObject.getString("exportJsonData");
                    zlVar2.f90117g = jSONObject.getBoolean("isInsert");
                    java.lang.String string = jSONObject.getString("bundleData");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, "")) {
                        zlVar2.f90118h = null;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        android.os.Bundle bundle = new android.os.Bundle();
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string);
                            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                            while (keys.hasNext()) {
                                java.lang.String next = keys.next();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String str = next;
                                bundle.putString(str, jSONObject2.getString(str));
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NoteMultiTaskHelper", e17, "jsonToBundle", new java.lang.Object[0]);
                            bundle = null;
                        }
                        zlVar2.f90118h = bundle;
                    }
                    zlVar2.f90119i = jSONObject.getInt("itemType");
                    zlVar2.f90120j = jSONObject.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    zlVar2.f90121k = jSONObject.getInt("intdata");
                    zlVar2.f90122l = jSONObject.getBoolean("showShare");
                    zlVar2.f55x5ab01132 = new r45.bq0();
                    java.lang.String string2 = jSONObject.getString("field_favProto");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                        zlVar2.f55x5ab01132.mo11468x92b714fd(android.util.Base64.decode(string2, 0));
                    }
                    zlVar2.f90123m = new r45.dq0();
                    java.lang.String string3 = jSONObject.getString("reportInfo");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                        zlVar2.f90123m.mo11468x92b714fd(android.util.Base64.decode(string3, 0));
                    }
                    zlVar2.f90114d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    zlVar = zlVar2;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NoteMultiTaskHelper", e18, "parse NotifyWNNoteOperationEvent", new java.lang.Object[0]);
                }
                if (zlVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteMultiTaskHelper", "NotifyWNNoteOperationEvent data is null");
                    return;
                }
                try {
                    zlVar.f90118h.putByteArray("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebMultiTaskHelper", e19, "onTaskBarItemClicked", new java.lang.Object[0]);
                }
                if (zlVar.f90111a == 9 && (F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(zlVar.f56x88be67a1)) != null) {
                    zlVar.f90112b = F.f67660x4b6e9352;
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    r45.sp0 sp0Var = F.f67640x5ab01132.G;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sp0Var, "getNoteInfo(...)");
                    bundle2.putString("noteauthor", sp0Var.f467424d);
                    bundle2.putString("noteeditor", sp0Var.f467425e);
                    bundle2.putLong("edittime", F.f67659xa783a79b);
                    zlVar.f90118h = bundle2;
                    zlVar.f55x5ab01132 = F.f67640x5ab01132;
                    zlVar.f90111a = 2;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
                c5773x64e6b625.f136087g = zlVar;
                c5773x64e6b625.e();
                return;
            }
            if (m75939xb282bd08 == 2) {
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(m75945x2fec8307);
                    am.sn snVar2 = new am.sn();
                    snVar2.f89437a = jSONObject3.getLong("msgId");
                    snVar2.f89442f = jSONObject3.getString("talker");
                    snVar2.f89438b = jSONObject3.getString("noteXmlStr");
                    snVar2.f89440d = jSONObject3.getBoolean("showShare");
                    snVar2.f89443g = jSONObject3.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                    snVar2.f89439c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    snVar = snVar2;
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NoteMultiTaskHelper", e27, "parseOpenNoteFromSessionEventData", new java.lang.Object[0]);
                }
                if (snVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteMultiTaskHelper", "OpenNoteFromSessionEvent data is null");
                    return;
                }
                android.os.Bundle bundle3 = new android.os.Bundle();
                snVar.f89444h = bundle3;
                bundle3.putByteArray("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
                c5824x69fbb00a.f136132g = snVar;
                c5824x69fbb00a.e();
                return;
            }
            if (m75939xb282bd08 != 3) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "click WNNoteBanner");
            try {
                iz4.r rVar2 = new iz4.r();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject(m75945x2fec8307);
                rVar2.f377672d = jSONObject4.getBoolean("topIsOpenFromSession");
                rVar2.f377673e = jSONObject4.getLong("topLocalId");
                rVar2.f377674f = jSONObject4.getLong("topMsgId");
                rVar2.f377675g = jSONObject4.getString("topMsgTalker");
                rVar2.f377676h = jSONObject4.getBoolean("isChatRoom");
                rVar2.f377677i = jSONObject4.getString("topTitle");
                rVar2.f377678m = jSONObject4.getString("topNoteXml");
                rVar2.f377679n = jSONObject4.getInt("topLastPosition");
                rVar2.f377680o = jSONObject4.getInt("topLastOffset");
                rVar2.f377675g = jSONObject4.getString("topMsgTalker");
                rVar = rVar2;
            } catch (java.lang.Exception e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NoteMultiTaskHelper", e28, "parseWNNoteKeepTopItem", new java.lang.Object[0]);
            }
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteMultiTaskHelper", "WNNoteKeepTopItem data is null");
                return;
            }
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putByteArray("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
            if (rVar.f377672d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "isOpenFromSession: true");
                hz4.w wVar = new hz4.w();
                wVar.f367955p = cz4.f.x0(rVar);
                wVar.f367956q = 3;
                wVar.f367951i.f367959b = rVar.f377676h ? 3 : 2;
                ((hz4.f) hz4.f.wi()).f367940d = wVar;
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f454186d = 8;
                wVar.t(rVar.f377678m, java.lang.Long.valueOf(rVar.f377674f), rVar.f377675g, true, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, rVar.f377679n, rVar.f377680o, dq0Var, bundle4);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "isOpenFromSession: false");
            hz4.p pVar = new hz4.p();
            pVar.f367955p = cz4.f.x0(rVar);
            pVar.f367956q = 3;
            pVar.f367951i.f367959b = 1;
            ((hz4.f) hz4.f.wi()).f367940d = pVar;
            r45.dq0 dq0Var2 = new r45.dq0();
            dq0Var2.f454186d = 8;
            pVar.w(rVar.f377673e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, rVar.f377678m, java.lang.Boolean.TRUE, rVar.f377679n, rVar.f377680o, dq0Var2, null, bundle4.getByteArray("key_multi_task_common_info"), false);
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteMultiTaskHelper", e29.getMessage());
        }
    }

    @Override // hh4.j
    public void p0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
    }
}
