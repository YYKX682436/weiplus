package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class va extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.va f268113d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.va();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f268114e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f268115f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (((java.util.HashMap) msg.f422323a).isEmpty()) {
            env.f422396d.e(msg.f422546c, "quickSendRedPacket:fail missing arguments", null);
        }
        f268114e = env;
        f268115f = msg;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("materialId");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] JsApiQuickSendRedPacket start Content: " + env.f422393a);
        android.content.Context context = env.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z3 z3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4.f264447i;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] normal activity: " + str + " 、" + str2);
            z3Var.a(hy4.a0.f367609i);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27809, 1, str, str, "", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            android.content.Context context2 = env.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2;
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(this);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Intent Ni = ((qd0.q0) e1Var).Ni(abstractActivityC21394xb3d2c0cf, string);
            Ni.putExtra("KQuickSendRedPacketSessionId", str2);
            Ni.putExtra("KQuickSendRedPacketMaterialId", str);
            Ni.putExtra("key_from", 4);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.j) ((mh0.n) i95.n0.c(mh0.n.class))).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
            pf5.j0.a(Ni, fb3.e.class);
            pf5.j0.a(Ni, fb3.b.class);
            abstractActivityC21394xb3d2c0cf.startActivityForResult(Ni, 215);
        } else if ((context instanceof com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) && (context instanceof q80.z)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] liteapp: " + str + " 、" + str2);
            z3Var.a(hy4.a0.f367609i);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27809, 1, str, str, "", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            java.lang.Object obj = env.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) obj).R1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ta.f268080a);
            android.content.Context context3 = env.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ext.ui.SwipeBackActivity");
            com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) context3;
            rd0.e1 e1Var2 = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string2 = env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.content.Intent Ni2 = ((qd0.q0) e1Var2).Ni(activityC10454x40355150, string2);
            Ni2.putExtra("KQuickSendRedPacketSessionId", str2);
            Ni2.putExtra("KQuickSendRedPacketMaterialId", str);
            Ni2.putExtra("key_from", 4);
            ((pg0.d3) ((qg0.c0) i95.n0.c(qg0.c0.class))).getClass();
            if (((j05.f) i95.n0.c(j05.f.class)) != null) {
                pf5.j0.a(Ni2, fb3.e.class);
                pf5.j0.a(Ni2, fb3.b.class);
            }
            activityC10454x40355150.startActivityForResult(Ni2, 215);
        } else if ((context instanceof com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64) && (context instanceof q80.z)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] WxaLiteAppTransparentBaseUI: " + str + " 、" + str2);
            z3Var.a(hy4.a0.f367609i);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27809, 1, str, str, "", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            java.lang.Object obj2 = env.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) obj2).R1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ua.f268094a);
            android.content.Context context4 = env.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context4, "null cannot be cast to non-null type com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI");
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64 activityC3720xaf400c64 = (com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64) context4;
            rd0.e1 e1Var3 = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string3 = env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            android.content.Intent Ni3 = ((qd0.q0) e1Var3).Ni(activityC3720xaf400c64, string3);
            Ni3.putExtra("KQuickSendRedPacketSessionId", str2);
            Ni3.putExtra("KQuickSendRedPacketMaterialId", str);
            Ni3.putExtra("key_from", 4);
            ((pg0.d3) ((qg0.c0) i95.n0.c(qg0.c0.class))).getClass();
            if (((j05.f) i95.n0.c(j05.f.class)) != null) {
                pf5.j0.a(Ni3, fb3.e.class);
                pf5.j0.a(Ni3, fb3.b.class);
            }
            activityC3720xaf400c64.startActivityForResult(Ni3, 215);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33744x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0.f34639x24728b;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[mmOnActivityResult] requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data: ");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", sb6.toString());
        if (i17 != 215 || i18 != -1 || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] unknow case");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] cancel");
            nw4.k kVar = f268114e;
            if (kVar != null) {
                nw4.y2 y2Var = f268115f;
                kVar.f422396d.e(y2Var != null ? y2Var.f422546c : null, "quickSendRedPacket:selectSessionCancel ", null);
                return;
            }
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] unknow error");
            nw4.k kVar2 = f268114e;
            if (kVar2 != null) {
                nw4.y2 y2Var2 = f268115f;
                kVar2.f422396d.e(y2Var2 != null ? y2Var2.f422546c : null, "quickSendRedPacket:unknown ", null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] pay success");
        nw4.k kVar3 = f268114e;
        if (kVar3 != null) {
            nw4.y2 y2Var3 = f268115f;
            kVar3.f422396d.e(y2Var3 != null ? y2Var3.f422546c : null, "quickSendRedPacket:ok", null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4.f264447i.a(hy4.a0.f367610m);
        }
    }
}
