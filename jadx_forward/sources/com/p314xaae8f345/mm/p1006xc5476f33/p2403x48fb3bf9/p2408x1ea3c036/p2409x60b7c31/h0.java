package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class h0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f263858e;

    public h0(sd.b bVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f263857d = bVar;
        this.f263858e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.da daVar;
        com.p314xaae8f345.mm.ui.da daVar2;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f263858e;
        sd.b bVar = this.f263857d;
        if (i17 != 45) {
            if (i17 == 32) {
                if (i18 == -1) {
                    java.lang.String stringExtra = intent.getStringExtra("key_pick_local_media_local_id");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        bVar.c("fail", null);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.a(stringExtra);
                        if (a17 == null || !(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36)) {
                            daVar = null;
                            bVar.c("fail", null);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c19287x4a9b6f36 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36) a17;
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(dm.i4.f66867x2a5c95c7, stringExtra);
                            hashMap.put("duration", java.lang.Integer.valueOf(c19287x4a9b6f36.f264287w));
                            hashMap.put("height", java.lang.Integer.valueOf(c19287x4a9b6f36.f264278q));
                            hashMap.put("size", java.lang.Integer.valueOf(c19287x4a9b6f36.f264276o));
                            hashMap.put("width", java.lang.Integer.valueOf(c19287x4a9b6f36.f264277p));
                            bVar.d(hashMap);
                        }
                    }
                    daVar = null;
                } else if (i18 != 0) {
                    daVar = null;
                    bVar.c("fail", null);
                } else {
                    daVar = null;
                    bVar.c("cancel", null);
                }
                abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
                return;
            }
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra2 = intent.getStringExtra("key_pick_local_media_local_id");
            java.lang.String stringExtra3 = intent.getStringExtra("key_pick_local_media_thumb_local_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "localId:%s", stringExtra2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "thumbLocalId:%s", stringExtra3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                bVar.c("fail", null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.a(stringExtra2);
                if (a18 == null || !(a18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36)) {
                    daVar2 = null;
                    bVar.c("fail", null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c19287x4a9b6f362 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36) a18;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put(dm.i4.f66867x2a5c95c7, stringExtra2);
                    hashMap2.put("duration", java.lang.Integer.valueOf(c19287x4a9b6f362.f264287w));
                    hashMap2.put("height", java.lang.Integer.valueOf(c19287x4a9b6f362.f264278q));
                    hashMap2.put("size", java.lang.Integer.valueOf(c19287x4a9b6f362.f264276o));
                    hashMap2.put("width", java.lang.Integer.valueOf(c19287x4a9b6f362.f264277p));
                    hashMap2.put("thumbLocalId", stringExtra3);
                    bVar.d(hashMap2);
                }
            }
            daVar2 = null;
        } else if (i18 != 0) {
            bVar.c("fail", null);
            daVar2 = null;
        } else {
            bVar.c("cancel", null);
            daVar2 = null;
        }
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar2);
    }
}
