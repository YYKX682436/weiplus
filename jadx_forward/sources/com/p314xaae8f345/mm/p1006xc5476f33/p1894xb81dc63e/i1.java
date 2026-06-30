package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@j95.b
/* loaded from: classes8.dex */
public final class i1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0, p012xc85e97e9.p093xedfae76a.m1 {

    /* renamed from: w, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w0 f231976w;

    /* renamed from: e, reason: collision with root package name */
    public volatile lk3.b f231979e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f231980f;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16596x8f729c41 f231988q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f231989r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f231990s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f231991t;

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f231992u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f231975v = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f231977x = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f231978d = "MicroMsg.MultiTask.PluginMultiTask";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f231981g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f231982h = "multitask_star";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f231983i = "multitask_star_enable";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231984m = "multitask_star_init_sync_enable";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f231985n = "multi_task_storage";

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16594x7c7d7f3e f231986o = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16594x7c7d7f3e();

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.x0 f231987p = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.x0(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.multitask.PluginMultiTask$multiTaskTabChangeListener$1] */
    public i1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f231988q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d>(a0Var) { // from class: com.tencent.mm.plugin.multitask.PluginMultiTask$multiTaskTabChangeListener$1
            {
                this.f39173x3fe91575 = 1772888173;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d c5718x259ce65d) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d event = c5718x259ce65d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.this.f231978d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MultiTaskTabChangedEvent callback, event.data.curIndex: ");
                am.ek ekVar = event.f136040g;
                sb6.append(ekVar.f88095a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (ekVar.f88095a == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ni(), null, java.lang.Boolean.TRUE, 1, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ni(), java.lang.Boolean.TRUE, null, 2, null);
                }
                return true;
            }
        };
        this.f231990s = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.z0.f232152d);
        this.f231992u = new p012xc85e97e9.p093xedfae76a.l1();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ai(java.lang.String r18, int r19, r45.lr4 r20, android.graphics.Bitmap r21, byte[] r22, mk3.a r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.Ai(java.lang.String, int, r45.lr4, android.graphics.Bitmap, byte[], mk3.a):void");
    }

    public final boolean Bi(java.lang.String str, int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f231981g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ik3.r rVar = (ik3.r) obj;
            if (rVar.f373445b == i17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f373444a, str)) {
                break;
            }
        }
        return obj != null;
    }

    public boolean Di() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return Ni();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f231985n).getBoolean(this.f231983i, j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20561x67f0147b()) == 1);
    }

    public final boolean Ni() {
        return ((java.lang.Boolean) ((jz5.n) this.f231990s).mo141623x754a37bb()).booleanValue();
    }

    public final java.lang.String Ri(java.lang.String id6, int i17, int i18, int i19) {
        java.lang.String str;
        pk3.h a17;
        zk3.g0 g0Var;
        int a76;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w0 w0Var = f231976w;
        android.view.View view2 = null;
        if (w0Var == null) {
            return null;
        }
        yk3.i iVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) w0Var).f232126f;
        if (iVar != null && (a17 = iVar.a(0, "MultiTaskForMinusScreen")) != null && i18 != (a76 = (g0Var = (zk3.g0) a17).a7(id6, i17)) && a76 >= 0) {
            java.util.ArrayList arrayList = g0Var.f554985g;
            if (a76 < arrayList.size()) {
                if (i19 != 4) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = g0Var.f554987i;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = c22849x81a93d25 != null ? c22849x81a93d25.p0(a76 + 1) : null;
                    if (p08 != null) {
                        view2 = p08.f3639x46306858;
                    }
                } else if (arrayList.size() <= 2) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = g0Var.f554987i;
                    if (c22849x81a93d252 != null && (p07 = c22849x81a93d252.p0(1)) != null && (view = p07.f3639x46306858) != null) {
                        view2 = view.findViewById(com.p314xaae8f345.mm.R.id.jvd);
                    }
                } else {
                    view2 = g0Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jv9);
                }
                str = al3.g.f87391a.a(view2);
                return str;
            }
        }
        str = "";
        return str;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Ui(java.lang.String id6, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Zi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.f231998z0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
        if (k0Var != null && (Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).Zi(id6, i17)) != null) {
            return Zi;
        }
        lk3.b aj6 = aj();
        if (aj6 != null) {
            return aj6.Y6(id6, i17);
        }
        return null;
    }

    public java.lang.String Vi() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.g0.class);
            java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
            return str == null ? "" : str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String valueOf = java.lang.String.valueOf(gm0.j1.b().h());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(valueOf != null ? valueOf : "");
        sb6.append(java.lang.System.currentTimeMillis());
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb6.toString()).toString();
    }

    public void Zi(kk3.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "getMultiTaskInfoList");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.c(this.f231989r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.a1(bVar, this);
            this.f231989r = a1Var;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.f0.class, a1Var);
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.f231998z0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
        if (k0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).aj(bVar);
            return;
        }
        lk3.b aj6 = aj();
        if (aj6 != null) {
            aj6.Z6(bVar);
        }
    }

    public final lk3.b aj() {
        if (this.f231979e == null) {
            synchronized (this) {
                if (this.f231979e == null) {
                    this.f231979e = new lk3.b(new jm0.l());
                }
            }
        }
        return this.f231979e;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c bj(java.lang.String id6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return Ui(id6, i17);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66865x76d1ec5a, id6);
        bundle.putInt("type", i17);
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h0.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean cj(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        java.lang.String str = multiTaskInfo.f66791xc8a07680;
        boolean z17 = false;
        z17 = false;
        if ((str == null || str.length() == 0) == true) {
            return false;
        }
        java.lang.String field_id = multiTaskInfo.f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        int i17 = multiTaskInfo.f66793x2262335f;
        if (gm0.j1.a()) {
            m134976x2690a4ac();
        }
        java.lang.String t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f231985n).t(this.f231982h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17) && !this.f231980f) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                return fj(field_id, i17);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66865x76d1ec5a, field_id);
            bundle.putInt("type", i17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i0.class);
            if (c10750x9556b48c != null) {
                return c10750x9556b48c.f149933d;
            }
            return false;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(t17);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                boolean z18 = false;
                for (int i18 = 0; i18 < length; i18++) {
                    try {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                        if (optJSONObject != null) {
                            l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.A;
                            try {
                                java.lang.String string = optJSONObject.getString("field_id");
                                int i19 = optJSONObject.getInt("field_type");
                                c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
                                c16601x7ed0e40c.f66791xc8a07680 = string;
                                c16601x7ed0e40c.f66793x2262335f = i19;
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTaskInfo", e17, "convertJSONObjectToMultiTaskInfo fail, exception:%s", e17);
                                c16601x7ed0e40c = null;
                            }
                            if (c16601x7ed0e40c != null && android.text.TextUtils.equals(c16601x7ed0e40c.f66791xc8a07680, field_id) && c16601x7ed0e40c.f66793x2262335f == i17) {
                                z18 = true;
                            }
                        }
                    } catch (org.json.JSONException e18) {
                        e = e18;
                        z17 = z18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f231978d, e, "load fail, exception:%s", e);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "load, hasTaskInfoByMMKV: " + z17);
                        return z17;
                    }
                }
                z17 = z18;
            }
        } catch (org.json.JSONException e19) {
            e = e19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "load, hasTaskInfoByMMKV: " + z17);
        return z17;
    }

    public final boolean fj(java.lang.String multiTaskId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Zi;
        pk3.h a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskId, "multiTaskId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w0 w0Var = f231976w;
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = null;
        if (w0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31 c16620x3de5dd31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) w0Var;
            if (c16620x3de5dd31.W6()) {
                yk3.i iVar = c16620x3de5dd31.f232126f;
                if (iVar != null && (a17 = iVar.a(0, "MultiTaskForMinusScreen")) != null) {
                    java.util.Iterator it = ((zk3.g0) a17).f554985g.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        if (((uk3.a) next).f510057d.f66791xc8a07680.equals(multiTaskId)) {
                            z17 = true;
                            break;
                        }
                        i18 = i19;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "hasCurrentMultiInfo, id:%s, ret:%b", multiTaskId, java.lang.Boolean.valueOf(z17));
                return z17;
            }
        }
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.f231998z0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
        if (k0Var == null || (Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).Zi(multiTaskId, i17)) == null) {
            lk3.b aj6 = aj();
            if (aj6 != null) {
                c16601x7ed0e40c = aj6.Y6(multiTaskId, i17);
            }
        } else {
            c16601x7ed0e40c = Zi;
        }
        return c16601x7ed0e40c != null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f231992u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(r4, r1, false, false, 6, null) > 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hj(java.lang.String r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.hj(java.lang.String, int, boolean):void");
    }

    public boolean ij() {
        pk3.h a17;
        if (gm0.j1.a()) {
            m134976x2690a4ac();
        }
        if (this.f231980f) {
            return this.f231981g.isEmpty();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w0 w0Var = f231976w;
        if (w0Var != null) {
            yk3.i iVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) w0Var).f232126f;
            if ((iVar == null || (a17 = iVar.a(0, "MultiTaskForMinusScreen")) == null) ? false : ((zk3.g0) a17).f554984f) {
                return !r0.W6();
            }
        }
        java.lang.String t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f231985n).t(this.f231982h);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17) || this.f231980f) {
            try {
                return new org.json.JSONArray(t17).length() <= 0;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f231978d, e17, "load fail, exception:%s", e17);
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var;
            if (!jm0.g.class.isAssignableFrom(ik3.q.class)) {
                throw new java.lang.IllegalArgumentException(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = new p012xc85e97e9.p093xedfae76a.j1(j1Var.getViewModel(), new jm0.e(j1Var)).a(ik3.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            lk3.b U6 = ((ik3.q) ((jm0.g) a18)).U6();
            if ((U6 != null ? U6.Z6(null).isEmpty() : false) && !com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.d.f299039b.d()) {
                return true;
            }
        } else {
            lk3.b aj6 = aj();
            java.util.List Z6 = aj6 != null ? aj6.Z6(null) : null;
            if (Z6 == null || Z6.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void mj(int i17, java.lang.Class cls) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "registerMultiTaskUIC type:" + i17 + " clazzUic:" + cls);
        f231975v.put(java.lang.Integer.valueOf(i17), cls);
    }

    public void nj(java.lang.String str, int i17, boolean z17) {
        if (str != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                hj(str, i17, z17);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66865x76d1ec5a, str);
            bundle.putInt("type", i17);
            bundle.putBoolean("starOpt", z17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.c1.f231958d);
        }
    }

    public final void oj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "restore data from storage");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "account not ready!");
            return;
        }
        if (this.f231980f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "restoreData already done!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.d1(this);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.f231998z0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
        if (k0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).aj(d1Var);
            return;
        }
        lk3.b aj6 = aj();
        if (aj6 != null) {
            aj6.Z6(d1Var);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "onAccountInitialized");
        this.f231980f = false;
        oj();
        if ((this.f231991t || !Ni()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f231985n).getBoolean(this.f231984m, false)) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f231985n).putBoolean(this.f231984m, true);
        long nextInt = new java.util.Random().nextInt(300) * 1000;
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.f1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(f1Var, nextInt, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "doStarSync delay: " + nextInt);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f231978d, "onAccountRelease");
        this.f231979e = null;
        f231976w = null;
        f231977x.clear();
        this.f231980f = false;
        mo48814x2efc64();
        java.lang.String str = this.f231978d;
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f231986o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unregisterMultiTaskBroadcastReceiver");
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).unregisterActivityLifecycleCallbacks(this.f231987p);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16594x7c7d7f3e c16594x7c7d7f3e = this.f231986o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String str = this.f231978d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCreate");
        super.mo8845x3e5a77bb(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.multitask");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(c16594x7c7d7f3e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unregisterMultiTaskBroadcastReceiver");
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        }
        try {
            if (fp.h.a(33)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c16594x7c7d7f3e, intentFilter);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c16594x7c7d7f3e, intentFilter, 4);
            }
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "registerMultiTaskBroadcastReceiver error");
        }
        mo48813x58998cd();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if (((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h)) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.e.f299041b.b(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20561x67f0147b()) == 1);
            }
            java.lang.String str2 = this.f231985n;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str2);
            java.lang.String str3 = this.f231983i;
            this.f231991t = M.getBoolean(str3, false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str2).putBoolean(str3, Ni());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "starModeEnable: " + Ni() + ", lastStarModeEnable: " + this.f231991t);
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerActivityLifecycleCallbacks(this.f231987p);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:28:0x000a, B:5:0x0017, B:6:0x001b, B:8:0x0021, B:11:0x0031), top: B:27:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pj() {
        /*
            r5 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.f231981g
            r2 = 0
            if (r1 == 0) goto L14
            boolean r3 = r1.isEmpty()     // Catch: org.json.JSONException -> L12
            if (r3 != 0) goto L14
            r3 = 1
            goto L15
        L12:
            r1 = move-exception
            goto L38
        L14:
            r3 = r2
        L15:
            if (r3 == 0) goto L43
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L12
        L1b:
            boolean r3 = r1.hasNext()     // Catch: org.json.JSONException -> L12
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: org.json.JSONException -> L12
            ik3.r r3 = (ik3.r) r3     // Catch: org.json.JSONException -> L12
            java.lang.String r4 = r3.f373444a     // Catch: org.json.JSONException -> L12
            int r3 = r3.f373445b     // Catch: org.json.JSONException -> L12
            org.json.JSONObject r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.u0(r4, r3)     // Catch: org.json.JSONException -> L12
            if (r3 == 0) goto L1b
            int r4 = r2 + 1
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L12
            r2 = r4
            goto L1b
        L38:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r3 = r5.f231978d
            java.lang.String r4 = "saveMultiTaskToMMKV fail, exception:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r4, r2)
        L43:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            boolean r1 = gm0.j1.a()
            if (r1 == 0) goto L56
            r5.m134976x2690a4ac()
        L56:
            java.lang.String r1 = r5.f231985n
            com.tencent.mm.sdk.platformtools.o4 r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r1)
            java.lang.String r2 = r5.f231982h
            r1.D(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.pj():void");
    }

    public void qj(int i17, java.lang.String id6, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66865x76d1ec5a, id6);
            bundle.putInt("type", i18);
            bundle.putInt("event_type", i17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.e1(this));
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 c5715x746b0d06 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06();
        am.ak akVar = c5715x746b0d06.f136036g;
        akVar.f87694c = i17;
        akVar.f87693b = i18;
        akVar.f87692a = id6;
        c5715x746b0d06.e();
    }

    public final void rj(java.lang.String id6, int i17, r45.lr4 showData, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Zi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showData, "showData");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.f231998z0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
        if (k0Var == null || (Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).Zi(id6, i17)) == null) {
            lk3.b aj6 = aj();
            if (aj6 != null) {
                c16601x7ed0e40c = aj6.Y6(id6, i17);
            }
        } else {
            c16601x7ed0e40c = Zi;
        }
        if (c16601x7ed0e40c != null) {
            c16601x7ed0e40c.f66794xa783a79b = c01.id.c();
            c16601x7ed0e40c.f66793x2262335f = i17;
            c16601x7ed0e40c.f66792x98981ec = showData;
            if (bArr != null) {
                c16601x7ed0e40c.f66790x225a93cf = bArr;
            }
            lk3.b aj7 = aj();
            if (aj7 != null) {
                com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(aj7, c16601x7ed0e40c, false, false, 6, null);
            }
            ((d73.i) i95.n0.c(d73.i.class)).hb(c16601x7ed0e40c);
        }
    }

    public void wi(java.lang.String id6, int i17, r45.lr4 showData, byte[] bArr, mk3.a multiTaskAddExtarParams) {
        r45.er4 er4Var;
        r45.er4 er4Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showData, "showData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskAddExtarParams, "multiTaskAddExtarParams");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = id6;
        c16601x7ed0e40c.f66793x2262335f = i17;
        c16601x7ed0e40c.f66789xac3be4e = c01.id.c();
        c16601x7ed0e40c.f66794xa783a79b = c01.id.c();
        c16601x7ed0e40c.f66792x98981ec = showData;
        c16601x7ed0e40c.f66790x225a93cf = bArr;
        lk3.b aj6 = aj();
        java.lang.Boolean valueOf = aj6 != null ? java.lang.Boolean.valueOf(aj6.X6(c16601x7ed0e40c)) : null;
        if (multiTaskAddExtarParams.f408674a == null && multiTaskAddExtarParams.f408676c) {
            r45.kr4 kr4Var = new r45.kr4();
            kr4Var.set(6, new r45.er4());
            boolean Ri = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c);
            r45.er4 er4Var3 = (r45.er4) kr4Var.m75936x14adae67(6);
            if (er4Var3 != null) {
                er4Var3.set(1, java.lang.Long.valueOf(Ri ? 1L : 2L));
            }
            kr4Var.set(3, java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f));
            r45.er4 er4Var4 = (r45.er4) kr4Var.m75936x14adae67(6);
            if (er4Var4 != null) {
                er4Var4.set(0, 11L);
            }
            multiTaskAddExtarParams.f408674a = kr4Var;
        }
        nk3.f fVar = nk3.f.f419574a;
        r45.kr4 kr4Var2 = multiTaskAddExtarParams.f408674a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6766x2f928865 c6766x2f928865 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6766x2f928865();
        c6766x2f928865.f140911d = c6766x2f928865.b("ItemId", c16601x7ed0e40c.f66791xc8a07680, true);
        c6766x2f928865.f140912e = fVar.a(c16601x7ed0e40c.f66793x2262335f);
        long j17 = 0;
        c6766x2f928865.f140913f = (kr4Var2 == null || (er4Var2 = (r45.er4) kr4Var2.m75936x14adae67(6)) == null) ? 0L : er4Var2.m75942xfb822ef2(0);
        if (kr4Var2 != null && (er4Var = (r45.er4) kr4Var2.m75936x14adae67(6)) != null) {
            j17 = er4Var.m75942xfb822ef2(1);
        }
        c6766x2f928865.f140914g = j17;
        c6766x2f928865.f140915h = c6766x2f928865.b("ContextId", kr4Var2 != null ? kr4Var2.m75945x2fec8307(0) : null, true);
        c6766x2f928865.f140916i = c6766x2f928865.b("ItemSubId", kr4Var2 != null ? kr4Var2.m75945x2fec8307(4) : null, true);
        c6766x2f928865.k();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f231981g;
        if (b17 && !Bi(id6, i17)) {
            copyOnWriteArrayList.add(0, new ik3.r(id6, i17));
            pj();
            ((d73.i) i95.n0.c(d73.i.class)).vg(c16601x7ed0e40c);
        }
        if (multiTaskAddExtarParams.f408675b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
            j75.f Ai = k0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).Ai() : null;
            if (Ai != null) {
                Ai.B3(new ik3.e(false, c16601x7ed0e40c));
            }
        }
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool);
        java.lang.String str = this.f231978d;
        if (b18) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").getBoolean("multitask_first_add_flag", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskFirstAdd, flag: " + z17);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[enterTips] first Add!");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAdd, flag: true");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").putBoolean("multitask_first_add_flag", true);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAddTime, time: " + currentTimeMillis);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").putLong("multitask_first_add_time", currentTimeMillis);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addTaskInfo, starOpt:" + multiTaskAddExtarParams + ".starOpt, id:" + id6 + ", type:" + i17 + ", success:" + valueOf + ", multiTask: " + c16601x7ed0e40c.mo124851xcc313de3() + ", size: " + copyOnWriteArrayList.size());
    }
}
