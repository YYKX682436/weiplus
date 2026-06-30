package i53;

/* loaded from: classes8.dex */
public class a3 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f370049a;

    public a3(i53.d3 d3Var) {
        this.f370049a = d3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0
    public void a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        i53.d3 d3Var = this.f370049a;
        if (!((java.util.HashSet) d3Var.f370085f).contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "onFinish, not in uploadingList, localId: %s", str);
            return;
        }
        int size = d3Var.f370081b.size();
        float f17 = size;
        final float f18 = (((size - r0) / f17) + ((1.0f / f17) * (i18 / 100.0f))) * 0.95f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "onProgress, localId : %s, percent : %d, initSize : %d, uploadingSize : %d, uploadProgress : %f", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(((java.util.HashSet) d3Var.f370085f).size() + ((java.util.HashSet) d3Var.f370086g).size()), java.lang.Float.valueOf(f18));
        d3Var.getClass();
        java.util.Iterator it = m33.s0.f404863a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            final java.lang.String str3 = d3Var.f370080a;
            if (!hasNext) {
                fs.g.b(m33.x1.class, new fs.o() { // from class: m33.s0$$b
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        java.lang.String str4 = str3;
                        float f19 = f18;
                        ((ah0.w0) ((m33.x1) nVar)).getClass();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("postId", str4);
                            jSONObject.put("percent", f19);
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "onPublishHaowanProgress");
                            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
                            ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, tw4.a.class, null);
                            if (!((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                                return false;
                            }
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("onPublishHaowanProgress", jSONObject);
                            return false;
                        } catch (java.lang.Exception e17) {
                            java.lang.String obj = e17.toString();
                            int i19 = rl.b.f478676a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HaowanPublishStateEvent", obj, null);
                            return false;
                        }
                    }
                });
                return;
            }
            m33.w1 w1Var = (m33.w1) it.next();
            if (w1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.g0) w1Var;
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("game_haowan_publish_post_id", str3);
                    bundle.putFloat("game_haowan_publish_progress", f18);
                    java.util.Iterator it6 = ((java.util.ArrayList) g0Var.f265065a.f265019i).iterator();
                    while (it6.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it6.next()).f265328d.mo70207xf5bc2045(255, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
                }
            }
        }
    }
}
