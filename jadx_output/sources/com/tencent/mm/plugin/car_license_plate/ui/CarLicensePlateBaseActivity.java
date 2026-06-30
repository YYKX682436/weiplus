package com.tencent.mm.plugin.car_license_plate.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class CarLicensePlateBaseActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f94608d = kotlinx.coroutines.z0.b();

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        kotlinx.coroutines.y0 y0Var = this.f94608d;
        if (kotlinx.coroutines.z0.h(y0Var)) {
            kotlinx.coroutines.z0.e(y0Var, null, 1, null);
        }
        super.onDestroy();
    }
}
