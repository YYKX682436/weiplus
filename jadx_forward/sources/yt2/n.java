package yt2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 f546848d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4) {
        this.f546848d = c14986x9295a1e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SubsidyOverlay", "exit total finished (1100ms), onAllFinish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4 = this.f546848d;
        c14986x9295a1e4.setVisibility(8);
        yz5.a aVar = c14986x9295a1e4.C;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        c14986x9295a1e4.C = null;
    }
}
