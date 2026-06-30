package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@j95.b
/* loaded from: classes8.dex */
public final class p1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232012d = "MicroMsg.MultiTask.PluginMultiTaskService";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f232013e = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m1(this);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16597xbfe45137 f232014f;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.multitask.PluginMultiTaskService$multiTaskLatestDeleteListener$1] */
    public p1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f232014f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06>(a0Var) { // from class: com.tencent.mm.plugin.multitask.PluginMultiTaskService$multiTaskLatestDeleteListener$1
            {
                this.f39173x3fe91575 = -1085760746;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 c5715x746b0d06) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 event = c5715x746b0d06;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ak akVar = event.f136036g;
                if (akVar == null || akVar.f87694c != 6) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1.this.f232012d, "NotifyLatestMultiTaskDeleteEvent callback");
                tk3.t.f501480o.a().m(0);
                return true;
            }
        };
    }

    public boolean Ai() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di();
    }

    public android.graphics.Point Bi() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).getClass();
        return new android.graphics.Point(0, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232027k);
    }

    public int Di(java.lang.String id6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).f231981g.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            ik3.r rVar = (ik3.r) it.next();
            if (rVar.f373445b == i17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f373444a, id6)) {
                break;
            }
            i18++;
        }
        if (i18 == -1) {
            return 0;
        }
        return i18;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0 Ni() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s1.f232035d.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h2.f231971d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h2.f231972e;
        if (h2Var == null) {
            synchronized (t1Var) {
                h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h2.f231972e;
                if (h2Var == null) {
                    h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h2();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h2.f231972e = h2Var;
                }
            }
        }
        return h2Var;
    }

    public boolean Ri(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).cj(multiTaskInfo);
    }

    public void Ui(android.os.Bundle bundle, r45.k97 webMultiTaskData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webMultiTaskData, "webMultiTaskData");
        webMultiTaskData.set(4, bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        webMultiTaskData.set(5, bundle.getString("webpageTitle"));
        webMultiTaskData.set(6, java.lang.Boolean.valueOf(bundle.getBoolean("hide_option_menu")));
        webMultiTaskData.set(7, java.lang.Boolean.valueOf(bundle.getBoolean("translate_webview")));
        webMultiTaskData.set(8, bundle.getString("srcUsername"));
        webMultiTaskData.set(9, bundle.getString("srcDisplayname"));
        webMultiTaskData.set(10, java.lang.Integer.valueOf(bundle.getInt("mode")));
        webMultiTaskData.set(11, bundle.getString("KTemplateId"));
        webMultiTaskData.set(12, bundle.getString("KPublisherId"));
        webMultiTaskData.set(13, java.lang.Integer.valueOf(bundle.getInt("KOpenArticleSceneFromScene")));
        webMultiTaskData.set(14, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.mm.ui.w2.f292727g)));
        webMultiTaskData.set(15, java.lang.Integer.valueOf(bundle.getInt("pay_channel")));
        webMultiTaskData.set(16, java.lang.Integer.valueOf(bundle.getInt("key_download_restrict")));
        webMultiTaskData.set(17, java.lang.Integer.valueOf(bundle.getInt("key_wallet_region")));
        webMultiTaskData.set(18, bundle.getString("key_function_id"));
        webMultiTaskData.set(19, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.mm.ui.w2.f292730j, -1)));
        webMultiTaskData.set(20, java.lang.Integer.valueOf(bundle.getInt("geta8key_scene")));
        webMultiTaskData.set(25, bundle.getString("ad_ux_info_for_jsapi_pay"));
        webMultiTaskData.set(26, java.lang.Boolean.valueOf(bundle.getBoolean("key_menu_hide_expose")));
        webMultiTaskData.set(27, bundle.getString("webviewCurrentProcess"));
        webMultiTaskData.set(1, bundle.getString("rawUrl"));
    }

    public void Vi(int i17, java.lang.String id6, int i18, java.lang.String processName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if ((processName.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(processName, bm5.f1.a())) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 c5715x746b0d06 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06();
                am.ak akVar = c5715x746b0d06.f136036g;
                akVar.f87694c = i17;
                akVar.f87693b = i18;
                akVar.f87692a = id6;
                c5715x746b0d06.b(android.os.Looper.getMainLooper());
                return;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66865x76d1ec5a, id6);
        bundle.putInt("type", i18);
        bundle.putInt("event_type", i17);
        if (processName.length() == 0) {
            processName = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(processName, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.o1(this));
    }

    public void Zi(java.lang.String id6, int i17, r45.lr4 showData, android.graphics.Bitmap bitmap, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showData, "showData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class));
        i1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTaskInfoByBitmap id:");
        sb6.append(id6);
        sb6.append(" type:");
        sb6.append(i17);
        sb6.append(" bitmap:");
        jz5.f0 f0Var = null;
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getByteCount()) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = i1Var.f231978d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            showData.set(7, java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
            java.lang.String b17 = u0Var.b(id6);
            if (bitmap != null) {
                if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                    com.p314xaae8f345.mm.vfs.w6.h(b17);
                }
                n11.a.b().p(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.f232034a.a(b17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232040b));
                if (!u0Var.a(bitmap, "", b17)) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, b17, false);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
                        showData.set(7, java.lang.Boolean.TRUE);
                    }
                }
            } else {
                showData.set(7, java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.vfs.w6.j(b17)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateTaskInfoByBitmap showData defaultBg mainProcess");
            }
            i1Var.rj(id6, i17, showData, bArr);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        showData.set(7, java.lang.Boolean.FALSE);
        if (bitmap != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            sb8.append(lp0.b.h0("multitask").o());
            sb8.append('/');
            sb8.append(id6);
            java.lang.String sb9 = sb8.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb9)) {
                com.p314xaae8f345.mm.vfs.w6.h(sb9);
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb9, false);
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "", new java.lang.Object[0]);
                showData.set(7, java.lang.Boolean.TRUE);
            }
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, sb9);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateTaskInfoByBitmap showData defaultBg");
        }
        bundle.putString(dm.i4.f66865x76d1ec5a, id6);
        bundle.putInt("type", i17);
        bundle.putByteArray("showData", showData.mo14344x5f01b1f6());
        bundle.putByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l2.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.g1(i1Var));
    }

    public void aj(java.lang.String id6, int i17, r45.lr4 showData, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showData, "showData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class));
        i1Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            i1Var.rj(id6, i17, showData, bArr);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66865x76d1ec5a, id6);
        bundle.putInt("type", i17);
        bundle.putByteArray("showData", showData.mo14344x5f01b1f6());
        bundle.putByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k2.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h1(i1Var));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f232013e.m43071x58998cd();
        if (((km0.c) gm0.j1.p().a()).a()) {
            mo48813x58998cd();
            if (bm5.o1.f104252a.i(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20565x9bf7e437(), 0) == 1) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").putBoolean(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di() ? "multitask_new_tips_show" : "multitask_tips_show", false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232012d, "onAccountInitialized");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f232013e.m43072x2efc64();
        if (((km0.c) gm0.j1.p().a()).a()) {
            mo48814x2efc64();
            tk3.t.f501480o.a().m(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232012d, "onAccountReleased");
    }

    public void wi(java.lang.String id6, int i17, r45.lr4 showData, android.graphics.Bitmap bitmap, byte[] bArr, r45.kr4 kr4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showData, "showData");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).Ai(id6, i17, showData, bitmap, bArr, new mk3.a(kr4Var, false, false, 6, null));
    }
}
