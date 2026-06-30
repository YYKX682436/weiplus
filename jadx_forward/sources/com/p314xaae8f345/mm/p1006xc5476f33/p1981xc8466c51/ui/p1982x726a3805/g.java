package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes12.dex */
public class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i f237044d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i iVar) {
        this.f237044d = iVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i iVar = this.f237044d;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("sns_kemdia_path", iVar.f237050h);
            java.lang.String a17 = c01.n2.a("fav_");
            c01.n2.d().c(a17, true).i("prePublishId", "fav_");
            intent.putExtra("reportSessionId", a17);
            j45.l.j(iVar.f237046d, "sns", ".ui.SnsUploadUI", intent, null);
            return;
        }
        if (itemId == 2) {
            o72.x1.J0(iVar.f237050h, iVar.f237046d, iVar.f237047e.f338123a.f456964q2);
        } else {
            if (itemId != 3) {
                return;
            }
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(iVar.f237046d, iVar.f237050h, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.f(this));
        }
    }
}
