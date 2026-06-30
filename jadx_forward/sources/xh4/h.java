package xh4;

/* loaded from: classes14.dex */
public final class h extends com.p314xaae8f345.mm.app.z2 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        if (gm0.j1.a()) {
            if (uh4.c0.m168057xb411027f().mo168058x74219ae7()) {
                xh4.g.f536131a.m175020x3cb8acf();
            }
            if (uh4.c0.m168057xb411027f().T2()) {
                xh4.f.f536125a.m175020x3cb8acf();
            }
            xh4.e eVar = xh4.e.f536119a;
            if (eVar.m175018x2ddc9eb5()) {
                return;
            }
            if (android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "minors_mode", 0) == 1) {
                eVar.m175020x3cb8acf();
            }
        }
    }
}
