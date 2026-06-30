package fk;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h f344781a;

    /* renamed from: b, reason: collision with root package name */
    public long f344782b;

    /* renamed from: c, reason: collision with root package name */
    public long f344783c;

    public a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h foregroundListener, long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j18 = (i17 & 4) != 0 ? 0L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foregroundListener, "foregroundListener");
        this.f344781a = foregroundListener;
        this.f344782b = j17;
        this.f344783c = j18;
    }

    /* renamed from: equals */
    public boolean m129612xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk.a)) {
            return false;
        }
        fk.a aVar = (fk.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f344781a, aVar.f344781a) && this.f344782b == aVar.f344782b && this.f344783c == aVar.f344783c;
    }

    /* renamed from: hashCode */
    public int m129613x8cdac1b() {
        return (((this.f344781a.hashCode() * 31) + java.lang.Long.hashCode(this.f344782b)) * 31) + java.lang.Long.hashCode(this.f344783c);
    }

    /* renamed from: toString */
    public java.lang.String m129614x9616526c() {
        return "ExposeData(foregroundListener=" + this.f344781a + ", startTime=" + this.f344782b + ", exposeTime=" + this.f344783c + ')';
    }
}
