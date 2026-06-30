package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class hj implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f290419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f290420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f290421f;

    public hj(java.lang.String userName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f290419d = userName;
        this.f290420e = i17;
        this.f290421f = i18;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f290419d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
