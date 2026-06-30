package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class k1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, final com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.graphics.PointF pointF;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15499x16f3c825 c15499x16f3c825 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15499x16f3c825) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + c15499x16f3c825.f218349d);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(this, a0Var) { // from class: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "mRecogResultListener callback:");
                if (c5886xd11a0be72 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7) {
                    try {
                        com.p314xaae8f345.mm.vfs.w6.h(c5886xd11a0be72.f136194g.f87901a);
                        java.util.ArrayList a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a.a(c5886xd11a0be72);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15496xce3811a4 c15496xce3811a4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15496xce3811a4(a17, c5886xd11a0be72.f136194g.f87901a, java.lang.Boolean.TRUE);
                        a17.size();
                        rVar.a(c15496xce3811a4);
                        mo48814x2efc64();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.f218429q.mo48814x2efc64();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewLongClickHelper", e17, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.f218429q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(this, a0Var) { // from class: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c72 = c5885x60bd3c7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "delete qb recog fail: %s", c5885x60bd3c72.f136193g.f87811a);
                am.bq bqVar = c5885x60bd3c72.f136193g;
                com.p314xaae8f345.mm.vfs.w6.h(bqVar.f87811a);
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15496xce3811a4(null, bqVar.f87811a, java.lang.Boolean.FALSE));
                mo48814x2efc64();
                abstractC20980x9b9ad01d.mo48814x2efc64();
                return false;
            }
        };
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        java.lang.String str = c15499x16f3c825.f218349d;
        float f17 = c15499x16f3c825.f218351f;
        float f18 = c15499x16f3c825.f218352g;
        if (str == null) {
            pointF = new android.graphics.PointF(f17, f18);
        } else {
            int i17 = c15499x16f3c825.f218353h;
            if (i17 > 0) {
                f17 /= i17;
            }
            int i18 = c15499x16f3c825.f218354i;
            if (i18 > 0) {
                f18 /= i18;
            }
            pointF = new android.graphics.PointF(f17, f18);
        }
        c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(pointF.x));
        c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(pointF.y));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.f218428p;
        am.aq aqVar = c5884x4c2d9184.f136192g;
        aqVar.f87707a = j17;
        aqVar.f87708b = str;
        aqVar.f87711e = true;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.f218429q.mo48813x58998cd();
        c5884x4c2d9184.e();
    }
}
