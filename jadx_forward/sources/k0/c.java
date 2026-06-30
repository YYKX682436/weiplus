package k0;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f384406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f384407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, long j17) {
        super(1);
        this.f384406d = z17;
        this.f384407e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        ((y1.l) semantics).g(k0.y.f384507c, new k0.x(this.f384406d ? j0.u1.SelectionStart : j0.u1.SelectionEnd, this.f384407e, null));
        return jz5.f0.f384359a;
    }
}
