package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f83946d;

    public yd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f83946d = mdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/JsApiShowImageOperateSheet$BottomSheetLogicHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.md mdVar = this.f83946d;
        if (mdVar.f81605b.i()) {
            mdVar.f81605b.u();
        }
        com.tencent.mm.plugin.appbrand.jsapi.md.a(mdVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/JsApiShowImageOperateSheet$BottomSheetLogicHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
