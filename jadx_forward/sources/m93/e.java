package m93;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m93.i f406562f;

    public e(m93.i iVar, java.lang.String str, int i17) {
        this.f406562f = iVar;
        this.f406560d = str;
        this.f406561e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        m93.i iVar = this.f406562f;
        ((java.util.concurrent.ConcurrentHashMap) iVar.f406572e).remove(this.f406560d + "_" + java.lang.Integer.toString(this.f406561e));
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) iVar.f406572e).entrySet().iterator();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (it.hasNext()) {
            long j17 = currentTimeMillis - ((m93.f) ((java.util.Map.Entry) it.next()).getValue()).f406564b;
            if (j17 < 0 || j17 > 3600000) {
                it.remove();
            }
        }
    }
}
