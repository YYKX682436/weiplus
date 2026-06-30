package su0;

/* loaded from: classes5.dex */
public final class b implements com.p314xaae8f345.p457x3304c6.p482xca9708e2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f494159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su0.j f494160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 f494161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f494162d;

    public b(yz5.l lVar, su0.j jVar, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, java.lang.Object obj) {
        this.f494159a = lVar;
        this.f494160b = jVar;
        this.f494161c = c4195xcab2df48;
        this.f494162d = obj;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.b
    public void a(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4194x93c4c6d6 c4194x93c4c6d6, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.nio.ByteBuffer byteBuffer;
        if (c4194x93c4c6d6 != null && (byteBuffer = c4194x93c4c6d6.f130072a) != null) {
            byteBuffer.capacity();
        }
        yz5.l lVar = this.f494159a;
        if (c4093x6b88526b != null || c4194x93c4c6d6 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAsyncSpeechRequest onComplete: message ");
            sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJTTSTaskExecutor", sb6.toString());
            lVar.mo146xb9724478(null);
            return;
        }
        if (c4194x93c4c6d6.f130073b) {
            lVar.mo146xb9724478(c4194x93c4c6d6);
        } else {
            this.f494160b.d(this.f494161c, this.f494162d, 1000L, this.f494159a);
        }
    }
}
