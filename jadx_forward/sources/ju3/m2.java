package ju3;

/* loaded from: classes2.dex */
public final class m2 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f383508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17026x3754ba3c f383509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f383510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f383511g;

    public m2(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17026x3754ba3c c17026x3754ba3c, int i17, yz5.l lVar) {
        this.f383508d = textView;
        this.f383509e = c17026x3754ba3c;
        this.f383510f = i17;
        this.f383511g = lVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
        this.f383508d.setText(this.f383509e.getResources().getString(this.f383510f, java.lang.Integer.valueOf(i17)));
        this.f383511g.mo146xb9724478(java.lang.Integer.valueOf(i17));
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
