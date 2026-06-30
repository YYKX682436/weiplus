package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.c3 f81722d;

    public b3(com.tencent.mm.plugin.appbrand.jsapi.media.c3 c3Var) {
        this.f81722d = c3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.jsapi.media.c3 c3Var = this.f81722d;
        intent.putExtra("key_send_raw_image", !c3Var.f81737e.f81759d.f81629h);
        intent.putExtra("key_force_show_raw_image_button", c3Var.f81737e.f81759d.f81630i);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest = c3Var.f81737e.f81759d;
        intent.putExtra("key_is_raw_image_button_disable", jsApiChooseImage$ChooseRequest.f81630i && !jsApiChooseImage$ChooseRequest.f81629h);
        intent.putExtra("max_select_count", c3Var.f81737e.f81759d.f81626e);
        intent.putExtra("query_source_type", c3Var.f81737e.f81762g);
        intent.putExtra("isPreviewPhoto", true);
        intent.putExtra("max_select_count", 1);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
        arrayList.add(c3Var.f81736d);
        intent.putStringArrayListExtra("preview_image_list", arrayList);
        intent.putExtra("preview_image", true);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.addFlags(67108864);
        c3Var.f81737e.startActivityForResult("gallery", ".ui.GalleryEntryUI", intent, 3);
    }
}
