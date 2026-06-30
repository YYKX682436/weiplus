package h41;

/* loaded from: classes15.dex */
public final class f0 implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360311a;

    public f0(h41.i0 i0Var) {
        this.f360311a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.t
    public java.lang.String b() {
        return "contact::search_contacts";
    }

    @Override // ey.t
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o notification) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        this.f360311a.f360334h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "search_contacts start");
    }
}
