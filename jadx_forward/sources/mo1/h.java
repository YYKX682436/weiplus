package mo1;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d f411821d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d) {
        this.f411821d = activityC12849xeea2846d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d = this.f411821d;
        po1.d dVar = activityC12849xeea2846d.f174238o;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Roam.CreateRoamLitePkgUI", "Notify user device is null");
        } else {
            android.widget.Button button = activityC12849xeea2846d.f174236m;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("createBtn");
                throw null;
            }
            button.setEnabled(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.CreateRoamLitePkgUI", "begin save new package");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h hVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h();
            hVar.f297371d = 0L;
            hVar.f297372e = 0;
            java.lang.String str2 = dVar.f438828a;
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.g(false, new mo1.e(f0Var, countDownLatch, str2));
            countDownLatch.await();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.CreateRoamLitePkgUI", "getMaxPackageNumberByDevice maxNumber = " + f0Var.f391649d + ", targetDeviceId=" + str2);
            int i17 = f0Var.f391649d + 1;
            if (i17 <= 1) {
                str = "WXGBACKUPPACKAGEPREFIX_" + activityC12849xeea2846d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwy);
            } else {
                str = "WXGBACKUPPACKAGEPREFIX_" + activityC12849xeea2846d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwz, java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g();
            gVar.f297363e = 0;
            gVar.f297364f = str;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u();
            uVar.f297522e = dVar.f438828a;
            uVar.f297521d = dVar.f438829b.h();
            uVar.f297524g = dVar.b();
            uVar.f297523f = dVar.f438832e;
            gVar.f297365g = uVar;
            gVar.f297366h = oo1.o.f428684a.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12849xeea2846d.f174237n;
            if (c12853x6acde7c9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            gVar.f297367i = c12853x6acde7c9.b();
            gVar.f297368m = 0;
            gVar.f297370o = hVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.CreateRoamLitePkgUI", "Try save package to SDK and backend");
            ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(activityC12849xeea2846d), null, null, new mo1.m(gVar, activityC12849xeea2846d, null), 3, null)).p(new mo1.j(dVar, activityC12849xeea2846d, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12849xeea2846d, activityC12849xeea2846d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwv), false, 3, mo1.n.f411840d)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
