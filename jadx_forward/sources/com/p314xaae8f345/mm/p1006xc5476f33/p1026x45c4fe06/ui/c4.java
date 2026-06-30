package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class c4 implements org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f171155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171156b;

    public c4(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI, java.lang.String str2) {
        this.f171155a = r6Var;
        this.f171156b = appBrandDebugUI;
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onCanceled */
    public void mo49258x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onFailed */
    public void mo49259x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDebugUI", "onFailed: info=" + abstractC29564x6974077e + " exception=" + abstractC29501x119930f2);
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onSucceeded */
    public void mo49260x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f171155a;
        java.lang.String a17 = kk.k.a(r6Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDebugUI", "download success: md5=" + a17 + " filePath=" + r6Var.o() + " isMatch=" + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "22ce9fe8fecba3a6996b60eb9207c862"));
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(this.f171156b.getCacheDir().getAbsolutePath(), "interrupted.jpg");
        r6Var2.l();
        r6Var2.k();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(r6Var.o());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(r6Var2.o());
        byte[] bArr = new byte[new java.util.Random().nextInt(1048576)];
        fileOutputStream.write(bArr, 0, fileInputStream.read(bArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b0.f156984a.a("https://pic-go-1252561521.cos.ap-guangzhou.myqcloud.com/157deb5c-3a30-4bc6-b12e-f10ac933b210.png", null, r6Var2, 60000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b4(r6Var2, a17, "22ce9fe8fecba3a6996b60eb9207c862"), (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? false : true);
    }
}
