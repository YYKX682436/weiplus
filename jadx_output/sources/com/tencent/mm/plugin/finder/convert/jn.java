package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jn implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103769d;

    public jn(in5.s0 s0Var) {
        this.f103769d = s0Var;
    }

    @Override // cw2.ea
    public void onVideoPause() {
    }

    @Override // cw2.ea
    public void onVideoPlay() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        android.widget.SeekBar seekBar;
        if (j18 <= 0 || (seekBar = (android.widget.SeekBar) this.f103769d.p(com.tencent.mm.R.id.f487542oy0)) == null) {
            return;
        }
        seekBar.setProgress(a06.d.b((((float) j17) * 1000.0f) / ((float) j18)));
    }
}
