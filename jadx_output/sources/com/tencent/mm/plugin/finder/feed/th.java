package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class th implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.th f109060d = new com.tencent.mm.plugin.finder.feed.th();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        cd2.b bVar = (cd2.b) obj;
        cd2.b bVar2 = (cd2.b) obj2;
        int d17 = bVar.f40655d.d();
        int d18 = bVar2.f40655d.d();
        cd2.c cVar = bVar.f40655d;
        cd2.c cVar2 = bVar2.f40655d;
        return d17 == d18 ? kotlin.jvm.internal.o.j(cVar2.i(), cVar.i()) : kotlin.jvm.internal.o.i(cVar2.d(), cVar.d());
    }
}
