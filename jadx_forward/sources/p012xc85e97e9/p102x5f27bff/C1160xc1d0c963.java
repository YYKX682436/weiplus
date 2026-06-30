package p012xc85e97e9.p102x5f27bff;

/* renamed from: androidx.profileinstaller.ProfileInstallerInitializer */
/* loaded from: classes12.dex */
public class C1160xc1d0c963 implements r4.b {
    @Override // r4.b
    /* renamed from: dependencies */
    public java.util.List mo7908x1e06fd29() {
        return java.util.Collections.emptyList();
    }

    @Override // r4.b
    public java.lang.Object l0(android.content.Context context) {
        final android.content.Context applicationContext = context.getApplicationContext();
        j4.k.a(new java.lang.Runnable() { // from class: j4.j$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p102x5f27bff.C1160xc1d0c963.this.getClass();
                android.os.Handler a17 = android.os.Build.VERSION.SDK_INT >= 28 ? j4.l.a(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper());
                int nextInt = new java.util.Random().nextInt(java.lang.Math.max(1000, 1));
                final android.content.Context context2 = applicationContext;
                a17.postDelayed(new java.lang.Runnable() { // from class: j4.j$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue());
                        final android.content.Context context3 = context2;
                        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: j4.j$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4.i.b(context3, new j4.ExecutorC28999x2e755c(), j4.i.f379107a, false);
                            }
                        });
                    }
                }, nextInt + 5000);
            }
        });
        return new j4.m();
    }
}
