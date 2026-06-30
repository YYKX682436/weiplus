package qe2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f443568a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f443569b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f443570c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f443571d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc f443572e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443573f;

    public c(java.lang.String username, java.lang.String nickname, java.lang.String headUrl, boolean z17, boolean z18, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z18 = (i17 & 16) != 0 ? false : z18;
        c19780xceb4c4dc = (i17 & 32) != 0 ? null : c19780xceb4c4dc;
        z19 = (i17 & 64) != 0 ? false : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headUrl, "headUrl");
        this.f443568a = username;
        this.f443569b = nickname;
        this.f443570c = headUrl;
        this.f443571d = z18;
        this.f443572e = c19780xceb4c4dc;
        this.f443573f = z19;
    }
}
