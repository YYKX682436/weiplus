package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class f5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f79540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f79541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel f79542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f79543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(android.app.Activity activity, com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f79541e = activity;
        this.f79542f = carLicensePlateListViewContract$ViewModel;
        this.f79543g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.f5(this.f79541e, this.f79542f, this.f79543g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.auth.f5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f79540d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity activity = this.f79541e;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI.class);
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f79542f;
            if (carLicensePlateListViewContract$ViewModel != null) {
                intent.putExtra("INTENT_KEY_VIEW_MODEL", carLicensePlateListViewContract$ViewModel);
            }
            this.f79540d = 1;
            obj = st1.g.c(activity, intent, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.e5 e5Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.e5(this.f79543g, (android.app.Instrumentation.ActivityResult) obj);
        this.f79540d = 2;
        if (st1.g.d(e5Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
