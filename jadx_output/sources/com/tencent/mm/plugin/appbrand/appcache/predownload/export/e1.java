package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class e1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f75788d;

    public e1(java.util.Comparator comparator) {
        this.f75788d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f75788d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b(java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appcache.n9) obj).field_appId.length()), java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appcache.n9) obj2).field_appId.length()));
    }
}
