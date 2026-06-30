package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar */
/* loaded from: classes2.dex */
public class C19737x80a67750 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf {
    public android.widget.ImageView E;
    public long F;
    public long G;

    public C19737x80a67750(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 0L;
        this.G = 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    public void e(boolean z17) {
        mo61296x11f3be80(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdk;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        this.E = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxk);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        this.f272979z = z17;
        if (z17) {
            this.f244009i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79844x41f895de, -1));
            this.f244009i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
        } else {
            this.f244009i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79865xc8527e4c, -1));
            this.f244009i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
        }
    }

    public boolean v(int i17) {
        int mo69281xdf1112ec = mo69281xdf1112ec();
        if ((i17 == this.F && mo69281xdf1112ec == this.G) || java.lang.System.currentTimeMillis() - 0 < 300 || i17 < 0 || mo69281xdf1112ec < 0) {
            return false;
        }
        if (i17 > mo69281xdf1112ec) {
            i17 = mo69281xdf1112ec;
        }
        int mo69278x11ddf3f8 = mo69278x11ddf3f8();
        if (mo69278x11ddf3f8 <= 0) {
            return true;
        }
        int i18 = mo69281xdf1112ec != 0 ? (int) (mo69278x11ddf3f8 * ((i17 * 1.0d) / mo69281xdf1112ec)) : 0;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.E.getLayoutParams();
        layoutParams.width = i18;
        this.E.setLayoutParams(layoutParams);
        this.F = i17;
        this.G = mo69281xdf1112ec;
        return true;
    }

    public C19737x80a67750(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.F = 0L;
        this.G = 0L;
    }
}
