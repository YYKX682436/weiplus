package hu3;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final hu3.a f366727a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f366728b;

    /* renamed from: c, reason: collision with root package name */
    public final tl.w f366729c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.p f366730d;

    public s0(hu3.a audioConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioConfig, "audioConfig");
        this.f366727a = audioConfig;
        this.f366728b = "MicroMsg.RecordMaasTemplateAudioRecorder";
        tl.w wVar = new tl.w(audioConfig.f366615a, audioConfig.f366616b, 5);
        this.f366729c = wVar;
        wVar.e(1);
        wVar.f501693m = -19;
        wVar.f501705y = new hu3.r0(this);
        audioConfig.f366617c = wVar.f501688h;
    }

    public final void a(yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f366730d = callback;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f366728b, "start ret:" + this.f366729c.k());
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f366728b, "stop ret:" + this.f366729c.l());
        this.f366730d = null;
    }
}
