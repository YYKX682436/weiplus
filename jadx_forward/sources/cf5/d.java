package cf5;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f122490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f122491b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122492c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122493d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f122494e;

    public d(long j17, java.lang.String enterSource, long j18, boolean z17, java.util.List actions, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        actions = (i17 & 16) != 0 ? new java.util.ArrayList() : actions;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterSource, "enterSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actions, "actions");
        this.f122490a = j17;
        this.f122491b = enterSource;
        this.f122492c = j18;
        this.f122493d = z17;
        this.f122494e = actions;
    }

    /* renamed from: equals */
    public boolean m14755xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.d)) {
            return false;
        }
        cf5.d dVar = (cf5.d) obj;
        return this.f122490a == dVar.f122490a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122491b, dVar.f122491b) && this.f122492c == dVar.f122492c && this.f122493d == dVar.f122493d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122494e, dVar.f122494e);
    }

    /* renamed from: hashCode */
    public int m14756x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f122490a) * 31) + this.f122491b.hashCode()) * 31) + java.lang.Long.hashCode(this.f122492c)) * 31) + java.lang.Boolean.hashCode(this.f122493d)) * 31) + this.f122494e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14757x9616526c() {
        return "ActivePreviewSession(msgSvrId=" + this.f122490a + ", enterSource=" + this.f122491b + ", startElapsedMs=" + this.f122492c + ", selectionTriggered=" + this.f122493d + ", actions=" + this.f122494e + ')';
    }
}
