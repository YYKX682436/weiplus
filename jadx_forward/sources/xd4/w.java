package xd4;

/* loaded from: classes4.dex */
public final class w implements z35.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f535248a;

    public w(java.lang.ref.WeakReference weakReference) {
        this.f535248a = weakReference;
    }

    @Override // z35.s0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) this.f535248a.get();
        if (c17983xb14a9c8d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$1");
            return;
        }
        if (z17) {
            c17983xb14a9c8d.K();
        } else {
            c17983xb14a9c8d.F();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$1");
    }
}
