package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.s f279972d;

    public r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.s sVar) {
        this.f279972d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.s sVar = this.f279972d;
        try {
            if (!sVar.f279973d.f279979a.endsWith("hd")) {
                sVar.f279973d.f279979a = sVar.f279973d.f279979a + "hd";
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = sVar.f279975f.f279918e;
            if (c1163xf1deaba4 != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(sVar.f279974e);
                if (p07 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z) {
                    n11.a.b().h(sVar.f279973d.f279979a, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z) p07).f279988d, sVar.f279975f.f279921h);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "load hd thumb image failed : " + th6.getMessage());
        }
    }
}
