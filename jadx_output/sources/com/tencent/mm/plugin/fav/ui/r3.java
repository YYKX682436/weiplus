package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class r3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y3 f101368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101370g;

    public r3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI, java.util.List list, com.tencent.mm.plugin.fav.ui.y3 y3Var, java.util.List list2) {
        this.f101370g = favImgGalleryUI;
        this.f101367d = list;
        this.f101368e = y3Var;
        this.f101369f = list2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.view.View b17;
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101370g;
        favImgGalleryUI.f100361h.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f101367d;
            if (i17 >= list.size()) {
                return;
            }
            if (((java.lang.Integer) list.get(i17)).intValue() == 3) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = favImgGalleryUI.f100361h;
                favImgGalleryUI.getClass();
                com.tencent.mm.plugin.fav.ui.y3 y3Var = this.f101368e;
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = y3Var.f101616a;
                java.util.ArrayList a17 = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(recogQBarOfImageFileResultEvent);
                if (a17.size() == 0) {
                    b17 = null;
                } else {
                    com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) a17.get(0);
                    com.tencent.mm.plugin.fav.ui.u3 u3Var = new com.tencent.mm.plugin.fav.ui.u3(favImgGalleryUI, recogQBarOfImageFileResultEvent, imageQBarDataBean);
                    if (!y3Var.f101617b) {
                        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) favImgGalleryUI.f100368r).h(imageQBarDataBean.f158620e, imageQBarDataBean.f158619d);
                        y3Var.f101617b = true;
                    }
                    b17 = ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) favImgGalleryUI.f100368r).b(u3Var, imageQBarDataBean.f158620e, imageQBarDataBean.f158619d, 3);
                }
                k0Var.o(b17);
            } else {
                g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f101369f.get(i17));
            }
            i17++;
        }
    }
}
