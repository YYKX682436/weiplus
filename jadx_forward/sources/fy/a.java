package fy;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f348691a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f348692b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f348693c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f348694d;

    /* renamed from: e, reason: collision with root package name */
    public final long f348695e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f348696f;

    public a(java.lang.String chatId, java.lang.String nickname, java.lang.String remark, java.lang.String desc, long j17, java.lang.String matchedKeyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatId, "chatId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remark, "remark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchedKeyword, "matchedKeyword");
        this.f348691a = chatId;
        this.f348692b = nickname;
        this.f348693c = remark;
        this.f348694d = desc;
        this.f348695e = j17;
        this.f348696f = matchedKeyword;
    }

    /* renamed from: equals */
    public boolean m130529xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy.a)) {
            return false;
        }
        fy.a aVar = (fy.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348691a, aVar.f348691a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348692b, aVar.f348692b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348693c, aVar.f348693c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348694d, aVar.f348694d) && this.f348695e == aVar.f348695e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348696f, aVar.f348696f);
    }

    /* renamed from: hashCode */
    public int m130530x8cdac1b() {
        return (((((((((this.f348691a.hashCode() * 31) + this.f348692b.hashCode()) * 31) + this.f348693c.hashCode()) * 31) + this.f348694d.hashCode()) * 31) + java.lang.Long.hashCode(this.f348695e)) * 31) + this.f348696f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130531x9616526c() {
        return "ContactResult(chatId=" + this.f348691a + ", nickname=" + this.f348692b + ", remark=" + this.f348693c + ", desc=" + this.f348694d + ", recentChatTime=" + this.f348695e + ", matchedKeyword=" + this.f348696f + ')';
    }
}
