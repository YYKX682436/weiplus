package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f164263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.i f164265f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.i iVar, java.lang.ref.WeakReference weakReference, int i17) {
        this.f164265f = iVar;
        this.f164263d = weakReference;
        this.f164264e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.i.f164269g.get();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
                try {
                    str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h.class)).f149939d;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiGetRegionData", e17, "query updated address path", new java.lang.Object[0]);
                    str = null;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiGetRegionData", "MMProcessExist==FALSE, will fallback assets file");
                str = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "read file use updatedAddressPath[%s]", str);
                try {
                    str2 = com.p314xaae8f345.mm.vfs.w6.M(str);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiGetRegionData", e18, "read address from file %s", str);
                    str2 = null;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "read file use assets");
                try {
                    str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("address"));
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiGetRegionData", e19, "read address from assets", new java.lang.Object[0]);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiGetRegionData", "get invalid data");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "update process shared data, size[%d]", java.lang.Integer.valueOf(str2.length()));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.i.f164269g.set(str2);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "use process shared cache, size[%d]", java.lang.Integer.valueOf(str2.length()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f164263d.get();
        if (v5Var == null || !v5Var.mo50262x39e05d35()) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2);
        v5Var.a(this.f164264e, this.f164265f.p("ok", hashMap));
    }
}
