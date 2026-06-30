package hd2;

/* loaded from: classes8.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f362006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362007e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.View view) {
        this.f362006d = c14133xabc4217e;
        this.f362007e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Context mo7438x76847179;
        android.content.Context mo7438x768471792;
        int itemId = menuItem.getItemId();
        android.view.View container = this.f362007e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e = this.f362006d;
        if (itemId == 20002) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(container, "$container");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n;
            c14133xabc4217e.getClass();
            android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(container);
            if (b07 != null && (mo7438x76847179 = c14133xabc4217e.mo7438x76847179()) != null) {
                java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_File_Name", fj6);
                intent.putExtra("Retr_Compress_Type", 0);
                intent.putExtra("Retr_Msg_Type", 0);
                intent.putExtra("sourceImgInfo", c14133xabc4217e.n0());
                j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) mo7438x76847179, ".ui.transmit.MsgRetransmitUI", intent, 1014, new hd2.v(mo7438x76847179, c14133xabc4217e));
            }
        } else if (itemId == 20003) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(container, "$container");
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n;
            c14133xabc4217e.getClass();
            android.graphics.Bitmap b08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(container);
            if (b08 != null && (mo7438x768471792 = c14133xabc4217e.mo7438x76847179()) != null) {
                java.lang.String fj7 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b08, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj7, true);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Ksnsupload_type", 0);
                intent2.putExtra("sns_kemdia_path", fj7);
                intent2.putExtra("KFinder_source_url", c14133xabc4217e.n0().f152791d);
                j45.l.j(mo7438x768471792, "sns", ".ui.SnsUploadUI", intent2, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, mo7438x768471792, "share_comment", false, c14133xabc4217e.o0(0, null, 1), 4, null);
            }
        }
        c14133xabc4217e.mo7391x63a3b28a();
    }
}
