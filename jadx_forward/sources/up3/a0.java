package up3;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f511343e;

    public a0(up3.b0 b0Var, java.lang.String str, android.content.Intent intent) {
        this.f511342d = str;
        this.f511343e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = up3.b0.f511346c;
        java.lang.String str2 = this.f511342d;
        boolean equals = str.equals(str2);
        android.content.Intent intent = this.f511343e;
        if (!equals) {
            if (up3.b0.f511348e.equals(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                up3.d0.a(intent.getStringExtra(up3.b0.f511349f), intent.getStringExtra(up3.b0.f511350g), intent.getBooleanExtra(up3.b0.f511351h, false));
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra(up3.b0.f511349f);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra(up3.b0.f511347d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(stringArrayExtra)) {
            return;
        }
        for (java.lang.String str3 : stringArrayExtra) {
            if (str3.equals(bm5.f1.a())) {
                try {
                    com.p314xaae8f345.mm.vfs.r6 e17 = up3.d0.e();
                    java.lang.String str4 = "" + tp3.b.a("êê»¶ª¥¢³²øã") + str3 + "\n";
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("/proc/self/smaps"));
                    up3.b.k(r6Var);
                    up3.b.b(r6Var, e17, null, str4);
                    up3.b0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, stringExtra, e17.o(), true);
                    return;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.d0.f511356d, th6, "Explained by code.", new java.lang.Object[0]);
                    return;
                }
            }
        }
    }
}
