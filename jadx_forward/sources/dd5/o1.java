package dd5;

/* loaded from: classes12.dex */
public final class o1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final oi3.f f310768a;

    /* renamed from: b, reason: collision with root package name */
    public final xs.z0 f310769b;

    public o1(oi3.f simpleImgMsgInfo, xs.z0 preResolvedPaths) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleImgMsgInfo, "simpleImgMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preResolvedPaths, "preResolvedPaths");
        this.f310768a = simpleImgMsgInfo;
        this.f310769b = preResolvedPaths;
    }

    /* renamed from: equals */
    public boolean m124057xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.o1)) {
            return false;
        }
        dd5.o1 o1Var = (dd5.o1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310768a, o1Var.f310768a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310769b, o1Var.f310769b);
    }

    /* renamed from: hashCode */
    public int m124058x8cdac1b() {
        return (this.f310768a.hashCode() * 31) + this.f310769b.m175861x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m124059x9616526c() {
        return "ViewModel(simpleImgMsgInfo=" + this.f310768a + ", preResolvedPaths=" + this.f310769b + ')';
    }
}
