package cj3;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f41877a;

    /* renamed from: b, reason: collision with root package name */
    public final nj3.a f41878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41879c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41880d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41881e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41882f;

    public c(java.lang.String username, nj3.a dataBuffer, int i17, int i18, boolean z17, int i19) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
        this.f41877a = username;
        this.f41878b = dataBuffer;
        this.f41879c = i17;
        this.f41880d = i18;
        this.f41881e = z17;
        this.f41882f = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj3.c)) {
            return false;
        }
        cj3.c cVar = (cj3.c) obj;
        return kotlin.jvm.internal.o.b(this.f41877a, cVar.f41877a) && kotlin.jvm.internal.o.b(this.f41878b, cVar.f41878b) && this.f41879c == cVar.f41879c && this.f41880d == cVar.f41880d && this.f41881e == cVar.f41881e && this.f41882f == cVar.f41882f;
    }

    public int hashCode() {
        return (((((((((this.f41877a.hashCode() * 31) + this.f41878b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f41879c)) * 31) + java.lang.Integer.hashCode(this.f41880d)) * 31) + java.lang.Boolean.hashCode(this.f41881e)) * 31) + java.lang.Integer.hashCode(this.f41882f);
    }

    public java.lang.String toString() {
        return "DecodeResult(username=" + this.f41877a + ", dataBuffer=" + this.f41878b + ", w=" + this.f41879c + ", h=" + this.f41880d + ", screenFrame=" + this.f41881e + ", screenOri=" + this.f41882f + ')';
    }

    public /* synthetic */ c(java.lang.String str, nj3.a aVar, int i17, int i18, boolean z17, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this(str, aVar, i17, i18, z17, (i27 & 32) != 0 ? -1 : i19);
    }
}
