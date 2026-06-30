package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c3 f163255d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c3 c3Var) {
        this.f163255d = c3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c3 c3Var = this.f163255d;
        intent.putExtra("key_send_raw_image", !c3Var.f163270e.f163292d.f163162h);
        intent.putExtra("key_force_show_raw_image_button", c3Var.f163270e.f163292d.f163163i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e35647 = c3Var.f163270e.f163292d;
        intent.putExtra("key_is_raw_image_button_disable", c12160x62e35647.f163163i && !c12160x62e35647.f163162h);
        intent.putExtra("max_select_count", c3Var.f163270e.f163292d.f163159e);
        intent.putExtra("query_source_type", c3Var.f163270e.f163295g);
        intent.putExtra("isPreviewPhoto", true);
        intent.putExtra("max_select_count", 1);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
        arrayList.add(c3Var.f163269d);
        intent.putStringArrayListExtra("preview_image_list", arrayList);
        intent.putExtra("preview_image", true);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.addFlags(67108864);
        c3Var.f163270e.m50434x5dc77fb5("gallery", ".ui.GalleryEntryUI", intent, 3);
    }
}
