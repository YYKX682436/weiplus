package l32;

/* loaded from: classes13.dex */
public class x implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 z1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 z1Var2;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 z1Var3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2 a2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2.INSTANCE;
        a2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        r45.iq3 iq3Var = null;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene == null, do scene failed : %d, %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            android.app.ProgressDialog progressDialog = a2Var.f180379d;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            a2Var.f180379d.dismiss();
            a2Var.f180379d = null;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        int i27 = 0;
        if (m1Var.mo808xfb85f7b0() != 539) {
            if (m1Var.mo808xfb85f7b0() == 6693) {
                a2Var.f180381f = false;
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s, %s, %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    return;
                }
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", java.lang.Long.valueOf(currentTimeMillis));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("exdevice_kv").putLong(gm0.j1.b().h() + "_iot", currentTimeMillis);
                com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j2) m1Var).f180476e;
                if (oVar != null && (fVar = oVar.f152244b.f152233a) != null) {
                    iq3Var = (r45.iq3) fVar;
                }
                if (iq3Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "nsResp == null, bind iot device");
                    return;
                }
                java.util.Iterator it = iq3Var.f458798e.iterator();
                while (it.hasNext()) {
                    r45.of4 of4Var = ((r45.pf4) it.next()).f464541i;
                    if (of4Var != null && ((i19 = of4Var.f463758e) == 4011 || i19 == 13000 || i19 == 13001)) {
                        i27++;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "storage_device_count=%s, device_cnt=%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(iq3Var.f458797d));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "device_list_size:%d", java.lang.Integer.valueOf(iq3Var.f458798e.size()));
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.x1(a2Var, i27, iq3Var), "updateIotDevice");
                return;
            }
            return;
        }
        a2Var.f180380e = false;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s, %s, %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.lang.ref.WeakReference weakReference = a2Var.f180382g;
            if (weakReference != null && (z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1) weakReference.get()) != null) {
                z1Var.a(false);
            }
            android.app.ProgressDialog progressDialog2 = a2Var.f180379d;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            a2Var.f180379d.dismiss();
            a2Var.f180379d = null;
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h2) m1Var).f180450e;
        r45.sb3 sb3Var = (oVar2 == null || (fVar2 = oVar2.f152244b.f152233a) == null) ? null : (r45.sb3) fVar2;
        if (sb3Var == null || (linkedList = sb3Var.f467140e) == null) {
            java.lang.ref.WeakReference weakReference2 = a2Var.f180382g;
            if (weakReference2 != null && (z1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1) weakReference2.get()) != null) {
                z1Var2.a(false);
            }
            android.app.ProgressDialog progressDialog3 = a2Var.f180379d;
            if (progressDialog3 == null || !progressDialog3.isShowing()) {
                return;
            }
            a2Var.f180379d.dismiss();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "hard device_cnt:%d", java.lang.Integer.valueOf(linkedList.size()));
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.y1(a2Var, sb3Var));
        java.lang.ref.WeakReference weakReference3 = a2Var.f180382g;
        if (weakReference3 != null && (z1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1) weakReference3.get()) != null) {
            z1Var3.a(true);
        }
        android.app.ProgressDialog progressDialog4 = a2Var.f180379d;
        if (progressDialog4 == null || !progressDialog4.isShowing()) {
            return;
        }
        a2Var.f180379d.dismiss();
        a2Var.f180379d = null;
    }
}
