package ml2;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.mu2 f409046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409047b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f409048c;

    /* renamed from: d, reason: collision with root package name */
    public final ml2.x1 f409049d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f409050e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f409051f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f409052g;

    public h0(r45.mu2 contact, int i17, java.lang.String feedId, ml2.x1 actionType, java.lang.String commentscene, boolean z17, java.lang.String nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f409046a = contact;
        this.f409047b = i17;
        this.f409048c = feedId;
        this.f409049d = actionType;
        this.f409050e = commentscene;
        this.f409051f = z17;
        this.f409052g = nickName;
    }

    /* renamed from: equals */
    public boolean m147539xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.h0)) {
            return false;
        }
        ml2.h0 h0Var = (ml2.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409046a, h0Var.f409046a) && this.f409047b == h0Var.f409047b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409048c, h0Var.f409048c) && this.f409049d == h0Var.f409049d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409050e, h0Var.f409050e) && this.f409051f == h0Var.f409051f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409052g, h0Var.f409052g);
    }

    /* renamed from: hashCode */
    public int m147540x8cdac1b() {
        return (((((((((((this.f409046a.hashCode() * 31) + java.lang.Integer.hashCode(this.f409047b)) * 31) + this.f409048c.hashCode()) * 31) + this.f409049d.hashCode()) * 31) + this.f409050e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f409051f)) * 31) + this.f409052g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147541x9616526c() {
        return "HellLiveMixSearchItem(contact=" + this.f409046a + ", pos=" + this.f409047b + ", feedId=" + this.f409048c + ", actionType=" + this.f409049d + ", commentscene=" + this.f409050e + ", liveStatus=" + this.f409051f + ", nickName=" + this.f409052g + ')';
    }
}
