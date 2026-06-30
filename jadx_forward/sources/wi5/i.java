package wi5;

/* loaded from: classes.dex */
public final class i extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f527827c;

    public i(java.lang.String username, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f527826b = username;
        this.f527827c = i17;
    }

    /* renamed from: equals */
    public boolean m173846xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.i)) {
            return false;
        }
        wi5.i iVar = (wi5.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527826b, iVar.f527826b) && this.f527827c == iVar.f527827c;
    }

    /* renamed from: hashCode */
    public int m173847x8cdac1b() {
        return (this.f527826b.hashCode() * 31) + java.lang.Integer.hashCode(this.f527827c);
    }

    /* renamed from: toString */
    public java.lang.String m173848x9616526c() {
        return "CreateGroupSelectRelatedGroupReportAction(username=" + this.f527826b + ", position=" + this.f527827c + ')';
    }
}
