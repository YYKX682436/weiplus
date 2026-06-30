package lh1;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c f400185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f400186c;

    /* renamed from: d, reason: collision with root package name */
    public final int f400187d;

    /* renamed from: f, reason: collision with root package name */
    public lh1.b f400189f;

    /* renamed from: g, reason: collision with root package name */
    public final int f400190g;

    /* renamed from: a, reason: collision with root package name */
    public tl.w f400184a = null;

    /* renamed from: e, reason: collision with root package name */
    public long f400188e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final tl.v f400191h = new lh1.a(this);

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c) {
        this.f400186c = 0;
        this.f400187d = 0;
        this.f400190g = -1;
        c12420xb1146e9c = c12420xb1146e9c == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c() : c12420xb1146e9c;
        this.f400186c = c12420xb1146e9c.f167369e;
        this.f400187d = c12420xb1146e9c.f167370f;
        this.f400190g = c12420xb1146e9c.f167374m;
        this.f400185b = c12420xb1146e9c;
    }

    public boolean a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecorder", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        tl.w wVar = this.f400184a;
        boolean l17 = wVar != null ? wVar.l() : false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f400188e -= currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecorder", "stop time ticket:%d, costTimeInMs:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f400188e));
        return l17;
    }
}
