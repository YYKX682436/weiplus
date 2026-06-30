package ln1;

/* loaded from: classes12.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.s f401283a;

    /* renamed from: b, reason: collision with root package name */
    public ln1.c0 f401284b = null;

    /* renamed from: c, reason: collision with root package name */
    public long f401285c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f401286d = new java.util.concurrent.atomic.AtomicInteger(0);

    public f0(ln1.s sVar) {
        this.f401283a = sVar;
    }

    public boolean a() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f401286d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackAndSend.TagQueueSucker", "endCount:%d", java.lang.Integer.valueOf(atomicInteger.get()));
        return atomicInteger.get() == 0;
    }
}
