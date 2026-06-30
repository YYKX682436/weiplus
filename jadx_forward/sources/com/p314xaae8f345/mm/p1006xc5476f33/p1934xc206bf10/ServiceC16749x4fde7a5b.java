package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* renamed from: com.tencent.mm.plugin.normsg.NormsgDataService */
/* loaded from: classes13.dex */
public final class ServiceC16749x4fde7a5b extends com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f233933f = 0;

    @Override // com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d
    public void b(int i17, android.os.Bundle bundle, android.os.Bundle bundle2) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        java.lang.String str;
        if (bundle != null) {
            bundle.setClassLoader(getApplicationContext().getClassLoader());
        }
        boolean z17 = false;
        if (i17 == 1) {
            java.lang.String string = bundle.getString("package_name");
            try {
                android.content.pm.PackageManager packageManager = getApplicationContext().getPackageManager();
                str = packageManager.getApplicationInfo(string, 0).loadLabel(packageManager).toString();
            } catch (java.lang.Throwable unused) {
                str = "";
            }
            bundle2.putString("result", str);
            return;
        }
        fo3.s sVar = fo3.s.INSTANCE;
        int i18 = 2;
        if (i17 == 2) {
            try {
                z17 = sVar.o5();
            } catch (java.lang.Throwable unused2) {
            }
            bundle2.putBoolean("result", z17);
            return;
        }
        if (i17 == 3) {
            try {
                i18 = sVar.yi();
            } catch (java.lang.Throwable unused3) {
            }
            bundle2.putInt("result", i18);
            return;
        }
        if (i17 == 4) {
            try {
                bArr5 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.g((android.content.Intent) bundle.getParcelable("a_k_i"));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgDS", "run m4 error: " + th6);
                bArr5 = new byte[0];
            }
            bundle2.putByteArray("result", bArr5);
            return;
        }
        if (i17 == 5) {
            try {
                bArr4 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.i(bundle.getInt("a_k_d_i"), bundle.getString("a_k_d_n"), bundle.getLong("a_k_t"), bundle.getInt("a_k_d_e_t"), bundle.getString("a_k_d_o_p"));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgDS", "run m5 error: " + th7);
                bArr4 = new byte[0];
            }
            bundle2.putByteArray("result", bArr4);
            return;
        }
        if (i17 == 6) {
            try {
                bArr3 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.c(bundle.getLong("a_k_r_t"), ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397) bundle.getParcelable("a_k_c_s")).c(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb) bundle.getParcelable("a_k_a_m_s")).b(), bundle.getLong("a_k_pr_r_t"), ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397) bundle.getParcelable("a_k_pr_c_s")).c(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb) bundle.getParcelable("a_k_pr_a_m_s")).b());
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgDS", "run m6 error: " + th8);
                bArr3 = new byte[0];
            }
            bundle2.putByteArray("result", bArr3);
            return;
        }
        if (i17 == 7) {
            try {
                bArr2 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.h(bundle.getByteArray("a_k_a_r_i_f_o"));
            } catch (java.lang.Throwable th9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgDS", "run m7 error: " + th9);
                bArr2 = new byte[0];
            }
            bundle2.putByteArray("result", bArr2);
            return;
        }
        if (i17 != 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgDS", "unknown op: %s", java.lang.Integer.valueOf(i17));
            return;
        }
        int i19 = bundle.getInt("a_k_r_c");
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("a_k_c_r_r");
        int i27 = bundle.getInt("a_k_v_a_f_c");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (parcelableArrayList != null) {
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda.C2835xfd2e56d4 c2835xfd2e56d4 = (com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda.C2835xfd2e56d4) it.next();
                    arrayList.add(new com.p314xaae8f345.mm.p975xc206bf10.j(c2835xfd2e56d4.f127346d, c2835xfd2e56d4.f127347e, c2835xfd2e56d4.f127348f));
                }
            }
            bArr = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.j(i19, arrayList, i27);
        } catch (java.lang.Throwable th10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgDS", "run m8 error: " + th10);
            bArr = new byte[0];
        }
        bundle2.putByteArray("result", bArr);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.mm.p975xc206bf10.o.a(fo3.s.INSTANCE.C9());
    }
}
