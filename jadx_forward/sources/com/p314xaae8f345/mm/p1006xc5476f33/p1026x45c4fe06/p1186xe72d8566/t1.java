package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s1 f170097a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s1 f170098b;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s0 listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s1 s1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s1 s1Var2 = null;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append(android.os.Environment.DIRECTORY_PICTURES);
            sb6.append(str);
            sb6.append("Screenshots");
            sb6.append(str);
            s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s1(sb6.toString(), listener);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ScreenshotObserverCompact", e17, "<init>, create observer1 fail", new java.lang.Object[0]);
            s1Var = null;
        }
        this.f170097a = s1Var;
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str2 = java.io.File.separator;
            sb7.append(str2);
            sb7.append(android.os.Environment.DIRECTORY_DCIM);
            sb7.append(str2);
            sb7.append("Screenshots");
            sb7.append(str2);
            s1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s1(sb7.toString(), listener);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ScreenshotObserverCompact", e18, "<init>, create observer2 fail", new java.lang.Object[0]);
        }
        this.f170098b = s1Var2;
    }
}
