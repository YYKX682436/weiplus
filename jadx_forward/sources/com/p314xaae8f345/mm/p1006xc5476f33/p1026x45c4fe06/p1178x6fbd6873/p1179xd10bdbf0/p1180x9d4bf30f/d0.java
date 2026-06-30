package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 f169110a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 e0Var) {
        this.f169110a = e0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g4
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 e0Var = this.f169110a;
        boolean z17 = android.provider.Settings.System.getInt(e0Var.f169115b.getContentResolver(), "accelerometer_rotation", 0) == 0;
        java.lang.String str = e0Var.f169114a;
        java.util.Objects.toString(f4Var2);
        if (!z17 && e0Var.f169116c != f4Var2) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.f0 f0Var : e0Var.f169119f) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f4Var2);
                tf.a aVar = (tf.a) f0Var;
                aVar.getClass();
                java.util.Objects.toString(f4Var2);
                tf.c cVar = aVar.f500312a;
                if (!cVar.b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, not in foreground");
                } else if (cVar.f500323d && cVar.f500324e) {
                    java.lang.ref.WeakReference weakReference = cVar.f500322c;
                    if (weakReference == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, mPageViewRef is null");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
                        if (v5Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, thePageView is null");
                        } else {
                            xi1.g mo48803xee5260a9 = v5Var.mo32091x9a3f0ba2().mo48803xee5260a9();
                            if (mo48803xee5260a9 == null || !mo48803xee5260a9.mo51620x1ab1e3d4()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w0 a17 = cVar.f500321b.a();
                                int i17 = cVar.f500320a.f334030d;
                                a17.getClass();
                                v5Var.toString();
                                f4Var2.toString();
                                int ordinal = f4Var2.ordinal();
                                java.lang.String str2 = ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? null : "landscape" : "landscapeLeft" : "portrait";
                                if (str2 != null) {
                                    java.util.HashMap hashMap = new java.util.HashMap(2);
                                    hashMap.put("viewId", java.lang.Integer.valueOf(i17));
                                    hashMap.put("orientation", str2);
                                    java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOnVideoOrientationChanged", "dispatch, name: " + a17.k() + ", data: " + jSONObject);
                                    a17.f163907f = jSONObject;
                                    a17.v(v5Var, v5Var.mo50260x9f1221c2());
                                    a17.m();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = v5Var.v3();
                                    if (v37 != null) {
                                        a17.f163907f = jSONObject;
                                        a17.v(v37, v5Var.mo50260x9f1221c2());
                                        a17.m();
                                    }
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged: disable autoRotationEnabled for pad compat mode");
                            }
                        }
                    }
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f4Var2);
            e0Var.f169116c = f4Var2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f4Var2);
        e0Var.getClass();
    }
}
