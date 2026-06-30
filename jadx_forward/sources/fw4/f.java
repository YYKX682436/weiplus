package fw4;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f348630a;

    /* renamed from: b, reason: collision with root package name */
    public final fw4.e f348631b;

    public f(com.p314xaae8f345.mm.p944x882e457a.m1 netSceneBase, fw4.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netSceneBase, "netSceneBase");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f348630a = netSceneBase;
        this.f348631b = callback;
    }

    /* renamed from: equals */
    public boolean m130516xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw4.f)) {
            return false;
        }
        fw4.f fVar = (fw4.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348630a, fVar.f348630a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348631b, fVar.f348631b);
    }

    /* renamed from: hashCode */
    public int m130517x8cdac1b() {
        return (this.f348630a.hashCode() * 31) + this.f348631b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130518x9616526c() {
        return "GetDownloadAppInfoRequest(netSceneBase=" + this.f348630a + ", callback=" + this.f348631b + ')';
    }
}
