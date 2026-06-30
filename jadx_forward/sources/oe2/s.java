package oe2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f426315a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f426316b;

    public s(java.util.List liveList, java.lang.String chatRoomId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveList, "liveList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        this.f426315a = liveList;
        this.f426316b = chatRoomId;
    }

    /* renamed from: equals */
    public boolean m151167xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe2.s)) {
            return false;
        }
        oe2.s sVar = (oe2.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426315a, sVar.f426315a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426316b, sVar.f426316b);
    }

    /* renamed from: hashCode */
    public int m151168x8cdac1b() {
        return (this.f426315a.hashCode() * 31) + this.f426316b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151169x9616526c() {
        return "NewXmlFinderChatRoomLiveTipsbar(liveList=" + this.f426315a + ", chatRoomId=" + this.f426316b + ')';
    }
}
