package ga3;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c f351378b;

    /* renamed from: c, reason: collision with root package name */
    public final int f351379c;

    /* renamed from: d, reason: collision with root package name */
    public final int f351380d;

    /* renamed from: f, reason: collision with root package name */
    public ga3.d f351382f;

    /* renamed from: g, reason: collision with root package name */
    public final int f351383g;

    /* renamed from: a, reason: collision with root package name */
    public tl.w f351377a = null;

    /* renamed from: e, reason: collision with root package name */
    public long f351381e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final tl.v f351384h = new ga3.c(this);

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c) {
        this.f351379c = 0;
        this.f351380d = 0;
        this.f351383g = -1;
        c12420xb1146e9c = c12420xb1146e9c == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c() : c12420xb1146e9c;
        this.f351379c = c12420xb1146e9c.f167369e;
        this.f351380d = c12420xb1146e9c.f167370f;
        this.f351383g = c12420xb1146e9c.f167374m;
        this.f351378b = c12420xb1146e9c;
    }

    public boolean a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorder", "LiteApp stopRecord");
        tl.w wVar = this.f351377a;
        boolean l17 = wVar != null ? wVar.l() : false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f351381e -= currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorder", "LiteApp stop time ticket:%d, costTimeInMs:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f351381e));
        return l17;
    }
}
