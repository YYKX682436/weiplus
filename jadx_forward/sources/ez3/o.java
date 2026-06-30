package ez3;

/* loaded from: classes12.dex */
public class o implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class);
        q0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "onSceneEnd errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (m1Var.mo808xfb85f7b0() == 294) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0) m1Var;
            int i19 = e0Var.f240412h;
            if (i17 != 0 || i18 != 0) {
                if (q0Var.f240659p.containsKey(java.lang.Integer.valueOf(i19)) && q0Var.f240660q.containsKey(java.lang.Integer.valueOf(i19))) {
                    ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i19))).f141283i = java.lang.System.currentTimeMillis() - ((java.lang.Long) q0Var.f240660q.get(java.lang.Integer.valueOf(i19))).longValue();
                    ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i19))).f141280f = 5L;
                    ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i19))).k();
                    q0Var.f240659p.remove(java.lang.Integer.valueOf(i19));
                    q0Var.f240660q.remove(java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(q0Var.f240659p.size()), java.lang.Integer.valueOf(q0Var.f240660q.size()));
                }
                q0Var.fj(i19);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "TranslationSpr useNewCgi: %d newOcrmt: %s", 1, java.lang.String.valueOf(e0Var.f240417p));
            if (e0Var.f240417p) {
                q0Var.hj(i19, e0Var, q0Var.f240661r);
                return;
            }
            java.util.List list = e0Var.f240411g;
            if (list == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PluginScanTranslation", "startTranslation, translationInfos is null, sessionId: " + i19);
                return;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "session %d, angle %f, translationInfos length %d", java.lang.Integer.valueOf(i19), java.lang.Float.valueOf(e0Var.H()), java.lang.Integer.valueOf(linkedList.size()));
            if (q0Var.f240659p.containsKey(java.lang.Integer.valueOf(i19))) {
                ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i19))).f141282h = java.lang.System.currentTimeMillis() - e0Var.f240413i;
            }
            if (linkedList.size() <= 0 || !q0Var.f240658o.containsKey(java.lang.Integer.valueOf(i19))) {
                if (q0Var.f240659p.containsKey(java.lang.Integer.valueOf(i19)) && q0Var.f240660q.containsKey(java.lang.Integer.valueOf(i19))) {
                    ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i19))).f141283i = java.lang.System.currentTimeMillis() - ((java.lang.Long) q0Var.f240660q.get(java.lang.Integer.valueOf(i19))).longValue();
                }
                q0Var.fj(i19);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2) q0Var.f240658o.get(java.lang.Integer.valueOf(i19));
            if (p2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginScanTranslation", "startTranslation, record is null, sessionId: " + i19);
            } else {
                p2Var.f240510c = e0Var.f240417p ? e0Var.f240422u : ((r45.xv4) e0Var.f240409e.f152244b.f152233a).f472034h;
                p2Var.f240511d = e0Var.I();
                boolean z17 = e0Var.f240417p;
                p2Var.f240512e = z17 ? e0Var.f240424w : ((r45.xv4) e0Var.f240409e.f152244b.f152233a).f472036m;
                p2Var.f240514g = e0Var.f240415n;
                p2Var.f240515h = e0Var.f240416o;
                p2Var.f240516i = z17 ? e0Var.f240418q : "";
                p2Var.f240517j = z17 ? e0Var.f240419r : "";
                e04.w2 aj6 = q0Var.aj();
                float H = e0Var.H();
                java.lang.String str2 = p2Var.f240509b;
                e04.v2 v2Var = q0Var.f240661r;
                aj6.getClass();
                if (i19 != 0 && linkedList.size() > 0 && v2Var != null) {
                    android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, new android.graphics.BitmapFactory.Options());
                    if (J2 == null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.r0) v2Var).v5(i19, null);
                    } else {
                        if (aj6.f327682a != 0 && i19 != aj6.f327682a) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", java.lang.Integer.valueOf(aj6.f327682a), java.lang.Integer.valueOf(i19));
                            aj6.f327682a = 0;
                            aj6.f327683b = null;
                        }
                        aj6.f327682a = i19;
                        aj6.f327683b = v2Var;
                        new e04.u2(aj6, i19, list, H, J2).f(new java.lang.Void[0]);
                    }
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i19));
            if (c6797x4bb2039 != null) {
                c6797x4bb2039.f141280f = 1L;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginScanTranslation", "startTranslation, report is null, sessionId: " + i19);
        }
    }
}
