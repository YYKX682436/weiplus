package oy1;

/* loaded from: classes5.dex */
public final class h0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f431406d;

    public h0() {
        super(0);
    }

    public final boolean b(int i17) {
        java.util.Set set;
        if (this.f431406d == null) {
            this.f431406d = new java.util.LinkedHashSet();
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_data_report_sdk_cgi_liteapp_collect_report, "13", true);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Zi, "")) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                java.util.Iterator it = kz5.n0.S0(r26.n0.f0(Zi, new java.lang.String[]{"|"}, false, 0, 6, null)).iterator();
                while (it.hasNext()) {
                    java.lang.Integer h17 = r26.h0.h((java.lang.String) it.next());
                    if (h17 != null && (set = this.f431406d) != null) {
                        set.add(h17);
                    }
                }
            }
        }
        java.util.Set set2 = this.f431406d;
        if (set2 != null) {
            return set2.contains(java.lang.Integer.valueOf(i17));
        }
        return false;
    }

    public final java.util.List c(org.json.JSONArray jSONArray, int i17) {
        if (i17 >= 50) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "parseJsonArray get JSONArray data err! more than 50");
            return kz5.b0.c("more than 50");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.Object opt = jSONArray.opt(i18);
            if (opt instanceof org.json.JSONObject) {
                arrayList.add(f((org.json.JSONObject) opt, i17 + 1));
            } else if (opt instanceof org.json.JSONArray) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(opt);
                arrayList.add(c((org.json.JSONArray) opt, i17 + 1));
            } else {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5655x22761072 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5655x22761072) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.xh xhVar = event.f135981g;
        if (xhVar != null) {
            if (xhVar.f89911a <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "bizId err !! " + xhVar + ".businessId");
            } else {
                java.lang.String str = xhVar.f89913c;
                if (str == null || str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "jsonInfoStringList empty !!");
                } else {
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONArray(xhVar.f89913c);
                        if (jSONArray.length() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "jsonArray empty !!");
                        } else {
                            h(xhVar.f89911a, xhVar.f89912b, jSONArray);
                        }
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "parse json err !!");
                    }
                }
            }
        }
        return false;
    }

    public final java.util.Map f(org.json.JSONObject jSONObject, int i17) {
        java.lang.Object opt;
        org.json.JSONObject jSONObject2;
        jz5.f0 f0Var;
        if (jSONObject == null) {
            return null;
        }
        if (i17 >= 50) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "parseJsonToMapString get JSONArray data err! more than 50 ");
            return kz5.c1.l(new jz5.l("__ERROR__", "more than 50"));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String str = next instanceof java.lang.String ? next : null;
            if (str != null && (opt = jSONObject.opt(str)) != null) {
                if (opt instanceof java.lang.String) {
                    java.lang.String optString = jSONObject.optString(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    try {
                        jSONObject2 = new org.json.JSONObject(optString);
                    } catch (org.json.JSONException unused) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        linkedHashMap.put(str, f(jSONObject2, i17 + 1));
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        linkedHashMap.put(str, optString);
                    }
                } else if (opt instanceof java.lang.Integer) {
                    linkedHashMap.put(str, java.lang.Integer.valueOf(jSONObject.optInt(str)));
                } else if (opt instanceof java.lang.Long) {
                    linkedHashMap.put(str, java.lang.Long.valueOf(jSONObject.optLong(str)));
                } else if (opt instanceof java.lang.Double) {
                    linkedHashMap.put(str, java.lang.Double.valueOf(jSONObject.optDouble(str)));
                } else if (opt instanceof java.lang.Boolean) {
                    linkedHashMap.put(str, java.lang.Boolean.valueOf(jSONObject.optBoolean(str)));
                } else if (opt instanceof org.json.JSONArray) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                    int length = jSONArray.length();
                    for (int i18 = 0; i18 < length; i18++) {
                        java.lang.Object opt2 = jSONArray.opt(i18);
                        if (opt2 instanceof org.json.JSONObject) {
                            java.util.Map f17 = f((org.json.JSONObject) opt2, i17 + 1);
                            if (f17 != null) {
                                arrayList.add(f17);
                            }
                        } else if (opt2 instanceof org.json.JSONArray) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(opt2);
                            arrayList.add(c((org.json.JSONArray) opt2, i17 + 1));
                        } else {
                            arrayList.add(opt2);
                        }
                    }
                    linkedHashMap.put(str, arrayList);
                } else if (opt instanceof org.json.JSONObject) {
                    linkedHashMap.put(str, f((org.json.JSONObject) opt, i17 + 1));
                } else {
                    linkedHashMap.put(str, opt);
                }
            }
        }
        return linkedHashMap;
    }

    public final void h(int i17, boolean z17, org.json.JSONArray jSONArray) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        int i19;
        boolean z18;
        int i27;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        jz5.f0 f0Var;
        java.util.Map f17;
        org.json.JSONObject jSONObject3;
        jz5.f0 f0Var2;
        java.util.Map f18;
        org.json.JSONObject jSONObject4;
        jz5.f0 f0Var3;
        java.util.Map f19;
        java.lang.String str3 = "page_id";
        java.lang.String str4 = "LiteAppCustomReportCgiEvent";
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            int length = jSONArray.length();
            int i28 = 0;
            boolean z19 = z17;
            int i29 = 0;
            while (i29 < length) {
                org.json.JSONObject jSONObject5 = jSONArray.getJSONObject(i29);
                if (jSONObject5 != null) {
                    java.lang.String optString = jSONObject5.optString("eventId");
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                    java.lang.String optString2 = jSONObject5.optString("itemId");
                    int optInt = jSONObject5.optInt("itemType", i28);
                    if (optInt == 2) {
                        linkedHashMap2.put("view_id", optString2);
                        i18 = length;
                        z18 = true;
                    } else {
                        i18 = length;
                        z18 = z19;
                    }
                    java.lang.String optString3 = jSONObject5.optString("curPageJson", "");
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString3, "");
                    jz5.f0 f0Var4 = jz5.f0.f384359a;
                    jz5.f0 f0Var5 = null;
                    if (b17) {
                        str2 = str4;
                        i19 = i29;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                        try {
                            jSONObject4 = new org.json.JSONObject(optString3);
                        } catch (org.json.JSONException unused) {
                            jSONObject4 = null;
                        }
                        str2 = str4;
                        i19 = i29;
                        if (jSONObject4 == null || (f19 = f(jSONObject4, 0)) == null) {
                            f0Var3 = null;
                        } else {
                            if (optInt == 1) {
                                linkedHashMap2.putAll(f19);
                                if (!linkedHashMap2.containsKey(str3)) {
                                    linkedHashMap2.put(str3, optString2);
                                }
                            } else {
                                linkedHashMap2.put("cur_page", f19);
                            }
                            f0Var3 = f0Var4;
                        }
                        if (f0Var3 == null) {
                            linkedHashMap2.put("cur_page", optString3);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "cur page err !! " + optString3);
                        }
                    }
                    java.lang.String optString4 = jSONObject5.optString("refPageJson", "");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString4, "")) {
                        str = str3;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                        try {
                            jSONObject3 = new org.json.JSONObject(optString4);
                        } catch (org.json.JSONException unused2) {
                            jSONObject3 = null;
                        }
                        str = str3;
                        if (jSONObject3 == null || (f18 = f(jSONObject3, 0)) == null) {
                            f0Var2 = null;
                        } else {
                            linkedHashMap2.put("ref_page", f18);
                            f0Var2 = f0Var4;
                        }
                        if (f0Var2 == null) {
                            linkedHashMap2.put("ref_page", optString4);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "ref page err !! " + optString4);
                        }
                    }
                    java.lang.String optString5 = jSONObject5.optString("sourcePageJson", "");
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString5, "")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                        try {
                            jSONObject2 = new org.json.JSONObject(optString5);
                        } catch (org.json.JSONException unused3) {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 == null || (f17 = f(jSONObject2, 0)) == null) {
                            f0Var = null;
                        } else {
                            linkedHashMap2.put("source_page", f17);
                            f0Var = f0Var4;
                        }
                        if (f0Var == null) {
                            linkedHashMap2.put("source_page", optString5);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "ref page err !! " + optString5);
                        }
                    }
                    java.lang.String optString6 = jSONObject5.optString("dataJson", "");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString6, "")) {
                        i27 = -1;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
                        try {
                            jSONObject = new org.json.JSONObject(optString6);
                        } catch (org.json.JSONException unused4) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            i27 = jSONObject.optInt("is_wq_batch", -1);
                            java.util.Map f27 = f(jSONObject, 0);
                            if (f27 != null) {
                                linkedHashMap2.putAll(f27);
                            } else {
                                f0Var4 = null;
                            }
                            f0Var5 = f0Var4;
                        } else {
                            i27 = -1;
                        }
                        if (f0Var5 == null) {
                            linkedHashMap2.put("err_data_json", optString6);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "ref page err !! " + optString6);
                        }
                    }
                    boolean z27 = z18;
                    linkedHashMap2.put("event_time", java.lang.Long.valueOf(jSONObject5.optLong("eventTime", -1L)));
                    linkedHashMap2.put("session_id", jSONObject5.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984));
                    if (!b(i17) || i27 == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsCgiReportListener", "report " + optString + ' ' + optString2 + ' ' + z27);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).zj(optString, null, linkedHashMap2, i17, optInt == 2 ? true : z17, false);
                    } else {
                        linkedHashMap2.put("eventId", optString);
                        java.util.List list = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(i27));
                        if (list == null) {
                            list = new java.util.ArrayList();
                            linkedHashMap.put(java.lang.Integer.valueOf(i27), list);
                        }
                        list.add(linkedHashMap2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsCgiReportListener", " wqBatch report " + optString + ' ' + optString2 + ' ' + i27);
                    }
                    z19 = z27;
                } else {
                    str = str3;
                    str2 = str4;
                    i18 = length;
                    i19 = i29;
                }
                i29 = i19 + 1;
                length = i18;
                str4 = str2;
                str3 = str;
                i28 = 0;
            }
            java.lang.String str5 = str4;
            if (!linkedHashMap.isEmpty()) {
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    int intValue = ((java.lang.Number) entry.getKey()).intValue();
                    java.util.List list2 = (java.util.List) entry.getValue();
                    java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                    java.lang.String str6 = str5;
                    linkedHashMap3.put(str6, list2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsCgiReportListener", str6 + "  report wq = " + intValue + " size = " + list2.size() + ' ');
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).zj("LiteAppCustomReportCgiEvent", null, linkedHashMap3, i17, z19, false);
                    str5 = str6;
                }
            }
            if (z19) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("cgi_report_fake_session_out", null, null, i17, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsCgiReportListener", "sendReportDataList get JSONArray data err! " + e17.getMessage());
        }
    }
}
