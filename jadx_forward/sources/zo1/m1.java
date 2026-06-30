package zo1;

/* loaded from: classes5.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556223d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e) {
        this.f556223d = activityC12868xd8a7d79e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556223d;
        java.lang.Object obj = null;
        if (activityC12868xd8a7d79e.f174360s == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CreatePackageUI", "Notify user device is null");
            android.widget.TextView textView = activityC12868xd8a7d79e.f174349e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
                throw null;
            }
            textView.setTextColor(activityC12868xd8a7d79e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            android.widget.TextView textView2 = activityC12868xd8a7d79e.f174349e;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
                throw null;
            }
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.oez);
        } else {
            android.widget.Button button = activityC12868xd8a7d79e.f174355n;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("createBtn");
                throw null;
            }
            button.setEnabled(false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12868xd8a7d79e, activityC12868xd8a7d79e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwv), false, 3, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            po1.d dVar = activityC12868xd8a7d79e.f174360s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            h0Var.f391656d = dVar;
            zo1.t1 t1Var = new zo1.t1(h0Var, activityC12868xd8a7d79e);
            fo1.d dVar2 = fo1.d.f346391a;
            if (dVar2.b(dVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "The target device is a unbind online PC/MAC. device=" + h0Var.f391656d);
                if (dVar2.c((po1.d) h0Var.f391656d)) {
                    po1.d device = (po1.d) h0Var.f391656d;
                    zo1.p1 p1Var = new zo1.p1(h0Var, t1Var, activityC12868xd8a7d79e, f17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).bj(uuid, device.f438834g, 8000L, new fo1.c(p1Var, device));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "PC/MAC client version is not satisfied.");
                    t1Var.mo152xb9724478();
                    android.content.Intent intent = new android.content.Intent(activityC12868xd8a7d79e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC12868xd8a7d79e, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI", "onCreateBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC12868xd8a7d79e.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC12868xd8a7d79e, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI", "onCreateBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    android.widget.Button button2 = activityC12868xd8a7d79e.f174355n;
                    if (button2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("createBtn");
                        throw null;
                    }
                    button2.setEnabled(true);
                    f17.dismiss();
                }
            } else if (ro1.v.f479547a.f((po1.d) h0Var.f391656d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Start bind a new device=" + h0Var.f391656d + " before create package");
                po1.d deviceInfo = (po1.d) h0Var.f391656d;
                zo1.q1 q1Var = new zo1.q1(f17, h0Var, t1Var, activityC12868xd8a7d79e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
                if (deviceInfo.f438829b != po1.g.f438843h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDiskDeviceManager", "[addUDiskDevice] error device type, " + deviceInfo.f438829b);
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    java.util.Iterator it = so1.b.f491759a.d().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) next).f438833f, deviceInfo.f438833f)) {
                            obj = next;
                            break;
                        }
                    }
                    po1.d dVar3 = (po1.d) obj;
                    if (dVar3 != null) {
                        java.lang.String str2 = deviceInfo.f438832e;
                        java.lang.String str3 = deviceInfo.f438834g;
                        deviceInfo.d(dVar3.f438832e);
                        java.lang.String str4 = dVar3.f438834g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                        deviceInfo.f438834g = str4;
                        ro1.k kVar = new ro1.k(q1Var, deviceInfo, str2, str3, activityC12868xd8a7d79e);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskDeviceDelegate", "[addUDiskDevice] device=" + deviceInfo);
                        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        ((ku5.t0) ku5.t0.f394148d).q(new so1.f(deviceInfo, kVar));
                    } else {
                        android.content.Intent intent2 = new android.content.Intent(activityC12868xd8a7d79e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034.class);
                        intent2.putExtra("deviceInfo", deviceInfo.c());
                        ((com.p314xaae8f345.mm.ui.bd) activityC12868xd8a7d79e.m78751x5dc77fb5(intent2)).f279410a = new to1.e(q1Var);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Device is already bind, create package ");
                ((ku5.t0) ku5.t0.f394148d).g(new zo1.r1(t1Var, activityC12868xd8a7d79e, h0Var, f17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
