package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.MMKindaFinderRegManagerImpl */
/* loaded from: classes9.dex */
public class C3155xb36c092c implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3558xa22b4e8c {
    private final java.lang.String TAG = "MicorMsg.MMFinderRegManagerImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3558xa22b4e8c
    /* renamed from: startFinderFeeds */
    public void mo25448x2b41404d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MMFinderRegManagerImpl", "startFinderProfile feedid：%s，nonceid：%s", str, str2);
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (!(m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MMFinderRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", m27313x7608d9c4.getClass().getName());
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(m27313x7608d9c4, str, str2, true, 16, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.a(1));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3558xa22b4e8c
    /* renamed from: startFinderProfile */
    public void mo25449x87ad6d61(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MMFinderRegManagerImpl", "startFinderProfile username：%s", str);
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (!(m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) && !m27313x7608d9c4.getClass().getName().contains(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MMFinderRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", m27313x7608d9c4.getClass().getName());
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).xj(m27313x7608d9c4, str, 16, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.a(1));
    }
}
