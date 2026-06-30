package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    public final so2.n1 f103488a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f103489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103491d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103492e;

    public gi(so2.n1 placeHolderFeed, com.tencent.mm.plugin.finder.model.BaseFinderFeed recommendPlayFeed, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(placeHolderFeed, "placeHolderFeed");
        kotlin.jvm.internal.o.g(recommendPlayFeed, "recommendPlayFeed");
        this.f103488a = placeHolderFeed;
        this.f103489b = recommendPlayFeed;
        this.f103490c = i17;
        this.f103491d = i18;
        this.f103492e = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.convert.gi)) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.gi giVar = (com.tencent.mm.plugin.finder.convert.gi) obj;
        return kotlin.jvm.internal.o.b(this.f103488a, giVar.f103488a) && kotlin.jvm.internal.o.b(this.f103489b, giVar.f103489b) && this.f103490c == giVar.f103490c && this.f103491d == giVar.f103491d && this.f103492e == giVar.f103492e;
    }

    public int hashCode() {
        return (((((((((int) this.f103488a.getItemId()) * 31) + this.f103489b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f103490c)) * 31) + java.lang.Integer.hashCode(this.f103491d)) * 31) + java.lang.Integer.hashCode(this.f103492e);
    }

    public java.lang.String toString() {
        return "SocialHotViewTag(placeHolderFeed=" + this.f103488a + ", recommendPlayFeed=" + this.f103489b + ", placeHolderPosition=" + this.f103490c + ", targetTabType=" + this.f103491d + ", showType=" + this.f103492e + ')';
    }
}
