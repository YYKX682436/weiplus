package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class a extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zm f94559d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f94560e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f94561f;

    public a(r45.zm authorizeItem, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(authorizeItem, "authorizeItem");
        this.f94559d = authorizeItem;
        this.f94560e = z17;
        this.f94561f = z18;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a other = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (this.f94560e) {
            return false;
        }
        r45.zm zmVar = this.f94559d;
        int i17 = zmVar.f392203f;
        r45.zm zmVar2 = other.f94559d;
        return (i17 == zmVar2.f392203f) && zmVar.f392202e.equals(zmVar2.f392202e);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a other = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f94560e ? 1 : 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f94559d.f392204g;
        return str == null ? "" : str;
    }
}
