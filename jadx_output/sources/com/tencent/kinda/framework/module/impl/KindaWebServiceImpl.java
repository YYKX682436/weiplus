package com.tencent.kinda.framework.module.impl;

/* loaded from: classes4.dex */
public class KindaWebServiceImpl implements com.tencent.kinda.gen.KindaWebService {
    private static final java.lang.String TAG = "MicroMsg.KindaWebServiceImpl";

    @Override // com.tencent.kinda.gen.KindaWebService
    public void preLoad(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "preload Url:" + str);
        if (str.length() == 0) {
            return;
        }
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f474983a = str;
        i0Var.f474985c = 175;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i0Var);
        ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
    }
}
