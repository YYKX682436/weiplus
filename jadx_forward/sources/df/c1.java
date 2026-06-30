package df;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final df.c1 f310968a = new df.c1();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f310969b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.p2936x80def495.C25587x226dda3 f310970c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f310971d;

    /* renamed from: e, reason: collision with root package name */
    public static int f310972e;

    public final com.p314xaae8f345.p2936x80def495.C25587x226dda3 a() {
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = new com.p314xaae8f345.p2936x80def495.C25587x226dda3();
        c25587x226dda3.mo95670x316510();
        if (f310969b) {
            long m95854xceabf3ec = c25587x226dda3.m95854xceabf3ec();
            try {
                com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95793xa7d81bfe(m95854xceabf3ec);
            } catch (java.lang.Error e17) {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e("SkylinePreloader", "preloadTaskRunner " + m95854xceabf3ec + ' ' + c25587x226dda3 + " fail: " + e17);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e("SkylinePreloader", "preloadTaskRunner " + m95854xceabf3ec + ' ' + c25587x226dda3 + " fail: " + e18);
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 m95775x2669c10b = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95775x2669c10b(m95854xceabf3ec);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(m95854xceabf3ec);
            sb6.append(' ');
            sb6.append(c25587x226dda3);
            sb6.append(" use task_Runner: ");
            sb6.append(m95775x2669c10b);
            sb6.append(" - ");
            sb6.append(m95775x2669c10b != null ? java.lang.Long.valueOf(m95775x2669c10b.m137837xd9c84069()) : null);
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylinePreloader", sb6.toString());
            if (m95775x2669c10b != null) {
                c25587x226dda3.mo95672x8aa013d9(m95775x2669c10b.m137837xd9c84069());
            }
            if (m95775x2669c10b != null) {
                m95775x2669c10b.m137839x3498a0(new df.b1(c25587x226dda3));
            }
        }
        return c25587x226dda3;
    }
}
