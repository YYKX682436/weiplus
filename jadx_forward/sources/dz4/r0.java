package dz4;

/* loaded from: classes12.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f326916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f326917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f326918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f326919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f326920h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j17, long j18, long j19, long j27, long j28, long j29) {
        super(0);
        this.f326916d = j17;
        this.f326917e = j18;
        this.f326918f = j19;
        this.f326919g = j27;
        this.f326920h = j28;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k82.c cVar = k82.c.f386420a;
        java.util.HashMap hashMap = k82.c.f386421b;
        long j17 = this.f326916d;
        k82.b bVar = (k82.b) hashMap.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f386416m = true;
            long j18 = this.f326918f;
            long j19 = bVar.f386409f;
            bVar.f386410g = j18 + j19;
            bVar.f386411h = true;
            long j27 = j19 + this.f326917e;
            bVar.f386413j = j27;
            bVar.f386414k = j27 + this.f326919g + this.f326920h;
            cVar.d(bVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavEnterReporter", "reportFlutterNoteEnterSuccess: localId not found, localId=" + j17);
        }
        return jz5.f0.f384359a;
    }
}
