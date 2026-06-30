package qi3;

/* loaded from: classes12.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final qi3.g0 f445224a;

    /* renamed from: b, reason: collision with root package name */
    public final qi3.b0 f445225b;

    /* renamed from: c, reason: collision with root package name */
    public qi3.f0 f445226c;

    /* renamed from: d, reason: collision with root package name */
    public qi3.i0 f445227d;

    /* renamed from: e, reason: collision with root package name */
    public qi3.d0 f445228e;

    /* renamed from: f, reason: collision with root package name */
    public qi3.k0 f445229f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f445230g;

    /* renamed from: h, reason: collision with root package name */
    public float f445231h;

    public e0(qi3.g0 status, qi3.b0 sendTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendTask, "sendTask");
        this.f445224a = status;
        this.f445225b = sendTask;
    }

    public int a() {
        qi3.d0 d0Var = this.f445228e;
        if (d0Var != null) {
            return d0Var.f445216a;
        }
        qi3.i0 i0Var = this.f445227d;
        if (i0Var != null) {
            return i0Var.f445258a;
        }
        qi3.f0 f0Var = this.f445226c;
        if (f0Var != null) {
            return f0Var.f445233a;
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m160185x9616526c() {
        return "SendMsgEvent:[status:" + this.f445224a + ",id:" + this.f445225b.id() + ", retCode:" + a() + ", idTalker:" + this.f445230g + " percent:" + this.f445231h + ']';
    }
}
