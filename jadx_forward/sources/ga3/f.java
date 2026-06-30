package ga3;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f351385a;

    /* renamed from: b, reason: collision with root package name */
    public final long f351386b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f351387c;

    public f(java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorderHelper", "LiteAppRecorderHelper create appId:%s, appUuid:%d", str, java.lang.Long.valueOf(j17));
        this.f351385a = str;
        this.f351386b = j17;
    }

    public java.lang.String a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorderHelper", "LiteAppRecorderHelper stopRecord");
        return this.f351386b != ga3.v.g().f351417j ? ga3.v.g().i(this.f351387c, "recorder has been stopped", false) : ga3.v.g().k();
    }
}
