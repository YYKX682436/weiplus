package s65;

/* loaded from: classes11.dex */
public class s0 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r65.a f485047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 f485048b;

    public s0(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9, r65.a aVar) {
        this.f485048b = c20973x553f78a9;
        this.f485047a = aVar;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        if (sVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 52L, 1L, true);
            iz5.a.g("updater invalid assert", false);
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(34);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9 = this.f485048b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "go to update, isSilenceDownload:%s", java.lang.Boolean.valueOf(c20973x553f78a9.f273860h));
        if (!fp.m.c().equals("mounted")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater", "no sdcard.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 53L, 1L, true);
            c20973x553f78a9.f273860h = false;
        }
        r65.a aVar = this.f485047a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = aVar.f474600d.f152244b.f152233a;
        int i17 = ((r45.wp3) fVar).f470899f;
        java.lang.String str = ((r45.wp3) fVar).f470903m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        uk.m a17 = uk.m.a(str);
        uk.l lVar = a17 != null ? (uk.l) ((java.util.HashMap) a17.f510040b).get(k35.o1.a(c20973x553f78a9.getContext())) : null;
        if (lVar != null) {
            i17 += lVar.f510038e;
        }
        if (!fp.i.c(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater", "no enough space.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 54L, 1L, true);
            c20973x553f78a9.f273860h = false;
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "channel pack, not silence download.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 55L, 1L, true);
            c20973x553f78a9.f273860h = false;
        }
        int i18 = c20973x553f78a9.f273856d;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = aVar.f474600d;
        if (i18 == 2 && !c20973x553f78a9.f273861i) {
            java.lang.String a18 = s65.o0.a();
            if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(((r45.wp3) oVar.f152244b.f152233a).f470898e, false) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18) && a18.equals(((r45.wp3) oVar.f152244b.f152233a).f470898e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "we already have this pack %s being to install, just ignore this update request", a18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 56L, 1L, true);
                return;
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8.f240142d) {
            r45.wp3 wp3Var = (r45.wp3) oVar.f152244b.f152233a;
            wp3Var.f470904n = 1;
            wp3Var.f470905o = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
            wp3Var.f470906p = com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8.f240143e ? 1 : 0;
        }
        r45.wp3 wp3Var2 = (r45.wp3) oVar.f152244b.f152233a;
        if (wp3Var2 != null && wp3Var2.f470904n != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wp3Var2.f470905o)) {
            java.lang.String str2 = wp3Var2.f470905o;
            android.content.Context context = c20973x553f78a9.getContext();
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572067xu);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            intent.putExtra("rawUrl", str2);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.setFlags(872415232);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(c20973x553f78a9.getContext(), 0, intent, fp.g0.a(268435456));
            z2.k0 k0Var = new z2.k0(c20973x553f78a9.getContext(), "reminder_channel_id");
            k0Var.m(null);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f(string);
            k0Var.e("");
            k0Var.f550996g = activity;
            notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            android.app.Notification b17 = k0Var.b();
            b17.flags |= 16;
            ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, b17);
            s65.o0.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 57L, 1L, true);
            return;
        }
        if (c20973x553f78a9.f273860h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService checkcontrol");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 58L, 1L, true);
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
            s65.r0 r0Var = new s65.r0(this, sVar);
            c20973x553f78a9.f273862m = r0Var;
            r1Var.a(725, r0Var);
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.q0(0));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "gonna start AppUpdaterUI");
            android.content.Intent intent2 = new android.content.Intent(c20973x553f78a9.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.class);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.a(c20973x553f78a9, intent2, sVar, aVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "current updateType : %s", java.lang.Integer.valueOf(c20973x553f78a9.f273856d));
            if (c20973x553f78a9.f273856d == 1) {
                intent2.putExtra("intent_extra_download_mode", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 60L, 1L, true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 61L, 1L, true);
                intent2.putExtra("intent_extra_download_mode", 1);
            }
            android.content.Context context2 = c20973x553f78a9.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/sandbox/updater/Updater$3", "onSceneEnd", "(Lcom/tencent/mm/network/IDispatcher;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/sandbox/updater/Updater$3", "onSceneEnd", "(Lcom/tencent/mm/network/IDispatcher;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (c20973x553f78a9.f273856d != 3) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().r(262145, true);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b.a();
    }
}
