package xf0;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final xf0.i f535699a;

    /* renamed from: b, reason: collision with root package name */
    public final xf0.h f535700b;

    /* renamed from: c, reason: collision with root package name */
    public float f535701c;

    public g(xf0.i params, xf0.h type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f535699a = params;
        this.f535700b = type;
    }

    /* renamed from: equals */
    public boolean m175445xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0.g)) {
            return false;
        }
        xf0.g gVar = (xf0.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535699a, gVar.f535699a) && this.f535700b == gVar.f535700b;
    }

    /* renamed from: hashCode */
    public int m175446x8cdac1b() {
        return (this.f535699a.m175452x8cdac1b() * 31) + this.f535700b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175447x9616526c() {
        return "MsgVideoDownloadEvent(params=" + this.f535699a + ", type=" + this.f535700b + ')';
    }
}
