package un;

/* loaded from: classes11.dex */
public final class b implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ un.h f510769a;

    public b(un.h hVar) {
        this.f510769a = hVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("room_placed_to_the_top", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("room_set_to_conv_box", str)) {
            if (sharedPreferences != null) {
                sharedPreferences.getBoolean(str, false);
            }
            this.f510769a.X6();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
    }
}
