package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final db0.e f67365e;

    public q(db0.e eVar) {
        this.f67365e = eVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.elj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.feature.openmsg.uic.o item = (com.tencent.mm.feature.openmsg.uic.o) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        db0.e eVar = this.f67365e;
        if (eVar != null) {
            eVar.a(item, i17);
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = item.f67363d;
        java.lang.String str = appBrandOpenMaterialDetailModel.f86255d.f86265g;
        if (str != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.h5n);
            n11.a b17 = n11.a.b();
            java.lang.Object value = ((jz5.n) com.tencent.mm.feature.openmsg.uic.v.f67376f).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            b17.h(str, imageView, (o11.g) value);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.obc);
        if (textView != null) {
            java.lang.String functionDesc = appBrandOpenMaterialDetailModel.f86258g;
            kotlin.jvm.internal.o.f(functionDesc, "functionDesc");
            textView.setText(r26.n0.u0(functionDesc).toString());
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484050cu2);
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d;
        if (textView2 != null) {
            textView2.setText(appBrandOpenMaterialModel.f86267i);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vlt);
        int i19 = appBrandOpenMaterialModel.f86263e;
        if (i19 == 1) {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ob7));
            return;
        }
        if (i19 != 2) {
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
        } else {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ob6));
        }
    }
}
