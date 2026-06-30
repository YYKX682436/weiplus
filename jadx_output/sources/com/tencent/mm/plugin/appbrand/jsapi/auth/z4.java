package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class z4 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j5 f79813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79814b;

    public z4(com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var, com.tencent.mm.plugin.appbrand.y yVar) {
        this.f79813a = j5Var;
        this.f79814b = yVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(resultData, "resultData");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCarLicensePlateChooserViewController", "prompt onMsg, resultCode:" + i17 + ", id:" + i18 + "  userAgreementChecked:" + z17);
        com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var = this.f79813a;
        boolean z18 = true;
        if (1 != i17) {
            j5Var.f79607h.f61921i = 4L;
            j5Var.f79608i.a();
            return;
        }
        com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = j5Var.h().f94623d;
        java.lang.String str = (mMCarLicensePlateInfo == null || (arrayList = mMCarLicensePlateInfo.f94604d) == null) ? null : (java.lang.String) kz5.n0.a0(arrayList, i18);
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCarLicensePlateChooserViewController", "prompt onMsg, invalid avatarId(index):" + i18);
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.auth.y4(str, this.f79814b, z17, null), 3, null);
            j5Var.f79607h.f61921i = 3L;
            j5Var.f79608i.b(str);
        }
    }
}
