package kp4;

/* loaded from: classes5.dex */
public final class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 f392661a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f9) {
        this.f392661a = c18813xaf14a0f9;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g
    public final void a(boolean z17) {
        bg0.x behaviorHolder;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SegmentClip.MediaThumbSeekBarView", "Not Supported init SegmentSeekBar failed.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "checkInitThumbSeekBar: init success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f9 = this.f392661a;
        if (c18813xaf14a0f9.f257585g == null || (behaviorHolder = c18813xaf14a0f9.getBehaviorHolder()) == null) {
            return;
        }
        bg0.y yVar = c18813xaf14a0f9.f257585g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "onSegmentClipItemSelected: " + yVar.f101398a);
        ((dz0.v) behaviorHolder).d(yVar);
    }
}
