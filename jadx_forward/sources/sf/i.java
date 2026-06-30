package sf;

/* loaded from: classes7.dex */
public abstract class i {
    public static gg.c a(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, gg.d dVar, eg.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar) {
        if (!(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d() >= 300)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current version not support extend plugin");
            return null;
        }
        if (c27816xac2547f9 == null || !c27816xac2547f9.m120171x1f05d274()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current webview is not xweb kernel");
        } else {
            android.view.KeyEvent.Callback mo120167xbfee89b7 = c27816xac2547f9.mo120167xbfee89b7();
            if ((mo120167xbfee89b7 instanceof com.p314xaae8f345.p3210x3857dc.i2) && dVar != null) {
                com.p314xaae8f345.p3210x3857dc.i2 i2Var = (com.p314xaae8f345.p3210x3857dc.i2) mo120167xbfee89b7;
                gg.c mo131512x21f05ec7 = dVar.mo131512x21f05ec7();
                sf.h hVar = new sf.h(i2Var);
                hVar.f488475a = mo131512x21f05ec7;
                ((gg.a) mo131512x21f05ec7).f353019c = hVar;
                i2Var.mo120263x3db3fd1a(hVar);
                if (oaVar != null) {
                    hg.h hVar2 = new hg.h(i2Var);
                    hVar2.f362830a = oaVar;
                    i2Var.mo120264xb460a101(hVar2);
                    fg.b0 b0Var = new fg.b0(i2Var);
                    b0Var.f343260d = oaVar;
                    i2Var.mo120262x4537a079(b0Var);
                }
                if (cVar != null) {
                    ((gg.a) mo131512x21f05ec7).f353017a = cVar;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client success");
                return mo131512x21f05ec7;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client fail");
        }
        return null;
    }

    public static void b(gg.c cVar, java.lang.String str, int i17) {
        if (cVar == null || ((gg.a) cVar).f353019c == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyPluginScreenshot, %s#%d", str, java.lang.Integer.valueOf(i17));
        ((gg.a) cVar).f353019c.mo120226xf63e37a0(str, i17);
    }

    public static void c(gg.c cVar, java.lang.String str, int i17, float f17, float f18) {
        if (cVar == null || ((gg.a) cVar).f353019c == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyPluginTextureScale, %s#%d, scale:[%s,%s]", str, java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        ((gg.a) cVar).f353019c.mo120225xc0b8afc4(str, i17, f17, f18);
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        return java.lang.String.format(java.util.Locale.US, "%s#%d", str, java.lang.Integer.valueOf(i17));
    }
}
