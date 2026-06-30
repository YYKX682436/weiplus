package ds2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f324397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17) {
        super(1);
        this.f324397d = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.i3 mediaCache = (so2.i3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaCache, "mediaCache");
        return java.lang.Boolean.valueOf(mediaCache.y0() >= ds2.h.f324401c || (this.f324397d && mediaCache.w0() > 0));
    }
}
