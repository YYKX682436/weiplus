package tl;

/* loaded from: classes14.dex */
public class y extends tl.f0 {

    /* renamed from: d, reason: collision with root package name */
    public android.media.AudioRecord f501711d;

    /* renamed from: f, reason: collision with root package name */
    public final tl.c f501713f;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f501715h;

    /* renamed from: i, reason: collision with root package name */
    public final int f501716i;

    /* renamed from: j, reason: collision with root package name */
    public final int f501717j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f501718k;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f501712e = null;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f501714g = null;

    /* renamed from: l, reason: collision with root package name */
    public final android.media.AudioRecord.OnRecordPositionUpdateListener f501719l = new tl.x(this);

    public y(android.media.AudioRecord audioRecord, tl.c cVar, boolean z17, int i17, int i18) {
        this.f501711d = audioRecord;
        this.f501713f = cVar;
        this.f501715h = z17;
        this.f501716i = i17;
        this.f501717j = i18;
    }

    @Override // tl.f0
    public boolean a() {
        if (this.f501712e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordModeAsyncCallback", "alreay started record");
            return false;
        }
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("RecordModeAsyncCallback_handlerThread", 10);
        this.f501712e = a17;
        a17.start();
        this.f501711d.setRecordPositionUpdateListener(this.f501719l, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(this.f501712e.getLooper()));
        this.f501711d.setPositionNotificationPeriod(this.f501716i);
        boolean z17 = this.f501715h;
        int i18 = this.f501717j;
        if (z17 || this.f501714g == null) {
            this.f501714g = new byte[i18];
        }
        int read = this.f501711d.read(this.f501714g, 0, i18);
        tl.c cVar = this.f501713f;
        if (cVar == null || read <= 0) {
            return true;
        }
        cVar.b(this.f501714g, read);
        return true;
    }

    @Override // tl.f0
    public void b() {
        this.f501711d.setRecordPositionUpdateListener(null);
        this.f501711d = null;
        this.f501712e.quit();
        this.f501712e = null;
    }

    @Override // tl.f0
    public void c(boolean z17) {
        this.f501718k = z17;
    }
}
