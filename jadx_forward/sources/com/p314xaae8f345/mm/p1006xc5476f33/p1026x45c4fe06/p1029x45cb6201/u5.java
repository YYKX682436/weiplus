package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class u5 implements wu5.j {
    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "PkgNetworkOpt.triggerPreConnect";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        try {
            try {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158753r;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PkgNetworkOpt", e17, "triggerPreConnect", new java.lang.Object[0]);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x5.a(str);
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x5.f157583a = false;
        }
    }
}
