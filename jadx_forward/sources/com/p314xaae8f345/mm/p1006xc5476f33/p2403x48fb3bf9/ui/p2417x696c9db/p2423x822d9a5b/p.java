package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class p extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.p f265749a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.p();

    @Override // gp1.a0, gp1.z
    public void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = c12886x91aa2b6d != null ? java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAudioFloatBallListener", "onFloatBallInfoReplaced type: %s", objArr);
        if (!(c12886x91aa2b6d != null && c12886x91aa2b6d.f174579d == 56) || c12886x91aa2b6d == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.o.a(c12886x91aa2b6d)) == null) {
            return;
        }
        a17.mo14660x738236e6(" javascript: (    function () {        try { _WXJS?.mediaTracker?.pauseLastPlayback?.(); } catch(e) { console.warn('JS暂停异常:', e); }       })() ", null);
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAudioFloatBallListener", "onFloatBallDeleteButtonClick %s", c12886x91aa2b6d);
        if (c12886x91aa2b6d == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.o.a(c12886x91aa2b6d)) == null) {
            return;
        }
        a17.mo14660x738236e6(" javascript: (    function () {        try { _WXJS?.mediaTracker?.pauseLastPlayback?.(); } catch(e) { console.warn('JS暂停异常:', e); }       })() ", null);
    }

    @Override // gp1.a0, gp1.z
    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, int i18, int i19, int i27) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallCollapseStateChanged ballInfo.type: ");
        sb6.append(c12886x91aa2b6d != null ? java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d) : null);
        sb6.append(", oldCollapseState: ");
        sb6.append(i17);
        sb6.append(", newCollapseState: ");
        sb6.append(i18);
        sb6.append(", collapseReason: ");
        sb6.append(i19);
        sb6.append(", expandReason: ");
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAudioFloatBallListener", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAudioFloatBallListener", "onFloatBallPlayButtonClick %s", c12886x91aa2b6d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d.f174587o;
            ballButtonInfo.f174602d = !ballButtonInfo.f174602d;
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().b(c12886x91aa2b6d);
            if (ballButtonInfo.f174602d) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.o.a(c12886x91aa2b6d);
                if (a17 != null) {
                    a17.mo14660x738236e6(" javascript: (    function () {        try { _WXJS?.mediaTracker?.recoverLastPlayback?.(); } catch(e) { console.warn('JS恢复异常:', e); }          })() ", null);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.o.a(c12886x91aa2b6d);
            if (a18 != null) {
                a18.mo14660x738236e6(" javascript: (    function () {        try { _WXJS?.mediaTracker?.pauseLastPlayback?.(); } catch(e) { console.warn('JS暂停异常:', e); }       })() ", null);
            }
        }
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAudioFloatBallListener", "onFloatBallInfoClicked %s", c12886x91aa2b6d);
    }
}
