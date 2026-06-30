package ia3;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f371531a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f371532b;

    /* renamed from: c, reason: collision with root package name */
    public final long f371533c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f371534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f371535e;

    /* renamed from: f, reason: collision with root package name */
    public final long f371536f;

    /* renamed from: g, reason: collision with root package name */
    public final long f371537g;

    /* renamed from: h, reason: collision with root package name */
    public final long f371538h;

    /* renamed from: i, reason: collision with root package name */
    public final long f371539i;

    /* renamed from: j, reason: collision with root package name */
    public final long f371540j;

    /* renamed from: k, reason: collision with root package name */
    public final long f371541k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f371542l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f371543m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371544n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f371545o = false;

    public d(ia3.e eVar, long j17, java.lang.String str, long j18, boolean z17, int i17, long j19, long j27, long j28, long j29, long j37, long j38, long j39, boolean z18, boolean z19, java.lang.String str2) {
        this.f371531a = j17;
        this.f371532b = str;
        this.f371533c = j18;
        this.f371534d = z17;
        this.f371535e = i17;
        this.f371536f = j19;
        this.f371537g = j27;
        this.f371538h = j28;
        this.f371539i = j29;
        this.f371540j = j38;
        this.f371541k = j39;
        this.f371542l = z18;
        this.f371543m = str2;
    }

    public void a(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(this.f371532b, this.f371531a, this.f371533c, "", j17, str, z17, this.f371534d);
    }

    public void b() {
        long j17 = this.f371541k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onEnd callbackId:%d", java.lang.Long.valueOf(j17));
        this.f371545o = true;
        if (j17 != 0) {
            a(j17, new org.json.JSONObject().toString(), true);
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechEnd");
        d(this.f371544n, true);
        long j17 = this.f371538h;
        if (j17 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechEnd callbackId:%d", java.lang.Long.valueOf(j17));
            a(j17, jSONObject.toString(), true);
        }
    }

    public void d(java.lang.String str, boolean z17) {
        long j17 = this.f371536f;
        if (j17 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("result", str);
                jSONObject.put("isFinal", z17);
            } catch (java.lang.Exception unused) {
            }
            a(j17, jSONObject.toString(), true);
        }
    }
}
