package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f156991a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f156992b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f156993c;

    public boolean a(java.lang.String appId) {
        boolean remove;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        synchronized (this.f156991a) {
            java.util.List list = this.f156992b;
            remove = list != null ? ((java.util.ArrayList) list).remove(appId) : false;
            yz5.l lVar = this.f156993c;
            if (lVar != null) {
                lVar.mo146xb9724478(appId);
            }
        }
        return remove;
    }

    public void b() {
        synchronized (this.f156991a) {
            java.util.List list = this.f156992b;
            if (list != null) {
                ((java.util.ArrayList) list).clear();
            }
            this.f156993c = null;
        }
    }
}
