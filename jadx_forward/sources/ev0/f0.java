package ev0;

/* loaded from: classes5.dex */
public final class f0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 f338377d;

    public f0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 c10935x45f3d5c8) {
        this.f338377d = c10935x45f3d5c8;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        yz5.l onBgmVolumeChangedListener = this.f338377d.getOnBgmVolumeChangedListener();
        if (onBgmVolumeChangedListener != null) {
            onBgmVolumeChangedListener.mo146xb9724478(java.lang.Float.valueOf(i17 / 100.0f));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
