package nx0;

/* loaded from: classes5.dex */
public final class t0 extends nx0.p3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 f422760d;

    public t0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 c10979xd03dfd61) {
        this.f422760d = c10979xd03dfd61;
    }

    @Override // nx0.p3, android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m47340x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m47340x4905e9fa2;
        if (z17) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 c10979xd03dfd61 = this.f422760d;
            c10979xd03dfd61.f151123v = true;
            nx0.v vVar = c10979xd03dfd61.f151116o;
            if (vVar != null) {
                vVar.f422776e = i17 / 100.0f;
                m47340x4905e9fa2 = c10979xd03dfd61.m47340x4905e9fa();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m47340x4905e9fa2.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8147xed6e4d18(c10979xd03dfd61.f151117p);
                }
            }
            m47340x4905e9fa = c10979xd03dfd61.m47340x4905e9fa();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = m47340x4905e9fa.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61.c(c10979xd03dfd61, ((nx0.u) mo7946xf939df192).y());
            }
            c10979xd03dfd61.f(nx0.k1.f422681d);
        }
    }
}
