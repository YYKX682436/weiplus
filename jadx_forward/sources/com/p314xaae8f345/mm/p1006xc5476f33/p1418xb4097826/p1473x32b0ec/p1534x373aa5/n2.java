package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes5.dex */
public final class n2 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 f198029d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7) {
        this.f198029d = c14302xfcce20b7;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        yz5.p onSeekChanging;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7 = this.f198029d;
        qs5.c selectedEffect = c14302xfcce20b7.getSelectedEffect();
        int c17 = c14302xfcce20b7.c(i17, selectedEffect != null ? selectedEffect.f447958c : false, seekBar != null ? seekBar.getMax() : 0);
        qs5.c selectedEffect2 = c14302xfcce20b7.getSelectedEffect();
        if (selectedEffect2 != null && (onSeekChanging = c14302xfcce20b7.getOnSeekChanging()) != null) {
            if (!z17) {
                onSeekChanging = null;
            }
            if (onSeekChanging != null) {
                onSeekChanging.mo149xb9724478(java.lang.Integer.valueOf(selectedEffect2.f447956a), java.lang.Integer.valueOf(c17));
            }
        }
        c14302xfcce20b7.m57245x2dea6cc0(i17);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        yz5.p onSeekDone;
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7 = this.f198029d;
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            qs5.c selectedEffect = c14302xfcce20b7.getSelectedEffect();
            i17 = c14302xfcce20b7.c(progress, selectedEffect != null ? selectedEffect.f447958c : false, seekBar.getMax());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#onStopTrackingTouch progress=" + i17);
        qs5.c selectedEffect2 = c14302xfcce20b7.getSelectedEffect();
        if (selectedEffect2 == null || (onSeekDone = c14302xfcce20b7.getOnSeekDone()) == null) {
            return;
        }
        onSeekDone.mo149xb9724478(java.lang.Integer.valueOf(selectedEffect2.f447956a), java.lang.Integer.valueOf(i17));
    }
}
