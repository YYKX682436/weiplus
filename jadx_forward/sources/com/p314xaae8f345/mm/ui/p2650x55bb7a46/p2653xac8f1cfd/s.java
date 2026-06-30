package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281419a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281421c;

    /* renamed from: d, reason: collision with root package name */
    public final int f281422d;

    /* renamed from: e, reason: collision with root package name */
    public final long f281423e;

    /* renamed from: f, reason: collision with root package name */
    public long f281424f;

    public s(java.lang.String sessionId, java.lang.String chatName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
        this.f281419a = sessionId;
        this.f281420b = chatName;
        this.f281421c = i17;
        this.f281422d = i18;
        this.f281423e = java.lang.System.currentTimeMillis();
        this.f281424f = -1L;
    }

    /* renamed from: equals */
    public boolean m79522xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s sVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f281419a, sVar.f281419a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f281420b, sVar.f281420b) && this.f281421c == sVar.f281421c && this.f281422d == sVar.f281422d;
    }

    /* renamed from: hashCode */
    public int m79523x8cdac1b() {
        return (((((this.f281419a.hashCode() * 31) + this.f281420b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f281421c)) * 31) + java.lang.Integer.hashCode(this.f281422d);
    }

    /* renamed from: toString */
    public java.lang.String m79524x9616526c() {
        return "ChattingStatInfo(sessionId='" + this.f281419a + "', chatName='" + this.f281420b + "', chatType=" + this.f281421c + ", chatRoomUserCountOnEnter=" + this.f281422d + ", enterTime=" + this.f281423e + ", exitTime=" + this.f281424f + ')';
    }
}
