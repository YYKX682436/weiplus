package vv0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f521902a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f521903b;

    public a(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        this.f521902a = info;
        this.f521903b = materialLoadState;
    }

    public static vv0.a a(vv0.a aVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = aVar.f521902a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = aVar.f521903b;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        return new vv0.a(info, materialLoadState);
    }

    /* renamed from: equals */
    public boolean m172683xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.a)) {
            return false;
        }
        vv0.a aVar = (vv0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521902a, aVar.f521902a) && this.f521903b == aVar.f521903b;
    }

    /* renamed from: hashCode */
    public int m172684x8cdac1b() {
        return (this.f521902a.hashCode() * 31) + this.f521903b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172685x9616526c() {
        return "ClipData(info=" + this.f521902a + ", materialLoadState=" + this.f521903b + ')';
    }
}
