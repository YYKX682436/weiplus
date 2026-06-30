package cw2;

/* loaded from: classes2.dex */
public final class s8 implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305541d;

    public s8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305541d = c15196x85976f5f;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305541d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "onHeadsetStateChange on:" + z17 + " isVideoPlaying:" + c15196x85976f5f.J());
        if (z17 || !c15196x85976f5f.J()) {
            return;
        }
        if (c15196x85976f5f.getLongVideoSeekBar() != null) {
            c15196x85976f5f.b0(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 longVideoSeekBar = c15196x85976f5f.getLongVideoSeekBar();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(longVideoSeekBar);
            longVideoSeekBar.mo61296x11f3be80(false);
            return;
        }
        c15196x85976f5f.L(true, true);
        cw2.ca seekBarLayout = c15196x85976f5f.getSeekBarLayout();
        if (seekBarLayout != null) {
            cw2.ca.d(seekBarLayout, null, false, 3, null);
        }
    }
}
