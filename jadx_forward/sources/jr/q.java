package jr;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f382851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f382852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f382853c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382854d;

    public q(long j17, int i17, int i18, java.lang.String preloadSessionId, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        preloadSessionId = (i19 & 8) != 0 ? "-1" : preloadSessionId;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadSessionId, "preloadSessionId");
        this.f382851a = j17;
        this.f382852b = i17;
        this.f382853c = i18;
        this.f382854d = preloadSessionId;
    }
}
