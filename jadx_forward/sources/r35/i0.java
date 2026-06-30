package r35;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f450666a;

    public i0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913) {
        this.f450666a = c19659x677e0913;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17;
        int i18;
        java.lang.String string = message.getData().getString("k_url");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string == null) {
            string = "";
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f450666a;
        java.lang.String str = c19659x677e0913.f271424d;
        java.lang.String str2 = str != null ? str : "";
        c19659x677e0913.f271424d = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            c19659x677e0913.setImageBitmap(null);
            c19659x677e0913.mo65185x405ec283(null);
            return;
        }
        if (c19659x677e0913.f271424d.equals(string)) {
            byte[] byteArray = message.getData().getByteArray("k_data");
            if (byteArray == null || byteArray.length == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnImageView", "handleMsg fail, data is null");
                return;
            }
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(byteArray);
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(c19659x677e0913.f271424d, G);
            if (c19659x677e0913.f271430m) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913.a(c19659x677e0913, G);
            }
            if (G != null && (i17 = c19659x677e0913.f271425e) > 0 && (i18 = c19659x677e0913.f271426f) > 0) {
                G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(G, i18, i17, true, false);
            }
            if (c19659x677e0913.f271429i && G != null) {
                G = c19659x677e0913.f271431n > 0.0f ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(G, false, G.getWidth() * c19659x677e0913.f271431n) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(G, false, G.getWidth() * 0.5f);
            }
            if (G != null) {
                c19659x677e0913.setImageBitmap(G);
            }
            c19659x677e0913.mo65185x405ec283(G);
        }
    }
}
