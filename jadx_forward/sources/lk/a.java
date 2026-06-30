package lk;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(java.lang.Object obj) {
        if (a.b.c().f81577a && "3191139514".equals(a.b.c().b())) {
            final ry5.c f17 = ry5.c.f();
            if (obj == null) {
                f17.getClass();
                return;
            }
            if (android.text.TextUtils.isEmpty(f17.f483236a)) {
                ry5.b bVar = f17.f483237b;
                if (!bVar.f483233f && !bVar.f483234g) {
                    f17.a(0);
                    return;
                }
                ((my1.c) a.b.c().f81582f).getClass();
                final java.lang.String aj6 = cy1.a.Ui().aj(obj);
                if (android.text.TextUtils.isEmpty(aj6)) {
                    aj6 = obj.getClass().getSimpleName();
                }
                if (f17.f483241f.contains(aj6)) {
                    return;
                }
                final wy5.c cVar = new wy5.c();
                ((my1.c) a.b.c().f81582f).getClass();
                cVar.f532194a = cy1.a.Ui().Zi(obj);
                cVar.f532195b = obj.getClass().getSimpleName();
                int i17 = ry5.d.f483280a;
                ((my1.c) a.b.c().f81582f).getClass();
                cVar.f532198e = ry5.d.f(sz1.a.h(obj), 0);
                mk.d dVar = a.b.c().f81582f;
                wy5.a aVar = cVar.f532197d;
                ((my1.c) dVar).a(obj, aVar.f532189b);
                java.util.List b17 = ((my1.c) a.b.c().f81582f).b(obj);
                if (b17 != null) {
                    java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                    while (it.hasNext()) {
                        java.util.Map map = (java.util.Map) it.next();
                        try {
                            wy5.b bVar2 = new wy5.b();
                            bVar2.f532190a = ((java.lang.Integer) map.get("route_type")).intValue();
                            bVar2.f532191b = ((java.lang.Integer) map.get("route_rule")).intValue();
                            bVar2.f532192c = ((java.lang.Boolean) map.get("is_rt_report")).booleanValue();
                            bVar2.f532193d = ((java.lang.Boolean) map.get("is_batch_report")).booleanValue();
                            aVar.f532188a.add(bVar2);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                int i18 = ry5.d.f483280a;
                ry5.d.i(obj, f17.f483238c, new yz5.p() { // from class: ry5.c$$e
                    @Override // yz5.p
                    /* renamed from: invoke */
                    public final java.lang.Object mo149xb9724478(java.lang.Object obj2, java.lang.Object obj3) {
                        final android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
                        final ry5.c cVar2 = ry5.c.this;
                        cVar2.getClass();
                        if (bitmap == null || bitmap.getByteCount() <= 0) {
                            return null;
                        }
                        android.os.Handler handler = cVar2.f483238c;
                        final wy5.c cVar3 = cVar;
                        final java.lang.String str = aj6;
                        handler.postDelayed(new java.lang.Runnable() { // from class: ry5.c$$l
                            @Override // java.lang.Runnable
                            public final void run() {
                                ry5.c cVar4 = ry5.c.this;
                                cVar4.getClass();
                                java.lang.String e17 = ry5.d.e(bitmap);
                                wy5.c cVar5 = cVar3;
                                cVar5.f532196c = e17;
                                java.lang.String str2 = cVar5.f532195b;
                                java.lang.String b18 = a.b.c().b();
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(ry5.d.a());
                                sb6.append(";");
                                sb6.append(ry5.d.j());
                                sb6.append(";2;");
                                ((my1.c) a.b.c().f81582f).getClass();
                                sb6.append(o45.wf.f424562g);
                                java.lang.String sb7 = sb6.toString();
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("page_id", java.lang.Integer.valueOf(cVar5.f532194a));
                                hashMap.put("page_name", cVar5.f532195b);
                                hashMap.put("img_base64", cVar5.f532196c);
                                wy5.a aVar2 = cVar5.f532197d;
                                if (aVar2 != null) {
                                    hashMap.put("bind_report_info", aVar2.a());
                                }
                                wy5.e eVar = cVar5.f532198e;
                                if (eVar != null) {
                                    hashMap.put("decor_view_node", eVar.a());
                                }
                                java.lang.String encodeToString = android.util.Base64.encodeToString(new org.json.JSONObject(hashMap).toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 2);
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put("action", 10);
                                    jSONObject.put("uin", b18);
                                    jSONObject.put("startTime", currentTimeMillis);
                                    jSONObject.put("pageName", str2);
                                    jSONObject.put("clientInfo", sb7);
                                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, encodeToString);
                                } catch (org.json.JSONException unused2) {
                                }
                                cVar4.f483237b.c(jSONObject.toString());
                                cVar4.f483241f.add(str);
                            }
                        }, 1000L);
                        return null;
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d3, code lost:
    
        if (r3 < 0) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea A[Catch: Exception -> 0x02f1, TRY_LEAVE, TryCatch #3 {Exception -> 0x02f1, blocks: (B:107:0x02d6, B:109:0x02ea), top: B:106:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.a.b(android.view.View):void");
    }
}
