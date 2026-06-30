package xp1;

/* loaded from: classes5.dex */
public class h implements ae0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537418a;

    public h(android.content.Context context) {
        this.f537418a = context;
    }

    @Override // ae0.f
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            this.f537418a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("no_more_show_add_short_cut_dialog", true).commit();
        }
    }
}
