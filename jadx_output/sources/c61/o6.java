package c61;

/* loaded from: classes10.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(c61.l7 l7Var) {
        super(0);
        this.f39200d = l7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        cz2.h hVar = new cz2.h();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_WX_VERSION_STRING_SYNC;
        java.lang.String v17 = c17.v(u3Var, "");
        boolean b17 = kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.z.f193111g, v17);
        java.lang.String str = cz2.h.f225006b;
        if (b17) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i(str, "change version " + v17 + " => " + com.tencent.mm.sdk.platformtools.z.f193111g);
            gm0.j1.u().c().x(u3Var, com.tencent.mm.sdk.platformtools.z.f193111g);
            z17 = true;
        }
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_WX_VERSION2_STRING_SYNC;
        java.lang.String v18 = c18.v(u3Var2, "");
        java.lang.String format = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        if (!kotlin.jvm.internal.o.b(format, v18)) {
            com.tencent.mars.xlog.Log.i(str, "change wechatv " + v18 + " => " + format);
            gm0.j1.u().c().x(u3Var2, format);
            z17 = true;
        }
        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_WX_TAG_STRING_SYNC;
        java.lang.String v19 = c19.v(u3Var3, "");
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.z.f193105a, v19)) {
            com.tencent.mars.xlog.Log.i(str, "change tag " + v19 + " => " + com.tencent.mm.sdk.platformtools.z.f193105a);
            gm0.j1.u().c().x(u3Var3, com.tencent.mm.sdk.platformtools.z.f193105a);
            z17 = true;
        }
        if (z17) {
            kotlin.jvm.internal.o.d(v17);
            kotlin.jvm.internal.o.d(v18);
            kotlin.jvm.internal.o.d(v19);
            hVar.f225007a.a();
            com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct finderStreamTrackStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct();
            finderStreamTrackStruct.f57872d = 8;
            finderStreamTrackStruct.f57873e = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
            finderStreamTrackStruct.f57874f = finderStreamTrackStruct.b("actionName", "wx_change", true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("lastVersion", v17);
            jSONObject.put("lastVersion2", v18);
            jSONObject.put("lastTag", v19);
            jSONObject.put("ver", com.tencent.mm.sdk.platformtools.z.f193111g);
            jSONObject.put("ver_init", lp0.a.f320249c);
            java.lang.String format2 = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            jSONObject.put("CLIENT_VERSION", format2);
            jSONObject.put("tag", com.tencent.mm.sdk.platformtools.z.f193105a);
            jSONObject.put("rev", com.tencent.mm.sdk.platformtools.z.f193109e);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderStreamTrackStruct.f57875g = finderStreamTrackStruct.b("actionExt", r26.i0.t(jSONObject2, ",", ";", false), true);
            finderStreamTrackStruct.f57881m = c01.id.a();
            finderStreamTrackStruct.f57876h = 0;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.z.a();
            jSONObject3.put("result", a17 != null ? r26.i0.t(a17, "\n", ";", false) : null);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            finderStreamTrackStruct.f57877i = finderStreamTrackStruct.b("resultExt", r26.i0.t(jSONObject4, ",", ";", false), true);
            finderStreamTrackStruct.f57878j = 0;
            finderStreamTrackStruct.f57880l = 0L;
            m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
            java.lang.String str2 = I1 != null ? I1.field_nickname : null;
            finderStreamTrackStruct.f57879k = finderStreamTrackStruct.b("snn", str2 != null ? str2 : "", true);
            com.tencent.mars.xlog.Log.i(str, "report value " + finderStreamTrackStruct.n());
            finderStreamTrackStruct.k();
        }
        com.tencent.mm.plugin.finder.assist.z1 z1Var = com.tencent.mm.plugin.finder.assist.z1.f102742a;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        for (com.tencent.mm.plugin.finder.assist.y1 y1Var : com.tencent.mm.plugin.finder.assist.z1.f102744c) {
            kotlin.jvm.internal.o.d(L);
            y1Var.getClass();
            java.lang.String str3 = y1Var.f102706c;
            if (L.getLong(str3, 0L) != 0) {
                L.putLong(str3, 0L);
                com.tencent.mars.xlog.Log.i("Finder.FinderCrashChecker", "clean " + str3);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(y1Var.f102704a, y1Var.f102705b, 1L);
                com.tencent.mars.xlog.Log.i("Finder.FinderCrashChecker", "check " + str3 + ", hit!");
            }
        }
        c61.l7 l7Var = this.f39200d;
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorage", "clearInvalidData DELETE FROM FinderDraftItem WHERE finderItem IS NULL, succ:" + l7Var.Oj().f222428i.A("FinderDraftItem", "DELETE FROM FinderDraftItem WHERE finderItem IS NULL"));
        com.tencent.mm.plugin.finder.viewmodel.component.pt.R = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 1) == 1;
        com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "checkSysAllowRotate: systemEnableLandscape = " + com.tencent.mm.plugin.finder.viewmodel.component.pt.R);
        final com.tencent.mm.plugin.finder.assist.r3 r3Var = (com.tencent.mm.plugin.finder.assist.r3) ((jz5.n) l7Var.f39137y0).getValue();
        r3Var.a();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPostSelectEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.assist.FinderLiteAppStoreHelper$registerStoreMethod$1
            {
                this.__eventId = 1366460297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPostSelectEvent musicPostSelectEvent) {
                org.json.JSONObject jSONObject5;
                com.tencent.mm.autogen.events.MusicPostSelectEvent event = musicPostSelectEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.assist.r3 r3Var2 = com.tencent.mm.plugin.finder.assist.r3.this;
                r3Var2.a();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MusicPostSelectEvent callback: url=");
                am.kk kkVar = event.f54513g;
                sb6.append(kkVar.f7160a);
                sb6.append(", isCancel=");
                sb6.append(kkVar.f7162c);
                sb6.append(", errCode=");
                sb6.append(kkVar.f7163d);
                com.tencent.mars.xlog.Log.i("FinderLiteAppStoreUtils", sb6.toString());
                if (kkVar.f7163d != 0) {
                    jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("errCode", kkVar.f7163d);
                    jSONObject5.put("errMsg", "");
                    jSONObject5.put("audioUrl", "");
                    jSONObject5.put("isCancel", 0);
                } else {
                    jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("errCode", 0);
                    jSONObject5.put("errMsg", "");
                    java.lang.String str4 = kkVar.f7160a;
                    jSONObject5.put("audioUrl", str4 != null ? str4 : "");
                    jSONObject5.put("isCancel", kkVar.f7162c ? 1 : 0);
                    jSONObject5.put("duration", kkVar.f7164e);
                    jSONObject5.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILESIZE, kkVar.f7165f);
                    long j17 = kkVar.f7161b;
                    if (j17 != 0) {
                        jSONObject5.put("feedId", pm0.v.u(j17));
                    }
                }
                com.tencent.mm.plugin.lite.s sVar = r3Var2.f102503a;
                if (sVar != null) {
                    com.tencent.mm.plugin.finder.assist.q3 q3Var = r3Var2.f102504b;
                    sVar.c(q3Var != null ? q3Var.f102478a : 0L, q3Var != null ? q3Var.f102479b : 0, jSONObject5.toString());
                }
                return false;
            }
        }.alive();
        return jz5.f0.f302826a;
    }
}
