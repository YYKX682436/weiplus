package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.MMKindaFaceRegManagerImpl */
/* loaded from: classes9.dex */
public class C3154x3b0d2263 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3557xac348343 {

    /* renamed from: FACE_ACTION_REQUEST_CODE */
    private static final int f12151xab84d844 = 1;
    private final java.lang.String TAG = "MMKindaFaceRegManagerImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3557xac348343
    /* renamed from: startFaceImpl */
    public void mo25446x2529dc9f(int i17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3622x83841d6f abstractC3622x83841d6f, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, java.lang.String str3) {
        mo25447x2529dc9f(i17, str, str2, abstractC3622x83841d6f, abstractC3623x3b485619, str3, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3557xac348343
    /* renamed from: startFaceImpl */
    public void mo25447x2529dc9f(int i17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3622x83841d6f abstractC3622x83841d6f, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, java.lang.String str3, java.lang.String str4) {
        android.app.Activity m27314x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27314x7608d9c4("com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI");
        if (!(m27314x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) && !(m27314x7608d9c4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKindaFaceRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", m27314x7608d9c4.getClass().getName());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKindaFaceRegManagerImpl", "siScene:%s，strPackage：%s,strPackageSign:%s,otherVerifyTitle:%s，faceVerifyTitle：%s", java.lang.Integer.valueOf(i17), str, str2, str3, str4);
        if (m27314x7608d9c4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02) m27314x7608d9c4;
            activityC19168xd4c44a02.f262626r = true;
            activityC19168xd4c44a02.f262624p = abstractC3622x83841d6f;
            activityC19168xd4c44a02.f262625q = abstractC3623x3b485619;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c76 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76();
            am.jr jrVar = c5925x646e9c76.f136227g;
            jrVar.f88609j = activityC19168xd4c44a02;
            jrVar.f88600a = i17;
            jrVar.f88601b = str;
            jrVar.f88602c = str2;
            jrVar.f88603d = str3;
            jrVar.f88606g = str4;
            jrVar.f88607h = 4;
            c5925x646e9c76.e();
            return;
        }
        com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) m27314x7608d9c4;
        activityC10720x85cbbee2.f149687g = abstractC3622x83841d6f;
        activityC10720x85cbbee2.f149688h = abstractC3623x3b485619;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c762 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76();
        am.jr jrVar2 = c5925x646e9c762.f136227g;
        jrVar2.f88609j = activityC10720x85cbbee2;
        jrVar2.f88600a = i17;
        jrVar2.f88601b = str;
        jrVar2.f88602c = str2;
        jrVar2.f88603d = str3;
        jrVar2.f88606g = str4;
        jrVar2.f88607h = 4;
        c5925x646e9c762.e();
    }
}
