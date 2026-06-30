package d30;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d30.a f307660d;

    public b(d30.a aVar) {
        this.f307660d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.io.OutputStream H;
        if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_delete_egg_spring_media, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "clear useless media.");
            com.p314xaae8f345.mm.vfs.w6.f(d30.a.f307655e);
            com.p314xaae8f345.mm.vfs.w6.f(d30.a.f307656f);
            return;
        }
        this.f307660d.getClass();
        java.lang.String str = d30.a.f307657g;
        try {
            java.io.InputStream open = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("innerLuckyBag.wxam");
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                if (!r6Var.m()) {
                    r6Var.s().J();
                    try {
                        H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EggSpringFeatureService", e17, "open dst err!!!", new java.lang.Object[0]);
                        z17 = false;
                    }
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = open.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    H.write(bArr, 0, read);
                                }
                            }
                            z17 = true;
                        } catch (java.io.IOException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EggSpringFeatureService", e18, "copy err!!!", new java.lang.Object[0]);
                            z17 = false;
                        }
                        if (H != null) {
                            H.close();
                        }
                        if (!z17) {
                            com.p314xaae8f345.mm.vfs.w6.h(str);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "copy result!!![%s].", java.lang.Boolean.valueOf(z17));
                        if (open == null) {
                            return;
                        }
                    } catch (java.lang.Throwable th6) {
                        if (H != null) {
                            try {
                                H.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } else if (open == null) {
                    return;
                }
                open.close();
            } finally {
            }
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EggSpringFeatureService", e19, "open loading_lucky_bag file err!!!", new java.lang.Object[0]);
        }
    }
}
