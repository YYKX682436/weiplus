package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281205a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f281206b;

    /* renamed from: c, reason: collision with root package name */
    public int f281207c;

    public p4(java.lang.String groupId, java.util.List msgIdList, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        msgIdList = (i18 & 2) != 0 ? new java.util.ArrayList() : msgIdList;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdList, "msgIdList");
        this.f281205a = groupId;
        this.f281206b = msgIdList;
        this.f281207c = i17;
    }

    /* renamed from: equals */
    public boolean m79512xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4 p4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f281205a, p4Var.f281205a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f281206b, p4Var.f281206b) && this.f281207c == p4Var.f281207c;
    }

    /* renamed from: hashCode */
    public int m79513x8cdac1b() {
        return (((this.f281205a.hashCode() * 31) + this.f281206b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f281207c);
    }

    /* renamed from: toString */
    public java.lang.String m79514x9616526c() {
        return "MediaGroupInfo(groupId=" + this.f281205a + ", msgIdList=" + this.f281206b + ", currentIndex=" + this.f281207c + ')';
    }
}
