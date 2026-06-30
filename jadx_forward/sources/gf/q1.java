package gf;

/* loaded from: classes7.dex */
public final class q1 implements sf.d {
    @Override // sf.d
    /* renamed from: setPluginTextureScale */
    public void mo120225xc0b8afc4(java.lang.String str, int i17, float f17, float f18) {
        java.lang.Integer num = (java.lang.Integer) gf.a2.f352545q.get(str + '_' + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineViewRenderEngine", "setTextureScale engineId:" + num + " type:" + str + " id:" + i17 + " scaleX:" + f17 + " scaleY:" + f18);
        if (num != null) {
            num.intValue();
            d75.b.g(new gf.p1(num, i17, f17, f18));
        }
    }

    @Override // sf.d
    /* renamed from: takePluginScreenshot */
    public void mo120226xf63e37a0(java.lang.String str, int i17) {
    }
}
