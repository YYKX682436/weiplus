package h41;

/* loaded from: classes15.dex */
public final class a0 implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360290a;

    public a0(h41.i0 i0Var) {
        this.f360290a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return "ovc";
    }

    @Override // ey.t
    public java.lang.String b() {
        return "ovc::cancel_session";
    }

    @Override // ey.t
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o notification) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.d dVar = this.f360290a.f360327a;
        if (dVar != null) {
            dVar.G0();
        }
    }
}
