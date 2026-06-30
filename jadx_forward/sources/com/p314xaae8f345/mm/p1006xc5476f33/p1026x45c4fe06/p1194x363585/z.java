package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c f170754d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c) {
        this.f170754d = c12596x96aa9e2c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c = this.f170754d;
        try {
            java.lang.String str = c12596x96aa9e2c.f170513f;
            if (str != null) {
                java.lang.Class.forName(str).newInstance();
            }
            java.lang.String str2 = c12596x96aa9e2c.f170514g;
            if (str2 != null) {
                java.lang.Class.forName(str2).newInstance();
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "run: ", e17);
        }
    }
}
