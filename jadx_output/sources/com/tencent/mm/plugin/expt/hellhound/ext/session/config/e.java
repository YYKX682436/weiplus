package com.tencent.mm.plugin.expt.hellhound.ext.session.config;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.expt.hellhound.ext.session.config.e f99793b;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f99794a;

    public e() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f99794a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SessionPageConfigChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig$1
            {
                this.__eventId = -2053259629;
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x017f A[LOOP:4: B:95:0x0163->B:103:0x017f, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0189 A[EDGE_INSN: B:104:0x0189->B:105:0x0189 BREAK  A[LOOP:4: B:95:0x0163->B:103:0x017f], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0357  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.SessionPageConfigChangeEvent r27) {
                /*
                    Method dump skipped, instructions count: 992
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }

    public static com.tencent.mm.plugin.expt.hellhound.ext.session.config.e a() {
        if (f99793b == null) {
            synchronized (com.tencent.mm.plugin.expt.hellhound.ext.session.config.e.class) {
                if (f99793b == null) {
                    f99793b = new com.tencent.mm.plugin.expt.hellhound.ext.session.config.e();
                }
            }
        }
        return f99793b;
    }

    public r45.g16 b(long j17) {
        r45.d16 a17 = x52.e.a();
        if (a17 != null) {
            java.util.LinkedList linkedList = a17.f371993d;
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.g16 g16Var = (r45.g16) it.next();
                    if (g16Var != null && g16Var.f374823e == j17) {
                        return g16Var;
                    }
                }
            }
        }
        return null;
    }

    public final void c(r45.b45 b45Var, java.util.List list, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof r45.a44) {
                r45.a44 a44Var = (r45.a44) obj;
                if (b45Var.f370519d.equals(a44Var.f369716e)) {
                    java.lang.String str = a44Var.f369717f;
                    b45Var.f370522g = str;
                    if (android.text.TextUtils.isEmpty(str)) {
                        a62.k.a(124L);
                    } else {
                        a62.k.a(138L);
                    }
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "paramPaoguard, classNameProguard: %s, %s, %b", a44Var.f369716e, a44Var.f369717f, java.lang.Boolean.valueOf(z17));
                } else if (b45Var.f370520e.equals(a44Var.f369716e)) {
                    r45.a44 a44Var2 = new r45.a44();
                    b45Var.f370523h = a44Var2;
                    a44Var2.f369715d = !z17 ? 1 : 0;
                    java.lang.String str2 = b45Var.f370520e;
                    a44Var2.f369716e = str2;
                    a44Var2.f369717f = a44Var.f369717f;
                    if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(a44Var.f369717f)) {
                        a62.k.a(125L);
                    } else {
                        a62.k.a(139L);
                    }
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "paramPaoguard, dataPathProguard: type=%s, key=%s, val=%s, isView=%b", java.lang.Integer.valueOf(b45Var.f370523h.f369715d), b45Var.f370520e, a44Var.f369717f, java.lang.Boolean.valueOf(z17));
                }
            }
        }
    }

    public final void d(org.json.JSONObject jSONObject, java.util.List list, r45.c16 c16Var) {
        int length;
        int length2;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("viewOp");
        if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOpArrayLength=%d", java.lang.Integer.valueOf(length));
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                r45.b07 b07Var = new r45.b07();
                b07Var.f370418e = optJSONObject.optInt("type");
                b07Var.f370422i = optJSONObject.optString("viewId");
                b07Var.f370419f = optJSONObject.optString("class");
                b07Var.f370420g = optJSONObject.optInt("action");
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, class=%s, resName=%s, type=%d", b07Var.f370419f, b07Var.f370422i, java.lang.Integer.valueOf(b07Var.f370418e));
                if (list != null && !list.isEmpty()) {
                    for (java.lang.Object obj : list) {
                        if (obj instanceof r45.a44) {
                            r45.a44 a44Var = (r45.a44) obj;
                            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, resName=%s, key=%s, val=%s", b07Var.f370422i, a44Var.f369716e, a44Var.f369717f);
                            if (b07Var.f370422i.equals(a44Var.f369716e)) {
                                boolean isEmpty = android.text.TextUtils.isEmpty(a44Var.f369717f);
                                b07Var.f370417d = isEmpty ? b07Var.f370422i : a44Var.f369717f;
                                if (isEmpty) {
                                    a62.k.a(126L);
                                } else {
                                    a62.k.a(136L);
                                }
                            } else if (b07Var.f370419f.equals(a44Var.f369716e)) {
                                java.lang.String str = a44Var.f369717f;
                                b07Var.f370423m = str;
                                if (android.text.TextUtils.isEmpty(str)) {
                                    a62.k.a(127L);
                                } else {
                                    a62.k.a(137L);
                                }
                            }
                        }
                    }
                }
                org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("businessParams");
                if (optJSONArray2 != null && (length2 = optJSONArray2.length()) > 0) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOpParamJArraySize=%d", java.lang.Integer.valueOf(length2));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i18 = 0; i18 < length2; i18++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i18);
                        if (optJSONObject2 != null) {
                            r45.b45 b45Var = new r45.b45();
                            b45Var.f370519d = optJSONObject2.optString("className");
                            b45Var.f370520e = optJSONObject2.optString("dataPath");
                            c(b45Var, list, true);
                            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, pageParam.className=%s, pageParam.dataPath=%s, ", b45Var.f370519d, b45Var.f370520e);
                            arrayList.add(b45Var);
                        }
                    }
                    java.util.LinkedList linkedList = b07Var.f370421h;
                    linkedList.addAll(arrayList);
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOp.businessParams=%d", java.lang.Integer.valueOf(linkedList.size()));
                }
                c16Var.f371222f.addLast(b07Var);
            }
        }
    }
}
