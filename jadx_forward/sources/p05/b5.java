package p05;

/* loaded from: classes5.dex */
public final class b5 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f431999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f f432000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f432001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f432002g;

    public b5(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f c19569xe327f12f, int i17, yz5.l lVar) {
        this.f431999d = textView;
        this.f432000e = c19569xe327f12f;
        this.f432001f = i17;
        this.f432002g = lVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
        this.f431999d.setText(this.f432000e.getResources().getString(this.f432001f, java.lang.Integer.valueOf(i17)));
        this.f432002g.mo146xb9724478(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
    }
}
