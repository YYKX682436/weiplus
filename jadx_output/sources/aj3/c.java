package aj3;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modeltalkroom.MultiTalkGroupMember f5303a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f5304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5305c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5306d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f5307e;

    public c(com.tencent.mm.modeltalkroom.MultiTalkGroupMember member, android.view.View.OnClickListener listener, int i17, boolean z17, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(member, "member");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f5303a = member;
        this.f5304b = listener;
        this.f5305c = i17;
        this.f5306d = z17;
        this.f5307e = nickName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj3.c)) {
            return false;
        }
        aj3.c cVar = (aj3.c) obj;
        return kotlin.jvm.internal.o.b(this.f5303a, cVar.f5303a) && kotlin.jvm.internal.o.b(this.f5304b, cVar.f5304b) && this.f5305c == cVar.f5305c && this.f5306d == cVar.f5306d && kotlin.jvm.internal.o.b(this.f5307e, cVar.f5307e);
    }

    public int hashCode() {
        return (((((((this.f5303a.hashCode() * 31) + this.f5304b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f5305c)) * 31) + java.lang.Boolean.hashCode(this.f5306d)) * 31) + this.f5307e.hashCode();
    }

    public java.lang.String toString() {
        return "MultitalkAvatarViewData(member=" + this.f5303a + ", listener=" + this.f5304b + ", index=" + this.f5305c + ", isRenderVideo=" + this.f5306d + ", nickName=" + this.f5307e + ')';
    }
}
