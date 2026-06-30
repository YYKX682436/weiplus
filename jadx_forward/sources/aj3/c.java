package aj3;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 f86836a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f86837b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86838c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86839d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f86840e;

    public c(com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 member, android.view.View.OnClickListener listener, int i17, boolean z17, java.lang.String nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f86836a = member;
        this.f86837b = listener;
        this.f86838c = i17;
        this.f86839d = z17;
        this.f86840e = nickName;
    }

    /* renamed from: equals */
    public boolean m2131xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj3.c)) {
            return false;
        }
        aj3.c cVar = (aj3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86836a, cVar.f86836a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86837b, cVar.f86837b) && this.f86838c == cVar.f86838c && this.f86839d == cVar.f86839d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86840e, cVar.f86840e);
    }

    /* renamed from: hashCode */
    public int m2132x8cdac1b() {
        return (((((((this.f86836a.hashCode() * 31) + this.f86837b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f86838c)) * 31) + java.lang.Boolean.hashCode(this.f86839d)) * 31) + this.f86840e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2133x9616526c() {
        return "MultitalkAvatarViewData(member=" + this.f86836a + ", listener=" + this.f86837b + ", index=" + this.f86838c + ", isRenderVideo=" + this.f86839d + ", nickName=" + this.f86840e + ')';
    }
}
