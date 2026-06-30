package b31;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str) {
        super(0);
        this.f99143d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b31.l.f99147b;
        java.lang.String str = this.f99143d;
        b31.e eVar = (b31.e) concurrentHashMap.remove(str);
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceInputReporter", "stop report timeout without StreamReportNotify, voiceId:%s", str);
            b31.l.f99146a.d(eVar, 0L, 0L);
        }
        b31.l.f99148c.remove(str);
        return jz5.f0.f384359a;
    }
}
