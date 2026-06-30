package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class u9 implements k91.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157529b;

    public u9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v9 v9Var, java.lang.String str, int i17) {
        this.f157528a = str;
        this.f157529b = i17;
    }

    @Override // k91.q1
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54 c11895xe75b4e54;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "CommonConfigManager.getConfig config:%s", str);
        java.lang.String str2 = this.f157528a;
        int i17 = this.f157529b;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.f159954a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMToClientEventCenter", "notify appId:%s, type:%d, config:%s", str2, java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.f159954a;
        synchronized (hashMap2) {
            c11895xe75b4e54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54) hashMap2.get(str2);
        }
        if (c11895xe75b4e54 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
            return;
        }
        synchronized (c11895xe75b4e54) {
            c11895xe75b4e54.f159914f = 3;
            c11895xe75b4e54.f159915g = str2;
            c11895xe75b4e54.f159916h = i17;
            c11895xe75b4e54.f159917i = str;
            c11895xe75b4e54.c();
        }
    }
}
