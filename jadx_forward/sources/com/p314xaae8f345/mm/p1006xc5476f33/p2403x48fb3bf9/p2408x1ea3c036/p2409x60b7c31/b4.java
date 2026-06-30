package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class b4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setCloseWindowConfirmDialogInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetCloseWindowConfirmDialogInfo", "invoke");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar.f488130b.f426039c.optBoolean(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf));
        java.lang.String optString = bVar.f488130b.f426039c.optString("title_cn");
        java.lang.String optString2 = bVar.f488130b.f426039c.optString("title_eng");
        java.lang.String optString3 = bVar.f488130b.f426039c.optString("ok_cn");
        java.lang.String optString4 = bVar.f488130b.f426039c.optString("ok_eng");
        java.lang.String optString5 = bVar.f488130b.f426039c.optString("cancel_cn");
        java.lang.String optString6 = bVar.f488130b.f426039c.optString("cancel_eng");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f263719t;
        if (y1Var == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("close_window_confirm_dialog_switch", valueOf.booleanValue());
        bundle.putString("close_window_confirm_dialog_title_cn", optString);
        bundle.putString("close_window_confirm_dialog_title_eng", optString2);
        bundle.putString("close_window_confirm_dialog_ok_cn", optString3);
        bundle.putString("close_window_confirm_dialog_ok_eng", optString4);
        bundle.putString("close_window_confirm_dialog_cancel_cn", optString5);
        bundle.putString("close_window_confirm_dialog_cancel_eng", optString6);
        y1Var.m74259x8e5d7968(bundle);
        bVar.a();
    }
}
