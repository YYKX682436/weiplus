package nx0;

/* loaded from: classes5.dex */
public final class t3 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 f422763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.p3 f422764e;

    public t3(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 c10984x806b8ef5, nx0.p3 p3Var) {
        this.f422763d = c10984x806b8ef5;
        this.f422764e = p3Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        this.f422763d.m47375xd8a9172(i17);
        this.f422764e.onProgressChanged(seekBar, i17, z17);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f422764e.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        this.f422764e.getClass();
    }
}
