package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class b4 implements org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f171099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171101c;

    public b4(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f171099a = r6Var;
        this.f171100b = str;
        this.f171101c = str2;
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
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f171099a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDebugUI", "resume success: md5=" + this.f171100b + " filePath=" + r6Var.o() + " isMatch=" + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kk.k.a(r6Var), this.f171101c));
    }
}
