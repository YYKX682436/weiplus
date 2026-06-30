package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f231829a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f231830b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f231831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f231832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f231833e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f231834f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f231835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f231836h;

    public t(int i17, java.lang.String userName, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f231829a = i17;
        this.f231830b = userName;
        this.f231831c = z17;
        this.f231832d = z18;
        this.f231833e = z19;
        this.f231834f = z27;
        this.f231835g = z28;
        this.f231836h = i18;
    }

    public final boolean a() {
        int i17 = this.f231836h;
        return i17 == 101 || i17 == 102;
    }

    /* renamed from: equals */
    public boolean m67069xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t) obj;
        return this.f231829a == tVar.f231829a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f231830b, tVar.f231830b) && this.f231831c == tVar.f231831c && this.f231832d == tVar.f231832d && this.f231833e == tVar.f231833e && this.f231834f == tVar.f231834f && this.f231835g == tVar.f231835g && this.f231836h == tVar.f231836h;
    }

    /* renamed from: hashCode */
    public int m67070x8cdac1b() {
        return (((((((((((((java.lang.Integer.hashCode(this.f231829a) * 31) + this.f231830b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f231831c)) * 31) + java.lang.Boolean.hashCode(this.f231832d)) * 31) + java.lang.Boolean.hashCode(this.f231833e)) * 31) + java.lang.Boolean.hashCode(this.f231834f)) * 31) + java.lang.Boolean.hashCode(this.f231835g)) * 31) + java.lang.Integer.hashCode(this.f231836h);
    }

    /* renamed from: toString */
    public java.lang.String m67071x9616526c() {
        return "MultiTalkMemberInfo(memberId=" + this.f231829a + ", userName=" + this.f231830b + ", waiting=" + this.f231831c + ", isVideoOn=" + this.f231832d + ", isTalking=" + this.f231833e + ", isNetworkWeak=" + this.f231834f + ", isMicOff=" + this.f231835g + ", screenCastingState=" + this.f231836h + ')';
    }
}
