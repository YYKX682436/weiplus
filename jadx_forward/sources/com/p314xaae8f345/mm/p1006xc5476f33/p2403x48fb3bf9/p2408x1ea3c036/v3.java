package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class v3 implements sw4.h {
    private v3() {
    }

    @Override // sw4.h
    public void a(android.content.Context context, android.os.Bundle bundle, sw4.e eVar) {
        java.lang.String string = bundle.getString("img_path");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(string)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", string);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.addFlags(268435456);
            ((com.p314xaae8f345.mm.app.y7) dw4.a.f325830a).v(intent, context);
            eVar.f(null);
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(kk.k.e(string));
        if (Ni == null || !((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).E0()) {
            Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string));
        }
        long k17 = Ni == null ? 0L : com.p314xaae8f345.mm.vfs.w6.k(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).N0());
        if (Ni != null) {
            string = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).N0();
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(string, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), null);
            db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.t3(this, eVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u3(this, eVar));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", Ni != null ? ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).mo42933xb5885648() : "");
        intent2.putExtra("Retr_Msg_Type", 5);
        intent2.putExtra("Retr_MsgImgScene", 1);
        ((com.p314xaae8f345.mm.app.y7) dw4.a.f325830a).v(intent2, context);
        eVar.f(null);
    }
}
