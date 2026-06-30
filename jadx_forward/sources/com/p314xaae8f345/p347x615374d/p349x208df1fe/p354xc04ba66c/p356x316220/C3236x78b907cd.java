package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaModalManagerImpl */
/* loaded from: classes9.dex */
public class C3236x78b907cd implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3564x3f5f000d {
    public static final java.lang.String TAG = "MicroMsg.KindaModalManagerImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3564x3f5f000d
    /* renamed from: addModalView */
    public void mo25883x791d5751(com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "kinda call addModalView, modal: %s, %s", abstractC3412xb0aa4810.mo27603xea5dece5(), java.lang.Integer.valueOf(abstractC3412xb0aa4810.hashCode()));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27177x42f2ccdb(abstractC3412xb0aa4810);
    }

    /* renamed from: getPlatformDelegate */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 m25884xa71bee8e() {
        return new com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004() { // from class: com.tencent.kinda.framework.module.impl.KindaModalManagerImpl.2
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004
            /* renamed from: currentPlatform */
            public com.p314xaae8f345.p347x615374d.gen.EnumC3591x7397cc93 mo25887xf60f010c() {
                return com.p314xaae8f345.p347x615374d.gen.EnumC3591x7397cc93.ANDROID;
            }
        };
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3564x3f5f000d
    /* renamed from: removeAllModalViews */
    public void mo25885x9083821e() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27174x4c6f0a7d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3564x3f5f000d
    /* renamed from: removeModalViewImpl */
    public void mo25886x7638c60e(com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "kinda call reremoveModalView, modal: %s, %s", abstractC3412xb0aa4810.mo27603xea5dece5(), java.lang.Integer.valueOf(abstractC3412xb0aa4810.hashCode()));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27173xc84af884(abstractC3412xb0aa4810);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.KindaModalManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        });
    }
}
