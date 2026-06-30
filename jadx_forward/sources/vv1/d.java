package vv1;

/* loaded from: classes9.dex */
public abstract class d implements java.lang.Runnable, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final wv1.a f521938d;

    /* renamed from: e, reason: collision with root package name */
    public vv1.a f521939e;

    /* renamed from: f, reason: collision with root package name */
    public long f521940f;

    /* renamed from: g, reason: collision with root package name */
    public long f521941g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f521942h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f521943i = new vv1.c(this);

    public d(wv1.a aVar, vv1.a aVar2, im5.b bVar) {
        this.f521938d = aVar;
        this.f521939e = aVar2;
        if (bVar != null) {
            bVar.mo46316x322b85(this);
        }
    }

    public synchronized void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Base", "callFail");
        vv1.a aVar = this.f521939e;
        if (aVar != null) {
            aVar.c();
            this.f521939e = null;
        }
    }

    public synchronized void b(long j17, long j18) {
        vv1.a aVar;
        this.f521940f = j17;
        this.f521941g = j18;
        if (this.f521942h && (aVar = this.f521939e) != null) {
            aVar.a(j17, j18);
        }
    }

    public synchronized void c(com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Base", "onDownloadSuccess msgFile:%s", c10396xb34a007d);
        vv1.a aVar = this.f521939e;
        if (aVar != null) {
            aVar.d(c10396xb34a007d);
            this.f521939e = null;
        }
    }

    public abstract boolean d();

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
    }

    public abstract boolean j();

    public abstract void k();

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f521943i, 2000L);
        k();
    }

    /* renamed from: toString */
    public java.lang.String m172711x9616526c() {
        return "MsgFileWorker_Base{mMsgItem=" + this.f521938d + '}';
    }
}
