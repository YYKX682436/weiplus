package cw0;

/* loaded from: classes5.dex */
public final class t0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f304214d;

    public t0(cw0.w0 w0Var) {
        this.f304214d = w0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        cw0.w0 w0Var = this.f304214d;
        cw0.w0.K(w0Var, z17);
        yz5.l m122818x7e890d3 = w0Var.m122818x7e890d3();
        if (m122818x7e890d3 != null) {
            m122818x7e890d3.mo146xb9724478(java.lang.Float.valueOf(i17 / 100.0f));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
