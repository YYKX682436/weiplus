package ry5;

/* loaded from: classes13.dex */
public final class c implements ry5.a {

    /* renamed from: j, reason: collision with root package name */
    public static volatile ry5.c f483235j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f483236a;

    /* renamed from: b, reason: collision with root package name */
    public final ry5.b f483237b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f483238c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f483239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f483240e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f483241f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f483242g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f483243h;

    /* renamed from: i, reason: collision with root package name */
    public long f483244i;

    public c() {
        ry5.b bVar = new ry5.b();
        this.f483237b = bVar;
        this.f483239d = new java.lang.Runnable() { // from class: ry5.c$$i
            @Override // java.lang.Runnable
            public final void run() {
                android.app.Activity activity;
                mk.d dVar;
                ry5.c cVar = ry5.c.this;
                cVar.getClass();
                zy5.a aVar = a.b.c().f81578b;
                aVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = aVar.f559220d.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null) {
                        arrayList.add(weakReference.get());
                    }
                }
                if (arrayList.size() <= 0) {
                    cVar.c();
                    return;
                }
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        activity = null;
                        break;
                    }
                    activity = (android.app.Activity) arrayList.get(size);
                    if (activity != null && ry5.d.d(activity) != null) {
                        break;
                    } else {
                        size--;
                    }
                }
                java.lang.Long l17 = (java.lang.Long) a.b.c().f81579c.get(java.lang.Integer.valueOf(activity.hashCode()));
                long longValue = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
                ((my1.c) a.b.c().f81582f).getClass();
                if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) {
                    mk.d dVar2 = a.b.c().f81582f;
                    final ry5.C30153x2d8ca0 c30153x2d8ca0 = new ry5.C30153x2d8ca0(cVar, activity, longValue);
                    ((my1.c) dVar2).getClass();
                    final java.lang.String[] strArr = {""};
                    final boolean[] zArr = {false};
                    final w71.f[] a17 = w71.g.a();
                    for (int i17 = 0; i17 < a17.length; i17++) {
                        w71.f fVar = a17[i17];
                        final int i18 = i17;
                        yz5.l lVar = new yz5.l() { // from class: my1.c$$a
                            @Override // yz5.l
                            /* renamed from: invoke */
                            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                java.lang.String str = (java.lang.String) obj;
                                boolean e17 = u46.l.e(str);
                                java.lang.String[] strArr2 = strArr;
                                if (!e17) {
                                    strArr2[0] = str;
                                }
                                if (i18 != a17.length - 1) {
                                    return null;
                                }
                                ((ry5.C30153x2d8ca0) c30153x2d8ca0).a(strArr2[0]);
                                zArr[0] = true;
                                return null;
                            }
                        };
                        w71.h hVar = (w71.h) fVar;
                        hVar.getClass();
                        w71.n0 n0Var = new w71.n0();
                        n0Var.f524954e = lVar;
                        p3380x6a61f93.p3386xf51b86f1.C30601x21b80faf.m170189x21b46e6b(hVar.m105978x2737f10(), n0Var);
                    }
                    sz1.i.f495474b.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: my1.c$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (zArr[0]) {
                                return;
                            }
                            ((ry5.C30153x2d8ca0) c30153x2d8ca0).a(strArr[0]);
                        }
                    }, 3000L);
                    return;
                }
                int i19 = ry5.d.f483280a;
                wy5.e f17 = ry5.d.f(activity.getWindow().getDecorView().getRootView(), 0);
                if (f17 != null && (dVar = a.b.c().f81582f) != null) {
                    my1.c cVar2 = (my1.c) dVar;
                    cVar2.c();
                    java.util.Iterator it6 = ((java.util.ArrayList) cVar2.c()).iterator();
                    while (it6.hasNext()) {
                        android.view.View view = (android.view.View) it6.next();
                        android.graphics.Rect rect = new android.graphics.Rect();
                        view.getGlobalVisibleRect(rect);
                        wy5.e eVar = new wy5.e();
                        int i27 = rect.left;
                        eVar.f532208a = i27;
                        int i28 = rect.top;
                        eVar.f532209b = i28;
                        eVar.f532210c = rect.right - i27;
                        eVar.f532211d = rect.bottom - i28;
                        cVar2.a(view, eVar.f532212e);
                        f17.f532213f.add(eVar);
                    }
                }
                if (cVar.b(f17, activity, longValue)) {
                    return;
                }
                cVar.c();
            }
        };
        this.f483240e = new java.lang.Runnable() { // from class: ry5.c$$j
            @Override // java.lang.Runnable
            public final void run() {
                final android.app.Activity activity;
                android.view.View view;
                final ry5.c cVar = ry5.c.this;
                cVar.getClass();
                zy5.a aVar = a.b.c().f81578b;
                aVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = aVar.f559220d.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null) {
                        arrayList.add(weakReference.get());
                    }
                }
                if (arrayList.size() <= 0) {
                    cVar.e();
                    return;
                }
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        activity = null;
                        view = null;
                        break;
                    } else {
                        activity = (android.app.Activity) arrayList.get(size);
                        if (activity != null && (view = ry5.d.d(activity)) != null) {
                            break;
                        }
                    }
                }
                if (view == null || activity == null) {
                    cVar.e();
                    return;
                }
                java.lang.Long l17 = (java.lang.Long) a.b.c().f81579c.get(java.lang.Integer.valueOf(activity.hashCode()));
                final long longValue = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
                int i17 = ry5.d.f483280a;
                ry5.d.i(activity, cVar.f483238c, new yz5.p() { // from class: ry5.c$$b
                    @Override // yz5.p
                    /* renamed from: invoke */
                    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                        android.app.Activity activity2;
                        long j17 = longValue;
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                        ry5.c cVar2 = ry5.c.this;
                        if (bitmap != null) {
                            cVar2.getClass();
                            if (bitmap.getByteCount() > 0 && (activity2 = activity) != null) {
                                java.lang.String simpleName = activity2.getClass().getSimpleName();
                                java.lang.String b17 = a.b.c().b();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(ry5.d.a());
                                sb6.append(";");
                                sb6.append(ry5.d.j());
                                sb6.append(";2;");
                                ((my1.c) a.b.c().f81582f).getClass();
                                sb6.append(o45.wf.f424562g);
                                java.lang.String sb7 = sb6.toString();
                                java.lang.String e17 = ry5.d.e(bitmap);
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put("action", 2);
                                    jSONObject.put("uin", b17);
                                    jSONObject.put("startTime", j17);
                                    jSONObject.put("pageName", simpleName);
                                    jSONObject.put("clientInfo", sb7);
                                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, e17);
                                } catch (org.json.JSONException unused) {
                                }
                                cVar2.f483237b.c(jSONObject.toString());
                                return null;
                            }
                        }
                        cVar2.e();
                        return null;
                    }
                });
            }
        };
        this.f483241f = new java.util.concurrent.CopyOnWriteArrayList();
        this.f483242g = new java.util.concurrent.CopyOnWriteArrayList();
        this.f483243h = new java.util.ArrayList();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("amoeba#sentinel#handler");
        handlerThread.start();
        this.f483238c = new android.os.Handler(handlerThread.getLooper());
        bVar.f483231d = this;
    }

    public static ry5.c f() {
        if (f483235j == null) {
            synchronized (ry5.c.class) {
                if (f483235j == null) {
                    f483235j = new ry5.c();
                }
            }
        }
        return f483235j;
    }

    public final void a(final int i17) {
        if (xy5.b.f539695a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("enricwu.SentinelService", "[connectWebSocket]");
        }
        this.f483238c.post(new java.lang.Runnable() { // from class: ry5.c$$f
            /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 376
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ry5.RunnableC30156x2d8ca3.run():void");
            }
        });
    }

    public final boolean b(wy5.e eVar, android.app.Activity activity, long j17) {
        if (eVar == null) {
            return false;
        }
        java.lang.String simpleName = activity.getClass().getSimpleName();
        java.lang.String b17 = a.b.c().b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(ry5.d.a());
        sb6.append(";");
        sb6.append(ry5.d.j());
        sb6.append(";2;");
        ((my1.c) a.b.c().f81582f).getClass();
        sb6.append(o45.wf.f424562g);
        java.lang.String sb7 = sb6.toString();
        java.lang.String encodeToString = android.util.Base64.encodeToString(new org.json.JSONObject(eVar.a()).toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("action", 6);
            jSONObject.put("uin", b17);
            jSONObject.put("startTime", j17);
            jSONObject.put("pageName", simpleName);
            jSONObject.put("clientInfo", sb7);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, encodeToString);
        } catch (org.json.JSONException unused) {
        }
        this.f483237b.c(jSONObject.toString());
        return true;
    }

    public final void c() {
        android.os.Handler handler = this.f483238c;
        java.lang.Runnable runnable = this.f483239d;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 500L);
    }

    public final void d(final java.lang.Object obj, final java.lang.String str, final long j17, final int i17, final int i18) {
        if (i18 <= 0 || obj == null || android.text.TextUtils.isEmpty(this.f483236a)) {
            return;
        }
        this.f483238c.postDelayed(new java.lang.Runnable() { // from class: ry5.c$$g
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String obj2;
                java.lang.Object obj3;
                java.lang.Object obj4;
                java.lang.String str2 = str;
                long j18 = j17;
                int i19 = i17;
                int i27 = i18;
                final ry5.c cVar = ry5.c.this;
                cVar.getClass();
                java.lang.Object obj5 = obj;
                if (obj5 instanceof java.util.Map) {
                    java.lang.Object obj6 = ((java.util.Map) obj5).get("udf_kv");
                    if (obj6 instanceof java.util.Map) {
                        java.util.Map map = (java.util.Map) obj6;
                        obj4 = map.get("page_id");
                        obj3 = map.get("view_id");
                    } else {
                        obj4 = 0;
                        obj3 = "";
                    }
                    obj2 = xy5.a.a(obj5).toString();
                } else {
                    obj2 = obj5.toString();
                    obj3 = null;
                    obj4 = null;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("uin", a.b.c().b());
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280, 2);
                    ((my1.c) a.b.c().f81582f).getClass();
                    jSONObject.put("clientVersion", o45.wf.f424562g);
                    jSONObject.put("eventId", str2);
                    jSONObject.put("time", j18);
                    jSONObject.put("routeType", i19);
                    jSONObject.put("routeRule", i27);
                    jSONObject.put("pageId", obj4);
                    jSONObject.put("viewId", obj3);
                    jSONObject.put("paramsJsonStr", obj2);
                    cVar.f483243h.add(jSONObject.toString());
                } catch (java.lang.Exception unused) {
                }
                cVar.f483238c.postDelayed(new java.lang.Runnable() { // from class: ry5.c$$m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ry5.c cVar2 = ry5.c.this;
                        cVar2.getClass();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.ArrayList arrayList = cVar2.f483243h;
                        if (arrayList.size() >= 10 || currentTimeMillis - cVar2.f483244i >= 2000) {
                            java.lang.String b17 = a.b.c().b();
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(ry5.d.a());
                            sb6.append(";");
                            sb6.append(ry5.d.j());
                            sb6.append(";2;");
                            ((my1.c) a.b.c().f81582f).getClass();
                            sb6.append(o45.wf.f424562g);
                            java.lang.String sb7 = sb6.toString();
                            java.util.Iterator it = arrayList.iterator();
                            java.lang.String str3 = "";
                            while (it.hasNext()) {
                                str3 = str3 + "||" + ((java.lang.String) it.next());
                            }
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put("action", 5);
                                jSONObject2.put("uin", b17);
                                jSONObject2.put("startTime", currentTimeMillis2);
                                jSONObject2.put("pageName", "");
                                jSONObject2.put("clientInfo", sb7);
                                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str3);
                            } catch (org.json.JSONException unused2) {
                            }
                            cVar2.f483237b.c(jSONObject2.toString());
                            arrayList.clear();
                            cVar2.f483244i = currentTimeMillis;
                        }
                    }
                }, 2000L);
            }
        }, 100L);
    }

    public final void e() {
        android.os.Handler handler = this.f483238c;
        java.lang.Runnable runnable = this.f483240e;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 100L);
    }
}
