package wi5;

/* loaded from: classes.dex */
public final class j extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527830b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f527831c;

    /* renamed from: d, reason: collision with root package name */
    public final long f527832d;

    public /* synthetic */ j(java.lang.String str, boolean z17, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? 0L : j17);
    }

    /* renamed from: equals */
    public boolean m173849xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.j)) {
            return false;
        }
        wi5.j jVar = (wi5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527830b, jVar.f527830b) && this.f527831c == jVar.f527831c && this.f527832d == jVar.f527832d;
    }

    /* renamed from: hashCode */
    public int m173850x8cdac1b() {
        return (((this.f527830b.hashCode() * 31) + java.lang.Boolean.hashCode(this.f527831c)) * 31) + java.lang.Long.hashCode(this.f527832d);
    }

    /* renamed from: toString */
    public java.lang.String m173851x9616526c() {
        return "CreateGroupStartChattingAction(username=" + this.f527830b + ", afterCreateGroup=" + this.f527831c + ", exitType=" + this.f527832d + ')';
    }

    public j(java.lang.String username, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f527830b = username;
        this.f527831c = z17;
        this.f527832d = j17;
    }
}
