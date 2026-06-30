package we5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f526832a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f526833b;

    public a(yb5.d chattingContext, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f526832a = chattingContext;
        this.f526833b = msgInfo;
    }

    /* renamed from: equals */
    public boolean m173659xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we5.a)) {
            return false;
        }
        we5.a aVar = (we5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526832a, aVar.f526832a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526833b, aVar.f526833b);
    }

    /* renamed from: hashCode */
    public int m173660x8cdac1b() {
        return (this.f526832a.hashCode() * 31) + this.f526833b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173661x9616526c() {
        return "AsyncMsgParams(chattingContext=" + this.f526832a + ", msgInfo=" + this.f526833b + ')';
    }
}
