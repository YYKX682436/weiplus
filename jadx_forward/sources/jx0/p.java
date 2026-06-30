package jx0;

/* loaded from: classes5.dex */
public final class p implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 f383922d;

    public p(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1) {
        this.f383922d = c10963x9da302b1;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        java.lang.String valueOf;
        float f17 = i17;
        int i18 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1.D;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.f383922d;
        yz5.l lVar = c10963x9da302b1.customText;
        if (lVar == null || (valueOf = (java.lang.String) lVar.mo146xb9724478(java.lang.Float.valueOf(f17))) == null) {
            valueOf = java.lang.String.valueOf((int) f17);
        }
        c10963x9da302b1.f150936w.setText(valueOf);
        if (z17) {
            c10963x9da302b1.A(f17);
        }
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = c10963x9da302b1.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i17, z17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f383922d.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f383922d.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }
}
