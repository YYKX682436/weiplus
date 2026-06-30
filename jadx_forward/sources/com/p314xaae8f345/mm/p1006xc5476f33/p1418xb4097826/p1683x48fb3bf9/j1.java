package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class j1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f218410d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f218411e;

    public j1(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f218410d = weakReference;
        this.f218411e = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15496xce3811a4 c15496xce3811a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15496xce3811a4) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1) this.f218410d.get();
        if (n1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack helper == null");
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15496xce3811a4.f218344e);
        java.lang.String str = this.f218411e;
        java.lang.String str2 = c15496xce3811a4.f218344e;
        if (K0 || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack   path error, data.mImagePath:" + str2 + "   path: " + str);
            return;
        }
        java.util.HashMap hashMap = n1Var.f218439j;
        if (hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  remove filePath:".concat(str2));
        }
        if (!c15496xce3811a4.f218345f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  recog is fail:" + str);
            return;
        }
        n1Var.f218440k = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        n1Var.f218441l = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - n1Var.f218442m.longValue());
        java.util.ArrayList arrayList = n1Var.f218430a;
        arrayList.clear();
        java.util.ArrayList arrayList2 = c15496xce3811a4.f218343d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList2.get(0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  :" + arrayList.size());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.z0(n1Var));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName mImageQBarDataList nil");
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList.get(0);
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        int i17 = c17261xe88a6357.f240153e;
        java.lang.String str3 = c17261xe88a6357.f240152d;
        ((jd0.z1) l2Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName");
            kd0.p2 p2Var = n1Var.f218436g;
            int i18 = c17261xe88a6357.f240153e;
            java.lang.String str4 = c17261xe88a6357.f240152d;
            java.lang.String str5 = n1Var.f218438i;
            kd0.f2 f2Var = new kd0.f2(str4);
            f2Var.f388168b = 4;
            f2Var.f388169c = str5;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).i(i18, f2Var);
        }
    }
}
