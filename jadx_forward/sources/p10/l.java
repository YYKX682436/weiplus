package p10;

/* loaded from: classes8.dex */
public final class l implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432500d;

    public l(int i17, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432500d = c10541x905158a3;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            i17 += 100;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432500d;
        c10541x905158a3.f147361u = i17;
        android.widget.TextView textView = c10541x905158a3.f147356p;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("swipeSpeedLabel");
            throw null;
        }
        textView.setText("Speed: " + i17 + " px/s");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
