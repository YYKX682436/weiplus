package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f75458a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f75459b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f75460c;

    public boolean a(java.lang.String appId) {
        boolean remove;
        kotlin.jvm.internal.o.g(appId, "appId");
        synchronized (this.f75458a) {
            java.util.List list = this.f75459b;
            remove = list != null ? ((java.util.ArrayList) list).remove(appId) : false;
            yz5.l lVar = this.f75460c;
            if (lVar != null) {
                lVar.invoke(appId);
            }
        }
        return remove;
    }

    public void b() {
        synchronized (this.f75458a) {
            java.util.List list = this.f75459b;
            if (list != null) {
                ((java.util.ArrayList) list).clear();
            }
            this.f75460c = null;
        }
    }
}
