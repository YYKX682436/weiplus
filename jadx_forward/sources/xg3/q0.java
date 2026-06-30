package xg3;

/* loaded from: classes11.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f535955a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f535956b;

    /* renamed from: c, reason: collision with root package name */
    public long f535957c;

    /* renamed from: d, reason: collision with root package name */
    public int f535958d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f535959e;

    /* renamed from: f, reason: collision with root package name */
    public int f535960f;

    /* renamed from: g, reason: collision with root package name */
    public long f535961g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f535962h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f535963i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f535964j;

    public q0(int i17) {
        this.f535958d = i17;
    }

    public byte[] a() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (this.f535959e == null && (fVar = this.f535964j) != null) {
            try {
                this.f535959e = fVar.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: " + e17.getMessage());
            }
        }
        return this.f535959e;
    }

    public int b() {
        return this.f535958d;
    }
}
