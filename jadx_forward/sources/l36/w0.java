package l36;

/* loaded from: classes16.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.k0 f397214a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397215b;

    /* renamed from: c, reason: collision with root package name */
    public final l36.i0 f397216c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f397217d;

    /* renamed from: e, reason: collision with root package name */
    public volatile l36.l f397218e;

    public w0(l36.v0 v0Var) {
        this.f397214a = v0Var.f397197a;
        this.f397215b = v0Var.f397198b;
        l36.h0 h0Var = v0Var.f397199c;
        h0Var.getClass();
        this.f397216c = new l36.i0(h0Var);
        v0Var.getClass();
        byte[] bArr = m36.e.f404919a;
        java.util.Map map = v0Var.f397200d;
        this.f397217d = map.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
    }

    public java.lang.String a(java.lang.String str) {
        return this.f397216c.c(str);
    }

    /* renamed from: toString */
    public java.lang.String m145056x9616526c() {
        return "Request{method=" + this.f397215b + ", url=" + this.f397214a + ", tags=" + this.f397217d + '}';
    }
}
