package b00;

@j95.b
/* loaded from: classes9.dex */
public final class a0 extends i95.w implements c00.u3 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f16636d;

    /* renamed from: e, reason: collision with root package name */
    public long f16637e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f16638f = jz5.h.b(b00.x.f16787d);

    public final java.util.Map Bi(java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("digest", str);
        linkedHashMap.put("number_red_cnt", java.lang.String.valueOf(i17));
        linkedHashMap.put("if_have_red", z17 ? "1" : "0");
        linkedHashMap.put("kefu_type", java.lang.Integer.valueOf(k41.h1.c(str2)));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("kf_user_name", str2);
        return linkedHashMap;
    }

    public final java.util.Map Ni(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("kf_user_name", str);
        linkedHashMap.put("kf_session_id", b00.k0.f16702a);
        return linkedHashMap;
    }

    public final java.util.Map Ri(java.lang.String str, java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("kf_user_name", str == null ? "" : str);
        linkedHashMap.put("enter_lst_session_id", str == null ? "" : str);
        java.lang.String str2 = this.f16636d;
        linkedHashMap.put("page_session_id", str2 != null ? str2 : "");
        linkedHashMap.put("kefu_type", java.lang.Integer.valueOf(k41.h1.c(str)));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public final java.util.Map Ui(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(i17));
        linkedHashMap.put("type", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("product_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("order_id", str4);
        linkedHashMap.put("kf_session_id", b00.k0.f16702a);
        return linkedHashMap;
    }

    public final java.util.Map Vi(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("kf_user_name", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("toolbar_item_name", str2);
        linkedHashMap.put("toolbar_item_link_type", java.lang.Integer.valueOf(i17));
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("toolbar_item_link_url", str3);
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i18));
        linkedHashMap.put("kf_session_id", b00.k0.f16702a);
        return linkedHashMap;
    }

    public final dy1.r Zi() {
        return (dy1.r) ((jz5.n) this.f16638f).getValue();
    }

    public void a(android.view.View view, com.tencent.mm.storage.f9 f9Var, java.lang.String str, int i17) {
        java.lang.String str2;
        if (view != null && f9Var != null) {
            if (!(str == null || str.length() == 0)) {
                java.util.Map b17 = b(f9Var, i17);
                if (b17 == null) {
                    return;
                }
                if (i17 >= 0) {
                    str2 = "_" + i17;
                } else {
                    str2 = "";
                }
                wi(view, str, 160, str + '_' + f9Var.getMsgId() + str2, b17, b00.w.f16784d);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindReportForView success, viewId:");
                sb6.append(str);
                sb6.append(", viewIndex:");
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", sb6.toString());
                return;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindReportForView invalid params, view:");
        sb7.append(view != null);
        sb7.append(", msgInfo:");
        sb7.append(f9Var != null);
        sb7.append(", viewId:");
        sb7.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.EcsKfReportService", sb7.toString());
    }

    public void aj(java.lang.String event, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        c(event, f9Var, str, -1);
    }

    public final java.util.Map b(com.tencent.mm.storage.f9 f9Var, int i17) {
        java.lang.String z17;
        java.lang.String T0 = f9Var.T0();
        java.lang.String y07 = f9Var.y0();
        boolean z18 = false;
        if ((T0 == null || T0.length() == 0) || !k41.h1.d(T0)) {
            T0 = ((y07 == null || y07.length() == 0) || !k41.h1.d(y07)) ? null : y07;
        }
        if (T0 == null || T0.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "not ecs kf session, skip report");
            return null;
        }
        int c17 = k41.h1.c(T0);
        if (c17 == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfReportService", "ecs kf session, but type == 0");
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(f9Var.I0());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        w05.h hVar = k17 != null ? (w05.h) k17.getCustom(k17.f432315e + 74) : null;
        if (hVar != null && (z17 = hVar.z()) != null) {
            if (z17.length() > 0) {
                z18 = true;
            }
        }
        if (z18) {
            linkedHashMap.put("extra_info_json", hVar.z());
        }
        linkedHashMap.put("msg_id", valueOf);
        linkedHashMap.put("kf_user_name", T0);
        linkedHashMap.put("kefu_type", java.lang.Integer.valueOf(c17));
        if (i17 >= 0) {
            linkedHashMap.put("kf_view_index", java.lang.Integer.valueOf(i17 + 1));
        }
        return linkedHashMap;
    }

    public final void bj(java.lang.String str, java.lang.String str2, java.util.Map map) {
        ((cy1.a) Zi()).Bj(str, str2, map, 12, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "reportEvent viewId:" + str + ", eventId:" + str2 + ", params:" + map);
    }

    public void c(java.lang.String event, com.tencent.mm.storage.f9 f9Var, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(event, "event");
        if (f9Var != null) {
            if (!(str == null || str.length() == 0)) {
                java.util.Map b17 = b(f9Var, i17);
                if (b17 != null) {
                    java.util.Map t17 = kz5.c1.t(b17);
                    t17.put("kf_session_id", b00.k0.f16702a);
                    bj(str, event, t17);
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportCustomEvent invalid params, msgInfo:");
        sb6.append(f9Var != null);
        sb6.append(", viewId:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.EcsKfReportService", sb6.toString());
    }

    public final void cj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map) {
        if (k41.h1.d(str)) {
            bj(str2, str3, map);
        }
    }

    public void fj(java.lang.String str) {
        cj(str, "ecs_kf_session_more", "view_clk", Ni(str));
    }

    public void hj(int i17, java.lang.String str) {
        if (!k41.h1.d(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "reportEnterKfRoom skip, not ecs kf, scene:" + i17 + ", kfUserName:" + str);
            return;
        }
        int c17 = k41.h1.c(str);
        java.lang.String str2 = b00.k0.f16702a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i17));
        linkedHashMap.put("kf_session_id", str2);
        linkedHashMap.put("kf_user_name", str == null ? "" : str);
        linkedHashMap.put("kefu_type", java.lang.Integer.valueOf(c17));
        bj("ecs_kf_room_enter", "page_enter", linkedHashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "reportEnterKfRoom success, scene:" + i17 + ", sessionId:" + str2 + ", kfUserName:" + str + ", kefuType:" + c17 + ", params:" + linkedHashMap);
    }

    public final void wi(android.view.View view, java.lang.String str, int i17, java.lang.String str2, java.util.Map map, final yz5.l lVar) {
        ((cy1.a) Zi()).pk(view, str);
        if (str2 != null) {
            ((cy1.a) Zi()).tk(view, str2);
        }
        if (map != null) {
            ((cy1.a) Zi()).gk(view, map);
        }
        if (lVar != null) {
            ((cy1.a) Zi()).Ai(view, new ly1.a(lVar) { // from class: b00.z

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yz5.l f16798a;

                {
                    kotlin.jvm.internal.o.g(lVar, "function");
                    this.f16798a = lVar;
                }

                @Override // ly1.a
                public final /* synthetic */ java.util.Map b(java.lang.String str3) {
                    return (java.util.Map) this.f16798a.invoke(str3);
                }
            });
        }
        ((cy1.a) Zi()).Tj(view, i17, 12, false);
    }
}
