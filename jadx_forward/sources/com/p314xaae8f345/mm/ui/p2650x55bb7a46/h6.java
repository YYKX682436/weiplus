package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class h6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        int i17 = erVar.f285452o;
        java.lang.String str = erVar.f285453p;
        java.lang.String str2 = erVar.f285454q;
        java.lang.String str3 = erVar.f285455r;
        java.lang.String str4 = erVar.f285456s;
        int i18 = erVar.f285457t;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "topic id is zero.");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", dVar.x());
        intent.putExtra("rawUrl", erVar.f285459v);
        intent.putExtra("set_id", i17);
        intent.putExtra("set_title", str);
        intent.putExtra("set_iconURL", str3);
        intent.putExtra("set_desc", str2);
        intent.putExtra("headurl", str4);
        intent.putExtra("pageType", i18);
        j45.l.j(dVar.g(), "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", intent, null);
    }
}
