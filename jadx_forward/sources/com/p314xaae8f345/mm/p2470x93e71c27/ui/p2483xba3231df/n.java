package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272513f;

    public n(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar, java.lang.String str, yz5.l lVar) {
        this.f272511d = vVar;
        this.f272512e = str;
        this.f272513f = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar = this.f272511d;
        java.util.ArrayList arrayList = vVar.f272538f;
        java.lang.String str = this.f272512e;
        arrayList.removeIf(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.m(str));
        java.lang.String str2 = vVar.f272536d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherMMKV", "removeShortCupApp: " + str + ", " + str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("recent_use_app_mmkv", 2, null)) != null) {
            r45.j56 j56Var = new r45.j56();
            byte[] j17 = N.j("shortcut:" + str2);
            if (j17 != null) {
                j56Var.mo11468x92b714fd(j17);
            }
            java.util.LinkedList linkedList = j56Var.f459129d;
            if (linkedList != null) {
                linkedList.remove(str);
            }
            N.H("shortcut:" + str2, j56Var.mo14344x5f01b1f6());
        }
        this.f272513f.mo146xb9724478(java.lang.Integer.valueOf(i17));
    }
}
