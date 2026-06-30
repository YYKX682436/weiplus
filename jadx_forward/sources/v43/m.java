package v43;

/* loaded from: classes8.dex */
public class m implements hm0.q {
    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
        h53.j d17;
        if (com.p314xaae8f345.mm.ui.bk.I() && com.p314xaae8f345.mm.ui.bk.F() && (d17 = h53.j.d()) != null) {
            d17.f360590g.h(java.lang.String.format("if (SystemInfo == 'undefined' || SystemInfo.isDarkMode == 'undefined) {return;} SystemInfo.isDarkMode=%b; console.log(SystemInfo.isDarkMode);", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C())), null);
        }
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
    }
}
