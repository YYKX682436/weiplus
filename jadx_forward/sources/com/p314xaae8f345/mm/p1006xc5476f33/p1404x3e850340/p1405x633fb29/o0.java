package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes11.dex */
public class o0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5929xbd8235e5 c5929xbd8235e5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5929xbd8235e5) abstractC20979x809547d1;
        boolean z17 = false;
        if (c5929xbd8235e5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceStartManageListener", "hy: event is null");
            return false;
        }
        android.content.Context context = c5929xbd8235e5.f136234g.f89273a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectManager", "hy: start face manage process");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectManager", "hy: context is null. abort");
        } else if (yVar.d(true)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13525xb56e3034.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/model/FaceDetectManager", "startFaceManageProcess", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/facedetect/model/FaceDetectManager", "startFaceManageProcess", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectManager", "hy: not support face detect. abort");
        }
        c5929xbd8235e5.f136235h.f89369a = z17;
        return true;
    }
}
