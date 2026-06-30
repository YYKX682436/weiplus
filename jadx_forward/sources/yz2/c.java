package yz2;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb f550057d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb c15541x39aaabeb) {
        this.f550057d = c15541x39aaabeb;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "release");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb c15541x39aaabeb = this.f550057d;
        c15541x39aaabeb.f218808f.cancel();
        c15541x39aaabeb.f218807e.clearAnimation();
    }
}
