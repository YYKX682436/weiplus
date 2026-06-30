package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class s9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f108339a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f108340b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f108341c;

    public s9(int i17, java.util.List feedList) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        this.f108339a = i17;
        this.f108340b = feedList;
        this.f108341c = "Finder.LoaderCacheData";
    }

    public java.lang.String toString() {
        return "position:" + this.f108339a + ",feed size:" + this.f108340b.size();
    }
}
