package androidx.preference;

/* loaded from: classes13.dex */
public class h0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.SeekBarPreference f11827d;

    public h0(androidx.preference.SeekBarPreference seekBarPreference) {
        this.f11827d = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        if (z17) {
            androidx.preference.SeekBarPreference seekBarPreference = this.f11827d;
            if (seekBarPreference.V) {
                return;
            }
            seekBarPreference.N(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f11827d.V = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        androidx.preference.SeekBarPreference seekBarPreference = this.f11827d;
        seekBarPreference.V = false;
        if (seekBar.getProgress() + seekBarPreference.S != seekBarPreference.R) {
            seekBarPreference.N(seekBar);
        }
    }
}
