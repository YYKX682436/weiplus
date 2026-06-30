package ml;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static ml.e f408712e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f408713a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f408714b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f408715c;

    /* renamed from: d, reason: collision with root package name */
    public int f408716d;

    public e() {
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue(9);
        this.f408715c = new java.util.LinkedList();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(availableProcessors)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadThreadPool", "getNormalCorePoolSize cpuCount:%d", objArr);
        int i18 = (availableProcessors * 2) + 2;
        if (i18 > 8) {
            i18 = 8;
        } else if (i18 < 4) {
            i18 = 4;
        }
        this.f408716d = i18;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i18, 8, 120L, java.util.concurrent.TimeUnit.SECONDS, priorityBlockingQueue, new ll.l("AUDIO_DOWNLOAD_THREAD_POOL_GROUP", "audio_download_thread#"));
        this.f408714b = threadPoolExecutor;
        threadPoolExecutor.setMaximumPoolSize(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadThreadPool", "new AudioThreadPool poolSize:%d", java.lang.Integer.valueOf(i18));
    }

    public void a(int i17) {
        if (i17 > 8) {
            this.f408716d = 8;
        } else if (i17 < 4) {
            this.f408716d = 4;
        } else {
            this.f408716d = i17;
        }
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadThreadPool", "setCorePoolSize poolSize:%d", objArr);
        this.f408714b.setCorePoolSize(i17);
    }
}
