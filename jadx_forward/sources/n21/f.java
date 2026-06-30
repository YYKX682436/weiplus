package n21;

/* loaded from: classes12.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f415784d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f415785e = new java.util.concurrent.ArrayBlockingQueue(1024);

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        yl.h hVar = new yl.h();
        java.lang.String a17 = n21.c.a();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeexEncoderWorker", "path " + a17);
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(a17);
            java.lang.String str = a18.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a18, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            hVar.b(a17 + this.f415784d + ".temp");
            while (true) {
                java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = (java.util.concurrent.ArrayBlockingQueue) this.f415785e;
                if (arrayBlockingQueue.size() <= 0) {
                    break;
                }
                tl.h0 h0Var = (tl.h0) arrayBlockingQueue.poll();
                if (h0Var.f501581a != null && h0Var.f501582b > 0) {
                    hVar.a(h0Var, 0);
                }
            }
            hVar.d();
            try {
                com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(a17 + this.f415784d + ".temp");
                java.lang.String str2 = a19.f294812f;
                if (str2 != null) {
                    java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l18)) {
                        a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l18, a19.f294813g, a19.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z7 a27 = com.p314xaae8f345.mm.vfs.z7.a(a17 + this.f415784d + ".spx");
                java.lang.String str3 = a27.f294812f;
                if (str3 != null) {
                    java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l19)) {
                        a27 = new com.p314xaae8f345.mm.vfs.z7(a27.f294810d, a27.f294811e, l19, a27.f294813g, a27.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var2 = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m19 = b3Var2.m(a19, null);
                com.p314xaae8f345.mm.vfs.z2 m27 = b3Var2.m(a27, null);
                if (m19.a() && m27.a()) {
                    try {
                        m27.f294799a.t(m27.f294800b, m19.f294799a, m19.f294800b);
                    } catch (java.io.IOException unused) {
                    }
                }
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexEncoderWorker", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
            n21.o.b().c();
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexEncoderWorker", "filename open failed, ", e18);
            return true;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        return false;
    }

    public boolean c(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeexEncoderWorker", "init ");
        ((java.util.concurrent.ArrayBlockingQueue) this.f415785e).clear();
        int i27 = n21.h.f415799g;
        this.f415784d = java.lang.String.format("%s%d_%d_%d_%d", i27 != 1 ? i27 != 2 ? "single_" : "app_" : "chatroom_", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return true;
    }
}
