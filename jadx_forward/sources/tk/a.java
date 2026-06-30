package tk;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f501390a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 f501391b;

    public a(boolean z17, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f501390a = z17;
        this.f501391b = scene;
    }

    /* renamed from: equals */
    public boolean m166681xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.a)) {
            return false;
        }
        tk.a aVar = (tk.a) obj;
        return this.f501390a == aVar.f501390a && this.f501391b == aVar.f501391b;
    }

    /* renamed from: hashCode */
    public int m166682x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f501390a) * 31) + this.f501391b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166683x9616526c() {
        return "BizPublishEditorCheckResult(shouldUseNewEditor=" + this.f501390a + ", scene=" + this.f501391b + ')';
    }
}
