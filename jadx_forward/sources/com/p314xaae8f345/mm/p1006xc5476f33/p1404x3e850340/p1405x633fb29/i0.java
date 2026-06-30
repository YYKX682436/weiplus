package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes.dex */
public class i0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5926x7e298318 c5926x7e298318 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5926x7e298318) abstractC20979x809547d1;
        boolean z17 = false;
        if (c5926x7e298318 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
        am.lr lrVar = c5926x7e298318.f136229g;
        android.content.Context context = lrVar.f88798a;
        android.os.Bundle bundle = lrVar.f88799b;
        int i17 = lrVar.f88800c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectManager", "start wx internal face verify");
        if (context != null && bundle != null) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.f218776i;
            bundle.putBoolean("face_permission_check", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.U6(context, bundle, i17);
            z17 = true;
        }
        am.mr mrVar = c5926x7e298318.f136230h;
        mrVar.f88892a = z17;
        if (!z17) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            mrVar.f88893b = bundle2;
            bundle2.putInt("err_code", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4);
            mrVar.f88893b.putString("err_msg", "face detect not support");
        }
        return true;
    }
}
