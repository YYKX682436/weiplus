package rh2;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final rh2.j f477187a = new rh2.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f477188b = kz5.c0.i(new jz5.l("live_ai_assistran_kws_engine_for_android", "libDecoderOff_DNN_arm64.so"), new jz5.l("live_ai_assistrant_kws_so", "libkws_jni.so"), new jz5.l("live_ai_assistant_kws_model", "libwxvoiceembed_bin_zhibo_iter06"));

    public final void a(com.p314xaae8f345.mm.udr.e0 e0Var) {
        java.lang.String m117639xfb83cc9b;
        java.lang.String c17;
        for (jz5.l lVar : f477188b) {
            java.lang.String str = (java.lang.String) lVar.f384366d;
            java.lang.String str2 = (java.lang.String) lVar.f384367e;
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_4e2919fe", str);
            if (Ui != null && (m117639xfb83cc9b = Ui.m117639xfb83cc9b()) != null && (c17 = Ui.c()) != null) {
                java.lang.String str3 = c17 + '/' + str2;
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str3);
                if (!r6Var.m() || r6Var.C() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSResourceLoader", "[ensurePostPath] copying " + str + " -> " + str3);
                    com.p314xaae8f345.mm.vfs.w6.u(c17);
                    try {
                        com.p314xaae8f345.mm.vfs.w6.c(m117639xfb83cc9b, str3);
                        if (!r6Var.m() || r6Var.C() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KWSResourceLoader", "[ensurePostPath] copy result missing/empty: ".concat(str));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSResourceLoader", "[ensurePostPath] ready " + str + ", size=" + r6Var.C());
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KWSResourceLoader", "[ensurePostPath] copyFile threw: " + str + " -> " + str3 + ": " + e17.getMessage());
                    }
                }
            }
        }
    }
}
