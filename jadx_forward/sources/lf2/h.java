package lf2;

/* loaded from: classes10.dex */
public final class h implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f399819d;

    public h(lf2.s sVar) {
        this.f399819d = sVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        lf2.s sVar = this.f399819d;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((om2.e) sVar.H.a(om2.e.class)).f427825h;
        sVar.getClass();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
