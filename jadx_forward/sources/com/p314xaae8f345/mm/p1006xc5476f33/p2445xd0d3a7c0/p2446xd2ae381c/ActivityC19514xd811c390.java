package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wenote/flutter/WeNoteFlutterUI;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI */
/* loaded from: classes12.dex */
public final class ActivityC19514xd811c390 extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f269644v = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f269645u = "";

    public final void a7() {
        if (isChangingConfigurations()) {
            ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f269645u);
            if (wi6 != null) {
                ((ez4.u) wi6).f339479e = true;
            }
        }
    }

    public final void b7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "setWindowStyle: orientation=" + i17);
        if (i17 == 2) {
            getWindow().addFlags(1024);
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            getWindow().clearFlags(1024);
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        cz4.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "finish: ");
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f269645u);
        if (wi6 != null && (fVar = ((ez4.u) wi6).a().f326998c) != null) {
            fVar.p();
        }
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02cb, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bf A[Catch: all -> 0x033c, TryCatch #1 {all -> 0x033c, blocks: (B:119:0x0277, B:121:0x0295, B:129:0x02aa, B:132:0x02b7, B:134:0x02bf, B:141:0x02da, B:144:0x02ed, B:147:0x02fa, B:150:0x0307, B:153:0x031b, B:156:0x0328, B:176:0x02cd), top: B:118:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b5  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r37, int r38, android.content.Intent r39) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f269645u);
        if (wi6 != null) {
            ez4.u uVar = (ez4.u) wi6;
            uVar.b().getClass();
            boolean z17 = false;
            if (hz4.b0.a().f367915a) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_x));
                u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                u1Var.a(true);
                u1Var.q(false);
                z17 = true;
            }
            if (z17 || uVar.a().a(true)) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "onConfigurationChanged: orientation=" + newConfig.orientation);
        b7(newConfig.orientation);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.lang.String str;
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f269645u);
        a7();
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "onDestroy: isChangingConfigurations=" + isChangingConfigurations());
        if (wi6 != null) {
            ez4.u uVar = (ez4.u) wi6;
            dz4.v3 v3Var = (dz4.v3) ((jz5.n) uVar.f339499y).mo141623x754a37bb();
            java.lang.String str2 = v3Var.f326971b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onActivityDestroy");
            dz4.i iVar = ((ez4.u) v3Var.f326970a).f339475a;
            boolean z17 = iVar.f326824b;
            hz4.i iVar2 = iVar.f326833k;
            int i17 = iVar2 != null ? iVar2.f367959b : 0;
            java.lang.String str3 = iVar2 != null ? iVar2.f367958a : null;
            if (iVar2 == null || (str = iVar2.a(iVar.f326834l)) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6448xa7d86d81 c6448xa7d86d81 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6448xa7d86d81();
            c6448xa7d86d81.f137881d = i17;
            c6448xa7d86d81.f137882e = c6448xa7d86d81.b("sessionID", str3, true);
            c6448xa7d86d81.f137883f = c6448xa7d86d81.b("noteid", str, true);
            c6448xa7d86d81.f137885h = z17 ? 1 : 0;
            c6448xa7d86d81.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "report14789: openNoteFrom=" + i17 + ", owner=" + (z17 ? 1 : 0) + ", noteId=" + str + ", sessionId=" + str3);
            dz4.y1 a17 = uVar.a();
            cz4.f fVar = a17.f326998c;
            if (fVar != null) {
                fVar.o0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = a17.f326999d;
            if (eVar != null) {
                eVar.f269665x.clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "onDestroy");
            }
            a17.f326999d = null;
            dz4.l3 l3Var = (dz4.l3) ((jz5.n) uVar.f339489o).mo141623x754a37bb();
            if (p3325xe03a0797.p3326xc267989b.z0.h((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) l3Var.f326877a).mo141623x754a37bb())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMsgDownloadHelper", "onActivityDestroy: cancel coroutineScope");
                p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) l3Var.f326877a).mo141623x754a37bb(), null, 1, null);
            }
            ((dz4.k1) ((jz5.n) uVar.f339488n).mo141623x754a37bb()).a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "onPause: isChangingConfigurations=" + isChangingConfigurations());
        a7();
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f269645u);
        if (wi6 != null) {
            dz4.y1 a17 = ((ez4.u) wi6).a();
            cz4.f fVar = a17.f326998c;
            if (fVar != null) {
                fVar.z();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = a17.f326999d;
            if (eVar != null) {
                eVar.A();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "onResume: ");
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f269645u);
        if (wi6 != null) {
            dz4.y1 a17 = ((ez4.u) wi6).a();
            cz4.f fVar = a17.f326998c;
            if (fVar != null) {
                fVar.x();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = a17.f326999d;
            if (eVar != null) {
                eVar.z();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        a7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterUI", "onStop: isChangingConfigurations=" + isChangingConfigurations());
    }
}
