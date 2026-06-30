package fm;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.udr.e0.class})
/* loaded from: classes13.dex */
public final class d0 extends i95.w {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.vfs.r6[] G2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        if (c06.e.f119249d.e(1, 101) <= 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w Zi = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Zi("ilinkres_9f0a6b36");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab c6693xbd9eeeab = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab();
            c6693xbd9eeeab.f140306d = gm0.j1.b().n() ? 1 : 0;
            c6693xbd9eeeab.f140307e = c6693xbd9eeeab.b("userLanguage", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
            c6693xbd9eeeab.f140308f = c6693xbd9eeeab.b("systemLanguage", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274381b.toString(), true);
            c6693xbd9eeeab.f140311i = c6693xbd9eeeab.b("curResVersion", "96b2c56e4056b923191227d71602c0ce", true);
            fm.a[] aVarArr = fm.a.f345494d;
            c6693xbd9eeeab.f140309g = 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("preloadListSize", (Zi == null || (linkedList2 = Zi.f299119d) == null) ? 0 : linkedList2.size());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (Zi != null && (linkedList = Zi.f299119d) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x) it.next()).m117638xfb82e301());
                }
            }
            jSONObject.put("preloadListName", jSONArray);
            k65.l lVar = k65.l.f386150a;
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var = j65.b.f379451g;
                if (r6Var.m() && (G = r6Var.G()) != null) {
                    java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(G);
                    while (true) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
                        if (!bVar.hasNext()) {
                            break;
                        }
                        com.p314xaae8f345.mm.vfs.r6 r6Var2 = (com.p314xaae8f345.mm.vfs.r6) bVar.next();
                        if (r6Var2.y() && (G2 = r6Var2.G()) != null) {
                            if ((G2.length == 0) ^ true) {
                                jSONArray2.put(r6Var2.m82467xfb82e301());
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMBaseStringConstant", th6, "getLocalResourceFileList", new java.lang.Object[0]);
            }
            jSONObject.put("localUnCompressResourceList", jSONArray2);
            jSONObject.put("localUnCompressResource", !j65.b.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) ? 1 : 0);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6693xbd9eeeab.p(r26.i0.t(jSONObject2, ",", ";", false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMBaseStringResFeatureService", "onAccountInitialized report coverage, struct: " + c6693xbd9eeeab.n());
            c6693xbd9eeeab.k();
        }
        ((ku5.t0) ku5.t0.f394148d).g(fm.c0.f345508d);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMBaseStringResFeatureService", "onCreate");
    }
}
