package cf5;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f40957a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f40958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40959c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f40961e;

    public d(long j17, java.lang.String enterSource, long j18, boolean z17, java.util.List actions, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        actions = (i17 & 16) != 0 ? new java.util.ArrayList() : actions;
        kotlin.jvm.internal.o.g(enterSource, "enterSource");
        kotlin.jvm.internal.o.g(actions, "actions");
        this.f40957a = j17;
        this.f40958b = enterSource;
        this.f40959c = j18;
        this.f40960d = z17;
        this.f40961e = actions;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.d)) {
            return false;
        }
        cf5.d dVar = (cf5.d) obj;
        return this.f40957a == dVar.f40957a && kotlin.jvm.internal.o.b(this.f40958b, dVar.f40958b) && this.f40959c == dVar.f40959c && this.f40960d == dVar.f40960d && kotlin.jvm.internal.o.b(this.f40961e, dVar.f40961e);
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f40957a) * 31) + this.f40958b.hashCode()) * 31) + java.lang.Long.hashCode(this.f40959c)) * 31) + java.lang.Boolean.hashCode(this.f40960d)) * 31) + this.f40961e.hashCode();
    }

    public java.lang.String toString() {
        return "ActivePreviewSession(msgSvrId=" + this.f40957a + ", enterSource=" + this.f40958b + ", startElapsedMs=" + this.f40959c + ", selectionTriggered=" + this.f40960d + ", actions=" + this.f40961e + ')';
    }
}
