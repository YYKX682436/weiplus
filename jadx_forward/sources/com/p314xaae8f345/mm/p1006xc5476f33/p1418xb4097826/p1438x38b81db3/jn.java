package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class jn implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185302d;

    public jn(in5.s0 s0Var) {
        this.f185302d = s0Var;
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        android.widget.SeekBar seekBar;
        if (j18 <= 0 || (seekBar = (android.widget.SeekBar) this.f185302d.p(com.p314xaae8f345.mm.R.id.f569075oy0)) == null) {
            return;
        }
        seekBar.setProgress(a06.d.b((((float) j17) * 1000.0f) / ((float) j18)));
    }
}
