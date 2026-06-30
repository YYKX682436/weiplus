package eb;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static eb.a f332222b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 f332223a;

    static {
        java.util.regex.Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    public a(com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17) {
        this.f332223a = c2743x723fba17;
    }

    public void a(boolean z17) {
        com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17 = this.f332223a;
        synchronized (c2743x723fba17) {
            xa.b bVar = c2743x723fba17.f126182a;
            bVar.d();
            android.content.SharedPreferences.Editor edit = bVar.f534285a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z17);
            edit.apply();
            if (!c2743x723fba17.f126187f && z17) {
                c2743x723fba17.i();
            }
            c2743x723fba17.f126187f = z17;
        }
    }
}
