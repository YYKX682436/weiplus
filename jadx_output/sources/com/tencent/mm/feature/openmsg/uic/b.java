package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class b extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgAppBrandMultiSelectPreProcessUIC", "dispatch collection:" + appBrandOpenMaterialCollection);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eb0.b(appBrandOpenMaterialCollection, null, list, true));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.a(this));
        }
    }
}
