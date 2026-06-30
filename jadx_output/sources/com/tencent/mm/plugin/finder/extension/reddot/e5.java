package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes3.dex */
public final class e5 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f105494d;

    public e5(yz5.l lVar) {
        this.f105494d = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar = this.f105494d;
        return mz5.a.b((java.lang.Comparable) lVar.invoke(obj), (java.lang.Comparable) lVar.invoke(obj2));
    }
}
