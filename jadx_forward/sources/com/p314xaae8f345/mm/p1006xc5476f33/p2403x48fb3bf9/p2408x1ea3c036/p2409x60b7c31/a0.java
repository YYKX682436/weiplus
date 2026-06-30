package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class a0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.b0 f263783e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.b0 b0Var, sd.b bVar) {
        this.f263783e = b0Var;
        this.f263782d = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f263783e.hashCode() & 65535)) {
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("key_pick_local_media_show_memory_warning", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(booleanExtra));
            java.util.HashMap hashMap = new java.util.HashMap();
            if (booleanExtra) {
                hashMap.put("memoryWarning", java.lang.Boolean.TRUE);
            }
            sd.b bVar = this.f263782d;
            if (i18 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_pick_local_pic_callback_local_ids") : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    bVar.b("fail", hashMap);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "localIds = %s", stringExtra);
                    hashMap.put("localIds", stringExtra);
                    java.lang.String stringExtra2 = intent.getStringExtra("key_pick_local_pic_source_type");
                    if (stringExtra2 != null) {
                        hashMap.put("sourceType", stringExtra2);
                    }
                    bVar.d(hashMap);
                }
            } else if (i18 != 0) {
                bVar.b("fail", hashMap);
            } else {
                bVar.b("cancel", hashMap);
            }
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d).m78545xde66c1f2(null);
        }
    }
}
