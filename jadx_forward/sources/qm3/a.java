package qm3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile rm5.k f446292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f446293b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f446294c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f446295d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.t f446296e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f446297f;

    public a(rm5.k kVar, java.util.Set pending, java.util.Set requesting, java.util.Set readyTimes, u26.t channel, p3325xe03a0797.p3326xc267989b.r2 r2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        kVar = (i17 & 1) != 0 ? null : kVar;
        pending = (i17 & 2) != 0 ? new java.util.HashSet() : pending;
        requesting = (i17 & 4) != 0 ? new java.util.HashSet() : requesting;
        readyTimes = (i17 & 8) != 0 ? new java.util.HashSet() : readyTimes;
        channel = (i17 & 16) != 0 ? new u26.q(10) : channel;
        r2Var = (i17 & 32) != 0 ? null : r2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pending, "pending");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requesting, "requesting");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(readyTimes, "readyTimes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f446292a = kVar;
        this.f446293b = pending;
        this.f446294c = requesting;
        this.f446295d = readyTimes;
        this.f446296e = channel;
        this.f446297f = r2Var;
    }
}
