package b31;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str) {
        super(0);
        this.f17610d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b31.l.f17614b;
        java.lang.String str = this.f17610d;
        b31.e eVar = (b31.e) concurrentHashMap.remove(str);
        if (eVar != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoiceInputReporter", "stop report timeout without StreamReportNotify, voiceId:%s", str);
            b31.l.f17613a.d(eVar, 0L, 0L);
        }
        b31.l.f17615c.remove(str);
        return jz5.f0.f302826a;
    }
}
