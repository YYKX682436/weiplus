package rv0;

/* loaded from: classes5.dex */
public final class m7 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481656d;

    public m7(rv0.o7 o7Var) {
        this.f481656d = o7Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        yz5.p m163193x80267865 = this.f481656d.m163193x80267865();
        if (m163193x80267865 != null) {
            m163193x80267865.mo149xb9724478(java.lang.Float.valueOf(i17 / 100.0f), java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
