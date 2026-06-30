package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e f181326b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181327a;

    public e() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f181327a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6000xaeda0c83>(a0Var) { // from class: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig$1
            {
                this.f39173x3fe91575 = -2053259629;
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x017f A[LOOP:4: B:95:0x0163->B:103:0x017f, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0189 A[EDGE_INSN: B:104:0x0189->B:105:0x0189 BREAK  A[LOOP:4: B:95:0x0163->B:103:0x017f], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0357  */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6000xaeda0c83 r27) {
                /*
                    Method dump skipped, instructions count: 992
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.C13491x36bc86dc.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e a() {
        if (f181326b == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e.class) {
                if (f181326b == null) {
                    f181326b = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e();
                }
            }
        }
        return f181326b;
    }

    public r45.g16 b(long j17) {
        r45.d16 a17 = x52.e.a();
        if (a17 != null) {
            java.util.LinkedList linkedList = a17.f453526d;
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.g16 g16Var = (r45.g16) it.next();
                    if (g16Var != null && g16Var.f456356e == j17) {
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
                if (b45Var.f452052d.equals(a44Var.f451249e)) {
                    java.lang.String str = a44Var.f451250f;
                    b45Var.f452055g = str;
                    if (android.text.TextUtils.isEmpty(str)) {
                        a62.k.a(124L);
                    } else {
                        a62.k.a(138L);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "paramPaoguard, classNameProguard: %s, %s, %b", a44Var.f451249e, a44Var.f451250f, java.lang.Boolean.valueOf(z17));
                } else if (b45Var.f452053e.equals(a44Var.f451249e)) {
                    r45.a44 a44Var2 = new r45.a44();
                    b45Var.f452056h = a44Var2;
                    a44Var2.f451248d = !z17 ? 1 : 0;
                    java.lang.String str2 = b45Var.f452053e;
                    a44Var2.f451249e = str2;
                    a44Var2.f451250f = a44Var.f451250f;
                    if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(a44Var.f451250f)) {
                        a62.k.a(125L);
                    } else {
                        a62.k.a(139L);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "paramPaoguard, dataPathProguard: type=%s, key=%s, val=%s, isView=%b", java.lang.Integer.valueOf(b45Var.f452056h.f451248d), b45Var.f452053e, a44Var.f451250f, java.lang.Boolean.valueOf(z17));
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOpArrayLength=%d", java.lang.Integer.valueOf(length));
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                r45.b07 b07Var = new r45.b07();
                b07Var.f451951e = optJSONObject.optInt("type");
                b07Var.f451955i = optJSONObject.optString("viewId");
                b07Var.f451952f = optJSONObject.optString("class");
                b07Var.f451953g = optJSONObject.optInt("action");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, class=%s, resName=%s, type=%d", b07Var.f451952f, b07Var.f451955i, java.lang.Integer.valueOf(b07Var.f451951e));
                if (list != null && !list.isEmpty()) {
                    for (java.lang.Object obj : list) {
                        if (obj instanceof r45.a44) {
                            r45.a44 a44Var = (r45.a44) obj;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, resName=%s, key=%s, val=%s", b07Var.f451955i, a44Var.f451249e, a44Var.f451250f);
                            if (b07Var.f451955i.equals(a44Var.f451249e)) {
                                boolean isEmpty = android.text.TextUtils.isEmpty(a44Var.f451250f);
                                b07Var.f451950d = isEmpty ? b07Var.f451955i : a44Var.f451250f;
                                if (isEmpty) {
                                    a62.k.a(126L);
                                } else {
                                    a62.k.a(136L);
                                }
                            } else if (b07Var.f451952f.equals(a44Var.f451249e)) {
                                java.lang.String str = a44Var.f451250f;
                                b07Var.f451956m = str;
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOpParamJArraySize=%d", java.lang.Integer.valueOf(length2));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i18 = 0; i18 < length2; i18++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i18);
                        if (optJSONObject2 != null) {
                            r45.b45 b45Var = new r45.b45();
                            b45Var.f452052d = optJSONObject2.optString("className");
                            b45Var.f452053e = optJSONObject2.optString("dataPath");
                            c(b45Var, list, true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, pageParam.className=%s, pageParam.dataPath=%s, ", b45Var.f452052d, b45Var.f452053e);
                            arrayList.add(b45Var);
                        }
                    }
                    java.util.LinkedList linkedList = b07Var.f451954h;
                    linkedList.addAll(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOp.businessParams=%d", java.lang.Integer.valueOf(linkedList.size()));
                }
                c16Var.f452755f.addLast(b07Var);
            }
        }
    }
}
