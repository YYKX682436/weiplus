package mt5;

/* loaded from: classes8.dex */
public class d implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public final mt5.g f412845a = new mt5.g();

    /* renamed from: b, reason: collision with root package name */
    public lt5.f f412846b;

    @Override // lt5.a
    public synchronized lt5.f a(android.content.Context context) {
        lt5.f fVar = this.f412846b;
        if (fVar == null || fVar.f402837b != 0) {
            this.f412846b = b(context);
        }
        return this.f412846b;
    }

    public final lt5.f b(android.content.Context context) {
        java.lang.String str;
        lt5.f a17 = this.f412845a.a(context);
        if (a17.f402837b == 0) {
            java.lang.String str2 = a17.f402836a;
            if (!android.text.TextUtils.isEmpty(str2) && !"00000000-0000-0000-0000-000000000000".equals(str2)) {
                return a17;
            }
        }
        try {
            str = android.provider.Settings.Global.getString(context.getContentResolver(), "oaid");
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        if (!android.text.TextUtils.isEmpty(str) && !"00000000-0000-0000-0000-000000000000".equals(str)) {
            return new lt5.f(str, 0);
        }
        mt5.f fVar = new mt5.f(context);
        boolean z17 = true;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            context.bindService(intent, fVar, 1);
            z17 = fVar.f412851g.await(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            str = fVar.f412848d;
        } catch (java.lang.Throwable unused2) {
        }
        fVar.a();
        if (android.text.TextUtils.isEmpty(str) || "00000000-0000-0000-0000-000000000000".equals(str)) {
            return lt5.f.a(z17 ? -10 : -105);
        }
        return new lt5.f(str, 0);
    }
}
