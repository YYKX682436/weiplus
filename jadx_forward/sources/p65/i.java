package p65;

/* loaded from: classes12.dex */
public class i extends p65.a {
    @Override // p65.a
    public void e(android.app.Application application) {
        g(f(application));
        try {
            if (bm5.f1.a().endsWith(":fallback")) {
                com.p314xaae8f345.mm.p2617xca9a2a67.a.f275173a = application.getCacheDir().getAbsolutePath() + "/splash_cache";
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
