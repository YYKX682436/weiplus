package nx0;

/* loaded from: classes5.dex */
public final class l2 extends nx0.p3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10981x1a40da5d f422691d;

    public l2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10981x1a40da5d c10981x1a40da5d) {
        this.f422691d = c10981x1a40da5d;
    }

    @Override // nx0.p3, android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10981x1a40da5d c10981x1a40da5d;
        nx0.i2 i2Var;
        if (!z17 || (i2Var = (c10981x1a40da5d = this.f422691d).f151135g) == null) {
            return;
        }
        i2Var.f422669e = i17 / 100.0f;
        p3325xe03a0797.p3326xc267989b.i2 i2Var2 = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(i2Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new nx0.k2(c10981x1a40da5d, i2Var, null), 2, null);
    }
}
