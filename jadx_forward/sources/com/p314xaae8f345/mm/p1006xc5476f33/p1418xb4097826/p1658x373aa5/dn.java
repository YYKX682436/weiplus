package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class dn implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f213444e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f213445f;

    public dn(java.lang.String nickname, int i17, java.lang.String avatar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatar, "avatar");
        this.f213443d = nickname;
        this.f213444e = i17;
        this.f213445f = avatar;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
