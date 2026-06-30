package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes7.dex */
public class w implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f256782a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, java.lang.ref.WeakReference weakReference) {
        this.f256782a = weakReference;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        android.content.Context context = (android.content.Context) this.f256782a.get();
        if (context == null || android.text.TextUtils.isEmpty(str2) || !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str2);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.addFlags(268435456);
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(kk.k.e(str2));
        if (Ni == null || !((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).E0()) {
            Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2));
        }
        long k17 = Ni == null ? 0L : com.p314xaae8f345.mm.vfs.w6.k(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).N0());
        if (Ni != null) {
            str2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).N0();
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), null);
            db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.u(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.v(this));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", Ni != null ? ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).mo42933xb5885648() : "");
        intent2.putExtra("Retr_Msg_Type", 5);
        intent2.putExtra("Retr_MsgImgScene", 1);
        j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent2, null);
    }
}
