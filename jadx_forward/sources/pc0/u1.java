package pc0;

@j95.b
/* loaded from: classes4.dex */
public final class u1 extends i95.w implements qc0.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f434849d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f434850e = new java.util.HashSet();

    public void Ai(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileOptService", "markBizUseFinish ".concat(str));
        this.f434849d.add(str);
        wi(str);
    }

    public void Bi(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileOptService", "markComponentUseFinish ".concat(str));
        this.f434850e.add(str);
        wi(str);
    }

    public final void wi(java.lang.String str) {
        java.util.HashSet hashSet = this.f434849d;
        if (hashSet.contains(str)) {
            java.util.HashSet hashSet2 = this.f434850e;
            if (hashSet2.contains(str)) {
                hashSet.remove(str);
                hashSet2.remove(str);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_clean_enale_v2, true)) {
                    dw3.h hVar = dw3.h.f325744a;
                    com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                    java.lang.String o17 = lp0.b.h0("media").o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    if (r26.n0.B(str, o17, true)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.String str2 = "MEDIA_FILE-" + java.lang.System.currentTimeMillis();
                        dw3.k kVar = dw3.k.f325752a;
                        kVar.c(str, str2);
                        dw3.c0.f325715a.j(str);
                        kVar.e(str, java.lang.System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            }
        }
    }
}
