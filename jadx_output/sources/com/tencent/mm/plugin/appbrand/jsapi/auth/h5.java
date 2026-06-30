package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j5 f79576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var) {
        super(1);
        this.f79576d = j5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        android.app.Instrumentation.ActivityResult it = (android.app.Instrumentation.ActivityResult) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int resultCode = it.getResultCode();
        android.content.Intent resultData = it.getResultData();
        if (-1 == resultCode && resultData != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = resultData.getStringArrayListExtra("RESULT_KEY_UPDATED_LIST");
            com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var = this.f79576d;
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel h17 = j5Var.h();
            com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = h17.f94623d;
            if (mMCarLicensePlateInfo == null || (arrayList = mMCarLicensePlateInfo.f94604d) == null) {
                arrayList = new java.util.ArrayList();
            }
            androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new rt1.s0(arrayList, stringArrayListExtra == null ? new java.util.ArrayList<>() : stringArrayListExtra), true);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            a17.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.g5(c0Var));
            if (c0Var.f310112d) {
                h17.b(stringArrayListExtra);
                j5Var.b(h17.f94623d);
            }
        }
        return jz5.f0.f302826a;
    }
}
