package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes13.dex */
public class p extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.C16730x3be3ed15 f233875a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.C16730x3be3ed15 c16730x3be3ed15) {
        this.f233875a = c16730x3be3ed15;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17;
        int i18;
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LogoImageView", "handleMsg fail, data is null");
            return;
        }
        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.C16730x3be3ed15 c16730x3be3ed15 = this.f233875a;
        sb6.append(c16730x3be3ed15.f233793d);
        sb6.append(kk.k.g(c16730x3be3ed15.f233794e.getBytes()));
        com.p314xaae8f345.mm.vfs.w6.S(sb6.toString(), bArr, 0, bArr.length);
        if (G != null && (i17 = c16730x3be3ed15.f233795f) > 0 && (i18 = c16730x3be3ed15.f233796g) > 0) {
            G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(G, i18, i17, true, false);
        }
        c16730x3be3ed15.setImageBitmap(G);
    }
}
