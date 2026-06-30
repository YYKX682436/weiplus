package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class d extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatch collection:");
        sb6.append(appBrandOpenMaterialCollection);
        sb6.append(" , msgId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(", materialExtension:");
        sb6.append(materialModel != null ? materialModel.f86270e : null);
        sb6.append(", mimeType: ");
        sb6.append(materialModel != null ? materialModel.f86269d : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgPreProcessUIC", sb6.toString());
        boolean n27 = f9Var != null ? f9Var.n2() : true;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eb0.b(appBrandOpenMaterialCollection, f9Var, null, true ^ n27));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.c(this));
        }
    }
}
