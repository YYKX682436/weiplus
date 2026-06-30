package wm2;

/* loaded from: classes14.dex */
public final class b implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef f528765d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef c14420x69387ef) {
        this.f528765d = c14420x69387ef;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef c14420x69387ef = this.f528765d;
        double d17 = e06.p.d(c14420x69387ef.m57969x754a37bb(), c14420x69387ef.getMinimum(), c14420x69387ef.getMaximum());
        c14420x69387ef.B(d17, (d17 - c14420x69387ef.getMinimum()) / (c14420x69387ef.getMaximum() - c14420x69387ef.getMinimum()));
        java.lang.Object obj = c14420x69387ef.f199407y;
        if ((obj instanceof android.os.Vibrator ? (android.os.Vibrator) obj : null) != null && java.lang.Math.abs(d17 - c14420x69387ef.getDefault()) < 0.005d) {
            ((android.os.Vibrator) c14420x69387ef.f199407y).vibrate(10L);
        }
        yz5.l valueChangedHandler = c14420x69387ef.getValueChangedHandler();
        if (valueChangedHandler != null) {
            valueChangedHandler.mo146xb9724478(java.lang.Double.valueOf(d17));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
