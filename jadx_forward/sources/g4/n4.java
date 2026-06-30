package g4;

/* loaded from: classes5.dex */
public final class n4 implements g4.m4, p3325xe03a0797.p3326xc267989b.y0, u26.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final u26.y0 f349992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f349993e;

    public n4(p3325xe03a0797.p3326xc267989b.y0 scope, u26.y0 channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f349993e = scope;
        this.f349992d = channel;
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l mo7786x54170f2d() {
        return this.f349993e.mo7786x54170f2d();
    }

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        return this.f349992d.s(th6);
    }

    @Override // u26.y0
    public java.lang.Object t(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return this.f349992d.t(obj, interfaceC29045xdcb5ca57);
    }
}
