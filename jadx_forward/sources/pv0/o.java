package pv0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f440073a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f440074b;

    public o(java.util.concurrent.atomic.AtomicInteger requestGroupCounter, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestGroupCounter, "requestGroupCounter");
        this.f440073a = requestGroupCounter;
        this.f440074b = z17;
    }

    /* renamed from: equals */
    public boolean m159067xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv0.o)) {
            return false;
        }
        pv0.o oVar = (pv0.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440073a, oVar.f440073a) && this.f440074b == oVar.f440074b;
    }

    /* renamed from: hashCode */
    public int m159068x8cdac1b() {
        return (this.f440073a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f440074b);
    }

    /* renamed from: toString */
    public java.lang.String m159069x9616526c() {
        return "InvokeFromOutsideMonitor(requestGroupCounter=" + this.f440073a + ", enable=" + this.f440074b + ')';
    }
}
