package uu0;

/* loaded from: classes5.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public final uu0.k f512788b;

    /* renamed from: c, reason: collision with root package name */
    public final int f512789c;

    /* renamed from: d, reason: collision with root package name */
    public final int f512790d;

    /* renamed from: e, reason: collision with root package name */
    public final int f512791e;

    /* renamed from: f, reason: collision with root package name */
    public final int f512792f;

    /* renamed from: h, reason: collision with root package name */
    public uu0.n f512794h;

    /* renamed from: i, reason: collision with root package name */
    public uu0.a f512795i;

    /* renamed from: a, reason: collision with root package name */
    public tl.w f512787a = null;

    /* renamed from: g, reason: collision with root package name */
    public long f512793g = 0;

    /* renamed from: j, reason: collision with root package name */
    public final tl.v f512796j = new uu0.m(this);

    public o(uu0.k kVar) {
        kVar = kVar == null ? new uu0.k() : kVar;
        this.f512789c = kVar.f512777b;
        this.f512790d = kVar.f512778c;
        this.f512791e = kVar.f512782g;
        this.f512792f = kVar.f512784i;
        this.f512788b = kVar;
    }

    public boolean a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecorder", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        tl.w wVar = this.f512787a;
        boolean l17 = wVar != null ? wVar.l() : false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f512793g -= currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecorder", "stop time ticket:%d, costTimeInMs:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f512793g));
        return l17;
    }
}
