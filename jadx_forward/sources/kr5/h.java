package kr5;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f393098d;

    public h(android.content.Context context) {
        this.f393098d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            boolean z17 = kr5.p.f393104b.f393097s;
            android.content.Context context = this.f393098d;
            if (z17) {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
                edit.putString("b218ad913b", "4.11.0a");
                edit.commit();
                or5.b.a("shared bugly inited success", new java.lang.Object[0]);
            } else {
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("BuglySdkInfos", 0);
                if (sharedPreferences.contains("b218ad913b")) {
                    android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.remove("b218ad913b");
                    edit2.apply();
                }
            }
        } catch (java.lang.Exception e17) {
            or5.b.a("shared bugly inited error " + e17, new java.lang.Object[0]);
        }
    }
}
