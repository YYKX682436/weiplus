package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMenuListHelper$QBarLogicTask */
/* loaded from: classes8.dex */
class C19262x4cc4d1e implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f263661d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f263662e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f263663f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageMenuListHelper$QBarLogicTask.1
        {
            this.f39173x3fe91575 = 812146647;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
            if (!(c5886xd11a0be72 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7)) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19262x4cc4d1e c19262x4cc4d1e = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19262x4cc4d1e.this;
            java.util.Map map = c19262x4cc4d1e.f263662e;
            if (map != null) {
                c5886xd11a0be72.f136194g.getClass();
                if (!((java.util.HashMap) map).containsKey(0L)) {
                    return false;
                }
            }
            java.util.Map map2 = c19262x4cc4d1e.f263662e;
            if (map2 != null) {
                c5886xd11a0be72.f136194g.getClass();
                ((java.util.HashMap) map2).remove(0L);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
            java.lang.String e17 = s6Var.e(c5886xd11a0be72);
            int c17 = s6Var.c(c5886xd11a0be72);
            int d17 = s6Var.d(c5886xd11a0be72);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("file_path", c5886xd11a0be72.f136194g.f87901a);
            bundle.putString("result", e17);
            bundle.putInt("code_type", c17);
            bundle.putInt("code_version", d17);
            c19262x4cc4d1e.f263661d.a(bundle);
            return false;
        }
    };

    private C19262x4cc4d1e() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f263661d = rVar;
        int i17 = bundle.getInt("type");
        java.lang.String string = bundle.getString("img_path");
        if (i17 == 1) {
            if (this.f263662e == null) {
                this.f263662e = new java.util.HashMap();
                this.f263663f.mo48813x58998cd();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
            am.aq aqVar = c5884x4c2d9184.f136192g;
            aqVar.f87707a = currentTimeMillis;
            aqVar.f87708b = string;
            c5884x4c2d9184.e();
            ((java.util.HashMap) this.f263662e).put(java.lang.Long.valueOf(currentTimeMillis), string);
            return;
        }
        if (i17 != 2) {
            return;
        }
        java.util.Map map = this.f263662e;
        if (map == null || !((java.util.HashMap) map).containsValue(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarLogicTask", "%s is not recognizing", string);
            return;
        }
        java.util.Iterator it = ((java.util.HashMap) this.f263662e).keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            if (((java.lang.String) ((java.util.HashMap) this.f263662e).get(java.lang.Long.valueOf(longValue))).equals(string)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1 c5226x932022f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1();
                c5226x932022f1.f135559g.f89219a = longValue;
                c5226x932022f1.e();
                ((java.util.HashMap) this.f263662e).remove(java.lang.Long.valueOf(longValue));
            }
        }
    }
}
