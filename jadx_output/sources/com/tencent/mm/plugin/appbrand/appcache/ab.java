package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class ab implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f75438d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Iterator f75439e = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f75440f;

    public ab(com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        this.f75440f = wxaPkgWrappingInfo;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f75438d) {
            return true;
        }
        if (this.f75439e == null) {
            this.f75439e = this.f75440f.f75402g.iterator();
        }
        return this.f75439e.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f75438d) {
            return (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) this.f75439e.next();
        }
        this.f75438d = true;
        return this.f75440f;
    }
}
