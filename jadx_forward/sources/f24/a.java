package f24;

/* loaded from: classes11.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2066x63a518c2.C17552x76472f54 f340621a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2066x63a518c2.C17552x76472f54 c17552x76472f54) {
        this.f340621a = c17552x76472f54;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2066x63a518c2.C17552x76472f54 c17552x76472f54 = this.f340621a;
        android.preference.PreferenceManager.getDefaultSharedPreferences(c17552x76472f54.m80379x76847179()).edit().putBoolean("settings_landscape_mode", z17).apply();
        c17552x76472f54.f243442h = z17;
        c17552x76472f54.t7(c17552x76472f54.m158354x19263085().getIntent());
        if (z17) {
            com.p314xaae8f345.mm.ui.ee.c(1);
            c17552x76472f54.m80379x76847179().setRequestedOrientation(-1);
        } else {
            com.p314xaae8f345.mm.ui.ee.c(0);
            c17552x76472f54.m80379x76847179().setRequestedOrientation(1);
        }
    }
}
