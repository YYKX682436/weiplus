package xu4;

@j95.b
/* loaded from: classes8.dex */
public final class e extends i95.w implements ur.m {
    public void wi() {
        xu4.g gVar = xu4.g.f538820a;
        com.p314xaae8f345.mm.vfs.r6 p17 = ((uv4.b) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(10)).p();
        java.util.Properties properties = new java.util.Properties();
        if (p17.A()) {
            try {
                java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(p17);
                try {
                    properties.load(C);
                    vz5.b.a(C, null);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(properties.get("supportPreloadJSApi"), "1")) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_emotion_search_preload_webview, 0) == 1) {
                su4.v2.a().b(gVar.a(kz5.c1.l(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "71"), new jz5.l("isPreload", "1"))), false, 2);
            }
        }
    }
}
