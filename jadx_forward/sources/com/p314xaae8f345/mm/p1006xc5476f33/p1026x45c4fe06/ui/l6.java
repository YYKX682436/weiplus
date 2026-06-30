package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class l6 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 f171381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e93) {
        super(obj);
        this.f171381b = activityC12657x2ef82e93;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue || booleanValue2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e93 = this.f171381b;
        if (activityC12657x2ef82e93.f170918o != null) {
            android.os.Bundle bundle = android.os.Build.VERSION.SDK_INT >= 31 ? android.app.ActivityOptions.makeCustomAnimation(activityC12657x2ef82e93, 0, 0).toBundle() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e932 = this.f171381b;
            android.content.Intent intent = activityC12657x2ef82e932.f170918o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC12657x2ef82e932, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$special$$inlined$observable$1", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            activityC12657x2ef82e932.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
            yj0.a.f(activityC12657x2ef82e932, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$special$$inlined$observable$1", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            activityC12657x2ef82e93.f170918o = null;
        }
    }
}
