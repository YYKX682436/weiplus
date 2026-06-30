package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes2.dex */
public final class f1 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f237759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f237760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f237761f;

    public f1(android.widget.TextView textView, int i17, yz5.l lVar) {
        this.f237759d = textView;
        this.f237760e = i17;
        this.f237761f = lVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        this.f237759d.setText(java.lang.String.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicVolumeAdjustDialog", "onStopTrackingTouch: rowId=" + this.f237760e + " newValue=" + progress);
            this.f237761f.mo146xb9724478(java.lang.Integer.valueOf(progress));
        }
    }
}
