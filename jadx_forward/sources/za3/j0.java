package za3;

/* loaded from: classes13.dex */
public class j0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16290x262da0ee f552500a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16290x262da0ee c16290x262da0ee) {
        this.f552500a = c16290x262da0ee;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17;
        int i18;
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimpleImageView", "handleMsg fail, data is null");
            return;
        }
        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16290x262da0ee c16290x262da0ee = this.f552500a;
        sb6.append(c16290x262da0ee.f226196d);
        sb6.append(kk.k.g(c16290x262da0ee.f226197e.getBytes()));
        com.p314xaae8f345.mm.vfs.w6.S(sb6.toString(), bArr, 0, bArr.length);
        if (G != null && (i17 = c16290x262da0ee.f226198f) > 0 && (i18 = c16290x262da0ee.f226199g) > 0) {
            G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(G, i18, i17, true, false);
        }
        c16290x262da0ee.setImageBitmap(G);
    }
}
