package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaWebServiceImpl */
/* loaded from: classes4.dex */
public class C3250x7161fb0e implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3574x13dbbce {
    private static final java.lang.String TAG = "MicroMsg.KindaWebServiceImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3574x13dbbce
    /* renamed from: preLoad */
    public void mo25938xecf5e229(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "preload Url:" + str);
        if (str.length() == 0) {
            return;
        }
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f556516a = str;
        i0Var.f556518c = 175;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i0Var);
        ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
    }
}
