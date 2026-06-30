package cu3;

/* loaded from: classes8.dex */
public final class b implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd f303997d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd) {
        this.f303997d = c17002x1531c3fd;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd = this.f303997d;
        c17002x1531c3fd.getTAG();
        android.widget.TextView progressDescTv = c17002x1531c3fd.getProgressDescTv();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('%');
        progressDescTv.setText(sb6.toString());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd = this.f303997d;
        int lastSelectedIndex = c17002x1531c3fd.getLastSelectedIndex();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(seekBar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd.a(c17002x1531c3fd, lastSelectedIndex, seekBar.getProgress() / 100.0f);
    }
}
