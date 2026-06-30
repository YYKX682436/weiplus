package xh1;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f536037a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh1.g f536039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xh1.g gVar, android.os.Looper looper) {
        super(looper);
        this.f536039c = gVar;
        this.f536037a = 5000L;
        this.f536038b = 1;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if ((message != null ? message.what : 0) == this.f536038b) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(message);
            java.lang.Object obj = message.obj;
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            if (num != null) {
                int intValue = num.intValue();
                xh1.g gVar = this.f536039c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f536043e, "timeout for requestId:" + intValue);
                gVar.b(intValue);
            }
        }
    }
}
