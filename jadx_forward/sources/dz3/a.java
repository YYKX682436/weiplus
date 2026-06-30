package dz3;

/* loaded from: classes15.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f326630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f326631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz3.c f326632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f326633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f326634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f326635i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dz3.i f326636m;

    public a(dz3.i iVar, byte[] bArr, android.graphics.RectF rectF, tz3.c cVar, int i17, int i18, int i19) {
        this.f326636m = iVar;
        this.f326630d = bArr;
        this.f326631e = rectF;
        this.f326632f = cVar;
        this.f326633g = i17;
        this.f326634h = i18;
        this.f326635i = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.RectF rectF;
        if (!this.f326636m.f326666a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReIdAiScanImageDecodeQueue", "decodeFullImage not inited");
            return;
        }
        tz3.c cVar = this.f326632f;
        byte[] bArr = this.f326630d;
        if (bArr == null || (rectF = this.f326631e) == null) {
            if (cVar != null) {
                cVar.b(null);
                return;
            }
            return;
        }
        sz3.c1 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.i(this.f326633g, rectF, bArr, this.f326634h, this.f326635i);
        if (i17 != null) {
            i17.f495507a = 3;
            i17.f495508b = java.lang.System.currentTimeMillis();
        }
        if (cVar != null) {
            cVar.b(i17);
        }
    }
}
