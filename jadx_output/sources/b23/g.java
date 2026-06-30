package b23;

/* loaded from: classes12.dex */
public final class g extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.ui.widget.k1 f17393b;

    public g(com.tencent.mm.plugin.fts.ui.widget.k1 proxy) {
        kotlin.jvm.internal.o.g(proxy, "proxy");
        this.f17393b = proxy;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b23.g) && kotlin.jvm.internal.o.b(this.f17393b, ((b23.g) obj).f17393b);
    }

    public int hashCode() {
        return this.f17393b.hashCode();
    }

    public java.lang.String toString() {
        return "VoiceSearchRequiredAction(proxy=" + this.f17393b + ')';
    }
}
