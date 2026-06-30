package ho1;

/* loaded from: classes5.dex */
public final class f0 implements com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f364200d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f364200d = binding.mo137508x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().a(true);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2.Companion.m91656x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f364200d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().a(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onDetachedFromActivity");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f364200d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().a(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onDetachedFromActivityForConfigChanges");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2.Companion.m91656x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f364200d = binding.mo137508x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().a(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onReattachedToActivityForConfigChanges");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2
    /* renamed from: openSAFDirTree */
    public void mo91651x535d68bd(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f364200d;
        if (activity == null) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "Device is not initialize, try to get a new device from system");
        java.util.List b17 = ro1.v.f479547a.b();
        if (((java.util.ArrayList) b17).isEmpty()) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_no_udisk_devices")));
            return;
        }
        po1.d a17 = po1.d.a((po1.d) kz5.n0.i0(b17), null, null, null, null, "/", null, null, 111, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "Open saf ui and request permission. rootDevice=" + a17);
        android.content.Intent d17 = to1.g.f502444a.d(a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        wo1.l1.f529519a.a(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78751x5dc77fb5(d17)).f279410a = new ho1.z(callback, activity);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2
    /* renamed from: openSAFDirTreeOfDevice */
    public void mo91652x8603daea(com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.C24732x4829d59a deviceInfo, yz5.l callback) {
        po1.d e17;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f364200d == null) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_context_null")));
            return;
        }
        ro1.v vVar = ro1.v.f479547a;
        java.util.List b17 = vVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Count of available devices is ");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        if (arrayList.isEmpty()) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_no_udisk_devices")));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(deviceInfo.m91678xbdf72787(), "deviceId@roam-at")) {
            e17 = oo1.j.f428678a.a();
        } else {
            java.lang.String m91678xbdf72787 = deviceInfo.m91678xbdf72787();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m91678xbdf72787);
            e17 = vVar.e(m91678xbdf72787);
            if (e17 == null) {
                java.lang.String m91678xbdf727872 = deviceInfo.m91678xbdf72787();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m91678xbdf727872);
                po1.f fVar = po1.g.f438839d;
                java.lang.Long m91682x1cd0bea6 = deviceInfo.m91682x1cd0bea6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m91682x1cd0bea6);
                po1.g a17 = fVar.a((int) m91682x1cd0bea6.longValue());
                java.lang.String m91679xe01341da = deviceInfo.m91679xe01341da();
                java.lang.String str = m91679xe01341da == null ? "" : m91679xe01341da;
                java.lang.String m91681x2716c7ec = deviceInfo.m91681x2716c7ec();
                java.lang.String str2 = m91681x2716c7ec == null ? "" : m91681x2716c7ec;
                java.lang.String m91680x1cce9391 = deviceInfo.m91680x1cce9391();
                java.lang.String str3 = m91680x1cce9391 == null ? "" : m91680x1cce9391;
                java.lang.String m91683x1cd0a707 = deviceInfo.m91683x1cd0a707();
                java.lang.String str4 = m91683x1cd0a707 == null ? "" : m91683x1cd0a707;
                java.lang.String m91684x337c437b = deviceInfo.m91684x337c437b();
                e17 = new po1.d(m91678xbdf727872, a17, str, str2, str3, str4, m91684x337c437b == null ? "" : m91684x337c437b);
            }
        }
        android.app.Activity activity = this.f364200d;
        if (e17.f438833f.length() == 0) {
            java.lang.String str5 = ((po1.d) kz5.n0.i0(b17)).f438833f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
            e17.f438833f = str5;
        }
        android.content.Intent d17 = to1.g.f502444a.d(po1.d.a(e17, null, null, null, null, "/", null, null, 111, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        wo1.l1.f529519a.a(null);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78751x5dc77fb5(d17)).f279410a = new ho1.c0(callback, e17, activity);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamFloatWindowHelper", "Remove float window");
            java.lang.ref.WeakReference weakReference = wo1.l1.f529520b;
            if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                ((android.view.WindowManager) systemService).removeView(view);
                wo1.l1.f529520b = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackup.FlutterBackupPlugin", "openSAFDirTreeOfDevice error", e18);
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_path_error")));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2
    /* renamed from: selectConversationByName */
    public void mo91653xac1d3c01(java.util.List alreadySelected, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alreadySelected, "alreadySelected");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f364200d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationByName activity is null");
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12871x42f7168f.class);
        intent.putExtra("contactListShowSize", true);
        intent.putExtra("contactListSortType", 3);
        intent.putExtra("titile", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzg));
        intent.putExtra("already_select_contact", (java.lang.String[]) alreadySelected.toArray(new java.lang.String[0]));
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174471f;
        intent.putExtra("reportPageId", 4L);
        intent.putExtra("contactListPushDownAnim", true);
        pf5.j0.a(intent, ap1.g.class);
        pf5.j0.a(intent, ap1.o0.class);
        pf5.j0.a(intent, ap1.x0.class);
        pf5.j0.a(intent, ap1.x1.class);
        pf5.j0.a(intent, ap1.f1.class);
        pf5.j0.a(intent, ap1.p1.class);
        pf5.j0.a(intent, ap1.u1.class);
        pf5.j0.a(intent, ap1.b2.class);
        ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78751x5dc77fb5(intent)).f279410a = new ho1.d0(callback);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2877xf0ae4398.InterfaceC24724xc3635c2
    /* renamed from: selectConversationBylabel */
    public void mo91654xd930dc5e(java.util.List alreadySelected, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alreadySelected, "alreadySelected");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f364200d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationlabels activity is null");
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(alreadySelected.size());
        java.util.Iterator it = alreadySelected.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        intent.putStringArrayListExtra("label_id", arrayList);
        intent.setClassName(activity, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78751x5dc77fb5(intent)).f279410a = new ho1.e0(callback);
    }
}
