package ep5;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337297a;

    /* renamed from: b, reason: collision with root package name */
    public int f337298b;

    /* renamed from: c, reason: collision with root package name */
    public int f337299c;

    /* renamed from: d, reason: collision with root package name */
    public long f337300d;

    /* renamed from: e, reason: collision with root package name */
    public long f337301e;

    public a(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f337297a = tag;
    }

    public final boolean a(int i17) {
        boolean H0 = ((jp5.o) i95.n0.c(jp5.o.class)).H0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "isCameraPause:" + ((jp5.o) i95.n0.c(jp5.o.class)).H0());
        if (H0) {
            this.f337300d = java.lang.System.currentTimeMillis();
            return false;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f337300d) / 1000);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "isBlackRender:" + this.f337301e + ", " + longValue + ", " + this.f337300d);
        return longValue >= ((long) i17) && this.f337300d != 0;
    }

    public final boolean b(int i17) {
        java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f337300d) / 1000);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "isRenderFailed:" + this.f337301e + ", " + longValue + ", " + this.f337300d);
        if (this.f337301e != 0) {
            return longValue >= ((long) i17) && this.f337300d != 0;
        }
        return true;
    }

    /* renamed from: equals */
    public boolean m127968xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep5.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337297a, ((ep5.a) obj).f337297a);
    }

    /* renamed from: hashCode */
    public int m127969x8cdac1b() {
        return this.f337297a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127970x9616526c() {
        return "TraceInfo(tag=" + this.f337297a + ')';
    }
}
